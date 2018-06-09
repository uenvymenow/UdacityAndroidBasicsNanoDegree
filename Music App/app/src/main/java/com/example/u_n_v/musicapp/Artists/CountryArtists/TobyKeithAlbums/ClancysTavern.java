package com.example.u_n_v.musicapp.Artists.CountryArtists.TobyKeithAlbums;

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

public class ClancysTavern extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.clancys_tavern_album_toby_keith, "Clancy's Tavern","Made in America"));
        songList.add(new Songs(R.drawable.clancys_tavern_album_toby_keith, "Clancy's Tavern","I Need to Hear a Country Song"));
        songList.add(new Songs(R.drawable.clancys_tavern_album_toby_keith, "Clancy's Tavern","Clancy's Tavern"));
        songList.add(new Songs(R.drawable.clancys_tavern_album_toby_keith, "Clancy's Tavern","Tryin' to Fall in Love"));
        songList.add(new Songs(R.drawable.clancys_tavern_album_toby_keith, "Clancy's Tavern","Just Another Sundown"));
        songList.add(new Songs(R.drawable.clancys_tavern_album_toby_keith, "Clancy's Tavern","Beers Ago"));
        songList.add(new Songs(R.drawable.clancys_tavern_album_toby_keith, "Clancy's Tavern","South of You"));
        songList.add(new Songs(R.drawable.clancys_tavern_album_toby_keith, "Clancy's Tavern","Club Zydeco Moon"));
        songList.add(new Songs(R.drawable.clancys_tavern_album_toby_keith, "Clancy's Tavern","I Won't Let You Down"));
        songList.add(new Songs(R.drawable.clancys_tavern_album_toby_keith, "Clancy's Tavern","Red Solo Cup"));
        songList.add(new Songs(R.drawable.clancys_tavern_album_toby_keith, "Clancy's Tavern","Chill-Axin'"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Made in America") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I Need to Hear a Country Song") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Clancy's Tavern") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Tryin' to Fall in Love") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Just Another Sundown") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Beers Ago") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "South of You") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Club Zydeco Moon") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I Won't Let You Down") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Red Solo Cup") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Chill-Axin'") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(ClancysTavern.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();
    }
}
