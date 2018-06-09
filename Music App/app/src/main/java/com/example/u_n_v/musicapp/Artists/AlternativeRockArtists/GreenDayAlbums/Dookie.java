package com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDayAlbums;

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

public class Dookie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.mipmap.dookie_album_green_day, "Dookie", "Burnout"));
        songList.add(new Songs(R.mipmap.dookie_album_green_day, "Dookie","Having A Blast"));
        songList.add(new Songs(R.mipmap.dookie_album_green_day, "Dookie","Chump"));
        songList.add(new Songs(R.mipmap.dookie_album_green_day, "Dookie","Longview"));
        songList.add(new Songs(R.mipmap.dookie_album_green_day, "Dookie","Welcome to Paradise"));
        songList.add(new Songs(R.mipmap.dookie_album_green_day, "Dookie","Pulling Teeth"));
        songList.add(new Songs(R.mipmap.dookie_album_green_day, "Dookie","Basket Case"));
        songList.add(new Songs(R.mipmap.dookie_album_green_day, "Dookie","She"));
        songList.add(new Songs(R.mipmap.dookie_album_green_day, "Dookie","Sassafras Roots"));
        songList.add(new Songs(R.mipmap.dookie_album_green_day, "Dookie","When I Come Around"));
        songList.add(new Songs(R.mipmap.dookie_album_green_day, "Dookie","Coming Clean"));
        songList.add(new Songs(R.mipmap.dookie_album_green_day, "Dookie","Emenius Sleepus"));
        songList.add(new Songs(R.mipmap.dookie_album_green_day, "Dookie","In the End"));
        songList.add(new Songs(R.mipmap.dookie_album_green_day, "Dookie","F.O.D./All by Myself"));

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
