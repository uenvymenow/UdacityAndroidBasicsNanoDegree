package com.example.u_n_v.musicapp.Artists.PopRockArtists.JustinBieberAlbums;

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

public class Purpose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.mipmap.purpose_album_justin_bieber, "Mark My Words"));
        songList.add(new Songs(R.mipmap.purpose_album_justin_bieber, "I'll Show You"));
        songList.add(new Songs(R.mipmap.purpose_album_justin_bieber, "What Do You Mean?"));
        songList.add(new Songs(R.mipmap.purpose_album_justin_bieber, "Sorry"));
        songList.add(new Songs(R.mipmap.purpose_album_justin_bieber, "Love Yourself"));
        songList.add(new Songs(R.mipmap.purpose_album_justin_bieber, "Company"));
        songList.add(new Songs(R.mipmap.purpose_album_justin_bieber, "No Pressure"));
        songList.add(new Songs(R.mipmap.purpose_album_justin_bieber, "No Sense"));
        songList.add(new Songs(R.mipmap.purpose_album_justin_bieber, "The Feeling"));
        songList.add(new Songs(R.mipmap.purpose_album_justin_bieber, "Life Is Worth Living"));
        songList.add(new Songs(R.mipmap.purpose_album_justin_bieber, "Where Are U Now"));
        songList.add(new Songs(R.mipmap.purpose_album_justin_bieber, "Children"));
        songList.add(new Songs(R.mipmap.purpose_album_justin_bieber, "Purpose"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Mark My Words") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I'll Show You") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "What Do You Mean?") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Sorry") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Love Yourself") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Company") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "No Pressure") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "No Sense") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "The Feeling") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Life Is Worth Living") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Where Are U Now") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Children") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Purpose") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(Purpose.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();
    }
}
