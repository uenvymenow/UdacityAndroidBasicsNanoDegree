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

public class SheWasTooGoodToMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.mipmap.she_was_too_good_to_me_album_chet_baker, "Autumn Leaves"));
        songList.add(new Songs(R.mipmap.she_was_too_good_to_me_album_chet_baker, "She Was Too Good to Me"));
        songList.add(new Songs(R.mipmap.she_was_too_good_to_me_album_chet_baker, "Funk in Deep Freeze"));
        songList.add(new Songs(R.mipmap.she_was_too_good_to_me_album_chet_baker, "Tangerine"));
        songList.add(new Songs(R.mipmap.she_was_too_good_to_me_album_chet_baker, "With a Song in My Heart"));
        songList.add(new Songs(R.mipmap.she_was_too_good_to_me_album_chet_baker, "What'll I Do?"));
        songList.add(new Songs(R.mipmap.she_was_too_good_to_me_album_chet_baker, "It's You or No One"));
        songList.add(new Songs(R.mipmap.she_was_too_good_to_me_album_chet_baker, "My Future Just Passed"));



        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Autumn Leaves") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "She Was Too Good to Me") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Funk in Deep Freeze") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Tangerine") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "With a Song in My Heart") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "What'll I Do?") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "It's You or No One") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "My Future Just Passed") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(SheWasTooGoodToMe.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
