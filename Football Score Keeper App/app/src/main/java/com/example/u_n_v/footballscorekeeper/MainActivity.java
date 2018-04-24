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

    public void displayScoreTeamA(int scoreTeamA) {
        TextView scoreTV = findViewById(R.id.TeamAScore);

        scoreTV.setText(String.valueOf(scoreTeamA));
    }

    public void teamATD(View v){
        scoreTeamA += 6;
        displayScoreTeamA(scoreTeamA);
    }

    public void teamAExtraPoint(View v){
        scoreTeamA += 1;
        displayScoreTeamA(scoreTeamA);
    }

    public void teamA2Pt(View v){
        scoreTeamA += 2;
        displayScoreTeamA(scoreTeamA);
    }

    public void teamAFieldGoal(View v){
        scoreTeamA += 3;
        displayScoreTeamA(scoreTeamA);
    }

    public void teamASafety(View v){
        scoreTeamA += 2;
        displayScoreTeamA(scoreTeamA);
    }
}

