package com.example.u_n_v.musicapp.Artists.PopRockArtists.TaylorSwiftAlbums;

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

public class Red extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.red_album_taylor_swift, "Red","State of Grace"));
        songList.add(new Songs(R.drawable.red_album_taylor_swift, "Red","Red"));
        songList.add(new Songs(R.drawable.red_album_taylor_swift, "Red","Treacherous"));
        songList.add(new Songs(R.drawable.red_album_taylor_swift, "Red","I Knew You Were Trouble"));
        songList.add(new Songs(R.drawable.red_album_taylor_swift, "Red","All Too Well"));
        songList.add(new Songs(R.drawable.red_album_taylor_swift, "Red","22"));
        songList.add(new Songs(R.drawable.red_album_taylor_swift, "Red","I Almost Do"));
        songList.add(new Songs(R.drawable.red_album_taylor_swift, "Red","We Are Never Ever Getting Back Together"));
        songList.add(new Songs(R.drawable.red_album_taylor_swift, "Red","Stay Stay Stay"));
        songList.add(new Songs(R.drawable.red_album_taylor_swift, "Red","The Last Time"));
        songList.add(new Songs(R.drawable.red_album_taylor_swift, "Red","Holy Ground"));
        songList.add(new Songs(R.drawable.red_album_taylor_swift, "Red","Sad Beautiful Tragic"));
        songList.add(new Songs(R.drawable.red_album_taylor_swift, "Red","The Lucky One"));
        songList.add(new Songs(R.drawable.red_album_taylor_swift, "Red","Everything Has Changed"));
        songList.add(new Songs(R.drawable.red_album_taylor_swift, "Red","Starlight"));
        songList.add(new Songs(R.drawable.red_album_taylor_swift, "Red","Begin Again"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "State of Grace") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Red") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Treacherous") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I Knew Your Were Trouble") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "All Too Well") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "22") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I Almost Do") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "We Are Never Ever Getting Back Together") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Stay Stay Stay") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "The Last Time") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Holy Ground") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Sad Beautiful Tragic") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "The Lucky One") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Everything Has Changed") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Starlight") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Begin Again") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(Red.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();
    }
}
