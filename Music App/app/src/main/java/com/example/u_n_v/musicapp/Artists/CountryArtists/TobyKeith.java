package com.example.u_n_v.musicapp.Artists.CountryArtists;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.u_n_v.musicapp.AlbumAdapters.AlbumAdapter;
import com.example.u_n_v.musicapp.AlbumAdapters.Albums;
import com.example.u_n_v.musicapp.Artists.CountryArtists.TimMcGrawAlbums.LetItGo;
import com.example.u_n_v.musicapp.Artists.CountryArtists.TimMcGrawAlbums.SundownHeavenTown;
import com.example.u_n_v.musicapp.Artists.CountryArtists.TimMcGrawAlbums.TwoLanesOfFreedom;
import com.example.u_n_v.musicapp.Artists.CountryArtists.TobyKeithAlbums.BigDogDaddy;
import com.example.u_n_v.musicapp.Artists.CountryArtists.TobyKeithAlbums.BulletsInTheGun;
import com.example.u_n_v.musicapp.Artists.CountryArtists.TobyKeithAlbums.ClancysTavern;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class TobyKeith extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        // Create the Artist Array List object
        final ArrayList<Albums> albumList = new ArrayList<>();

        albumList.add(new Albums(R.mipmap.bullets_in_the_gun_album_toby_keith,"Bullets in the Gun")); // Image retrieved from https://www.imdb.com/title/tt5931886/
        albumList.add(new Albums(R.mipmap.big_dog_daddy_album_toby_keith,"Big Dog Daddy")); // Image retrieved from https://en.wikipedia.org/wiki/Big_Dog_Daddy
        albumList.add(new Albums(R.mipmap.clancys_tavern_album_toby_keith,"Clancy's Tavern")); // Image retrieved from https://en.wikipedia.org/wiki/Clancy%27s_Tavern

        AlbumAdapter albumAdapter = new AlbumAdapter(this, albumList);

        final ListView listView = findViewById(R.id.album_list);

        listView.setAdapter(albumAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Albums currentArtist = albumList.get(position);
                String currentAlbumName = currentArtist.getAlbumName();

                if (currentAlbumName == "Bullets in the Gun"){
                    Intent bulletsInTheGunIntent = new Intent(TobyKeith.this, BulletsInTheGun.class);
                    startActivity(bulletsInTheGunIntent);
                } else if (currentAlbumName == "Big Dog Daddy"){
                    Intent bigDogDaddyIntent = new Intent(TobyKeith.this, BigDogDaddy.class);
                    startActivity(bigDogDaddyIntent);
                } else if (currentAlbumName == "Clancy's Tavern"){
                    Intent clancysTavernIntent = new Intent(TobyKeith.this, ClancysTavern.class);
                    startActivity(clancysTavernIntent);
                }
            }
        });
    }
}
