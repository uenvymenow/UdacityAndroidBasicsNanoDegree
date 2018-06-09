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

public class Ten extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.ten_album_pearl_jam, "Ten","Once"));
        songList.add(new Songs(R.drawable.ten_album_pearl_jam, "Ten","Even Flow"));
        songList.add(new Songs(R.drawable.ten_album_pearl_jam, "Ten","Alive"));
        songList.add(new Songs(R.drawable.ten_album_pearl_jam, "Ten","Why Go"));
        songList.add(new Songs(R.drawable.ten_album_pearl_jam, "Ten","Black"));
        songList.add(new Songs(R.drawable.ten_album_pearl_jam, "Ten","Jeremy"));
        songList.add(new Songs(R.drawable.ten_album_pearl_jam, "Ten","Oceans"));
        songList.add(new Songs(R.drawable.ten_album_pearl_jam, "Ten","Porch"));
        songList.add(new Songs(R.drawable.ten_album_pearl_jam, "Ten","Garden"));
        songList.add(new Songs(R.drawable.ten_album_pearl_jam, "Ten","Deep"));
        songList.add(new Songs(R.drawable.ten_album_pearl_jam, "Ten","Release"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Once") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Even Flow") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Alive") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Why Go") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Black") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Jeremy") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Oceans") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Porch") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Garden") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Deep") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Release") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(Ten.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
