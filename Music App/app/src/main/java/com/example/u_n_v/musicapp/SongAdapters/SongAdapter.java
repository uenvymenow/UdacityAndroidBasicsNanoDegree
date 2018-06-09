package com.example.u_n_v.musicapp.SongAdapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.u_n_v.musicapp.R;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Songs> {

    public SongAdapter(Context context, ArrayList<Songs> list){
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View songListView = convertView;
        if (songListView == null){
            songListView = LayoutInflater.from(getContext()).inflate(R.layout.song_list_view, parent, false);
        }

        // Create currentSong object
        Songs currentSong = getItem(position);

        // Retrieve the album ImageView
        ImageView albumImage = songListView.findViewById(R.id.song_album_image);
        if (currentSong.hasAlbumImageID()){
            albumImage.setImageResource(currentSong.getAlbumImageID());
            albumImage.setVisibility(View.VISIBLE);
        } else {
            albumImage.setVisibility(View.GONE);
        }

        // Find Song Name TextView
        TextView songNameTextView = songListView.findViewById(R.id.song_name);
        songNameTextView.setText(currentSong.getSongName());

        // Find Song Album TextView
        TextView songAlbumTextView = songListView.findViewById(R.id.song_album);
        songAlbumTextView.setText(currentSong.getAlbumName());

        return songListView;
    }
}
