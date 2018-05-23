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

public class ALoveSupreme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.a_love_supreme_album_john_coltrane, "Acknowledgement"));
        songList.add(new Songs(R.drawable.a_love_supreme_album_john_coltrane, "Resolution"));
        songList.add(new Songs(R.drawable.a_love_supreme_album_john_coltrane, "Pursuance"));
        songList.add(new Songs(R.drawable.a_love_supreme_album_john_coltrane, "Psalm"));
        songList.add(new Songs(R.drawable.a_love_supreme_album_john_coltrane, "Introduction by André Francis"));
        songList.add(new Songs(R.drawable.a_love_supreme_album_john_coltrane, "Acknowledgement (Live)"));
        songList.add(new Songs(R.drawable.a_love_supreme_album_john_coltrane, "Resolution (Live)"));
        songList.add(new Songs(R.drawable.a_love_supreme_album_john_coltrane, "Pursuance (Live)"));
        songList.add(new Songs(R.drawable.a_love_supreme_album_john_coltrane, "Psalm (Live)"));
        songList.add(new Songs(R.drawable.a_love_supreme_album_john_coltrane, "Resolution (Alternate take)"));
        songList.add(new Songs(R.drawable.a_love_supreme_album_john_coltrane, "Resolution (Breakdown)"));
        songList.add(new Songs(R.drawable.a_love_supreme_album_john_coltrane, "Acknowledgement (Alternate take) Part 1"));
        songList.add(new Songs(R.drawable.a_love_supreme_album_john_coltrane, "Acknowledgement (Alternate take) Part 2"));

        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Acknowledgement") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Resolution") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Pursuance") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Psalm") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Introduction by André Francis") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Acknowledgement (Live)") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Resolution (Live)") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Pursuance (Live)") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Psalm (Live)") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Resolution (Alternate take)") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Resolution (Breakdown)") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Acknowledgement (Alternate take) Part 1") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Acknowledgement (Alternate take) Part 2") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName) {
        Toast.makeText(ALoveSupreme.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}

