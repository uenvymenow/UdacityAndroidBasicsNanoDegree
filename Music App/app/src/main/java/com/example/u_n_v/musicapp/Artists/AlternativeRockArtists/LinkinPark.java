package com.example.u_n_v.musicapp.Artists.AlternativeRockArtists;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.u_n_v.musicapp.AlbumAdapters.AlbumAdapter;
import com.example.u_n_v.musicapp.AlbumAdapters.Albums;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDayAlbums.AmericanIdiot;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDayAlbums.Dookie;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDayAlbums.Nimrod;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.LinkinParkAlbums.HybridTheory;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.LinkinParkAlbums.Meteora;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.LinkinParkAlbums.MinutesToMidnight;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class LinkinPark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        // Create the Artist Array List object
        final ArrayList<Albums> albumList = new ArrayList<>();

        albumList.add(new Albums(R.drawable.hybrid_theory_album_linkin_park,"Hybrid Theory")); // Image retrieved from https://en.wikipedia.org/wiki/Hybrid_Theory
        albumList.add(new Albums(R.drawable.meteora_album_linkin_park,"Meteora")); // Image retrieved from https://en.wikipedia.org/wiki/Meteora_(album)
        albumList.add(new Albums(R.drawable.minutes_to_midnight_album_linkin_park,"Minutes to Midnight")); // Image retrieved from https://en.wikipedia.org/wiki/Minutes_to_Midnight_(Linkin_Park_album)

        AlbumAdapter albumAdapter = new AlbumAdapter(this, albumList);

        final ListView listView = findViewById(R.id.album_list);

        listView.setAdapter(albumAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Albums currentArtist = albumList.get(position);
                String currentAlbumName = currentArtist.getAlbumName();

                if (currentAlbumName == "Hybrid Theory"){
                    Intent hybridTheoryIntent = new Intent(LinkinPark.this, HybridTheory.class);
                    startActivity(hybridTheoryIntent);
                } else if (currentAlbumName == "Meteora"){
                    Intent meteoraIntent = new Intent(LinkinPark.this, Meteora.class);
                    startActivity(meteoraIntent);
                }else if (currentAlbumName == "Minutes to Midnight"){
                    Intent minutesToMidnightIntent = new Intent(LinkinPark.this, MinutesToMidnight.class);
                    startActivity(minutesToMidnightIntent);
                }
            }
        });
    }
}
