package com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.LinkinParkAlbums;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDayAlbums.AmericanIdiot;
import com.example.u_n_v.musicapp.R;
import com.example.u_n_v.musicapp.SongAdapters.SongAdapter;
import com.example.u_n_v.musicapp.SongAdapters.Songs;

import java.util.ArrayList;

public class Meteora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Meteora","Foreward"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Meteora","Don't Stay"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Meteora","Somewhere I Belong"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Meteora","Lying from You"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Meteora","Hit the Floor"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Meteora","Easier to Run"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Meteora","Faint"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Meteora","Figure.09"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Meteora","Breaking the Habit"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Meteora","From the Inside"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Meteora","Nobody's Listening"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Meteora","Session"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Meteora","Numb"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Foreward") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Don't Stay") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Somewhere I Belong") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Lying from You") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Hit the Floor") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Easier to Run") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Faint") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Figure.09") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Breaking the Habit") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "From the Inside") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Nobody's Listening") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Session") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Numb") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(Meteora.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
