package com.example.Club_Gaa;

import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;

import java.util.ArrayList;

public class TeamLayout extends TeamHome {

    ListView lv;
    EditText nameTxt, posTxt;
    Button savebtn, retrieveBtn, team1, forgetButton, team2;
    ArrayList<String> players = new ArrayList<String>();

    ArrayAdapter<String> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teams);

        //final Context context = this;
        team1 = (Button) findViewById(R.id.team1);
        team1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                data();
            }

        });
        team2 = (Button) findViewById(R.id.team2);
        team2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                data();
            }

        });

    }

    private void data() {


        setContentView(R.layout.name_position);
        nameTxt = (EditText) findViewById(R.id.nameTxt);
        posTxt = (EditText) findViewById(R.id.posTxt);

        savebtn = (Button) findViewById(R.id.saveBtn);
        retrieveBtn = (Button) findViewById(R.id.retrievebtn);

        forgetButton = (Button) findViewById(R.id.forgetButton);

        lv = (ListView) findViewById(R.id.listView1);
        lv.setBackgroundColor(Color.LTGRAY);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_selectable_list_item, players);

        final PersonalTeamDatabase db = new PersonalTeamDatabase(this);

        //EVENTS
        savebtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                //OPEN
                db.openDB();

                //INSERT
                long result = db.add(nameTxt.getText().toString(), posTxt.getText().toString());

                if (result > 0) {
                    nameTxt.setText("");
                    posTxt.setText("");
                } else {
                    Toast.makeText(getApplicationContext(), "Failure", Toast.LENGTH_SHORT).show();
                }


                //CLOSE DB
                db.close();
            }
        });

        forgetButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                db.dropDB();
            }
        });

        //RETRIEVE
        retrieveBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                players.clear();

                //OPEN
                db.openDB();

                //RETRIEVE
                Cursor c = db.getAllNames();

                while (c.moveToNext()) {
                    String name = c.getString(1);
                    players.add(name);
                }

                lv.setAdapter(adapter);

                db.close();

            }
        });

        lv.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int pos,
                                    long id) {
                // TODO Auto-generated method stub

                Toast.makeText(getApplicationContext(), players.get(pos), Toast.LENGTH_SHORT).show();


            }
        });
    }
}