package com.example.Club_Gaa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MyActivity extends Activity {
    Button teamsheets_button;
    Button fixtures_button;
    Button results_button;
    Button find_button;
    Button admin_button;


    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //final Context context = this;
        results_button = (Button) findViewById(R.id.results_button);
        results_button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MyActivity.this, Results.class);

                startActivity(intent);

                /*
                double latitude = 53.296254;
                double longitude = -8.751457;


                String coordinates = String.format("geo:0,0?q=" + latitude + "," + longitude);
                Intent intentMap = new Intent( Intent.ACTION_VIEW, Uri.parse(coordinates) );
                startActivity( intentMap );
                */

            }

        });

        teamsheets_button = (Button) findViewById(R.id.teamsheets_button);
        teamsheets_button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyActivity.this, TeamHome.class);

                startActivity(intent);

            }

        });
        find_button = (Button) findViewById(R.id.find_button);
        find_button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyActivity.this, FindGround.class);

                startActivity(intent);


            }

        });
    }
}


