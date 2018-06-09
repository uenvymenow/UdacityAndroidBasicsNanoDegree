package com.example.u_n_v.musicapp.Artists.ClassicRockArtists.LedZeppelinAlbums;

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

public class LedZeppelin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.mipmap.led_zeppelin_album_led_zeppelin, "Good Times Bad Times"));
        songList.add(new Songs(R.mipmap.led_zeppelin_album_led_zeppelin, "Babe I'm Gonna Leave You"));
        songList.add(new Songs(R.mipmap.led_zeppelin_album_led_zeppelin, "You Shook Me"));
        songList.add(new Songs(R.mipmap.led_zeppelin_album_led_zeppelin, "Dazed and Confused"));
        songList.add(new Songs(R.mipmap.led_zeppelin_album_led_zeppelin, "Your Time Is Gonna Come"));
        songList.add(new Songs(R.mipmap.led_zeppelin_album_led_zeppelin, "Black Mountain Side (instrumental)"));
        songList.add(new Songs(R.mipmap.led_zeppelin_album_led_zeppelin, "Communication Breakdown"));
        songList.add(new Songs(R.mipmap.led_zeppelin_album_led_zeppelin, "I Can't Quit You Baby"));
        songList.add(new Songs(R.mipmap.led_zeppelin_album_led_zeppelin, "How Many More Times"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Good Times Bad Times") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Babe I'm Gonna Leave You") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "You Shook Me") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Dazed and Confused") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Your Time Is Gonna Come") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Black Mountain Side (instrumental)") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Communication Breakdown") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I Can't Quit You Baby") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "How Many More Times") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(LedZeppelin.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();
    }
}
