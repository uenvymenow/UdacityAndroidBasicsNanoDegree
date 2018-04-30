package com.example.u_n_v.statequiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import java.io.Console;
import java.util.logging.ConsoleHandler;

public class MainActivity extends AppCompatActivity {

    int totalQuestions = 10;
    int correctAnswers = 0;
    int question1Score = 0;
//    int question2Score = 0;
//    int question3Score = 0;
//    int question4Score = 0;
//    int question5Score = 0;
//    int question6Score = 0;
//    int question7Score = 0;
//    int question8Score = 0;
//    int question9Score = 0;
//    int question10Score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void question1RadioButton(View view) {
        // Import radio buttons for question 1
        RadioButton questionOneCorrectRB = findViewById(R.id.question1CorrectAnswer);

        // Check if correct RadioButton is clicked
        if (questionOneCorrectRB.isChecked()) {
            question1Score = 1;
        } else {
            question1Score = 0;
        }
    }

    public void displayScore(){
        Toast.makeText(this, "Your final score is " + calculateFinalScore(calculateCorrectScore(), totalQuestions) + "%", Toast.LENGTH_SHORT).show();
    }

    public void submitButton(View v){
        displayScore();
    }

    public int calculateCorrectScore(){
        // Adds all of the correct answers
        correctAnswers = question1Score;
        return correctAnswers;
    }

    public int calculateFinalScore(int answersCorrect, int questionTotal) {
        int percentCorrect = (int) (((double) answersCorrect / (double) questionTotal) * 100);
        return percentCorrect;
    }

}
