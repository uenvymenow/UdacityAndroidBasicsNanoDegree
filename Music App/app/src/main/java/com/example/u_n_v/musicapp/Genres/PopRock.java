package com.example.u_n_v.musicapp.Genres;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.u_n_v.musicapp.ArtistAdapters.ArtistAdapter;
import com.example.u_n_v.musicapp.ArtistAdapters.Artists;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class PopRock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_list);

        // Create the Artist Array List object
        ArrayList<Artists> artistList = new ArrayList<>();

        artistList.add(new Artists(R.drawable.taylor_swift, "Taylor Swift"));

        ArtistAdapter artistAdapter = new ArtistAdapter(this, artistList);

        ListView listView = findViewById(R.id.artist_list);

        listView.setAdapter(artistAdapter);
    }
}
