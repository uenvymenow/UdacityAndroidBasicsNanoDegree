package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Creates words array for NumbersActivity
        String [] words = new String[10];

        // Assign values to array sections
        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "eight";
        words[8] = "nine";
        words[9] = "ten";

        Log.v("NumbersActivity", "Word at index 0: " + words[0]);
        Log.v("NumbersActivity", "Word at index 1: " + words[1]);
        Log.v("NumbersActivity", "Word at index 2: " + words[2]);
        Log.v("NumbersActivity", "Word at index 3: " + words[3]);
        Log.v("NumbersActivity", "Word at index 4: " + words[4]);
        Log.v("NumbersActivity", "Word at index 5: " + words[5]);
        Log.v("NumbersActivity", "Word at index 6: " + words[6]);
        Log.v("NumbersActivity", "Word at index 7: " + words[7]);
        Log.v("NumbersActivity", "Word at index 8: " + words[8]);
        Log.v("NumbersActivity", "Word at index 9: " + words[9]);
    }
}
