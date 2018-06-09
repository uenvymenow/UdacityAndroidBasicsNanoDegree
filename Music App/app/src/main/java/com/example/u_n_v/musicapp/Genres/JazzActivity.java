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
import com.example.u_n_v.musicapp.Artists.JazzArtists.ChetBaker;
import com.example.u_n_v.musicapp.Artists.JazzArtists.JohnColtrane;
import com.example.u_n_v.musicapp.Artists.JazzArtists.LouisDanielArmstrong;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class JazzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_list);

        // Create the Artist Array List object
        final ArrayList<Artists> artistList = new ArrayList<>();

        artistList.add(new Artists(R.drawable.john_coltrane, "John Coltrane")); // Image retrieved from https://en.wikipedia.org/wiki/John_Coltrane
        artistList.add(new Artists(R.drawable.louis_armstrong, "Louis Daniel Armstrong")); // Image retrieved from https://www.jazzmusics.com/jazz-musicians/top-10-amazing-facts-about-louis-armstrong/
        artistList.add(new Artists(R.drawable.chet_baker, "Chet Baker")); // Image retrieved from https://www.goodreads.com/author/show/297032.Chet_Baker


        ArtistAdapter artistAdapter = new ArtistAdapter(this, artistList);

        final ListView listView = findViewById(R.id.artist_list);

        listView.setAdapter(artistAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Artists currentArtist = artistList.get(position);
                String currentArtistName = currentArtist.getArtistName();

                if (currentArtistName == "John Coltrane"){
                    Intent johnColtraneIntent = new Intent(JazzActivity.this, JohnColtrane.class);
                    startActivity(johnColtraneIntent);
                } else if (currentArtistName == "Louis Daniel Armstrong"){
                    Intent louisArmstrong = new Intent(JazzActivity.this, LouisDanielArmstrong.class);
                    startActivity(louisArmstrong);
                } else if (currentArtistName == "Chet Baker"){
                    Intent chetBaker = new Intent(JazzActivity.this, ChetBaker.class);
                    startActivity(chetBaker);
                }
            }
        });
    }
}
