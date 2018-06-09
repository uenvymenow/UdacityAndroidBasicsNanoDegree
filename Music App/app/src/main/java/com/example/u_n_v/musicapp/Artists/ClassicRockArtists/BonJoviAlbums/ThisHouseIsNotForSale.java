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

public class ThisHouseIsNotForSale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create the Artist Array List object
        final ArrayList<Songs> songList = new ArrayList<>();

        songList.add(new Songs(R.drawable.this_house_is_not_for_sale_album_bon_jovi, "This House Is Not For Sale","This House Is Not For Sale"));
        songList.add(new Songs(R.drawable.this_house_is_not_for_sale_album_bon_jovi, "This House Is Not For Sale","Living With the Ghost"));
        songList.add(new Songs(R.drawable.this_house_is_not_for_sale_album_bon_jovi, "This House Is Not For Sale","Knockout"));
        songList.add(new Songs(R.drawable.this_house_is_not_for_sale_album_bon_jovi, "This House Is Not For Sale","Labor of Love"));
        songList.add(new Songs(R.drawable.this_house_is_not_for_sale_album_bon_jovi, "This House Is Not For Sale","Born Again Tomorrow"));
        songList.add(new Songs(R.drawable.this_house_is_not_for_sale_album_bon_jovi, "This House Is Not For Sale","Roller Coaster"));
        songList.add(new Songs(R.drawable.this_house_is_not_for_sale_album_bon_jovi, "This House Is Not For Sale","New Year's Day"));
        songList.add(new Songs(R.drawable.this_house_is_not_for_sale_album_bon_jovi, "This House Is Not For Sale","The Devil's in the Temple"));
        songList.add(new Songs(R.drawable.this_house_is_not_for_sale_album_bon_jovi, "This House Is Not For Sale","Scars on This Guitar"));
        songList.add(new Songs(R.drawable.this_house_is_not_for_sale_album_bon_jovi, "This House Is Not For Sale","God Bless This Mess"));
        songList.add(new Songs(R.drawable.this_house_is_not_for_sale_album_bon_jovi, "This House Is Not For Sale","Reunion"));
        songList.add(new Songs(R.drawable.this_house_is_not_for_sale_album_bon_jovi, "This House Is Not For Sale","Come On Up to Our House"));


        SongAdapter songAdapter = new SongAdapter(this, songList);

        final ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs currentSong = songList.get(position);
                String currentSongName = currentSong.getSongName();

                if (currentSongName == "This House Is Not For Sale") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Living With the Ghost") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Knockout") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Labor of Love") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Born Again Tomorrow") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Roller Coaster") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "New Year's Day") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "The Devil's in the Temple") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Scars on This Guitar") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "God Bless This Mess") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Reunion") {
                    displayNowPlaying(currentSongName);
                } else if (currentSongName == "Come On Up to Our House") {
                    displayNowPlaying(currentSongName);
                }
            }
        });
    }

    public void displayNowPlaying(String songName){
        Toast.makeText(ThisHouseIsNotForSale.this, "Now playing: " + songName, Toast.LENGTH_SHORT).show();

    }
}
