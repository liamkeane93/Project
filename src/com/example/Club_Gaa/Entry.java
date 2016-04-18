package com.example.Club_Gaa;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ScrollView;
import org.json.JSONException;
import org.json.JSONObject;


public class Entry extends MyActivity {
    EditText nameTxt;
    EditText posTxt;
    Button saveBtn;
    EditText editText;
    Button viewDatabase;
    ListView listView;
    ScrollView scrollView;


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entry1);
        editText= (EditText)findViewById(R.id.editText);
        nameTxt = (EditText)findViewById(R.id.nameTxt);
        posTxt = (EditText)findViewById(R.id.posTxt);

        saveBtn = (Button)findViewById(R.id.saveBtn);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1 = nameTxt.getText().toString();
                String position1 = posTxt.getText().toString();
                // System.out.print("Button");
                JSONObject post_dict = new JSONObject();
                try {

                    post_dict.put("name1", name1);
                    post_dict.put("position1", position1);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                //new httpAsyncTask().execute("http://192.168.1.11:8080/SurveyServlet", post_dict.toString());
                new httpAsyncTask().execute("http://10.12.2.216:8080/SurveyServlet", post_dict.toString());
                //editText.setText(new httpAsyncTask().getDatabaseInfo());
            }
        });

        viewDatabase = (Button)findViewById(R.id.viewDatabase);
        viewDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //System.out.print("Button");
                JSONObject post_dic = new JSONObject();
                try{
                    post_dic.put("Option" ,"viewGalway");
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                //new httpAsyncTask().execute("http://192.168.1.11:8080/SurveyServlet", post_dic.toString());

                new httpAsyncTask().execute("http://10.12.2.216:8080/SurveyServlet");

                editText.setText(new httpAsyncTask().getDatabaseInfo1());

            }
        });


    }
}

