package com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.LinkinParkAlbums;

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

public class MinutesToMidnight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.minutes_to_midnight_album_linkin_park, "Wake"));
        songList.add(new Songs(R.drawable.minutes_to_midnight_album_linkin_park, "Given Up"));
        songList.add(new Songs(R.drawable.minutes_to_midnight_album_linkin_park, "Leave Out All the Rest"));
        songList.add(new Songs(R.drawable.minutes_to_midnight_album_linkin_park, "Bleed It Out"));
        songList.add(new Songs(R.drawable.minutes_to_midnight_album_linkin_park, "Shadow of the Day"));
        songList.add(new Songs(R.drawable.minutes_to_midnight_album_linkin_park, "What I've Done"));
        songList.add(new Songs(R.drawable.minutes_to_midnight_album_linkin_park, "Hands Held High"));
        songList.add(new Songs(R.drawable.minutes_to_midnight_album_linkin_park, "No More Sorrow"));
        songList.add(new Songs(R.drawable.minutes_to_midnight_album_linkin_park, "Valentine's Day"));
        songList.add(new Songs(R.drawable.minutes_to_midnight_album_linkin_park, "In Between"));
        songList.add(new Songs(R.drawable.minutes_to_midnight_album_linkin_park, "In Pieces"));
        songList.add(new Songs(R.drawable.minutes_to_midnight_album_linkin_park, "The Little Things Give You Away"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Wake") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Given Up") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Leave Out All the Rest") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Bleed It Out") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Shadow of the Day") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "What I've Done") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Hands Held High") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "No More Sorrow") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Valentine's Day") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "In Between") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "In Pieces") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "The Little Things Give You Away") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(MinutesToMidnight.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
