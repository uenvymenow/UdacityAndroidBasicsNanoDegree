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
import com.example.u_n_v.musicapp.Artists.CountryArtists.LukeBryanAlbums.KillTheLights;
import com.example.u_n_v.musicapp.Artists.CountryArtists.LukeBryanAlbums.TailgatesAndTanlines;
import com.example.u_n_v.musicapp.Artists.CountryArtists.LukeBryanAlbums.WhatMakesYouCountry;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class LukeBryan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        // Create the Artist Array List object
        final ArrayList<Albums> albumList = new ArrayList<>();

        albumList.add(new Albums(R.mipmap.kill_the_lights_album_luke_bryan,"Kill the Lights")); // Image retrieved from https://en.wikipedia.org/wiki/Kill_the_Lights_(Luke_Bryan_album)
        albumList.add(new Albums(R.mipmap.tailgates_and_tanlines_album_luke_bryan,"Tailgates & Tanlines")); // Image retrieved from https://en.wikipedia.org/wiki/Tailgates_%26_Tanlines
        albumList.add(new Albums(R.mipmap.what_makes_you_country_album_luke_bryan,"What Makes You Country")); // Image retrieved from https://en.wikipedia.org/wiki/What_Makes_You_Country

        AlbumAdapter albumAdapter = new AlbumAdapter(this, albumList);

        final ListView listView = findViewById(R.id.album_list);

        listView.setAdapter(albumAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Albums currentArtist = albumList.get(position);
                String currentAlbumName = currentArtist.getAlbumName();

                if (currentAlbumName == "Kill the Lights"){
                    Intent killTheLightsIntent = new Intent(LukeBryan.this, KillTheLights.class);
                    startActivity(killTheLightsIntent);
                } else if (currentAlbumName == "Tailgates & Tanlines"){
                    Intent tailgatesAndTanlinesIntent = new Intent(LukeBryan.this, TailgatesAndTanlines.class);
                    startActivity(tailgatesAndTanlinesIntent);
                } else if (currentAlbumName == "What Makes You Country"){
                    Intent whatMakesYouCountryIntent = new Intent(LukeBryan.this, WhatMakesYouCountry.class);
                    startActivity(whatMakesYouCountryIntent);
                }
            }
        });
    }
}
