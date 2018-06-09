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

public class TailgatesAndTanlines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.tailgates_and_tanlines_album_luke_bryan, "Tailgates and Tanlines","Country Girl (Shake It for Me)"));
        songList.add(new Songs(R.drawable.tailgates_and_tanlines_album_luke_bryan, "Tailgates and Tanlines","Kiss Tomorrow Goodbye"));
        songList.add(new Songs(R.drawable.tailgates_and_tanlines_album_luke_bryan, "Tailgates and Tanlines","Drunk on You"));
        songList.add(new Songs(R.drawable.tailgates_and_tanlines_album_luke_bryan, "Tailgates and Tanlines","Too Damn Young"));
        songList.add(new Songs(R.drawable.tailgates_and_tanlines_album_luke_bryan, "Tailgates and Tanlines","I Don't Want This Night to End"));
        songList.add(new Songs(R.drawable.tailgates_and_tanlines_album_luke_bryan, "Tailgates and Tanlines","You Don't Know Jack"));
        songList.add(new Songs(R.drawable.tailgates_and_tanlines_album_luke_bryan, "Tailgates and Tanlines","Harvest Time"));
        songList.add(new Songs(R.drawable.tailgates_and_tanlines_album_luke_bryan, "Tailgates and Tanlines","I Know You're Gonna Be There"));
        songList.add(new Songs(R.drawable.tailgates_and_tanlines_album_luke_bryan, "Tailgates and Tanlines","Muckalee Creek Water"));
        songList.add(new Songs(R.drawable.tailgates_and_tanlines_album_luke_bryan, "Tailgates and Tanlines","Tailgate Blues"));
        songList.add(new Songs(R.drawable.tailgates_and_tanlines_album_luke_bryan, "Tailgates and Tanlines","Been There, Done That"));
        songList.add(new Songs(R.drawable.tailgates_and_tanlines_album_luke_bryan, "Tailgates and Tanlines","Faded Away"));
        songList.add(new Songs(R.drawable.tailgates_and_tanlines_album_luke_bryan, "Tailgates and Tanlines","I Knew You That Way"));
        songList.add(new Songs(R.drawable.tailgates_and_tanlines_album_luke_bryan, "Tailgates and Tanlines","That Don't Just Happen [Bonus Track]"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Country Girl (Shake It for Me)") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Kiss Tomorrow Goodbye") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Drunk on You") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Too Damn Young") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I Don't Want This Night to End") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Harvest Time") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I Know You're Gonna Be There") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Muckalee Creek Water") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Tailgate Blues") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Been There, Done That") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Faded Away") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I Knew You That Way") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "That Don't Just Happen [Bonus Track]") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(TailgatesAndTanlines.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();
    }
}
