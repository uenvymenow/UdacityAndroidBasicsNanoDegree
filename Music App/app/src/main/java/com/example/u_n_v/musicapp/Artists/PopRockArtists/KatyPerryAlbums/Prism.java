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

public class Prism extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.prism_album_katy_perry, "Prism","Roar"));
        songList.add(new Songs(R.drawable.prism_album_katy_perry, "Prism","Legendary Lovers"));
        songList.add(new Songs(R.drawable.prism_album_katy_perry, "Prism","Birthday"));
        songList.add(new Songs(R.drawable.prism_album_katy_perry, "Prism","Walking on Air"));
        songList.add(new Songs(R.drawable.prism_album_katy_perry, "Prism","Unconditionally"));
        songList.add(new Songs(R.drawable.prism_album_katy_perry, "Prism","Dark Horse"));
        songList.add(new Songs(R.drawable.prism_album_katy_perry, "Prism","This Is How We Do"));
        songList.add(new Songs(R.drawable.prism_album_katy_perry, "Prism","International Smile"));
        songList.add(new Songs(R.drawable.prism_album_katy_perry, "Prism","Ghost"));
        songList.add(new Songs(R.drawable.prism_album_katy_perry, "Prism","Love Me"));
        songList.add(new Songs(R.drawable.prism_album_katy_perry, "Prism","This Moment"));
        songList.add(new Songs(R.drawable.prism_album_katy_perry, "Prism","Double Rainbow"));
        songList.add(new Songs(R.drawable.prism_album_katy_perry, "Prism","By the Grace of God"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Roar") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Legendary Lovers") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Birthday") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Walking on Air") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Unconditionally") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Dark Horse") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "This Is How We Do") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "International Smile") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Ghost") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Love Me") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "This Moment") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Double Rainbow") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "By the Grace of God") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(Prism.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();
    }
}
