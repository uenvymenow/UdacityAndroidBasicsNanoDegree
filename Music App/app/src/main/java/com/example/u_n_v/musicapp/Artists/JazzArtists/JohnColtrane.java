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
import com.example.u_n_v.musicapp.Artists.JazzArtists.JohnColtraneAlbums.ALoveSupreme;
import com.example.u_n_v.musicapp.Artists.JazzArtists.JohnColtraneAlbums.BlueTrain;
import com.example.u_n_v.musicapp.Artists.JazzArtists.JohnColtraneAlbums.GiantSteps;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class JohnColtrane extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        // Create the Artist Array List object
        final ArrayList<Albums> albumList = new ArrayList<>();

        albumList.add(new Albums(R.mipmap.a_love_supreme_album_john_coltrane,"A Love Supreme (Deluxe Edition)")); // Image retrieved from https://www.discogs.com/John-Coltrane-A-Love-Supreme/release/2525657
        albumList.add(new Albums(R.mipmap.giant_steps_album_john_coltrane,"Giant Steps")); // Image retrieved from https://en.wikipedia.org/wiki/Giant_Steps
        albumList.add(new Albums(R.mipmap.blue_train_album_john_coltrane,"Blue Train")); // Image retrieved from https://en.wikipedia.org/wiki/Blue_Train_(album)


        AlbumAdapter albumAdapter = new AlbumAdapter(this, albumList);

        final ListView listView = findViewById(R.id.album_list);

        listView.setAdapter(albumAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Albums currentArtist = albumList.get(position);
                String currentAlbumName = currentArtist.getAlbumName();

                if (currentAlbumName == "A Love Supreme (Deluxe Edition)"){
                    Intent aLoveSupremeIntent = new Intent(JohnColtrane.this, ALoveSupreme.class);
                    startActivity(aLoveSupremeIntent);
                } else if (currentAlbumName == "Giant Steps"){
                    Intent giantStepsIntent = new Intent(JohnColtrane.this, GiantSteps.class);
                    startActivity(giantStepsIntent);
                } else if (currentAlbumName == "Blue Train"){
                    Intent blueTrainIntent = new Intent(JohnColtrane.this, BlueTrain.class);
                    startActivity(blueTrainIntent);
                }
            }
        });
    }
}
