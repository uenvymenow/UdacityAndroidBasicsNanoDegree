package com.example.u_n_v.musicapp.Artists.CountryArtists.TimMcGrawAlbums;

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

public class SundownHeavenTown extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.sundown_heaven_town_album_tim_mcgraw, "Sundown Heaven Town","Overrated"));
        songList.add(new Songs(R.drawable.sundown_heaven_town_album_tim_mcgraw, "Sundown Heaven Town","City Lights"));
        songList.add(new Songs(R.drawable.sundown_heaven_town_album_tim_mcgraw, "Sundown Heaven Town","Shotgun Rider"));
        songList.add(new Songs(R.drawable.sundown_heaven_town_album_tim_mcgraw, "Sundown Heaven Town","Dust"));
        songList.add(new Songs(R.drawable.sundown_heaven_town_album_tim_mcgraw, "Sundown Heaven Town","Diamond Rings and Old Barstools"));
        songList.add(new Songs(R.drawable.sundown_heaven_town_album_tim_mcgraw, "Sundown Heaven Town","Words Are Medicine"));
        songList.add(new Songs(R.drawable.sundown_heaven_town_album_tim_mcgraw, "Sundown Heaven Town","Sick of Me"));
        songList.add(new Songs(R.drawable.sundown_heaven_town_album_tim_mcgraw, "Sundown Heaven Town","Meanwhile Back at Mama's"));
        songList.add(new Songs(R.drawable.sundown_heaven_town_album_tim_mcgraw, "Sundown Heaven Town","Keep On Truckin"));
        songList.add(new Songs(R.drawable.sundown_heaven_town_album_tim_mcgraw, "Sundown Heaven Town","Last Turn Home"));
        songList.add(new Songs(R.drawable.sundown_heaven_town_album_tim_mcgraw, "Sundown Heaven Town","Portland, Maine"));
        songList.add(new Songs(R.drawable.sundown_heaven_town_album_tim_mcgraw, "Sundown Heaven Town","Lookin' for That Girl"));
        songList.add(new Songs(R.drawable.sundown_heaven_town_album_tim_mcgraw, "Sundown Heaven Town","Still on the Line"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Overrated") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "City Lights") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Shotgun Rider") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Dust") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Diamond Rings and Old Barstools") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Words Are Medicine") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Sick of Me") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Meanwhile Back at Mama's") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Keep On Truckin") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Last Turn Home") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Portland, Maine") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Lookin' for That Girl") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Still on the Line") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(SundownHeavenTown.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();
    }
}
