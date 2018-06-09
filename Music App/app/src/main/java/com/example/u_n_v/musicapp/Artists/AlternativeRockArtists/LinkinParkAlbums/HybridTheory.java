package com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.LinkinParkAlbums;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDayAlbums.AmericanIdiot;
import com.example.u_n_v.musicapp.R;
import com.example.u_n_v.musicapp.SongAdapters.SongAdapter;
import com.example.u_n_v.musicapp.SongAdapters.Songs;

import java.util.ArrayList;

public class HybridTheory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.hybrid_theory_album_linkin_park, "Hyrbrid Theory","Papercut"));
        songList.add(new Songs(R.drawable.hybrid_theory_album_linkin_park, "Hyrbrid Theory", "One Step Closer"));
        songList.add(new Songs(R.drawable.hybrid_theory_album_linkin_park, "Hyrbrid Theory","With You"));
        songList.add(new Songs(R.drawable.hybrid_theory_album_linkin_park, "Hyrbrid Theory","Points of Authority"));
        songList.add(new Songs(R.drawable.hybrid_theory_album_linkin_park, "Hyrbrid Theory","Crawling"));
        songList.add(new Songs(R.drawable.hybrid_theory_album_linkin_park, "Hyrbrid Theory","Runaway"));
        songList.add(new Songs(R.drawable.hybrid_theory_album_linkin_park, "Hyrbrid Theory","By Myself"));
        songList.add(new Songs(R.drawable.hybrid_theory_album_linkin_park, "Hyrbrid Theory","In the End"));
        songList.add(new Songs(R.drawable.hybrid_theory_album_linkin_park, "Hyrbrid Theory","A Place for My Head"));
        songList.add(new Songs(R.drawable.hybrid_theory_album_linkin_park, "Hyrbrid Theory","Forgotten"));
        songList.add(new Songs(R.drawable.hybrid_theory_album_linkin_park, "Hyrbrid Theory","Cure for the Itch"));
        songList.add(new Songs(R.drawable.hybrid_theory_album_linkin_park, "Hyrbrid Theory","Pushing Me Away"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "Papercut") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "One Step Closer") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "With You") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Points of Authority") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Crawling") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Runaway") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "By Myself") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "In the End") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "A Place for My Head") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Forgotten") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Cure for the Itch") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Pushing Me Away") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(HybridTheory.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
