package com.example.u_n_v.musicapp.Genres;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.u_n_v.musicapp.AlbumAdapters.Albums;
import com.example.u_n_v.musicapp.ArtistAdapters.ArtistAdapter;
import com.example.u_n_v.musicapp.ArtistAdapters.Artists;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.GreenDay;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.LinkinPark;
import com.example.u_n_v.musicapp.Artists.AlternativeRockArtists.PearlJam;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class AlternativeRock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_list);

        // Create the Artist Array List object
        final ArrayList<Artists> artistList = new ArrayList<>();

        artistList.add(new Artists(R.drawable.green_day, "Green Day"));
        artistList.add(new Artists(R.drawable.pearl_jam, "Pearl Jam"));
        artistList.add(new Artists(R.drawable.linkin_park, "Linkin Park"));

        ArtistAdapter artistAdapter = new ArtistAdapter(this, artistList);

        final ListView listView = findViewById(R.id.artist_list);

        listView.setAdapter(artistAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Artists currentArtist = artistList.get(position);
                String currentArtistName = currentArtist.getArtistName();

                if (currentArtistName == "Green Day"){
                    Intent greenDayIntent = new Intent(AlternativeRock.this, GreenDay.class);
                    startActivity(greenDayIntent);
                } else if (currentArtistName == "Pearl Jam") {
                    Intent pearlJamIntent = new Intent(AlternativeRock.this, PearlJam.class);
                    startActivity(pearlJamIntent);
                } else if (currentArtistName == "Linkin Park") {
                    Intent linkinParkIntent = new Intent(AlternativeRock.this, LinkinPark.class);
                    startActivity(linkinParkIntent);
                }
            }
        });
    }
}
