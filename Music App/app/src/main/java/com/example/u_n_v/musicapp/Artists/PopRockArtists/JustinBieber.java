package com.example.u_n_v.musicapp.Artists.PopRockArtists;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.u_n_v.musicapp.AlbumAdapters.AlbumAdapter;
import com.example.u_n_v.musicapp.AlbumAdapters.Albums;
import com.example.u_n_v.musicapp.Artists.CountryArtists.TimMcGraw;
import com.example.u_n_v.musicapp.Artists.CountryArtists.TimMcGrawAlbums.LetItGo;
import com.example.u_n_v.musicapp.Artists.CountryArtists.TimMcGrawAlbums.SundownHeavenTown;
import com.example.u_n_v.musicapp.Artists.CountryArtists.TimMcGrawAlbums.TwoLanesOfFreedom;
import com.example.u_n_v.musicapp.Artists.PopRockArtists.JustinBieberAlbums.Believe;
import com.example.u_n_v.musicapp.Artists.PopRockArtists.JustinBieberAlbums.MyWorld20;
import com.example.u_n_v.musicapp.Artists.PopRockArtists.JustinBieberAlbums.Purpose;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class JustinBieber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        // Create the Artist Array List object
        final ArrayList<Albums> albumList = new ArrayList<>();

        albumList.add(new Albums(R.drawable.my_world_2_0_album_justin_bieber,"My World 2.0")); // Image retrieved from https://en.wikipedia.org/wiki/My_World_2.0
        albumList.add(new Albums(R.drawable.believe_album_justin_bieber,"Believe")); // Image retrieved from https://en.wikipedia.org/wiki/Believe_(Justin_Bieber_album)
        albumList.add(new Albums(R.drawable.purpose_album_justin_bieber,"Purpose")); // Image retrieved from https://en.wikipedia.org/wiki/Purpose_(Justin_Bieber_album)

        AlbumAdapter albumAdapter = new AlbumAdapter(this, albumList);

        final ListView listView = findViewById(R.id.album_list);

        listView.setAdapter(albumAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Albums currentArtist = albumList.get(position);
                String currentAlbumName = currentArtist.getAlbumName();

                if (currentAlbumName == "My World 2.0"){
                    Intent myWorld20Intent = new Intent(JustinBieber.this, MyWorld20.class);
                    startActivity(myWorld20Intent);
                } else if (currentAlbumName == "Believe"){
                    Intent believeIntent = new Intent(JustinBieber.this, Believe.class);
                    startActivity(believeIntent);
                } else if (currentAlbumName == "Purpose"){
                    Intent purposeIntent = new Intent(JustinBieber.this, Purpose.class);
                    startActivity(purposeIntent);
                }
            }
        });
    }
}
