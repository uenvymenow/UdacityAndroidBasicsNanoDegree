package com.example.u_n_v.musicapp.Genres;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.u_n_v.musicapp.ArtistAdapters.ArtistAdapter;
import com.example.u_n_v.musicapp.ArtistAdapters.Artists;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class Rap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_list);

        // Create the Artist Array List object
        ArrayList<Artists> artistList = new ArrayList<>();

        artistList.add(new Artists(R.drawable.cent_50, "50 Cent")); // Image retrieved from https://www.imdb.com/name/nm1265067/

        ArtistAdapter artistAdapter = new ArtistAdapter(this, artistList);

        ListView listView = findViewById(R.id.artist_list);

        listView.setAdapter(artistAdapter);
    }
}
