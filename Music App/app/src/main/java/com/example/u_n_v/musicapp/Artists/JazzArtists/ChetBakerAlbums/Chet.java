package com.example.u_n_v.musicapp.Artists.JazzArtists.ChetBakerAlbums;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDayAlbums.Dookie;
import com.example.u_n_v.musicapp.R;
import com.example.u_n_v.musicapp.SongAdapters.SongAdapter;
import com.example.u_n_v.musicapp.SongAdapters.Songs;

import java.util.ArrayList;

public class Chet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.mipmap.chet_album_chet_baker, "Alone Together"));
        songList.add(new Songs(R.mipmap.chet_album_chet_baker, "How High the Moon"));
        songList.add(new Songs(R.mipmap.chet_album_chet_baker, "It Never Entered My Mind"));
        songList.add(new Songs(R.mipmap.chet_album_chet_baker, "'Tis Autumn"));
        songList.add(new Songs(R.mipmap.chet_album_chet_baker, "If You Could See Me Now"));
        songList.add(new Songs(R.mipmap.chet_album_chet_baker, "September Song"));
        songList.add(new Songs(R.mipmap.chet_album_chet_baker, "You'd Be So Nice to Come Home To"));
        songList.add(new Songs(R.mipmap.chet_album_chet_baker, "Time on My Hands (You in My Arms)"));
        songList.add(new Songs(R.mipmap.chet_album_chet_baker, "You and the Night and the Music"));
        songList.add(new Songs(R.mipmap.chet_album_chet_baker, "Early Morning Mood"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Alone Together") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "How High the Moon") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "It Never Entered My Mind") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "'Tis Autumn") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "If You Could See Me Now") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "September Song") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "You'd Be So Nice to Come Home To") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Time on My Hands (You in My Arms)") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "You and the Night and the Music") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Early Morning Mood") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(Chet.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
