package com.example.u_n_v.statequiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.io.Console;
import java.util.logging.ConsoleHandler;

public class MainActivity extends AppCompatActivity {

    int totalQuestions = 10;
    int correctAnswers = 0;
    int question1Score = 0;
    int question2Score = 0;
    int question3Score = 0;
    int question4Score = 0;
    int question5Score = 0;
    int question6Score = 0;
    int question7Score = 0;
    int question8Score = 0;
    int question9Score = 0;
    int question10Score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Grabs the question1RadioButton and sees if it is checked or not for the correct answer
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

    // Grabs the question1RadioButton and sees if it is checked or not for the correct answer

    public void question2RadioButton(View view) {
        // Import radio buttons for question 2
        RadioButton questionTwoCorrectRB = findViewById(R.id.question2CorrectAnswer);

        // Check if correct RadioButton is clicked
        if (questionTwoCorrectRB.isChecked()) {
            question2Score = 1;
        } else {
            question2Score = 0;
        }
    }

    public int question3EditText() {
        // Import the value for EditText in question 3
        EditText questionThreeAnswer = findViewById(R.id.question3Answer);

        // Converts input from EditText to String
        String questionThree = questionThreeAnswer.getText().toString();
        questionThree = questionThree.toLowerCase();

        // Check if correct answer is input
        if (questionThree.equals("delaware")) {
            question3Score = 1;
        } else {
            question3Score = 0;
        }

        return question3Score;
    }

    // Displays Toast Message of final score
    public void displayScore(){
        Toast.makeText(this, "Your final score is " + calculateFinalScore(calculateCorrectScore(), totalQuestions) + "%", Toast.LENGTH_SHORT).show();
    }

    // Process displayScore method when submit button is clicked
    public void submitButton(View v){
        displayScore();
    }

    // Calculates the score of correct answers
    public int calculateCorrectScore(){
        // Calls correct score from question 3 EditText
        question3Score = question3EditText();

        // Adds all of the correct answers
        correctAnswers = question1Score + question2Score + question3Score;
        return correctAnswers;
    }

    // Calculates the final score in percentage
    public int calculateFinalScore(int answersCorrect, int questionTotal) {
        int percentCorrect = (int) (((double) answersCorrect / (double) questionTotal) * 100);
        return percentCorrect;
    }
}
