
import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.UnavailableException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "SurveyServlet")
public class Server extends HttpServlet {

    private Connection connection;
    private PreparedStatement sqlInsertData;
    private PreparedStatement sqldisplaydata;
    private PreparedStatement sqldisplaydata2;
    private Statement statement;

    // set up database connection and prepare SQL statements
    public void init( /*ServletConfig config*/) throws ServletException {
        // attempt database connection and create PreparedStatements
        try {
            // Connection connect;
            String driver = "com.mysql.jdbc.Driver";

            try {
                Class.forName(driver);

                String url = "jdbc:mysql://localhost:3306/teams"; //Database name here

                connection = DriverManager.getConnection(url, "root", "root");  //URL, user and password
                statement = connection.createStatement();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            sqlInsertData = connection.prepareStatement("INSERT INTO teams (Numbers, Oranmore)" + "VALUES (?, ?)");

         //   sqldisplaydata2 = connection.prepareStatement("SELECT Numbers FROM teams");

        }

        // for any exception throw an UnavailableException to
        // indicate that the servlet is not currently available
        catch (Exception exception) {
            exception.printStackTrace();
            throw new UnavailableException(exception.getMessage());
        }
    }

    // end of init method
    // process survey response

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String inputString = request.getParameter("loanInputs");
        PrintWriter out = response.getWriter();
        System.out.println(inputString);

        String Numbers = "";
        String Oranmore = "";
        String Athenry = "";


        try {
            JSONObject inputValues = new JSONObject(inputString);

            Numbers = inputValues.getString("Numbers");
            Oranmore = inputValues.getString("Oranmore");

        }


        // NullPointerException and JSONException
        catch (JSONException e) {
            e.printStackTrace();
        }

        try {
            sqlInsertData.setString(1, Numbers);
            sqlInsertData.setString(2, Oranmore);
            sqlInsertData.executeUpdate();


        }

        // if database exception occurs, return error page
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        try {
            String teamInfo = "";
            teamInfo = queryResults();
            JSONObject databaseInfo = new JSONObject();
            databaseInfo.put("teamInfo", teamInfo);

            databaseInfo.toString();
            out.println(databaseInfo);
            out.flush();


        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
    // close SQL statements and database when servlet terminates
    public void destroy() {
        // attempt to close statements and database connection
        try {
            sqlInsertData.close();
            statement.close();
            connection.close();
        }

        // handle database exceptions by returning error to client
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }  // end of destroy method

    public String queryResults()
    {

        ResultSet resultSet;
        StringBuffer results = null;

        try {
            // query database
            resultSet = statement.executeQuery("SELECT Numbers, Oranmore FROM teams");

            // process query results
            results = new StringBuffer();
            ResultSetMetaData metaData = resultSet.getMetaData();

            int numberOfColumns = metaData.getColumnCount();

            while (resultSet.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    results.append(resultSet.getObject(i) + "\t");
                }

                results.append("\n");
            }
            System.out.print(results);
        }
        // if database exception occurs, return error page
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return results.toString();
    }
}