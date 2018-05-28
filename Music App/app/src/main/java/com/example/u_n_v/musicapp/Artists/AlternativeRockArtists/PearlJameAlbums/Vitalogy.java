package com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.PearlJameAlbums;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.LinkinParkAlbums.Meteora;
import com.example.u_n_v.musicapp.R;
import com.example.u_n_v.musicapp.SongAdapters.SongAdapter;
import com.example.u_n_v.musicapp.SongAdapters.Songs;

import java.util.ArrayList;

public class Vitalogy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.vitalogy_album_pearl_jam, "Last Exit"));
        songList.add(new Songs(R.drawable.vitalogy_album_pearl_jam, "Spin the Black Circle"));
        songList.add(new Songs(R.drawable.vitalogy_album_pearl_jam, "Not for You"));
        songList.add(new Songs(R.drawable.vitalogy_album_pearl_jam, "Tremor Christ"));
        songList.add(new Songs(R.drawable.vitalogy_album_pearl_jam, "Nothingman"));
        songList.add(new Songs(R.drawable.vitalogy_album_pearl_jam, "Whipping"));
        songList.add(new Songs(R.drawable.vitalogy_album_pearl_jam, "Pry, To"));
        songList.add(new Songs(R.drawable.vitalogy_album_pearl_jam, "Corduroy"));
        songList.add(new Songs(R.drawable.vitalogy_album_pearl_jam, "Bugs"));
        songList.add(new Songs(R.drawable.vitalogy_album_pearl_jam, "Satan's Bed"));
        songList.add(new Songs(R.drawable.vitalogy_album_pearl_jam, "Better Man"));
        songList.add(new Songs(R.drawable.vitalogy_album_pearl_jam, "Aye Davanita"));
        songList.add(new Songs(R.drawable.vitalogy_album_pearl_jam, "Immortality"));
        songList.add(new Songs(R.drawable.vitalogy_album_pearl_jam, "Hey Foxymophandlemama, That's Me"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Last Exit") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Spin the Black Circle") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Not for You") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Tremor Christ") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Nothingman") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Whipping") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Pry, To") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Corduroy") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Bugs") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Satan's Bed") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Better Man") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Aye Davanita") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Immortality") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Hey Foxymophandlemama, That's Me") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(Vitalogy.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
