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

public class BigDogDaddy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.mipmap.big_dog_daddy_album_toby_keith, "High Maintenance Woman"));
        songList.add(new Songs(R.mipmap.big_dog_daddy_album_toby_keith, "Love Me If You Can"));
        songList.add(new Songs(R.mipmap.big_dog_daddy_album_toby_keith, "White Rose"));
        songList.add(new Songs(R.mipmap.big_dog_daddy_album_toby_keith, "Get My Drink On"));
        songList.add(new Songs(R.mipmap.big_dog_daddy_album_toby_keith, "Wouldn't Wanna Be Ya"));
        songList.add(new Songs(R.mipmap.big_dog_daddy_album_toby_keith, "Big Dog Daddy"));
        songList.add(new Songs(R.mipmap.big_dog_daddy_album_toby_keith, "I Know She Hung the Moon"));
        songList.add(new Songs(R.mipmap.big_dog_daddy_album_toby_keith, "Pump Jack"));
        songList.add(new Songs(R.mipmap.big_dog_daddy_album_toby_keith, "Burnin' Moonlight"));
        songList.add(new Songs(R.mipmap.big_dog_daddy_album_toby_keith, "Walk It Off"));
        songList.add(new Songs(R.mipmap.big_dog_daddy_album_toby_keith, "Hit It"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "High Maintenance Woman") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Love Me If You Can") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "White Rose") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Get My Drink On") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Wouldn't Wanna Be Ya") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Big Dog Daddy") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I Know She Hung the Moon") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Pump Jack") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Burnin' Moonlight") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Walk It Off") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Hit It") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(BigDogDaddy.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();
    }
}
