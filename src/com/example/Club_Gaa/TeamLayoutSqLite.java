package com.example.Club_Gaa;

import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;

import java.util.ArrayList;

public class TeamLayoutSqLite extends TeamHome {

    ListView lv;
    EditText nameTxt,posTxt;
    Button savebtn,retrieveBtn,ForgetButton;
    ArrayList<String> players=new ArrayList<String>();

    ArrayAdapter<String> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name_position);

        nameTxt=(EditText) findViewById(R.id.nameTxt);
        posTxt=(EditText) findViewById(R.id.posTxt);

        savebtn=(Button) findViewById(R.id.saveBtn);
        ForgetButton=(Button) findViewById(R.id.ForgetButton);
        retrieveBtn=(Button) findViewById(R.id.retrievebtn);
        nameTxt.setText("No: ");
        lv=(ListView) findViewById(R.id.listView1);
        lv.setBackgroundColor(Color.LTGRAY);

        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_selectable_list_item,players);

        final DatabaseSQLite db=new DatabaseSQLite(this);

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

                nameTxt.setText("No: ");
                posTxt.setText("");
                //CLOSE DB
                db.close();
            }
        });
        ForgetButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                db.openDB();
                db.dropTable();
                db.RecreateTable();
                db.close();

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
                Cursor c=db.getAllNames();

                while(c.moveToNext())
                {
                    StringBuilder sb = new StringBuilder();
                    sb.append(c.getString(1));
                    sb.append(" " +c.getString(2));
                    players.add(sb.toString());
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