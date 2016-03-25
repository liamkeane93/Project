package com.example.Club_Gaa;

import android.os.AsyncTask;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;


public class httpAsyncTask extends AsyncTask<String, Void, String>
{
    private static String databaseInfo;
    @Override
    protected String doInBackground(String... params)
    {
        String jsonString = "";
        System.out.println("DOIN");

        try
        {
            jsonString = Uttils.urlContentPost(params[0], "loanInputs", params[1]);
        }

        catch (IOException e)
        {

        }

        return jsonString;
    }

    protected void onPostExecute(String result)
    {
        System.out.println("onpostexecute");
        JSONObject jsonResult = null;
        String name = "";
        //String databaseInfo = "";
        String password_dup = "";

        try
        {
            jsonResult = new JSONObject(result);
            databaseInfo = jsonResult.getString("teamInfo");
            System.out.print(databaseInfo);


        }

        catch (JSONException e)
        {
            e.printStackTrace();
        }


    }
    protected static String getDatabaseInfo()
    {
        return databaseInfo;
    }
}