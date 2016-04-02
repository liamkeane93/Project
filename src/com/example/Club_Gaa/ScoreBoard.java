package com.example.Club_Gaa;

import android.os.Bundle;

/**
 * Created by Liam on 02/04/2016.
 */
public class ScoreBoard extends MyActivity {
    int TeamAPoint = 0;
    int TeamAGoal =0;
    int TeamBPoint = 0;
    int TeamBGoal =0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score);
    }


}
