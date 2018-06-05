package com.example.u_n_v.musicapp.Artists.PopRockArtists.KatyPerryAlbums;

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

public class Witness extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.witness_album_katy_perry, "Witness"));
        songList.add(new Songs(R.drawable.witness_album_katy_perry, "Hey Hey Hey"));
        songList.add(new Songs(R.drawable.witness_album_katy_perry, "Roulette"));
        songList.add(new Songs(R.drawable.witness_album_katy_perry, "Swish Swish"));
        songList.add(new Songs(R.drawable.witness_album_katy_perry, "Deja Vu"));
        songList.add(new Songs(R.drawable.witness_album_katy_perry, "Power"));
        songList.add(new Songs(R.drawable.witness_album_katy_perry, "Mind Maze"));
        songList.add(new Songs(R.drawable.witness_album_katy_perry, "Miss You More"));
        songList.add(new Songs(R.drawable.witness_album_katy_perry, "Chained to the Rhythm"));
        songList.add(new Songs(R.drawable.witness_album_katy_perry, "Tsunami"));
        songList.add(new Songs(R.drawable.witness_album_katy_perry, "Bon Appetit"));
        songList.add(new Songs(R.drawable.witness_album_katy_perry, "Bigger Than Me"));
        songList.add(new Songs(R.drawable.witness_album_katy_perry, "Save as Draft"));
        songList.add(new Songs(R.drawable.witness_album_katy_perry, "Pendulum"));
        songList.add(new Songs(R.drawable.witness_album_katy_perry, "Into Me You See"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Witness") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Hey Hey Hey") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Roulette") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Swish Swish") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Deja Vu") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Power") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Mind Maze") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Miss You More") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Chained to the Rhythm") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Tsunami") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Bon Appetit") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Bigger Than Me") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Save as Draft") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Pendulum") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Into Me You See") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(Witness.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();
    }
}
