package com.example.u_n_v.musicapp.Artists.CountryArtists.TobyKeithAlbums;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.u_n_v.musicapp.Artists.CountryArtists.TimMcGrawAlbums.SundownHeavenTown;
import com.example.u_n_v.musicapp.R;
import com.example.u_n_v.musicapp.SongAdapters.SongAdapter;
import com.example.u_n_v.musicapp.SongAdapters.Songs;

import java.util.ArrayList;

public class BulletsInTheGun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.mipmap.bullets_in_the_gun_album_toby_keith, "Bullets in the Gun"));
        songList.add(new Songs(R.mipmap.bullets_in_the_gun_album_toby_keith, "Somewhere Else"));
        songList.add(new Songs(R.mipmap.bullets_in_the_gun_album_toby_keith, "Trailerhood"));
        songList.add(new Songs(R.mipmap.bullets_in_the_gun_album_toby_keith, "In a Couple of Days"));
        songList.add(new Songs(R.mipmap.bullets_in_the_gun_album_toby_keith, "Think About You All of the Time"));
        songList.add(new Songs(R.mipmap.bullets_in_the_gun_album_toby_keith, "Kissin' in the Rain"));
        songList.add(new Songs(R.mipmap.bullets_in_the_gun_album_toby_keith, "Drive it on Home"));
        songList.add(new Songs(R.mipmap.bullets_in_the_gun_album_toby_keith, "Ain't Breakin' Nothin'"));
        songList.add(new Songs(R.mipmap.bullets_in_the_gun_album_toby_keith, "Is That All You Got"));
        songList.add(new Songs(R.mipmap.bullets_in_the_gun_album_toby_keith, "Get Out of My Car"));

        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Bullets in the Gun") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Somewhere Else") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Trailerhood") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "In a Couple of Days") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Think About You All of the Time") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Kissin' in the Rain") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Drive it on Home") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Ain't No Breakin' Nothin'") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Is That All You Got") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Get Out of My Car") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(BulletsInTheGun.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();
    }
}
