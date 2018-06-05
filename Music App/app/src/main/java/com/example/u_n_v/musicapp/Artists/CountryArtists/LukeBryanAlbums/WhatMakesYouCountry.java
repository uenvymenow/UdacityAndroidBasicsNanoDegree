package com.example.u_n_v.musicapp.Artists.CountryArtists.LukeBryanAlbums;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.u_n_v.musicapp.R;
import com.example.u_n_v.musicapp.SongAdapters.SongAdapter;
import com.example.u_n_v.musicapp.SongAdapters.Songs;

import java.util.ArrayList;

public class WhatMakesYouCountry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.what_makes_you_country_album_luke_bryan, "What Makes You Country"));
        songList.add(new Songs(R.drawable.what_makes_you_country_album_luke_bryan, "Out of Nowhere Girl"));
        songList.add(new Songs(R.drawable.what_makes_you_country_album_luke_bryan, "Light It Up"));
        songList.add(new Songs(R.drawable.what_makes_you_country_album_luke_bryan, "Most People Are Good"));
        songList.add(new Songs(R.drawable.what_makes_you_country_album_luke_bryan, "Sunrise, Sunburn, Sunset"));
        songList.add(new Songs(R.drawable.what_makes_you_country_album_luke_bryan, "Bad Lovers"));
        songList.add(new Songs(R.drawable.what_makes_you_country_album_luke_bryan, "Drinking Again"));
        songList.add(new Songs(R.drawable.what_makes_you_country_album_luke_bryan, "Land of a Million Songs"));
        songList.add(new Songs(R.drawable.what_makes_you_country_album_luke_bryan, "Like You Say You Do"));
        songList.add(new Songs(R.drawable.what_makes_you_country_album_luke_bryan, "Hooked on It"));
        songList.add(new Songs(R.drawable.what_makes_you_country_album_luke_bryan, "She's a Hot One"));
        songList.add(new Songs(R.drawable.what_makes_you_country_album_luke_bryan, "Hungover in a Hotel Room"));
        songList.add(new Songs(R.drawable.what_makes_you_country_album_luke_bryan, "Pick It Up"));
        songList.add(new Songs(R.drawable.what_makes_you_country_album_luke_bryan, "Driving This Thing"));
        songList.add(new Songs(R.drawable.what_makes_you_country_album_luke_bryan, "Win Life"));

        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "What Makes You Country") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Out of Nowhere Girl") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Light It Up") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Most People Are Good") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Sunrise, Sunburn, Sunset") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Bad Lovers") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Drinking Again") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Land of a Million Songs") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Like You Say You Do") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Hooked on It") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "She's a Hot One") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Hungover in a Hotel Room") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Pick It Up") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Driving This Thing") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Win Life") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(WhatMakesYouCountry.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();
    }
}
