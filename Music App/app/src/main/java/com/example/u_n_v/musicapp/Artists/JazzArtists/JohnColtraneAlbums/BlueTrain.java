package com.example.u_n_v.musicapp.Artists.JazzArtists.JohnColtraneAlbums;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDayAlbums.Dookie;
import com.example.u_n_v.musicapp.R;
import com.example.u_n_v.musicapp.SongAdapters.SongAdapter;
import com.example.u_n_v.musicapp.SongAdapters.Songs;

import java.util.ArrayList;

public class BlueTrain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.blue_train_album_john_coltrane, "Blue Train","Blue Train"));
        songList.add(new Songs(R.drawable.blue_train_album_john_coltrane, "Blue Train","Moment's Notice"));
        songList.add(new Songs(R.drawable.blue_train_album_john_coltrane, "Blue Train","Locomotion"));
        songList.add(new Songs(R.drawable.blue_train_album_john_coltrane, "Blue Train","I'm Old Fashioned"));
        songList.add(new Songs(R.drawable.blue_train_album_john_coltrane, "Blue Train","Lazy Bird"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Blue Train") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Moment's Notice") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Locomtion") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I'm Old Fashioned") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Lazy Bird") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(BlueTrain.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();
    }
}
