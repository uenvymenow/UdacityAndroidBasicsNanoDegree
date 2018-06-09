package com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDayAlbums;

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

public class Nimrod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.mipmap.nimrod_album_green_day, "Nimrod","Nice Guys Finish Last"));
        songList.add(new Songs(R.mipmap.nimrod_album_green_day, "Nimrod","Hitchin' a Ride"));
        songList.add(new Songs(R.mipmap.nimrod_album_green_day, "Nimrod","The Grouch"));
        songList.add(new Songs(R.mipmap.nimrod_album_green_day, "Nimrod","Redundant"));
        songList.add(new Songs(R.mipmap.nimrod_album_green_day, "Nimrod","Scattered"));
        songList.add(new Songs(R.mipmap.nimrod_album_green_day, "Nimrod","All the Time"));
        songList.add(new Songs(R.mipmap.nimrod_album_green_day, "Nimrod","Worry Rock"));
        songList.add(new Songs(R.mipmap.nimrod_album_green_day, "Nimrod","Platypus (I Hate You)"));
        songList.add(new Songs(R.mipmap.nimrod_album_green_day, "Nimrod","Uptight"));
        songList.add(new Songs(R.mipmap.nimrod_album_green_day, "Nimrod","Last Ride In (Instrumental)"));
        songList.add(new Songs(R.mipmap.nimrod_album_green_day, "Nimrod","Jinx"));
        songList.add(new Songs(R.mipmap.nimrod_album_green_day, "Nimrod","Haushinka"));
        songList.add(new Songs(R.mipmap.nimrod_album_green_day, "Nimrod","Walking Alone"));
        songList.add(new Songs(R.mipmap.nimrod_album_green_day, "Nimrod","Reject"));
        songList.add(new Songs(R.mipmap.nimrod_album_green_day, "Nimrod","Take Back"));
        songList.add(new Songs(R.mipmap.nimrod_album_green_day, "Nimrod","King for a Day"));
        songList.add(new Songs(R.mipmap.nimrod_album_green_day, "Nimrod","Good Riddance (Time of Your Life)"));
        songList.add(new Songs(R.mipmap.nimrod_album_green_day, "Nimrod","Prosthetic Head"));

        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Nice Guys Finish Last") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Hitchin' a Ride") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "The Grouch") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Redundant") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Scattered") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "All the Time") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Worry Rock") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Platypus (I Hate You)") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Uptight") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Last Ride In (Instrumental)") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Jinx") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Haushinka") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Walking Alone") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Reject") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Take Back") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "King for a Day") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Good Riddance (Time of Your Life)") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Prosthetic Head") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(Nimrod.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
