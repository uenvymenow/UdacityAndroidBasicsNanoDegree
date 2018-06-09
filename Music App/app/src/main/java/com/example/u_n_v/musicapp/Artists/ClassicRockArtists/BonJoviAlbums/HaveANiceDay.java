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

public class HaveANiceDay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.have_a_nice_day_album_bon_jovi, "Have a Nice Day","Have a Nice Day"));
        songList.add(new Songs(R.drawable.have_a_nice_day_album_bon_jovi, "Have a Nice Day","I Want to Be Loved"));
        songList.add(new Songs(R.drawable.have_a_nice_day_album_bon_jovi, "Have a Nice Day","Welcome to Wherever You Are"));
        songList.add(new Songs(R.drawable.have_a_nice_day_album_bon_jovi, "Have a Nice Day","Who Says You Can't Go Home"));
        songList.add(new Songs(R.drawable.have_a_nice_day_album_bon_jovi, "Have a Nice Day","Last Man Standing"));
        songList.add(new Songs(R.drawable.have_a_nice_day_album_bon_jovi, "Have a Nice Day","Bells of Freedom"));
        songList.add(new Songs(R.drawable.have_a_nice_day_album_bon_jovi, "Have a Nice Day","Wildflower"));
        songList.add(new Songs(R.drawable.have_a_nice_day_album_bon_jovi, "Have a Nice Day","Last Cigarette"));
        songList.add(new Songs(R.drawable.have_a_nice_day_album_bon_jovi, "Have a Nice Day","I Am"));
        songList.add(new Songs(R.drawable.have_a_nice_day_album_bon_jovi, "Have a Nice Day","Complicated"));
        songList.add(new Songs(R.drawable.have_a_nice_day_album_bon_jovi, "Have a Nice Day","Novocaine"));
        songList.add(new Songs(R.drawable.have_a_nice_day_album_bon_jovi, "Have a Nice Day","Story of My Life"));
        songList.add(new Songs(R.drawable.have_a_nice_day_album_bon_jovi, "Have a Nice Day","Who Says You Can't Go Home (duet version with Jennifer Nettles)"));



        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Have a Nice Day") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I Want to Be Loved") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Welcome to Wherever You Are") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Who Says You Can't Go Home") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Last Man Standing") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Bells of Freedom") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Wildflower") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Last Cigarette") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I Am") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Complicated") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Novocaine") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Story of My Life") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Who Says You Can't Go Home (duet version with Jennifer Nettles)") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(HaveANiceDay.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
