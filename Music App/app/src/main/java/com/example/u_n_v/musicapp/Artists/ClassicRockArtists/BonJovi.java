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
import com.example.u_n_v.musicapp.Artists.ClassicRockArtists.BonJoviAlbums.HaveANiceDay;
import com.example.u_n_v.musicapp.Artists.ClassicRockArtists.BonJoviAlbums.NewJersey;
import com.example.u_n_v.musicapp.Artists.ClassicRockArtists.BonJoviAlbums.ThisHouseIsNotForSale;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class BonJovi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        // Create the Artist Array List object
        final ArrayList<Albums> albumList = new ArrayList<>();

        albumList.add(new Albums(R.mipmap.new_jersey_album_bon_jovi,"New Jersey")); // Image Retrieved from https://en.wikipedia.org/wiki/New_Jersey_(album)
        albumList.add(new Albums(R.mipmap.have_a_nice_day_album_bon_jovi,"Have a Nice Day")); // Image Retrieved from https://en.wikipedia.org/wiki/Have_a_Nice_Day_(Bon_Jovi_album)
        albumList.add(new Albums(R.mipmap.this_house_is_not_for_sale_album_bon_jovi,"This House Is Not For Sale")); // Image Retrieved from https://en.wikipedia.org/wiki/This_House_Is_Not_for_Sale

        AlbumAdapter albumAdapter = new AlbumAdapter(this, albumList);

        final ListView listView = findViewById(R.id.album_list);

        listView.setAdapter(albumAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Albums currentArtist = albumList.get(position);
                String currentAlbumName = currentArtist.getAlbumName();

                if (currentAlbumName == "New Jersey"){
                    Intent newJerseyIntent = new Intent(BonJovi.this, NewJersey.class);
                    startActivity(newJerseyIntent);
                } else if (currentAlbumName == "Have a Nice Day"){
                    Intent haveANiceDayIntent = new Intent(BonJovi.this, HaveANiceDay.class);
                    startActivity(haveANiceDayIntent);
                } else if (currentAlbumName == "This House Is Not For Sale"){
                    Intent thisHouseIsNotForSaleIntent = new Intent(BonJovi.this, ThisHouseIsNotForSale.class);
                    startActivity(thisHouseIsNotForSaleIntent);
                }
            }
        });
    }
}
