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

        artistList.add(new Artists(R.drawable.bon_jovi, "Bon Jovi"));
        artistList.add(new Artists(R.drawable.aerosmith, "Aerosmith"));
        artistList.add(new Artists(R.drawable.led_zeppelin, "Led Zeppelin"));


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
