package com.example.u_n_v.musicapp.Artists.PopRockArtists;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.u_n_v.musicapp.AlbumAdapters.AlbumAdapter;
import com.example.u_n_v.musicapp.AlbumAdapters.Albums;
import com.example.u_n_v.musicapp.Artists.PopRockArtists.JustinBieberAlbums.Believe;
import com.example.u_n_v.musicapp.Artists.PopRockArtists.JustinBieberAlbums.MyWorld20;
import com.example.u_n_v.musicapp.Artists.PopRockArtists.JustinBieberAlbums.Purpose;
import com.example.u_n_v.musicapp.Artists.PopRockArtists.KatyPerryAlbums.OneOfTheBoys;
import com.example.u_n_v.musicapp.Artists.PopRockArtists.KatyPerryAlbums.Prism;
import com.example.u_n_v.musicapp.Artists.PopRockArtists.KatyPerryAlbums.Witness;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class KatyPerry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        // Create the Artist Array List object
        final ArrayList<Albums> albumList = new ArrayList<>();

        albumList.add(new Albums(R.drawable.one_of_the_boys_album_katy_perry,"One of the Boys")); // Image retrieved from https://en.wikipedia.org/wiki/One_of_the_Boys_(Katy_Perry_album)
        albumList.add(new Albums(R.drawable.prism_album_katy_perry,"Prism")); // Image retrieved from https://en.wikipedia.org/wiki/Prism_(Katy_Perry_album)
        albumList.add(new Albums(R.drawable.witness_album_katy_perry,"Witness")); // Image retrieved from https://en.wikipedia.org/wiki/Witness_(Katy_Perry_album)

        AlbumAdapter albumAdapter = new AlbumAdapter(this, albumList);

        final ListView listView = findViewById(R.id.album_list);

        listView.setAdapter(albumAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Albums currentArtist = albumList.get(position);
                String currentAlbumName = currentArtist.getAlbumName();

                if (currentAlbumName == "One of the Boys"){
                    Intent oneOfTheBoysIntent = new Intent(KatyPerry.this, OneOfTheBoys.class);
                    startActivity(oneOfTheBoysIntent);
                } else if (currentAlbumName == "Prism"){
                    Intent prismIntent = new Intent(KatyPerry.this, Prism.class);
                    startActivity(prismIntent);
                } else if (currentAlbumName == "Witness"){
                    Intent witnessIntent = new Intent(KatyPerry.this, Witness.class);
                    startActivity(witnessIntent);
                }
            }
        });
    }
}
