package com.example.android.soccerlivescore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int penaltyTeamA = 0;
    int penaltyTeamB = 0;
    int yellowCardTeamA = 0;
    int yellowCardTeamB = 0;
    int redCardTeamA = 0;
    int redCardTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Add 1 goal for Team A.
     */
    public void addGoalForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA+"    -");
    }

    /**
     * Add 1 goal for Team B.
     */
    public void addGoalForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB("    "+scoreTeamB);
    }

    /**
     * Add penalty for Team A.
     */
    public void addPenaltyForTeamA(View view) {
        penaltyTeamA = penaltyTeamA + 1;
        displayPenaltyForTeamA(penaltyTeamA);
    }

    /**
     * Add penalty for Team B.
     */
    public void addPenaltyForTeamB(View view) {
        penaltyTeamB = penaltyTeamB + 1;
        displayPenaltyForTeamB(penaltyTeamB);
    }

    /**
     * Add yellow card for  Team A.
     */
    public void addYellowCardForTeamA(View view) {
        yellowCardTeamA = yellowCardTeamA + 1;
        displayYellowCardForTeamA(yellowCardTeamA);
    }

    /**
     * Add yellow card for Team B.
     */
    public void addYellowCardForTeamB(View view) {
        yellowCardTeamB = yellowCardTeamB + 1;
        displayYellowCardForTeamB(yellowCardTeamB);
    }
    /**
     * Add red card for  Team A.
     */
    public void addRedCardForTeamA(View view) {
        redCardTeamA = redCardTeamA + 1;
        displayRedCardForTeamA(redCardTeamA);
    }

    /**
     * Add red card for Team B.
     */
    public void addRedCardForTeamB(View view) {
        redCardTeamB = redCardTeamB + 1;
        displayRedCardForTeamB(redCardTeamB);
    }
    /**
     * Reset scores.
     */
    public void resetScores(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        penaltyTeamA = 0;
        penaltyTeamB = 0;
        yellowCardTeamA = 0;
        yellowCardTeamB = 0;
        redCardTeamA = 0;
        redCardTeamB = 0;
        displayScoreForTeamA(scoreTeamA+"    -");
        displayScoreForTeamB("    "+scoreTeamB);
        displayPenaltyForTeamA(penaltyTeamA);
        displayPenaltyForTeamB(penaltyTeamB);
        displayYellowCardForTeamA(yellowCardTeamA);
        displayYellowCardForTeamB(yellowCardTeamB);
        displayRedCardForTeamA(redCardTeamA);
        displayRedCardForTeamB(redCardTeamB);
    }

    /**
     * This method displays the score for TeamA.
     */
    private void displayScoreForTeamA(String message) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_a_score);
        scoreTextView.setText(message);
    }
    /**
     * This method displays the score for TeamB.
     */
    private void displayScoreForTeamB(String message) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_b_score);
        scoreTextView.setText(message);
    }

    /**
     * Displays the nb of penalties for Team A.
     */
    public void displayPenaltyForTeamA(int penalty) {
        TextView penaltyView = (TextView) findViewById(R.id.team_a_penalty);
        penaltyView.setText(String.valueOf(penalty));
    }

    /**
     * Displays the nb of penalties for Team B.
     */   public void displayPenaltyForTeamB(int penalty) {
        TextView penaltyView = (TextView) findViewById(R.id.team_b_penalty);
        penaltyView.setText(String.valueOf(penalty));

    }
    /**
     * Displays the nb of yellow cards for Team A.
     */
    public void displayYellowCardForTeamA(int yellow) {
        TextView yellowView = (TextView) findViewById(R.id.team_a_yellowcard);
        yellowView.setText(String.valueOf(yellow));
    }

    /**
     * Displays the nb of yellow cards for Team B.
     */   public void displayYellowCardForTeamB(int yellow) {
        TextView yellowView = (TextView) findViewById(R.id.team_b_yellowcard);
        yellowView.setText(String.valueOf(yellow));

    }
    /**
     * Displays the nb of red cards for Team A.
     */
    public void displayRedCardForTeamA(int red) {
        TextView redView = (TextView) findViewById(R.id.team_a_redcard);
        redView.setText(String.valueOf(red));
    }

    /**
     * Displays the nb of red cards for Team B.
     */   public void displayRedCardForTeamB(int red) {
        TextView redView = (TextView) findViewById(R.id.team_b_redcard);
        redView.setText(String.valueOf(red));

    }

}
