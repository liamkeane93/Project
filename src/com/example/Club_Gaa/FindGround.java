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

    Button kenny_park,athenry_website, Abbeyknockmoy,AbbeyknockmoyWebsite,Annaghdown,AnnaghdownWebsite,
            Ardrahan,ArdrahanWebsite, Ballygar,BallygarWebsite;
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
                Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse(coordinates));
                startActivity(intentMap);


            }

        });

        athenry_website = (Button) findViewById(R.id.athenry_website );
        athenry_website .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.athenrygaa.ie/en/"));
                startActivity(intent);

            }

        });

        Abbeyknockmoy = (Button) findViewById(R.id.Abbeyknockmoy);
        Abbeyknockmoy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                double latitude = 53.436362;
                double longitude = -8.748008;
                String coordinates = String.format("geo:0,0?q=" + latitude + "," + longitude);
                Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse(coordinates));
                startActivity(intentMap);


            }

        });

        AbbeyknockmoyWebsite = (Button) findViewById(R.id.AbbeyknockmoyWebsite );
        AbbeyknockmoyWebsite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.abbeyknockmoy.gaa.ie/"));
                startActivity(intent);

            }

        });

        Annaghdown = (Button) findViewById(R.id.Annaghdown);
        Annaghdown.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                double latitude = 53.388483;
                double longitude = -8.958946;
                String coordinates = String.format("geo:0,0?q=" + latitude + "," + longitude);
                Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse(coordinates));
                startActivity(intentMap);


            }

        });

        AnnaghdownWebsite = (Button) findViewById(R.id.AnnaghdownWebsite );
        AnnaghdownWebsite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.annaghdowngaa.ie/"));
                startActivity(intent);

            }

        });

        Ardrahan = (Button) findViewById(R.id.Ardrahan);
        Ardrahan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                double latitude = 53.155224;
                double longitude = -8.815521;
                String coordinates = String.format("geo:0,0?q=" + latitude + "," + longitude);
                Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse(coordinates));
                startActivity(intentMap);


            }

        });

        ArdrahanWebsite = (Button) findViewById(R.id.ArdrahanWebsite );
        ArdrahanWebsite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.ardrahangaa.ie/"));
                startActivity(intent);

            }

        });

        Ballygar = (Button) findViewById(R.id.Ardrahan);
        Ballygar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                double latitude = 53.522256;
                double longitude = -8.326898;
                String coordinates = String.format("geo:0,0?q=" + latitude + "," + longitude);
                Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse(coordinates));
                startActivity(intentMap);


            }

        });

        BallygarWebsite = (Button) findViewById(R.id.ArdrahanWebsite );
        BallygarWebsite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/Ballygar-Hurling-Club-388164637975016/"));
                startActivity(intent);

            }

        });
    }
}

