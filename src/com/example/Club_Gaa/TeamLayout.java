package com.example.Club_Gaa;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class TeamLayout extends MyActivity {

    Button current_results;
    SQLiteDatabase db;
    TextView txtMsg;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teams);
    }

    private void openDatabase() {
        try {
            // path to private memory:
            String SDcardPath = "data/data/cis470.matos.databases";
            // -----------------------------------------------------------
            // this provides the path name to the SD card
            // String SDcardPath = Environment.getExternalStorageDirectory().getPath();

            String myDbPath = SDcardPath + "/" + "myfriendsDB2.db";
            txtMsg.append("\n-openDatabase - DB Path: " + myDbPath);

            db = SQLiteDatabase.openDatabase(myDbPath, null,
                    SQLiteDatabase.CREATE_IF_NECESSARY);

            txtMsg.append("\n-openDatabase - DB was opened");
        } catch (SQLiteException e) {
            txtMsg.append("\nError openDatabase: " + e.getMessage());
            finish();
        }
    }// createDatabase
}