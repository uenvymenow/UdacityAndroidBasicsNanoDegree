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

public class ItCouldHappenToYou extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.mipmap.it_could_happen_to_you_album_chet_baker, "Do It the Hard Way"));
        songList.add(new Songs(R.mipmap.it_could_happen_to_you_album_chet_baker, "I'm Old Fashioned"));
        songList.add(new Songs(R.mipmap.it_could_happen_to_you_album_chet_baker, "You're Driving Me Crazy"));
        songList.add(new Songs(R.mipmap.it_could_happen_to_you_album_chet_baker, "It Could Happen to You"));
        songList.add(new Songs(R.mipmap.it_could_happen_to_you_album_chet_baker, "My Heart Stood Still"));
        songList.add(new Songs(R.mipmap.it_could_happen_to_you_album_chet_baker, "The More I See You"));
        songList.add(new Songs(R.mipmap.it_could_happen_to_you_album_chet_baker, "Everything Happens to Me"));
        songList.add(new Songs(R.mipmap.it_could_happen_to_you_album_chet_baker, "Dancing on the Ceiling"));
        songList.add(new Songs(R.mipmap.it_could_happen_to_you_album_chet_baker, "How Long Has This Been Going On?"));
        songList.add(new Songs(R.mipmap.it_could_happen_to_you_album_chet_baker, "Old Devil Moon"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Do It the Hard Way") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "I'm Old Fashioned") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "You're Driving Me Crazy") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "It Could Happen to You") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "My Heart Stood Still") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "The More I See You") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Everything Happens to Me") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Dancing on the Ceiling") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "How Long Has This Been Going On?") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Old Devil Moon") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(ItCouldHappenToYou.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
