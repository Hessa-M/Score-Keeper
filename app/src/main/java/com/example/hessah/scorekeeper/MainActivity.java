package com.example.hessah.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int ScoreTeamA = 0;
    private int ScoreTeamB = 0;
    TextView scoreTeam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void PlusSixPointsTeamA(View view) {
        ScoreTeamA += 6;
        DisplayTextTeamA(ScoreTeamA);
    }

    public void PlusThreePointsTeamA(View view) {
        ScoreTeamA += 3;
        DisplayTextTeamA(ScoreTeamA);
    }

    public void PlusTwoPointsTeamA(View view) {
        ScoreTeamA += 2;
        DisplayTextTeamA(ScoreTeamA);
    }

    public void PlusOnePointTeamA(View view) {
        ScoreTeamA += 1;
        DisplayTextTeamA(ScoreTeamA);
    }

    public void PlusSixPointsTeamB(View view) {
        ScoreTeamB += 6;
        DisplayTextTeamB(ScoreTeamB);
    }

    public void PlusThreePointsTeamB(View view) {
        ScoreTeamB += 3;
        DisplayTextTeamB(ScoreTeamB);
    }

    public void PlusTwoPointsTeamB(View view) {
        ScoreTeamB += 2;
        DisplayTextTeamB(ScoreTeamB);
    }

    public void PlusOnePointTeamB(View view) {
        ScoreTeamB += 1;
        DisplayTextTeamB(ScoreTeamB);
    }

    public void Reset(View view) {
        ScoreTeamA = 0;
        ScoreTeamB = 0;
        DisplayTextTeamA(ScoreTeamA);
        DisplayTextTeamB(ScoreTeamB);
    }

    public void DisplayTextTeamA(int score) {
        scoreTeam = findViewById(R.id.TeamA);
        scoreTeam.setText(String.valueOf(score));
    }

    public void DisplayTextTeamB(int score) {
        scoreTeam = findViewById(R.id.TeamB);
        scoreTeam.setText(String.valueOf(score));
    }
}
