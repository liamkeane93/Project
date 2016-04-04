package com.example.Club_Gaa;

import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Liam on 02/04/2016.
 */
public class ScoreBoard extends MyActivity {
    int TeamAPoint = 0;
    int TeamAGoal =0;
    int TeamBPoint = 0;
    int TeamBGoal =0;


    private Button startButton;
    private Button pauseButton;
    private Button resetButton;

    private TextView timerValue;

    private long startTime = 0L;

    private Handler customHandler = new Handler();

    long timeInMilliseconds = 0L;
    long timeSwapBuff = 0L;
    long updatedTime = 0L;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score);
        timerValue = (TextView) findViewById(R.id.timerValue);

        startButton = (Button) findViewById(R.id.startButton);

        startButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                startTime = SystemClock.uptimeMillis();
                customHandler.postDelayed(updateTimerThread, 0);

            }
        });

        pauseButton = (Button) findViewById(R.id.pauseButton);

        pauseButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                timeSwapBuff += timeInMilliseconds;
                customHandler.removeCallbacks(updateTimerThread);

            }
        });
        resetButton = (Button) findViewById(R.id.resetButton);

        resetButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                timeInMilliseconds = 0L;
                timeSwapBuff = 0L;
                updatedTime = 0L;

                int secs = (int) (updatedTime / 1000);
                int mins = secs / 60;
                secs = secs % 60;
                int milliseconds = (int) (updatedTime % 1000);
                timerValue.setText("" + mins + ":"
                        + String.format("%02d", secs) + ":"
                        + String.format("%03d", milliseconds));


            }
        });

    }
    private Runnable updateTimerThread = new Runnable() {

        public void run() {

            timeInMilliseconds = SystemClock.uptimeMillis() - startTime;

            updatedTime = timeSwapBuff + timeInMilliseconds;

            int secs = (int) (updatedTime / 1000);
            int mins = secs / 60;
            secs = secs % 60;
            int milliseconds = (int) (updatedTime % 1000);
            timerValue.setText("" + mins + ":"
                    + String.format("%02d", secs) + ":"
                    + String.format("%03d", milliseconds));
            customHandler.postDelayed(this, 0);
        }

    };


    public void teamAPoint(View view) {

        TeamAPoint = TeamAPoint + 1;
        displayForTeamA(TeamAPoint);
    }

    public void teamAGoal(View view) {
        TeamAGoal = TeamAGoal + 1;
        displayGoalTeamA(TeamAGoal);
    }

    private void displayForTeamA(int point1) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_point);
        scoreView.setText("" + point1);
    }
    private void displayGoalTeamA(int goal1) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goal);
        scoreView.setText("" + goal1);
    }
    ///////////////////
    public void teamBPoint(View view) {
        TeamBPoint = TeamBPoint + 1;
        displayForTeamB(TeamBPoint);
    }



    public void teamBGoal(View view) {
        TeamBGoal = TeamBGoal+ 1;
        displayGoalTeamB(TeamBGoal);
    }

    private void displayGoalTeamB(int goal2) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goal);
        scoreView.setText(String.valueOf(goal2));
    }

    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_point);
        scoreView.setText(String.valueOf(score));
    }

    public void resetButton2(View view) {

        TeamAPoint = 0;
        TeamAGoal =0;
      //  TeamBPoint = 0;
      //  TeamBGoal =0;
       // displayGoalTeamB(0);
        displayGoalTeamA(0);
        displayForTeamA(0);
      //  displayForTeamB(0);

    }
    public void resetButton(View view) {

       // TeamAPoint = 0;
       // TeamAGoal =0;
        TeamBPoint = 0;
        TeamBGoal =0;
        displayGoalTeamB(0);
        //displayGoalTeamA(0);
     //   displayForTeamA(0);
        displayForTeamB(0);

    }

}
