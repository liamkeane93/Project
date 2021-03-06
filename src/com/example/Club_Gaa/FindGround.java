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
            Ardrahan,ArdrahanWebsite, Ballygar,BallygarWebsite, Castlegar, CastlegarWebsite, Moycullen, MoycullenWebsite
            ,Kinvara,KinvaraWebsite,Turloughmore,TurloughmoreWebsite,TynaghAbbeyDuniry,
            TynaghAbbeyDuniryWebsite,Oranmore,OranmoreWebsite;
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

        Castlegar = (Button) findViewById(R.id.Castlegar);
        Castlegar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                double latitude = 53.299389;
                double longitude = -9.017664;
                String coordinates = String.format("geo:0,0?q=" + latitude + "," + longitude);
                Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse(coordinates));
                startActivity(intentMap);


            }

        });

        CastlegarWebsite = (Button) findViewById(R.id.CastlegarWebsite );
        CastlegarWebsite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.castlegarhurlingclub.org/"));
                startActivity(intent);
            }

        });

        Moycullen = (Button) findViewById(R.id.Moycullen);
        Moycullen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                double latitude = 53.338688;
                double longitude = -9.181581;
                String coordinates = String.format("geo:0,0?q=" + latitude + "," + longitude);
                Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse(coordinates));
                startActivity(intentMap);


            }

        });

        MoycullenWebsite = (Button) findViewById(R.id.MoycullenWebsite );
        MoycullenWebsite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.moycullengaa.com/"));
                startActivity(intent);
            }

        });

        Kinvara = (Button) findViewById(R.id.Kinvara);
        Kinvara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                double latitude = 53.136976;
                double longitude = -8.951722;
                String coordinates = String.format("geo:0,0?q=" + latitude + "," + longitude);
                Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse(coordinates));
                startActivity(intentMap);


            }

        });

        KinvaraWebsite = (Button) findViewById(R.id.KinvaraWebsite );
        KinvaraWebsite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.kinvaragaa.ie/"));
                startActivity(intent);
            }

        });

        Turloughmore = (Button) findViewById(R.id.Turloughmore);
        Turloughmore.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                double latitude = 53.365707;
                double longitude = -8.904853;
                String coordinates = String.format("geo:0,0?q=" + latitude + "," + longitude);
                Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse(coordinates));
                startActivity(intentMap);


            }

        });

        TurloughmoreWebsite = (Button) findViewById(R.id.TurloughmoreWebsite );
        TurloughmoreWebsite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://turloughmoregaa.ie/"));
                startActivity(intent);
            }

        });

        TynaghAbbeyDuniry = (Button) findViewById(R.id.TynaghAbbeyDuniry);
        TynaghAbbeyDuniry.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                double latitude = 53.139903;
                double longitude = -8.466489;
                String coordinates = String.format("geo:0,0?q=" + latitude + "," + longitude);
                Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse(coordinates));
                startActivity(intentMap);


            }

        });

        TynaghAbbeyDuniryWebsite = (Button) findViewById(R.id.TynaghAbbeyDuniryWebsite);
        TynaghAbbeyDuniryWebsite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://tynaghabbeyduniryhurlingclub.com/"));
                startActivity(intent);
            }

        });
        Oranmore = (Button) findViewById(R.id.Oranmore);
        Oranmore.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                double latitude = 53.271690;
                double longitude = -8.918881;
                String coordinates = String.format("geo:0,0?q=" + latitude + "," + longitude);
                Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse(coordinates));
                startActivity(intentMap);


            }

        });

        OranmoreWebsite = (Button) findViewById(R.id.OranmoreWebsite);
        OranmoreWebsite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.oranmoremareegaa.com/"));
                startActivity(intent);
            }

        });
    }
}

