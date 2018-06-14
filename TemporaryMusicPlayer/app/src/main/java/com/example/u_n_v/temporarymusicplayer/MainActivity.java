package com.example.u_n_v.temporarymusicplayer;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        song = MediaPlayer.create(this, R.raw.broke_for_free_night_owl);
    }

    public void PlayButton(View view){
        song.start();
    }

    public void PauseButton(View view){
        song.pause();
    }
}
