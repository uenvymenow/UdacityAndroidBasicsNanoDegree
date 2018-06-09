package com.example.u_n_v.musicapp.Artists.PopRockArtists.JustinBieberAlbums;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.u_n_v.musicapp.Artists.CountryArtists.TobyKeithAlbums.ClancysTavern;
import com.example.u_n_v.musicapp.R;
import com.example.u_n_v.musicapp.SongAdapters.SongAdapter;
import com.example.u_n_v.musicapp.SongAdapters.Songs;

import java.util.ArrayList;

public class MyWorld20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.mipmap.my_world_2_0_album_justin_bieber, "Baby"));
        songList.add(new Songs(R.mipmap.my_world_2_0_album_justin_bieber, "Somebody to Love"));
        songList.add(new Songs(R.mipmap.my_world_2_0_album_justin_bieber, "Stuck in the Moment"));
        songList.add(new Songs(R.mipmap.my_world_2_0_album_justin_bieber, "U Smile"));
        songList.add(new Songs(R.mipmap.my_world_2_0_album_justin_bieber, "Runaway Love"));
        songList.add(new Songs(R.mipmap.my_world_2_0_album_justin_bieber, "Never Let You Go"));
        songList.add(new Songs(R.mipmap.my_world_2_0_album_justin_bieber, "Overboard"));
        songList.add(new Songs(R.mipmap.my_world_2_0_album_justin_bieber, "Eenie Meenie"));
        songList.add(new Songs(R.mipmap.my_world_2_0_album_justin_bieber, "Up"));
        songList.add(new Songs(R.mipmap.my_world_2_0_album_justin_bieber, "That Should Be Me"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Baby") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Somebody to Love") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Stuck in the Moment") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "U Smile") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Runaway Love") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Never Let You Go") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Overboard") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Eenie Meenie") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Up") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "That Should Be Me") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(MyWorld20.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();
    }
}
