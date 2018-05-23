package com.example.u_n_v.musicapp.Artists.JazzArtists;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.u_n_v.musicapp.AlbumAdapters.AlbumAdapter;
import com.example.u_n_v.musicapp.AlbumAdapters.Albums;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDay;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDayAlbums.Dookie;
import com.example.u_n_v.musicapp.Artists.JazzArtists.LouisArmstrongAlbums.LouisUnderTheStars;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class LouisDanielArmstrong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        // Create the Artist Array List object
        final ArrayList<Albums> albumList = new ArrayList<>();

        albumList.add(new Albums(R.drawable.louis_under_the_stars_album_louis_armstrong,"Louis Under the Stars")); // Image retrieved from https://en.wikipedia.org/wiki/Louis_Under_the_Stars

        AlbumAdapter albumAdapter = new AlbumAdapter(this, albumList);

        final ListView listView = findViewById(R.id.album_list);

        listView.setAdapter(albumAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Albums currentArtist = albumList.get(position);
                String currentAlbumName = currentArtist.getAlbumName();

                if (currentAlbumName == "Louis Under the Stars"){
                    Intent louisUnderTheStarsIntent = new Intent(LouisDanielArmstrong.this, LouisUnderTheStars.class);
                    startActivity(louisUnderTheStarsIntent);
                }
            }
        });
    }
}
