package com.example.Club_Gaa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Liam on 25/02/2016.
 */
public class TeamHome extends MyActivity {
    Button ClubTeams;
    Button CountyTeams;
    Button PersonalTeams;


    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teamhomepage);

        //final Context context = this;
        ClubTeams = (Button) findViewById(R.id.ClubTeams);
        ClubTeams.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TeamHome.this,ViewArea.class);

                startActivity(intent);

            }

        });

        PersonalTeams = (Button) findViewById(R.id.PersonalTeams);
        PersonalTeams.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeamHome.this, TeamLayoutSqLite.class);

                startActivity(intent);
            }

        });
    }
}

