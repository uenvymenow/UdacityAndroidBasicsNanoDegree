package com.example.u_n_v.musicapp.Artists.CountryArtists.TimMcGrawAlbums;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.u_n_v.musicapp.Artists.CountryArtists.LukeBryanAlbums.TailgatesAndTanlines;
import com.example.u_n_v.musicapp.R;
import com.example.u_n_v.musicapp.SongAdapters.SongAdapter;
import com.example.u_n_v.musicapp.SongAdapters.Songs;

import java.util.ArrayList;

public class TwoLanesOfFreedom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.two_lanes_of_freedom_album_tim_mcgraw, "Two Lanes of Freedom"));
        songList.add(new Songs(R.drawable.two_lanes_of_freedom_album_tim_mcgraw, "One of Those Nights"));
        songList.add(new Songs(R.drawable.two_lanes_of_freedom_album_tim_mcgraw, "Friend of a Friend"));
        songList.add(new Songs(R.drawable.two_lanes_of_freedom_album_tim_mcgraw, "Southern Girl"));
        songList.add(new Songs(R.drawable.two_lanes_of_freedom_album_tim_mcgraw, "Truck Yeah"));
        songList.add(new Songs(R.drawable.two_lanes_of_freedom_album_tim_mcgraw, "Nashville Without You"));
        songList.add(new Songs(R.drawable.two_lanes_of_freedom_album_tim_mcgraw, "Book of John"));
        songList.add(new Songs(R.drawable.two_lanes_of_freedom_album_tim_mcgraw, "Mexicoma"));
        songList.add(new Songs(R.drawable.two_lanes_of_freedom_album_tim_mcgraw, "Number 37405"));
        songList.add(new Songs(R.drawable.two_lanes_of_freedom_album_tim_mcgraw, "Highway Don't Care"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Two Lanes of Freedom") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "One of Those Nights") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Friend of a Friend") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Southern Girl") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Truck Yeah") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Nashville Without You") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Book of John") {
                    displayNowPlaying(currentSongName);
                }  else if (currentSongName == "Mexicoma") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Number 37405") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "It's Your World") {
                    displayNowPlaying(currentSongName);
                }  else if (currentSongName == "Highway Don't Care") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(TwoLanesOfFreedom.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();
    }
}
