package com.example.u_n_v.musicapp.AlbumAdapters;

import android.content.Context;
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

public class AlbumAdapter extends ArrayAdapter<Albums> {


    public AlbumAdapter(Context context, ArrayList<Albums> albumList){
        super(context, 0, albumList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View albumListView = convertView;
        if(albumListView == null){
            albumListView = LayoutInflater.from(getContext()).inflate(R.layout.album_list_view, parent, false);
        }

        Albums currentAlbum = getItem(position);

        // Find Album ImageView
        ImageView albumImageView = albumListView.findViewById(R.id.albumImageView);
        // Check if ImageView has image and if so display image
        if (currentAlbum.hasAlbumImage()){
            // Adds the Image ID for the artist in the currentArtist object and sets it to the artistImage ImageView

            albumImageView.setImageResource(currentAlbum.getAlbumImageID());
            albumImageView.setVisibility(View.VISIBLE);
        } else {
            albumImageView.setVisibility(View.GONE);
        }

        // Find Album TextView
        TextView albumNameTextView = albumListView.findViewById(R.id.albumNameTextView);
        // Set Album Name
        albumNameTextView.setText(currentAlbum.getAlbumName());

        return albumListView;
    }
}
