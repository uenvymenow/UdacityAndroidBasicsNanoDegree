package com.example.u_n_v.footballscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScoreTeamA(int scoreTeamA) { // sets text for Team A score
        TextView scoreTV = findViewById(R.id.TeamAScore);
        scoreTV.setText(String.valueOf(scoreTeamA));
    }

    public void teamATD(View v){ // adds touchdown points to score for Team A
        scoreTeamA += 6;
        displayScoreTeamA(scoreTeamA);
    }

    public void teamAExtraPoint(View v){ // adds extra point to score for Team A
        scoreTeamA += 1;
        displayScoreTeamA(scoreTeamA);
    }

    public void teamA2Pt(View v){ // adds 2 point conversion to score for Team A
        scoreTeamA += 2;
        displayScoreTeamA(scoreTeamA);
    }

    public void teamAFieldGoal(View v){ // adds field goal to score for Team A
        scoreTeamA += 3;
        displayScoreTeamA(scoreTeamA);
    }

    public void teamASafety(View v){ // adds safety to score for Team A
        scoreTeamA += 2;
        displayScoreTeamA(scoreTeamA);
    }

    public void displayScoreTeamB(int scoreTeamA) { // sets text for Team B score
        TextView scoreTV = findViewById(R.id.TeamBScore);
        scoreTV.setText(String.valueOf(scoreTeamA));
    }

    public void teamBTD(View v){ // adds touchdown to score for Team B
        scoreTeamB += 6;
        displayScoreTeamB(scoreTeamB);
    }

    public void teamBExtraPoint(View v){ // adds extra point to score for Team B
        scoreTeamB += 1;
        displayScoreTeamB(scoreTeamB);
    }

    public void teamB2Pt(View v){ // adds 2 point conversion to score for Team B
        scoreTeamB += 2;
        displayScoreTeamB(scoreTeamB);
    }

    public void teamBFieldGoal(View v){ // adds field goal to score for Team B
        scoreTeamB += 3;
        displayScoreTeamB(scoreTeamB);
    }

    public void teamBSafety(View v){ // adds safety to score for Team B
        scoreTeamB += 2;
        displayScoreTeamB(scoreTeamB);
    }

    public void resetButton(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }
}

