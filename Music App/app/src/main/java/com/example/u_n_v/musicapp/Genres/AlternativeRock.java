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

        artistList.add(new Artists(R.mipmap.green_day, "Green Day")); // Image retrieved from https://www.grammy.com/grammys/artists/green-day
        artistList.add(new Artists(R.mipmap.pearl_jam, "Pearl Jam")); // Image retrieved from https://consequenceofsound.net/2015/10/25-essential-pearl-jam-performances/
        artistList.add(new Artists(R.mipmap.linkin_park, "Linkin Park")); // Image retrieved from http://www.blabbermouth.net/news/linkin-park-has-every-intention-of-continuing-says-mike-shinoda/

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
