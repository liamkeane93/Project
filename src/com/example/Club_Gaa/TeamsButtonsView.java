package com.example.Club_Gaa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Liam on 19/04/2016.
 */
public class TeamsButtonsView extends Clubteams {

    Button OranmoreTeam;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intermediateeambuttons);

        //final Context context = this;
        OranmoreTeam = (Button) findViewById(R.id.OranmoreTeam);
        OranmoreTeam.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TeamsButtonsView.this,ViewArea.class);
                startActivity(intent);
            }

        });


    }
}

