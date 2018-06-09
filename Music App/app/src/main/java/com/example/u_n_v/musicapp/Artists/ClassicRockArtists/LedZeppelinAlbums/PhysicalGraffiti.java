package com.example.u_n_v.musicapp.Artists.ClassicRockArtists.LedZeppelinAlbums;

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

public class PhysicalGraffiti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.physical_graffiti_album_led_zeppelin, "Physical Graffiti","Custard Pie"));
        songList.add(new Songs(R.drawable.physical_graffiti_album_led_zeppelin, "Physical Graffiti","The Rover"));
        songList.add(new Songs(R.drawable.physical_graffiti_album_led_zeppelin, "Physical Graffiti","In My Time of Dying"));
        songList.add(new Songs(R.drawable.physical_graffiti_album_led_zeppelin, "Physical Graffiti","Houses of the Holy"));
        songList.add(new Songs(R.drawable.physical_graffiti_album_led_zeppelin, "Physical Graffiti","Trampled Under Foot"));
        songList.add(new Songs(R.drawable.physical_graffiti_album_led_zeppelin, "Physical Graffiti","Kashmir"));
        songList.add(new Songs(R.drawable.physical_graffiti_album_led_zeppelin, "Physical Graffiti","In the Light"));
        songList.add(new Songs(R.drawable.physical_graffiti_album_led_zeppelin, "Physical Graffiti","Bron-Yr-Aur"));
        songList.add(new Songs(R.drawable.physical_graffiti_album_led_zeppelin, "Physical Graffiti","Down by the Seaside"));
        songList.add(new Songs(R.drawable.physical_graffiti_album_led_zeppelin, "Physical Graffiti","Ten Years Gone"));
        songList.add(new Songs(R.drawable.physical_graffiti_album_led_zeppelin, "Physical Graffiti","Night Flight"));
        songList.add(new Songs(R.drawable.physical_graffiti_album_led_zeppelin, "Physical Graffiti","The Wanton Song"));
        songList.add(new Songs(R.drawable.physical_graffiti_album_led_zeppelin, "Physical Graffiti","Boogie with Stu"));
        songList.add(new Songs(R.drawable.physical_graffiti_album_led_zeppelin, "Physical Graffiti","Black Country Woman"));
        songList.add(new Songs(R.drawable.physical_graffiti_album_led_zeppelin, "Physical Graffiti","Sick Again"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Custard Pie") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "The Rover") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "In My Time of Dying") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Houses of the Holy") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Trampled Under Foot") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Kashmir") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "In the Light") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Bron-Yr-Aur") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Down by the Seaside") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Ten Years Gone") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Night Flight") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "The Wanton Song") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Boogie with Stu") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Black Country Woman") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Sick Again") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(PhysicalGraffiti.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
