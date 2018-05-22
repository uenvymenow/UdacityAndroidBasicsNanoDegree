package com.example.u_n_v.musicapp.ArtistAdapters;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;
import java.util.List;

public class ArtistAdapter extends ArrayAdapter<Artists> {

    public ArtistAdapter(Context context, ArrayList<Artists> artistList){
        super(context, 0, artistList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listView = convertView;
        if (listView == null)
            listView = LayoutInflater.from(getContext()).inflate(R.layout.artist_view_list, parent, false);

        // Create a new Artist Object
        Artists currentArtist = getItem(position);

        // Find ArtistImageView and display image resource if one is available
        ImageView artistImage = listView.findViewById(R.id.artistImageView);
        if (currentArtist.hasArtistImage()){
            // Adds the Image ID for the artist in the currentArtist object and sets it to the artistImage ImageView
            artistImage.setImageResource(currentArtist.getArtistImageID());
            artistImage.setVisibility(View.VISIBLE);
        } else {
            artistImage.setVisibility(View.GONE);
        }

        TextView artistTextView = listView.findViewById(R.id.artistNameTextView);
        artistTextView.setText(currentArtist.getArtistName());

        return listView;
    }
}
