package com.example.android.tabletennisscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

import static android.R.attr.id;
import static android.R.attr.y;
import static android.R.id.message;
import static com.example.android.tabletennisscorekeeper.R.id.setsA_text_view;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA;
    int scoreB;

    int setsA;
    int setsB;

    int netA;
    int netB;


    public void scoreForA(View view) {
        scoreA = scoreA + 1;
        displayForA(scoreA);

        if ((setsA >= 3)) {
                String winnerAMessage = "Player A wins!";
                displaymessageA(winnerAMessage);
        }

    }

    public void scoreForB(View view) {
        scoreB = scoreB + 1;
        displayForB(scoreB);

        if ((setsB >= 3)) {
            String winnerBMessage = "Player B wins!";
            displaymessageB(winnerBMessage);
        }
    }



    public void resetPoints(View w) {
        scoreA = 0;
        scoreB = 0;
    }

    public void netForA(View view) {
        netA += 1;
        displaynetA(netA);
    }

    public void netForB(View view) {
        netB += 1;
        displaynetB(netB);
    }

    public void setForA (View view) {
        setsA += 1;
        displaySetsA(setsA);
    }

    public void setForB (View view) {
        setsB += 1;
        displaySetsB(setsB);
    }

    public void resetAll(View w) {
        scoreA = 0;
        scoreB = 0;
        setsA = 0;
        setsB = 0;
        netA = 0;
        netB = 0;
        displayForA(scoreA);
        displayForB(scoreB);
        displaySetsA(setsA);
        displaySetsB(setsB);
        displaynetA(netA);
        displaynetB(netB);
    }

    private void displayForA(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.scoreA_text_view);
        scoreTextView.setText(NumberFormat.getNumberInstance().format(number));
    }

    private void displayForB(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.scoreB_text_view);
        scoreTextView.setText(NumberFormat.getNumberInstance().format(number));
    }

    private void displaySetsA(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.setsA_text_view);
        scoreTextView.setText(NumberFormat.getNumberInstance().format(number));
    }

    private void displaySetsB(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.setsB_text_view);
        scoreTextView.setText(NumberFormat.getNumberInstance().format(number));
    }

    private void displaynetA(int number) {
        TextView netTextView = (TextView) findViewById(R.id.net1_text_view);
        netTextView.setText(NumberFormat.getNumberInstance().format(number));
    }

    private void displaynetB(int number) {
        TextView netTextView = (TextView) findViewById(R.id.net2_text_view);
        netTextView.setText(NumberFormat.getNumberInstance().format(number));
    }

    private void displaymessageA(String message) {
        TextView winnerA = (TextView) findViewById(R.id.setsA_text_view);
        winnerA.setText(message);
    }

    private void displaymessageB(String message) {
        TextView winnerA = (TextView) findViewById(R.id.setsB_text_view);
        winnerA.setText(message);
    }
}





