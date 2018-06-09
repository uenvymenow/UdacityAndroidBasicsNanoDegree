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

public class Believe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.mipmap.believe_album_justin_bieber, "All Around the World"));
        songList.add(new Songs(R.mipmap.believe_album_justin_bieber, "Boyfriend"));
        songList.add(new Songs(R.mipmap.believe_album_justin_bieber, "As Long As You Love Me"));
        songList.add(new Songs(R.mipmap.believe_album_justin_bieber, "Catching Feelings"));
        songList.add(new Songs(R.mipmap.believe_album_justin_bieber, "Take You"));
        songList.add(new Songs(R.mipmap.believe_album_justin_bieber, "Right Here"));
        songList.add(new Songs(R.mipmap.believe_album_justin_bieber, "Fall"));
        songList.add(new Songs(R.mipmap.believe_album_justin_bieber, "Die in Your Arms"));
        songList.add(new Songs(R.mipmap.believe_album_justin_bieber, "Thought of You"));
        songList.add(new Songs(R.mipmap.believe_album_justin_bieber, "Beauty and a Beat"));
        songList.add(new Songs(R.mipmap.believe_album_justin_bieber, "One Love"));
        songList.add(new Songs(R.mipmap.believe_album_justin_bieber, "Be Alright"));
        songList.add(new Songs(R.mipmap.believe_album_justin_bieber, "Believe"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "All Around the World") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Boyfriend") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "As Long as You Love Me") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Catching Feelings") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Take You") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Right Here") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Fall") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Die in Your Arms") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Thought of You") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Beauty and a Beat") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "One Love") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Be Alright") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Believe") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(Believe.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();
    }
}
