package com.example.Club_Gaa;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Liam on 19/04/2016.
 */
public class ViewArea extends TeamsButtonsView {

    EditText editText;
    Button viewDatabase;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teamview);

        editText= (EditText)findViewById(R.id.editText);

       viewDatabase = (Button) findViewById(R.id.viewDatabase);
       viewDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {

                //JSONObject post_dict = new JSONObject();


                //new httpAsyncTask().execute("http://10.12.2.216:8080/SurveyServlet", post_dict.toString());

                editText.setText(new httpAsyncTask().getDatabaseInfo());

            }
       });
    }
}
