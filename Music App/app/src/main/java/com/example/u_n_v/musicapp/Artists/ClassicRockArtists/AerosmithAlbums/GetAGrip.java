package com.example.u_n_v.musicapp.Artists.ClassicRockArtists.AerosmithAlbums;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.LinkinParkAlbums.Meteora;
import com.example.u_n_v.musicapp.R;
import com.example.u_n_v.musicapp.SongAdapters.SongAdapter;
import com.example.u_n_v.musicapp.SongAdapters.Songs;

import java.util.ArrayList;

public class GetAGrip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Get a Grip","Intro"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Get a Grip","Eat the Rich"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Get a Grip","Get a Grip"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Get a Grip","Fever"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Get a Grip","Livin' on the Edge"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Get a Grip","Flesh"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Get a Grip","Walk On Down"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Get a Grip","Shut Up and Dance"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Get a Grip","Cryin"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Get a Grip","Gotta Love It"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Get a Grip","Crazy"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Get a Grip","Line Up (featuring Lenny Kravitz)"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Get a Grip","Amazing"));
        songList.add(new Songs(R.drawable.meteora_album_linkin_park, "Get a Grip","Boogie Man (instrumental)"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Intro") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Eat the Rich") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Get a Grip") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Fever") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Livin' on the Edge") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Flesh") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Walk On Down") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Shut Up and Dance") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Cryin") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Gotta Love It") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Crazy") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Line Up (featuring Lenny Kravitz)") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Amazing") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Boogie Man (instrumental)") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName) {
        Toast.makeText(GetAGrip.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();
    }
}
