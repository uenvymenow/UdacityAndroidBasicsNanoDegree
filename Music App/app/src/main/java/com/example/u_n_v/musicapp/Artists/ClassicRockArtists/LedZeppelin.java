package com.example.u_n_v.musicapp.Artists.ClassicRockArtists;

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
import com.example.u_n_v.musicapp.Artists.ClassicRockArtists.LedZeppelinAlbums.PhysicalGraffiti;
import com.example.u_n_v.musicapp.Artists.ClassicRockArtists.LedZeppelinAlbums.Presence;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class LedZeppelin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        // Create the Artist Array List object
        final ArrayList<Albums> albumList = new ArrayList<>();

        albumList.add(new Albums(R.mipmap.led_zeppelin_album_led_zeppelin,"Led Zeppelin")); // Image retrieved from https://en.wikipedia.org/wiki/Led_Zeppelin_(album)
        albumList.add(new Albums(R.mipmap.physical_graffiti_album_led_zeppelin,"Physical Graffiti")); // Image retrieved from https://en.wikipedia.org/wiki/Physical_Graffiti
        albumList.add(new Albums(R.mipmap.presence_album_led_zeppelin,"Presence")); // Image retrieved from https://en.wikipedia.org/wiki/Presence_(album)
        AlbumAdapter albumAdapter = new AlbumAdapter(this, albumList);

        final ListView listView = findViewById(R.id.album_list);

        listView.setAdapter(albumAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Albums currentArtist = albumList.get(position);
                String currentAlbumName = currentArtist.getAlbumName();

                if (currentAlbumName == "Led Zeppelin"){
                    Intent ledZeppelinIntent = new Intent(LedZeppelin.this, com.example.u_n_v.musicapp.Artists.ClassicRockArtists.LedZeppelinAlbums.LedZeppelin.class);
                    startActivity(ledZeppelinIntent);
                } else if (currentAlbumName == "Physical Graffiti"){
                    Intent physicalGraffitiIntent = new Intent(LedZeppelin.this, PhysicalGraffiti.class);
                    startActivity(physicalGraffitiIntent);
                } else if (currentAlbumName == "Presence"){
                    Intent presenceIntent = new Intent(LedZeppelin.this, Presence.class);
                    startActivity(presenceIntent);
                }
            }
        });
    }
}
