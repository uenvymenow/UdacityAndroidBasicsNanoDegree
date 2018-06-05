package com.example.u_n_v.musicapp.Artists.PopRockArtists;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.u_n_v.musicapp.AlbumAdapters.AlbumAdapter;
import com.example.u_n_v.musicapp.AlbumAdapters.Albums;
import com.example.u_n_v.musicapp.Artists.PopRockArtists.KatyPerryAlbums.OneOfTheBoys;
import com.example.u_n_v.musicapp.Artists.PopRockArtists.KatyPerryAlbums.Prism;
import com.example.u_n_v.musicapp.Artists.PopRockArtists.KatyPerryAlbums.Witness;
import com.example.u_n_v.musicapp.Artists.PopRockArtists.TaylorSwiftAlbums.Red;
import com.example.u_n_v.musicapp.Artists.PopRockArtists.TaylorSwiftAlbums.Reputation;
import com.example.u_n_v.musicapp.Artists.PopRockArtists.TaylorSwiftAlbums.TS1989;
import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class TaylorSwift extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        // Create the Artist Array List object
        final ArrayList<Albums> albumList = new ArrayList<>();

        albumList.add(new Albums(R.drawable.ts_1989_album_taylor_swift,"1989")); // Image retrieved from https://en.wikipedia.org/wiki/1989_(Taylor_Swift_album)
        albumList.add(new Albums(R.drawable.red_album_taylor_swift,"Red")); // Image retrieved from https://en.wikipedia.org/wiki/Red_(Taylor_Swift_album)
        albumList.add(new Albums(R.drawable.reputation_album_taylor_swift,"Reputation")); // Image retrieved from https://en.wikipedia.org/wiki/Reputation_(Taylor_Swift_album)

        AlbumAdapter albumAdapter = new AlbumAdapter(this, albumList);

        final ListView listView = findViewById(R.id.album_list);

        listView.setAdapter(albumAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Albums currentArtist = albumList.get(position);
                String currentAlbumName = currentArtist.getAlbumName();

                if (currentAlbumName == "1989"){
                    Intent ts1989Intent = new Intent(TaylorSwift.this, TS1989.class);
                    startActivity(ts1989Intent);
                } else if (currentAlbumName == "Red"){
                    Intent redIntent = new Intent(TaylorSwift.this, Red.class);
                    startActivity(redIntent);
                } else if (currentAlbumName == "Reputation"){
                    Intent reputationIntent = new Intent(TaylorSwift.this, Reputation.class);
                    startActivity(reputationIntent);
                }
            }
        });
    }
}
