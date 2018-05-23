package com.example.u_n_v.musicapp.Artists.JazzArtists.LouisArmstrongAlbums;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDayAlbums.Dookie;
import com.example.u_n_v.musicapp.R;
import com.example.u_n_v.musicapp.SongAdapters.SongAdapter;
import com.example.u_n_v.musicapp.SongAdapters.Songs;

import java.util.ArrayList;

public class LouisUnderTheStars extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.louis_under_the_stars_album_louis_armstrong, "Top Hat, White Tie and Tails"));
        songList.add(new Songs(R.drawable.louis_under_the_stars_album_louis_armstrong, "Have You Met Miss Jones?"));
        songList.add(new Songs(R.drawable.louis_under_the_stars_album_louis_armstrong, "I Only Have Eyes for You"));
        songList.add(new Songs(R.drawable.louis_under_the_stars_album_louis_armstrong, "Stormy Weather"));
        songList.add(new Songs(R.drawable.louis_under_the_stars_album_louis_armstrong, "Home (When Shadows Fall)"));
        songList.add(new Songs(R.drawable.louis_under_the_stars_album_louis_armstrong, "East of the Sun, West of the Moon"));
        songList.add(new Songs(R.drawable.louis_under_the_stars_album_louis_armstrong, "You're Blase"));
        songList.add(new Songs(R.drawable.louis_under_the_stars_album_louis_armstrong, "Body and Soul"));

        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Top Hat, White Tie and Tails") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Have You Met Miss Jones?") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I Only Have Eyes for You") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Stormy Weather") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Home (When Shadows Fall)") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "East of the Sun, West of the Moon") {
                    displayNowPlaying(currentSongName);
                }  else if (currentSongName == "You're Blase") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Body and Soul") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(LouisUnderTheStars.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
