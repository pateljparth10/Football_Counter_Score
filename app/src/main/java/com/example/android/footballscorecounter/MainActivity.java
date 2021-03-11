package com.example.android.footballscorecounter;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.android.footballscorecounter.R;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    public void six_points_team_a (View view){
        scoreTeamA += 6;
        displayForTeamA(scoreTeamA);
    }

    public void three_points_team_a(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void two_points_team_a(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void one_point_team_a(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);

    }
    public void six_points_team_b (View view){
        scoreTeamB += 6;
        displayForTeamB(scoreTeamB);
    }

    public void three_points_team_b(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void two_points_team_b(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void one_point_team_b(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
* Reset the scores to 0 for Team A and Team B
      */
    public void reset (View vew){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA ( int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}