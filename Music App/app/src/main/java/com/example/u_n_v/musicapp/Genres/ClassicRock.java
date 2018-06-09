package com.example.u_n_v.musicapp.Genres;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.u_n_v.musicapp.ArtistAdapters.ArtistAdapter;
import com.example.u_n_v.musicapp.ArtistAdapters.Artists;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDay;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.LinkinPark;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.PearlJam;
import com.example.u_n_v.musicapp.Artists.ClassicRockArtists.Aerosmith;
import com.example.u_n_v.musicapp.Artists.ClassicRockArtists.BonJovi;
import com.example.u_n_v.musicapp.Artists.ClassicRockArtists.LedZeppelin;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class ClassicRock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_list);

        // Create the Artist Array List object
        final ArrayList<Artists> artistList = new ArrayList<>();

        artistList.add(new Artists(R.mipmap.bon_jovi, "Bon Jovi")); // Image retrieved from https://www.straight.com/music/911311/lets-talk-about-albert-hammond-travis-scott-jon-bon-jovi-and-moby
        artistList.add(new Artists(R.mipmap.aerosmith, "Aerosmith")); // Image retrieved from https://open.spotify.com/artist/7Ey4PD4MYsKc5I2dolUwbH
        artistList.add(new Artists(R.mipmap.led_zeppelin, "Led Zeppelin")); // Image retrieved from http://ultimateclassicrock.com/tags/led-zeppelin/


        ArtistAdapter artistAdapter = new ArtistAdapter(this, artistList);

        final ListView listView = findViewById(R.id.artist_list);

        listView.setAdapter(artistAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Artists currentArtist = artistList.get(position);
                String currentArtistName = currentArtist.getArtistName();

                if (currentArtistName == "Bon Jovi"){
                    Intent bonJoviIntent = new Intent(ClassicRock.this, BonJovi.class);
                    startActivity(bonJoviIntent);
                } else if (currentArtistName == "Aerosmith"){
                    Intent aerosmithIntent = new Intent(ClassicRock.this, Aerosmith.class);
                    startActivity(aerosmithIntent);
                } else if (currentArtistName == "Led Zeppelin"){
                    Intent ledZeppelinIntent = new Intent(ClassicRock.this, LedZeppelin.class);
                    startActivity(ledZeppelinIntent);
                }
            }
        });
    }
}
