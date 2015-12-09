package com.example.Club_Gaa;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Liam on 01/12/2015.
 */
public class FindGround extends MyActivity {

    Button kenny_park;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ground);
        kenny_park = (Button) findViewById(R.id.kenny_park);
        kenny_park.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                double latitude = 53.296254;
                double longitude = -8.751457;
                String coordinates = String.format("geo:0,0?q=" + latitude + "," + longitude);
                Intent intentMap = new Intent( Intent.ACTION_VIEW, Uri.parse(coordinates) );
                startActivity( intentMap );


            }

        });
    }
}

