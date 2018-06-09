package com.example.u_n_v.musicapp.Artists.JazzArtists.LouisArmstrongAlbums;

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

public class LouisArmstrongsTownHallConcert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.mipmap.louis_armstrongs_town_hall_concert_album_louis_armstrong, "When Did You Leave Heaven?"));
        songList.add(new Songs(R.mipmap.louis_armstrongs_town_hall_concert_album_louis_armstrong, "You're A Heavenly Thing"));
        songList.add(new Songs(R.mipmap.louis_armstrongs_town_hall_concert_album_louis_armstrong, "I Married An Angel"));
        songList.add(new Songs(R.mipmap.louis_armstrongs_town_hall_concert_album_louis_armstrong, "A Sinner Kissed An Angel"));
        songList.add(new Songs(R.mipmap.louis_armstrongs_town_hall_concert_album_louis_armstrong, "Angela Mia"));
        songList.add(new Songs(R.mipmap.louis_armstrongs_town_hall_concert_album_louis_armstrong, "Angel Child"));
        songList.add(new Songs(R.mipmap.louis_armstrongs_town_hall_concert_album_louis_armstrong, "And The Angels Sing"));
        songList.add(new Songs(R.mipmap.louis_armstrongs_town_hall_concert_album_louis_armstrong, "Fools Rush In"));
        songList.add(new Songs(R.mipmap.louis_armstrongs_town_hall_concert_album_louis_armstrong, "I'll String Along With You"));
        songList.add(new Songs(R.mipmap.louis_armstrongs_town_hall_concert_album_louis_armstrong, "Angel"));
        songList.add(new Songs(R.mipmap.louis_armstrongs_town_hall_concert_album_louis_armstrong, "The Prisoner's Song"));

        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "When Did You Leave Heaven?") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "You're A Heavenly Thing"){
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I Married An Angel"){
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "A Sinner Kissed An Angel"){
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Angela Mia"){
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Angel Child"){
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "And The Angels Sing"){
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Fools rush In"){
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I'll String Along With You"){
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Angel"){
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "The Prisoner's Song"){
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(LouisArmstrongsTownHallConcert.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
