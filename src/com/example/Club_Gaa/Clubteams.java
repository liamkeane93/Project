package com.example.Club_Gaa;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Clubteams extends TeamHome {
    Button Intermediate;
    Button Senior;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clubcategory);

        //final Context context = this;
        Intermediate = (Button) findViewById(R.id.Intermediate);
        Intermediate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Clubteams.this, TeamsButtonsView.class);

                startActivity(intent);

            }

        });

        Senior = (Button) findViewById(R.id.Senior);
        Senior.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Clubteams.this, SeniorTeams.class);

                startActivity(intent);

            }

        });

    }
}