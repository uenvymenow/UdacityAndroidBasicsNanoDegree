package com.example.u_n_v.musicapp.Artists.AlternativeRockArtists;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.u_n_v.musicapp.AlbumAdapters.AlbumAdapter;
import com.example.u_n_v.musicapp.AlbumAdapters.Albums;
import com.example.u_n_v.musicapp.ArtistAdapters.ArtistAdapter;
import com.example.u_n_v.musicapp.ArtistAdapters.Artists;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDayAlbums.AmericanIdiot;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDayAlbums.Dookie;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDayAlbums.Nimrod;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;
import java.util.List;

public class GreenDay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        // Create the Artist Array List object
        final ArrayList<Albums> albumList = new ArrayList<>();

        albumList.add(new Albums(R.mipmap.dookie_album_green_day,"Dookie")); // Image retrieved from https://en.wikipedia.org/wiki/Dookie
        albumList.add(new Albums(R.mipmap.nimrod_album_green_day,"Nimrod")); // Image retrieved from https://en.wikipedia.org/wiki/Nimrod_(album)
        albumList.add(new Albums(R.mipmap.american_idiot_album_green_day,"American Idiot")); // Image retrieved from https://en.wikipedia.org/wiki/American_Idiot


        AlbumAdapter albumAdapter = new AlbumAdapter(this, albumList);

        final ListView listView = findViewById(R.id.album_list);

        listView.setAdapter(albumAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Albums currentArtist = albumList.get(position);
                String currentAlbumName = currentArtist.getAlbumName();

                if (currentAlbumName == "Dookie"){
                    Intent dookieIntent = new Intent(GreenDay.this, Dookie.class);
                    startActivity(dookieIntent);
                } else if (currentAlbumName == "Nimrod"){
                    Intent nimrodIntent = new Intent(GreenDay.this, Nimrod.class);
                    startActivity(nimrodIntent);
                } else if (currentAlbumName == "American Idiot"){
                    Intent americanIdiotIntent = new Intent(GreenDay.this, AmericanIdiot.class);
                    startActivity(americanIdiotIntent);
                }
            }
        });
    }
}
