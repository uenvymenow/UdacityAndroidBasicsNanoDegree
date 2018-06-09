package com.example.u_n_v.musicapp.Artists.ClassicRockArtists.BonJoviAlbums;

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

public class NewJersey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.mipmap.new_jersey_album_bon_jovi, "Lay Your Hands on Me"));
        songList.add(new Songs(R.mipmap.new_jersey_album_bon_jovi, "Bad Medicine"));
        songList.add(new Songs(R.mipmap.new_jersey_album_bon_jovi, "Born to Be My Baby"));
        songList.add(new Songs(R.mipmap.new_jersey_album_bon_jovi, "Living in Sin"));
        songList.add(new Songs(R.mipmap.new_jersey_album_bon_jovi, "Blood on Blood"));
        songList.add(new Songs(R.mipmap.new_jersey_album_bon_jovi, "Homebound Train"));
        songList.add(new Songs(R.mipmap.new_jersey_album_bon_jovi, "Wild Is the Wind"));
        songList.add(new Songs(R.mipmap.new_jersey_album_bon_jovi, "Ride Cowboy Ride"));
        songList.add(new Songs(R.mipmap.new_jersey_album_bon_jovi, "Stick to Your Guns"));
        songList.add(new Songs(R.mipmap.new_jersey_album_bon_jovi, "I'll Be There For You"));
        songList.add(new Songs(R.mipmap.new_jersey_album_bon_jovi, "99 in the Shade"));
        songList.add(new Songs(R.mipmap.new_jersey_album_bon_jovi, "Love for Sale"));

        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Lay Your Hands on Me") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Bad Medicine") {
                    displayNowPlaying(currentSongName);
                }else if (currentSongName == "Born to Be My Baby") {
                    displayNowPlaying(currentSongName);
                }else if (currentSongName == "Living in Sin") {
                    displayNowPlaying(currentSongName);
                }else if (currentSongName == "Blood on Blood") {
                    displayNowPlaying(currentSongName);
                }else if (currentSongName == "Homebound Train") {
                    displayNowPlaying(currentSongName);
                }else if (currentSongName == "Wild is the Wind") {
                    displayNowPlaying(currentSongName);
                }else if (currentSongName == "Ride Cowboy Ride") {
                    displayNowPlaying(currentSongName);
                }else if (currentSongName == "Stick to Your Guns") {
                    displayNowPlaying(currentSongName);
                }else if (currentSongName == "I'll Be There For You") {
                    displayNowPlaying(currentSongName);
                }else if (currentSongName == "99 in the Shade") {
                    displayNowPlaying(currentSongName);
                }else if (currentSongName == "Love for Sale") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(NewJersey.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
