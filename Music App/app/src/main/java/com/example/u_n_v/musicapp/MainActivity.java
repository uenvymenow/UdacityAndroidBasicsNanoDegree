package com.example.u_n_v.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find Classic Rock Genre
        TextView classicRock = findViewById(R.id.classic_rock);
        classicRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent classicRockIntent = new Intent(MainActivity.this, ClassicRock.class);
                startActivity(classicRockIntent);
            }
        });

        // Find Jazz Genre
        TextView jazz = findViewById(R.id.jazz);
        jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jazzIntent = new Intent(MainActivity.this, JazzActivity.class);
                startActivity(jazzIntent);
            }
        });

        // Find Alternative Rock Genre
        TextView alternativeRock = findViewById(R.id.alternative_rock);
        alternativeRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alternativeIntent = new Intent(MainActivity.this, AlternativeRock.class);
                startActivity(alternativeIntent);
            }
        });

        // Find Country Genre
        final TextView country = findViewById(R.id.country);
        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent countryIntent = new Intent(MainActivity.this, Country.class);
                startActivity(countryIntent);
            }
        });

        // Find Rap Genre
        final TextView rap = findViewById(R.id.rap);
        rap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rapIntent = new Intent(MainActivity.this, Rap.class);
                startActivity(rapIntent);
            }
        });

        // Find PopRock Genre
        final TextView popRock = findViewById(R.id.pop_rock);
        popRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popRockIntent = new Intent(MainActivity.this, PopRock.class);
                startActivity(popRockIntent);
            }
        });

        // Find Soundtrack Genre
        final TextView soundtracks = findViewById(R.id.soundtracks);
        soundtracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent soundtracksIntent = new Intent(MainActivity.this, Soundtracks.class);
                startActivity(soundtracksIntent);
            }
        });
    }
}
