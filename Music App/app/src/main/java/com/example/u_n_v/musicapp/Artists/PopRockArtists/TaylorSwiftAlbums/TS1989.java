package com.example.u_n_v.musicapp.Artists.PopRockArtists.TaylorSwiftAlbums;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.u_n_v.musicapp.Artists.PopRockArtists.KatyPerryAlbums.OneOfTheBoys;
import com.example.u_n_v.musicapp.R;
import com.example.u_n_v.musicapp.SongAdapters.SongAdapter;
import com.example.u_n_v.musicapp.SongAdapters.Songs;

import java.util.ArrayList;

public class TS1989 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.mipmap.ts_1989_album_taylor_swift, "Welcome to New York"));
        songList.add(new Songs(R.mipmap.ts_1989_album_taylor_swift, "Blank Space"));
        songList.add(new Songs(R.mipmap.ts_1989_album_taylor_swift, "Style"));
        songList.add(new Songs(R.mipmap.ts_1989_album_taylor_swift, "Out of the Woods"));
        songList.add(new Songs(R.mipmap.ts_1989_album_taylor_swift, "All You Had to Do Was Stay"));
        songList.add(new Songs(R.mipmap.ts_1989_album_taylor_swift, "Shake It Off"));
        songList.add(new Songs(R.mipmap.ts_1989_album_taylor_swift, "I Wish You Would"));
        songList.add(new Songs(R.mipmap.ts_1989_album_taylor_swift, "Bad Blood"));
        songList.add(new Songs(R.mipmap.ts_1989_album_taylor_swift, "Wildest Dreams"));
        songList.add(new Songs(R.mipmap.ts_1989_album_taylor_swift, "How You Get the Girl"));
        songList.add(new Songs(R.mipmap.ts_1989_album_taylor_swift, "This Love"));
        songList.add(new Songs(R.mipmap.ts_1989_album_taylor_swift, "I Know Places"));
        songList.add(new Songs(R.mipmap.ts_1989_album_taylor_swift, "Clean"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Welcome to New York") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Blank Space") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Style") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Out of the Woods") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "All You Had to Do Was Stay") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Shake It Off") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I Wish You Would") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Bad Blood") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Wildest Dreams") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "How You Get the Girl") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "This Love") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I Know Places") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Clean") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(TS1989.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();
    }
}
