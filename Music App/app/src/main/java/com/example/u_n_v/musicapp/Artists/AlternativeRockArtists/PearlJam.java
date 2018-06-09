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
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.PearlJameAlbums.NoCode;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.PearlJameAlbums.Ten;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.PearlJameAlbums.Vitalogy;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class PearlJam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        // Create the Artist Array List object
        final ArrayList<Albums> albumList = new ArrayList<>();

        albumList.add(new Albums(R.mipmap.ten_album_pearl_jam,"Ten")); // Image retrieved from https://en.wikipedia.org/wiki/Ten_(Pearl_Jam_album)
        albumList.add(new Albums(R.mipmap.vitalogy_album_pearl_jam,"Vitalogy")); // Image retrieved from https://en.wikipedia.org/wiki/Ten_(Pearl_Jam_album)
        albumList.add(new Albums(R.mipmap.no_code_album_pearl_jam,"No Code")); // Image retrieved from https://en.wikipedia.org/wiki/No_Code

        AlbumAdapter albumAdapter = new AlbumAdapter(this, albumList);

        final ListView listView = findViewById(R.id.album_list);

        listView.setAdapter(albumAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Albums currentArtist = albumList.get(position);
                String currentAlbumName = currentArtist.getAlbumName();

                if (currentAlbumName == "Ten"){
                    Intent tenIntent = new Intent(PearlJam.this, Ten.class);
                    startActivity(tenIntent);
                } else if (currentAlbumName == "Vitalogy"){
                    Intent vitalogyIntent = new Intent(PearlJam.this, Vitalogy.class);
                    startActivity(vitalogyIntent);
                } else if (currentAlbumName == "No Code"){
                    Intent noCodeIntent = new Intent(PearlJam.this, NoCode.class);
                    startActivity(noCodeIntent);
                }
            }
        });
    }
}
