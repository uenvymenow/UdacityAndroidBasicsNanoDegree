package com.example.u_n_v.musicapp.Genres;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.u_n_v.musicapp.ArtistAdapters.ArtistAdapter;
import com.example.u_n_v.musicapp.ArtistAdapters.Artists;
import com.example.u_n_v.musicapp.Artists.JazzArtists.ChetBaker;
import com.example.u_n_v.musicapp.Artists.JazzArtists.JohnColtrane;
import com.example.u_n_v.musicapp.Artists.JazzArtists.LouisDanielArmstrong;
import com.example.u_n_v.musicapp.Artists.PopRockArtists.JustinBieber;
import com.example.u_n_v.musicapp.Artists.PopRockArtists.KatyPerry;
import com.example.u_n_v.musicapp.Artists.PopRockArtists.TaylorSwift;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class PopRock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_list);

        // Create the Artist Array List object
        final ArrayList<Artists> artistList = new ArrayList<>();

        artistList.add(new Artists(R.mipmap.taylor_swift, "Taylor Swift")); // Image retrieved from https://en.wikipedia.org/wiki/Taylor_Swift
        artistList.add(new Artists(R.mipmap.justin_bieber, "Justin Bieber")); // Image retrieved from https://www.wattpad.com/251974159-justin-bieber-imagines-justin-bieber-fight-breakup
        artistList.add(new Artists(R.mipmap.katy_perry, "Katy Perry")); // Image retrieved from https://en.wikipedia.org/wiki/Katy_Perry

        ArtistAdapter artistAdapter = new ArtistAdapter(this, artistList);

        final ListView listView = findViewById(R.id.artist_list);

        listView.setAdapter(artistAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Artists currentArtist = artistList.get(position);
                String currentArtistName = currentArtist.getArtistName();

                if (currentArtistName == "Taylor Swift"){
                    Intent taylorSwiftIntent = new Intent(PopRock.this, TaylorSwift.class);
                    startActivity(taylorSwiftIntent);
                } else if (currentArtistName == "Justin Bieber"){
                    Intent justinBieberIntent = new Intent(PopRock.this, JustinBieber.class);
                    startActivity(justinBieberIntent);
                } else if (currentArtistName == "Katy Perry"){
                    Intent katyPerryIntent = new Intent(PopRock.this, KatyPerry.class);
                    startActivity(katyPerryIntent);
                }
            }
        });
    }
}
