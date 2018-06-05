package com.example.u_n_v.musicapp.Artists.PopRockArtists.KatyPerryAlbums;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.u_n_v.musicapp.Artists.PopRockArtists.JustinBieberAlbums.Purpose;
import com.example.u_n_v.musicapp.R;
import com.example.u_n_v.musicapp.SongAdapters.SongAdapter;
import com.example.u_n_v.musicapp.SongAdapters.Songs;

import java.util.ArrayList;

public class OneOfTheBoys extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.one_of_the_boys_album_katy_perry, "One of the Boys"));
        songList.add(new Songs(R.drawable.one_of_the_boys_album_katy_perry, "I Kissed a Girl"));
        songList.add(new Songs(R.drawable.one_of_the_boys_album_katy_perry, "Waking Up in Vegas"));
        songList.add(new Songs(R.drawable.one_of_the_boys_album_katy_perry, "Thinking of You"));
        songList.add(new Songs(R.drawable.one_of_the_boys_album_katy_perry, "Mannequin"));
        songList.add(new Songs(R.drawable.one_of_the_boys_album_katy_perry, "Ur So Gay"));
        songList.add(new Songs(R.drawable.one_of_the_boys_album_katy_perry, "Hot n Cold"));
        songList.add(new Songs(R.drawable.one_of_the_boys_album_katy_perry, "If You Can Afford Me"));
        songList.add(new Songs(R.drawable.one_of_the_boys_album_katy_perry, "Lost"));
        songList.add(new Songs(R.drawable.one_of_the_boys_album_katy_perry, "Self Inflicted"));
        songList.add(new Songs(R.drawable.one_of_the_boys_album_katy_perry, "I'm Still Breathing"));
        songList.add(new Songs(R.drawable.one_of_the_boys_album_katy_perry, "Fingerprints"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "One of the Boys") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I Kissed a Girl") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Waking Up in Vegas") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Thinking of You") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Mannequin") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Ur So Gay") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Hot n Cold") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "If You Can Afford Me") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Lost") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Self Inflicted") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I'm Still Breathing") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Fingerprints") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(OneOfTheBoys.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();
    }
}
