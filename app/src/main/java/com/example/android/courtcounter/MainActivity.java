package com.example.android.courtcounter;

import android.support.v4.app.FragmentContainer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ScrollingTabContainerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.R.attr.id;
import static android.R.attr.name;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA();
        displayForTeamB();
    }

    int teamAScore = 0;
    int teamBScore = 0;

    /*
      Aceste doua metode sunt pentru afisarea scorului echipelor
      TO-DO de rezumat la o singura metoda mai generala
     */
    private void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(teamAScore));
    }

    private void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(teamBScore));
    }
    
    private void addPointsForA(int points) {
        teamAScore += points;
        displayForTeamA();
    }

    public void addThreeForTeamA(View v) {
        addPointsForA(3);
    }

    public void addTwoForTeamA(View v) {
        addPointsForA(2);
    }

    public void freeThrowForTeamA(View v) {
        addPointsForA(1);
    }

    private void addPointsForB(int points) {
        teamBScore += points;
        displayForTeamB();
    }

    public void addThreeForB(View v) {
        addPointsForB(3);
    }

    public void addTwoForB(View v) {
        addPointsForB(2);
    }

    public void freeThrowForB(View v) {
        addPointsForB(1);
    }

    public void resetScore(View v) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamB();
        displayForTeamA();
    }
}

