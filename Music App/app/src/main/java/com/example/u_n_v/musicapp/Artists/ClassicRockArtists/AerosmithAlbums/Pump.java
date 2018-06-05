package com.example.u_n_v.musicapp.Artists.ClassicRockArtists.AerosmithAlbums;

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

public class Pump extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.pump_album_aerosmith, "Young Lust"));
        songList.add(new Songs(R.drawable.pump_album_aerosmith, "F.I.N.E."));
        songList.add(new Songs(R.drawable.pump_album_aerosmith, "Going Down/Love in an Elevator"));
        songList.add(new Songs(R.drawable.pump_album_aerosmith, "Monkey on My Back"));
        songList.add(new Songs(R.drawable.pump_album_aerosmith, "Water Song/Janie's Got a Gun"));
        songList.add(new Songs(R.drawable.pump_album_aerosmith, "Dulcimer Stomp/The Other Side"));
        songList.add(new Songs(R.drawable.pump_album_aerosmith, "My Girl"));
        songList.add(new Songs(R.drawable.pump_album_aerosmith, "Don't Get Mad, Get Even"));
        songList.add(new Songs(R.drawable.pump_album_aerosmith, "Hoodoo/Voodoo Medicine Man"));
        songList.add(new Songs(R.drawable.pump_album_aerosmith, "What It Takes"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Young Lust") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "F.I.N.E.") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Going Down/Love in an Elevator") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Monkey on My Back") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Water Song/Janie's Got a Gun") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Dulcimer Stomp/The Other Side") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "My Girl") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Don't Get Mad, Get Even") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Hoodoo/Voodoo Medicine Man") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "What It Takes") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(Pump.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
