package com.example.u_n_v.musicapp.Artists.CountryArtists.LukeBryanAlbums;

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

public class KillTheLights extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.mipmap.kill_the_lights_album_luke_bryan, "Kick the Dust Up"));
        songList.add(new Songs(R.mipmap.kill_the_lights_album_luke_bryan, "Kill the Lights"));
        songList.add(new Songs(R.mipmap.kill_the_lights_album_luke_bryan, "Strip It Down"));
        songList.add(new Songs(R.mipmap.kill_the_lights_album_luke_bryan, "Home Alone Tonight"));
        songList.add(new Songs(R.mipmap.kill_the_lights_album_luke_bryan, "Razor Blade"));
        songList.add(new Songs(R.mipmap.kill_the_lights_album_luke_bryan, "Fast"));
        songList.add(new Songs(R.mipmap.kill_the_lights_album_luke_bryan, "Move"));
        songList.add(new Songs(R.mipmap.kill_the_lights_album_luke_bryan, "Just Over"));
        songList.add(new Songs(R.mipmap.kill_the_lights_album_luke_bryan, "Love It Gone"));
        songList.add(new Songs(R.mipmap.kill_the_lights_album_luke_bryan, "Way Way Back"));
        songList.add(new Songs(R.mipmap.kill_the_lights_album_luke_bryan, "To the Moon and Back"));
        songList.add(new Songs(R.mipmap.kill_the_lights_album_luke_bryan, "Huntin', Fishin' and Lovin' Every Day"));
        songList.add(new Songs(R.mipmap.kill_the_lights_album_luke_bryan, "Scarecrows"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Kick the Dust Up") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Kill the Lights") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Strip It Down") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Home Alone Tonight") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Razor Blade") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Fast") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Move") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Just Over") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Love It Gone") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Way Way Back") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "To the Moon and Back") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Huntin', Fishin' and Lovin' Every Day") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Scarecrows") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(KillTheLights.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
