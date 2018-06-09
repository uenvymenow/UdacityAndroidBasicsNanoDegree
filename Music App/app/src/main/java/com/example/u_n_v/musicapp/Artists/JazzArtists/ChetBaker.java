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
import com.example.u_n_v.musicapp.Artists.JazzArtists.ChetBakerAlbums.Chet;
import com.example.u_n_v.musicapp.Artists.JazzArtists.ChetBakerAlbums.ItCouldHappenToYou;
import com.example.u_n_v.musicapp.Artists.JazzArtists.ChetBakerAlbums.SheWasTooGoodToMe;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class ChetBaker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        // Create the Artist Array List object
        final ArrayList<Albums> albumList = new ArrayList<>();

        albumList.add(new Albums(R.mipmap.chet_album_chet_baker,"Chet")); // Image retrieved from https://en.wikipedia.org/wiki/Chet_(Chet_Baker_album)
        albumList.add(new Albums(R.mipmap.she_was_too_good_to_me_album_chet_baker,"She Was Too Good to Me")); // Image retrieved from https://en.wikipedia.org/wiki/She_Was_Too_Good_to_Me
        albumList.add(new Albums(R.mipmap.it_could_happen_to_you_album_chet_baker,"It Could Happen to You")); // Image retrieved from https://en.wikipedia.org/wiki/(Chet_Baker_Sings)_It_Could_Happen_to_You


        AlbumAdapter albumAdapter = new AlbumAdapter(this, albumList);

        final ListView listView = findViewById(R.id.album_list);

        listView.setAdapter(albumAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Albums currentArtist = albumList.get(position);
                String currentAlbumName = currentArtist.getAlbumName();

                if (currentAlbumName == "Chet"){
                    Intent chetBakerIntent = new Intent(ChetBaker.this, Chet.class);
                    startActivity(chetBakerIntent);
                } else if (currentAlbumName == "She Was Too Good to Me"){
                    Intent sheWasTooGoodToMeIntent = new Intent(ChetBaker.this, SheWasTooGoodToMe.class);
                    startActivity(sheWasTooGoodToMeIntent);
                } else if (currentAlbumName == "It Could Happen to You"){
                    Intent itCouldHappenToYouIntent = new Intent(ChetBaker.this, ItCouldHappenToYou.class);
                    startActivity(itCouldHappenToYouIntent);
                }
            }
        });
    }
}
