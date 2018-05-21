package com.example.u_n_v.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.u_n_v.musicapp.ArtistAdapters.ArtistAdapter;
import com.example.u_n_v.musicapp.ArtistAdapters.Artists;

import java.util.ArrayList;

public class JazzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_list);

        // Create the Artist Array List object
        ArrayList<Artists> artistList = new ArrayList<>();

        artistList.add(new Artists(R.drawable.john_coltrane, "John Coltrane"));

        ArtistAdapter artistAdapter = new ArtistAdapter(this, artistList);

        ListView listView = findViewById(R.id.artist_list);

        listView.setAdapter(artistAdapter);
    }
}
