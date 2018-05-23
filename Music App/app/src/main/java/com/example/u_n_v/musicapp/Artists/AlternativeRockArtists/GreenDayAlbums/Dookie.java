package com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDayAlbums;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.u_n_v.musicapp.AlbumAdapters.AlbumAdapter;
import com.example.u_n_v.musicapp.AlbumAdapters.Albums;
import com.example.u_n_v.musicapp.R;
import com.example.u_n_v.musicapp.SongAdapters.SongAdapter;
import com.example.u_n_v.musicapp.SongAdapters.Songs;
import com.example.u_n_v.musicapp.TestActivity;

import java.util.ArrayList;

public class Dookie extends AppCompatActivity {

    private boolean playDookie = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.dookie_album_green_day, "Burnout"));
        songList.add(new Songs(R.drawable.dookie_album_green_day, "Having A Blast"));
        songList.add(new Songs(R.drawable.dookie_album_green_day, "Chump"));
        songList.add(new Songs(R.drawable.dookie_album_green_day, "Longview"));
        songList.add(new Songs(R.drawable.dookie_album_green_day, "Welcome to Paradise"));
        songList.add(new Songs(R.drawable.dookie_album_green_day, "Pulling Teeth"));
        songList.add(new Songs(R.drawable.dookie_album_green_day, "Basket Case"));
        songList.add(new Songs(R.drawable.dookie_album_green_day, "She"));
        songList.add(new Songs(R.drawable.dookie_album_green_day, "Sassafras Roots"));
        songList.add(new Songs(R.drawable.dookie_album_green_day, "When I Come Around"));
        songList.add(new Songs(R.drawable.dookie_album_green_day, "Coming Clean"));
        songList.add(new Songs(R.drawable.dookie_album_green_day, "Emenius Sleepus"));
        songList.add(new Songs(R.drawable.dookie_album_green_day, "In the End"));
        songList.add(new Songs(R.drawable.dookie_album_green_day, "F.O.D./All by Myself"));

        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Burnout") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Having A Blast") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Chump") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Longview") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Welcome to Paradise") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Pulling Teeth") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Basket Case") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "She") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Sassafras Roots") {
                    displayNowPlaying(currentSongName);
                }  else if (currentSongName == "When I Come Around") {
                    displayNowPlaying(currentSongName);
                }  else if (currentSongName == "Coming Clean") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Emenius Sleepus") {
                    displayNowPlaying(currentSongName);
                }  else if (currentSongName == "In the End") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "F.O.D./All by Myself") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(Dookie.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
