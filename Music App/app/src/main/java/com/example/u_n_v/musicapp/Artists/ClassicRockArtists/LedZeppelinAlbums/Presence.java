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

public class Presence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.mipmap.presence_album_led_zeppelin, "Achilles Last Stand"));
        songList.add(new Songs(R.mipmap.presence_album_led_zeppelin, "For Your Life"));
        songList.add(new Songs(R.mipmap.presence_album_led_zeppelin, "Royal Orleans"));
        songList.add(new Songs(R.mipmap.presence_album_led_zeppelin, "Nobody's Fault but Mine"));
        songList.add(new Songs(R.mipmap.presence_album_led_zeppelin, "Candy Store Rock"));
        songList.add(new Songs(R.mipmap.presence_album_led_zeppelin, "Hots On for Nowhere"));
        songList.add(new Songs(R.mipmap.presence_album_led_zeppelin, "Tea for One"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Achilles Last Stand") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "For Your Life") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Royal Orleans") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Nobody's Fault but Mine") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Candy Store Rock") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Hots On for Nowhere") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Tea for One") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(Presence.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
