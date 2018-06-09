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

public class LetItGo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.let_it_go_album_tim_mcgraw, "Let It Go","Last Dollar (Fly Away)"));
        songList.add(new Songs(R.drawable.let_it_go_album_tim_mcgraw, "Let It Go","I'm Workin"));
        songList.add(new Songs(R.drawable.let_it_go_album_tim_mcgraw, "Let It Go","Let It Go"));
        songList.add(new Songs(R.drawable.let_it_go_album_tim_mcgraw, "Let It Go","Whiskey and You"));
        songList.add(new Songs(R.drawable.let_it_go_album_tim_mcgraw, "Let It Go","Suspicions"));
        songList.add(new Songs(R.drawable.let_it_go_album_tim_mcgraw, "Let It Go","Kristofferson"));
        songList.add(new Songs(R.drawable.let_it_go_album_tim_mcgraw, "Let It Go","Put Your Lovin' on Me"));
        songList.add(new Songs(R.drawable.let_it_go_album_tim_mcgraw, "Let It Go","Nothin' to Die For"));
        songList.add(new Songs(R.drawable.let_it_go_album_tim_mcgraw, "Let It Go","Between the River and Me"));
        songList.add(new Songs(R.drawable.let_it_go_album_tim_mcgraw, "Let It Go","Train #10"));
        songList.add(new Songs(R.drawable.let_it_go_album_tim_mcgraw, "Let It Go","I Need You"));
        songList.add(new Songs(R.drawable.let_it_go_album_tim_mcgraw, "Let It Go","Comin' Home"));
        songList.add(new Songs(R.drawable.let_it_go_album_tim_mcgraw, "Let It Go","Shotgun Rider"));
        songList.add(new Songs(R.drawable.let_it_go_album_tim_mcgraw, "Let It Go","If You're Reading This"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Last Dollar (Fly Away)") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I'm Workin") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Let It Go") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Whiskey and You") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Suspicions") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Kristofferson") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Put Your Lovin' on Me") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Nothin' to Die For") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Between the River and Me") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Train #10") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I Need You") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Comin' Home") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Shotgun Rider") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "If You're Reading This") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(LetItGo.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();
    }
}
