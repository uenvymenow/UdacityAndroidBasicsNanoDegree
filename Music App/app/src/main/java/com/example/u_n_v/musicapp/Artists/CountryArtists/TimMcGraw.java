package com.example.u_n_v.musicapp.Artists.CountryArtists;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.u_n_v.musicapp.AlbumAdapters.AlbumAdapter;
import com.example.u_n_v.musicapp.AlbumAdapters.Albums;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDay;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDayAlbums.AmericanIdiot;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDayAlbums.Dookie;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDayAlbums.Nimrod;
import com.example.u_n_v.musicapp.Artists.CountryArtists.TimMcGrawAlbums.LetItGo;
import com.example.u_n_v.musicapp.Artists.CountryArtists.TimMcGrawAlbums.SundownHeavenTown;
import com.example.u_n_v.musicapp.Artists.CountryArtists.TimMcGrawAlbums.TwoLanesOfFreedom;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class TimMcGraw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        // Create the Artist Array List object
        final ArrayList<Albums> albumList = new ArrayList<>();

        albumList.add(new Albums(R.drawable.let_it_go_album_tim_mcgraw,"Let It Go")); // Image retrieved from https://en.wikipedia.org/wiki/Let_It_Go_(Tim_McGraw_album)
        albumList.add(new Albums(R.drawable.two_lanes_of_freedom_album_tim_mcgraw,"Two Lanes of Freedom")); // Image retrieved from https://en.wikipedia.org/wiki/Two_Lanes_of_Freedom
        albumList.add(new Albums(R.drawable.sundown_heaven_town_album_tim_mcgraw,"Sundown Heaven Town")); // Image retrieved from https://en.wikipedia.org/wiki/Sundown_Heaven_Town

        AlbumAdapter albumAdapter = new AlbumAdapter(this, albumList);

        final ListView listView = findViewById(R.id.album_list);

        listView.setAdapter(albumAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Albums currentArtist = albumList.get(position);
                String currentAlbumName = currentArtist.getAlbumName();

                if (currentAlbumName == "Let It Go"){
                    Intent letItGoIntent = new Intent(TimMcGraw.this, LetItGo.class);
                    startActivity(letItGoIntent);
                } else if (currentAlbumName == "Two Lanes of Freedom"){
                    Intent twoLanesOfFreedomIntent = new Intent(TimMcGraw.this, TwoLanesOfFreedom.class);
                    startActivity(twoLanesOfFreedomIntent);
                } else if (currentAlbumName == "Sundown Heaven Town"){
                    Intent sundownHeavenTownIntent = new Intent(TimMcGraw.this, SundownHeavenTown.class);
                    startActivity(sundownHeavenTownIntent);
                }
            }
        });
    }
}
