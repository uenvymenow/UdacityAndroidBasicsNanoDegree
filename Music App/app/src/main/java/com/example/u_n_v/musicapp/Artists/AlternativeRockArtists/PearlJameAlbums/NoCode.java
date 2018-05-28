package com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.PearlJameAlbums;

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

public class NoCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.no_code_album_pearl_jam, "Sometimes"));
        songList.add(new Songs(R.drawable.no_code_album_pearl_jam, "Hail, Hail"));
        songList.add(new Songs(R.drawable.no_code_album_pearl_jam, "Who You Are"));
        songList.add(new Songs(R.drawable.no_code_album_pearl_jam, "In My Tree"));
        songList.add(new Songs(R.drawable.no_code_album_pearl_jam, "Smile"));
        songList.add(new Songs(R.drawable.no_code_album_pearl_jam, "Off He Goes"));
        songList.add(new Songs(R.drawable.no_code_album_pearl_jam, "Habit"));
        songList.add(new Songs(R.drawable.no_code_album_pearl_jam, "Red Mosquito"));
        songList.add(new Songs(R.drawable.no_code_album_pearl_jam, "Lukin"));
        songList.add(new Songs(R.drawable.no_code_album_pearl_jam, "Present Tense"));
        songList.add(new Songs(R.drawable.no_code_album_pearl_jam, "Mankind"));
        songList.add(new Songs(R.drawable.no_code_album_pearl_jam, "I'm Open"));
        songList.add(new Songs(R.drawable.no_code_album_pearl_jam, "Around the Bend"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Sometimes") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Hail, Hail") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Who You Are") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "In My Tree") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Smile") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Off He Goes") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Habit") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Red Mosquito") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Lukin") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Present Tense") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Mankind") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I'm Open") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Around the Bend") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(NoCode.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
