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
import com.example.u_n_v.musicapp.Artists.ClassicRockArtists.AerosmithAlbums.GetAGrip;
import com.example.u_n_v.musicapp.Artists.ClassicRockArtists.AerosmithAlbums.Pump;
import com.example.u_n_v.musicapp.Artists.ClassicRockArtists.AerosmithAlbums.ToysInTheAttic;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class Aerosmith extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        // Create the Artist Array List object
        final ArrayList<Albums> albumList = new ArrayList<>();

        albumList.add(new Albums(R.mipmap.toys_in_the_attic_album_aerosmith,"Toys in the Attic")); // Image retrieved from http://www.subjectivesounds.com/musicblog/2016/1/5/aerosmith-toys-in-the-attic
        albumList.add(new Albums(R.mipmap.pump_album_aerosmith,"Pump")); // Image retrieved from https://en.wikipedia.org/wiki/Pump_(album)
        albumList.add(new Albums(R.mipmap.get_a_grip_album_aerosmith,"Get a Grip")); // Image retrieved from https://en.wikipedia.org/wiki/Get_a_Grip

        AlbumAdapter albumAdapter = new AlbumAdapter(this, albumList);

        final ListView listView = findViewById(R.id.album_list);

        listView.setAdapter(albumAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Albums currentArtist = albumList.get(position);
                String currentAlbumName = currentArtist.getAlbumName();

                if (currentAlbumName == "Toys in the Attic"){
                    Intent toysInTheAtticIntent = new Intent(Aerosmith.this, ToysInTheAttic.class);
                    startActivity(toysInTheAtticIntent);
                } else if (currentAlbumName == "Pump"){
                    Intent pumpIntent = new Intent(Aerosmith.this, Pump.class);
                    startActivity(pumpIntent);
                } else if (currentAlbumName == "Get a Grip"){
                    Intent getAGripIntent = new Intent(Aerosmith.this, GetAGrip.class);
                    startActivity(getAGripIntent);
                }
            }
        });
    }
}
