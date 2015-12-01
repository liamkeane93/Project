package com.example.Club_Gaa;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class TeamLayout extends MyActivity {

    Button team1;
    SQLiteDatabase db;
    TextView txtMsg;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teams);

        //final Context context = this;
        team1 = (Button) findViewById(R.id.team1);
        team1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //openDatabase();
                // dropTable(); // if needed drop table tblAmigos
            }

        });
    }

   //
    // -----------------------------------------------------------------------------------------------

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
    private void dropTable()
    {
        // (clean start) action query to drop table
        try
        {
            db.execSQL("DROP TABLE IF EXISTS tblAmigo;");
            txtMsg.append("\n-dropTable - dropped!!");
        }

        catch (Exception e)
        {
            txtMsg.append("\nError dropTable: " + e.getMessage());
            finish();
        }
    }

}
