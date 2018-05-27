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

public class AmericanIdiot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.american_idiot_album_green_day, "American Idiot"));
        songList.add(new Songs(R.drawable.american_idiot_album_green_day, "Jesus of Suburbia"));
        songList.add(new Songs(R.drawable.american_idiot_album_green_day, "Holiday"));
        songList.add(new Songs(R.drawable.american_idiot_album_green_day, "Boulevard of Broken Dreams"));
        songList.add(new Songs(R.drawable.american_idiot_album_green_day, "Are We the Waiting"));
        songList.add(new Songs(R.drawable.american_idiot_album_green_day, "St. Jimmy"));
        songList.add(new Songs(R.drawable.american_idiot_album_green_day, "Give Me Novacaine"));
        songList.add(new Songs(R.drawable.american_idiot_album_green_day, "She's a Rebel"));
        songList.add(new Songs(R.drawable.american_idiot_album_green_day, "Extraordinary Girl"));
        songList.add(new Songs(R.drawable.american_idiot_album_green_day, "Letterbomb"));
        songList.add(new Songs(R.drawable.american_idiot_album_green_day, "Wake Me Up When September Ends"));
        songList.add(new Songs(R.drawable.american_idiot_album_green_day, "Homecoming"));
        songList.add(new Songs(R.drawable.american_idiot_album_green_day, "Whatsername"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "American Idiot") {
                    displayNowPlaying(currentSongName);
                } else  if (currentSongName == "Jesus of Suburbia") {
                    displayNowPlaying(currentSongName);
                } else  if (currentSongName == "Holiday") {
                    displayNowPlaying(currentSongName);
                } else  if (currentSongName == "Boulevard of Broken Dreams") {
                    displayNowPlaying(currentSongName);
                } else  if (currentSongName == "Are We the Waiting") {
                    displayNowPlaying(currentSongName);
                } else  if (currentSongName == "St. Jimmy") {
                    displayNowPlaying(currentSongName);
                } else  if (currentSongName == "Give Me Novacaine") {
                    displayNowPlaying(currentSongName);
                } else  if (currentSongName == "She's a Rebel") {
                    displayNowPlaying(currentSongName);
                } else  if (currentSongName == "Extraordinary Girl") {
                    displayNowPlaying(currentSongName);
                } else  if (currentSongName == "Letterbomb") {
                    displayNowPlaying(currentSongName);
                } else  if (currentSongName == "Wake Me Up When September Ends") {
                    displayNowPlaying(currentSongName);
                } else  if (currentSongName == "Homecoming") {
                    displayNowPlaying(currentSongName);
                } else  if (currentSongName == "Whatsername") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(AmericanIdiot.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
