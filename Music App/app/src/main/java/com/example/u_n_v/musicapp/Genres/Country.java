package com.example.u_n_v.musicapp.Genres;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.u_n_v.musicapp.ArtistAdapters.ArtistAdapter;
import com.example.u_n_v.musicapp.ArtistAdapters.Artists;
import com.example.u_n_v.musicapp.Artists.ClassicRockArtists.Aerosmith;
import com.example.u_n_v.musicapp.Artists.ClassicRockArtists.BonJovi;
import com.example.u_n_v.musicapp.Artists.ClassicRockArtists.LedZeppelin;
import com.example.u_n_v.musicapp.Artists.CountryArtists.LukeBryan;
import com.example.u_n_v.musicapp.Artists.CountryArtists.TimMcGraw;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class Country extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_list);

        // Create the Artist Array List object
        final ArrayList<Artists> artistList = new ArrayList<>();

        artistList.add(new Artists(R.drawable.toby_keith, "Toby Keith"));
        artistList.add(new Artists(R.drawable.luke_bryan, "Luke Bryan"));
        artistList.add(new Artists(R.drawable.tim_mcgraw, "Tim McGraw"));

        ArtistAdapter artistAdapter = new ArtistAdapter(this, artistList);

        final ListView listView = findViewById(R.id.artist_list);

        listView.setAdapter(artistAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Artists currentArtist = artistList.get(position);
                String currentArtistName = currentArtist.getArtistName();

                if (currentArtistName == "Toby Keith"){
                    Intent tobyKeithIntent = new Intent(Country.this, BonJovi.class);
                    startActivity(tobyKeithIntent);
                } else if (currentArtistName == "Luke Bryan"){
                    Intent lukeBryanIntent = new Intent(Country.this, LukeBryan.class);
                    startActivity(lukeBryanIntent);
                } else if (currentArtistName == "Tim McGraw"){
                    Intent timMcGrawIntent = new Intent(Country.this, TimMcGraw.class);
                    startActivity(timMcGrawIntent);
                }
            }
        });
    }
}
