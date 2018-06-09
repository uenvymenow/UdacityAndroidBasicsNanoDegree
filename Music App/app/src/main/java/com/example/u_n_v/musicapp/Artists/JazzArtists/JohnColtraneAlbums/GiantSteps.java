package com.example.u_n_v.musicapp.Artists.JazzArtists.JohnColtraneAlbums;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDayAlbums.Dookie;
import com.example.u_n_v.musicapp.R;
import com.example.u_n_v.musicapp.SongAdapters.SongAdapter;
import com.example.u_n_v.musicapp.SongAdapters.Songs;

import java.util.ArrayList;

public class GiantSteps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.mipmap.giant_steps_album_john_coltrane, "Giant Steps"));
        songList.add(new Songs(R.mipmap.giant_steps_album_john_coltrane, "Cousin Mary"));
        songList.add(new Songs(R.mipmap.giant_steps_album_john_coltrane, "Countdown"));
        songList.add(new Songs(R.mipmap.giant_steps_album_john_coltrane, "Spiral"));
        songList.add(new Songs(R.mipmap.giant_steps_album_john_coltrane, "Syeeda's Song Flute"));
        songList.add(new Songs(R.mipmap.giant_steps_album_john_coltrane, "Naima"));
        songList.add(new Songs(R.mipmap.giant_steps_album_john_coltrane, "Mr. P.C."));



        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Giant Steps") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Cousin Mary") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Countdown") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Spiral") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Syeeda's Song Flute") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Naima") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Mr. P.C.") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(GiantSteps.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
