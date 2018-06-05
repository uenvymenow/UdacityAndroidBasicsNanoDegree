package com.example.u_n_v.musicapp.Artists.PopRockArtists.TaylorSwiftAlbums;

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

public class Reputation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.reputation_album_taylor_swift, "...Ready for it?"));
        songList.add(new Songs(R.drawable.reputation_album_taylor_swift, "End Game"));
        songList.add(new Songs(R.drawable.reputation_album_taylor_swift, "I Did Something Bad"));
        songList.add(new Songs(R.drawable.reputation_album_taylor_swift, "Don't Blame Me"));
        songList.add(new Songs(R.drawable.reputation_album_taylor_swift, "Delicate"));
        songList.add(new Songs(R.drawable.reputation_album_taylor_swift, "Look What You Made Me Do"));
        songList.add(new Songs(R.drawable.reputation_album_taylor_swift, "So It Goes..."));
        songList.add(new Songs(R.drawable.reputation_album_taylor_swift, "Gorgeous"));
        songList.add(new Songs(R.drawable.reputation_album_taylor_swift, "Getaway Car"));
        songList.add(new Songs(R.drawable.reputation_album_taylor_swift, "King of My Heart"));
        songList.add(new Songs(R.drawable.reputation_album_taylor_swift, "Dancing with Our Hands Tied"));
        songList.add(new Songs(R.drawable.reputation_album_taylor_swift, "Dress"));
        songList.add(new Songs(R.drawable.reputation_album_taylor_swift, "This Is Why We Can't Have Nice Things"));
        songList.add(new Songs(R.drawable.reputation_album_taylor_swift, "Call It What You Want"));
        songList.add(new Songs(R.drawable.reputation_album_taylor_swift, "New Year's Day"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "...Ready for it?") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "End Game") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I Did Something Bad") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Don't Blame Me") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Delicate") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Look What You Made Me Do") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "So It Goes...") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Gorgeous") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Getaway Car") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "King of My Heart") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Dancing with Our Hands Tied") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Dress") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "This Is Why We Can't Have Nice Things") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Call It What You Want") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "New Year's Day") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(Reputation.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();
    }
}
