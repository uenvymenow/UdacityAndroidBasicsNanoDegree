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

public class ToysInTheAttic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Toys in the Attic","Toys in the Attic"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Toys in the Attic","Uncle Salty"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Toys in the Attic","Adam's Apple"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Toys in the Attic","Walk This Way"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Toys in the Attic","Big Ten Inch Record"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Toys in the Attic","Sweet Emotion"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Toys in the Attic","No More No More"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Toys in the Attic","Round and Round"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Toys in the Attic","You See Me Crying"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Toys in the Attic") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Uncle Salty") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Adam's Apple") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Walk This Way") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Big Ten Inch Record") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Sweet Emotion") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "No More No More") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Round and Round") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "You See Me Crying") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(ToysInTheAttic.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
