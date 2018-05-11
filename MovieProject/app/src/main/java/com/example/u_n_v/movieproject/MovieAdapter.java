package com.example.u_n_v.movieproject;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends ArrayAdapter<Movie> {

    private Context mContext;
    private List<Movie> movieList = new ArrayList<>();

    // Constructor that is used to create an instance of the MovieAdapter object
    public MovieAdapter(@NonNull Context context, @LayoutRes ArrayList<Movie> list){
        super(context, 0, list);
        mContext = context;
        movieList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Allows the listItem view to reuse views by equating to convertView
        View listItem = convertView;
        // If listItem variable is empty then we need to infate a new listItem view
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);

        // Creates a new Movie object and assigns the position in the movieList to be the currentMovie
        Movie currentMovie = movieList.get(position);

        // Retrieves the image ID from the list_item.xml file
        // and sets the image resource to the getmImageDrawable from the currentMovie object
        ImageView image = listItem.findViewById(R.id.imageView_poster);
        image.setImageResource(currentMovie.getmImageDrawable());

        // Retrieves the name TextView ID from the list_item.xml file
        // and sets the name resource to the getmName from the currentMovie object
        TextView name = listItem.findViewById(R.id.textView_name);
        name.setText(currentMovie.getmName());

        // Retrieves the release TextView ID from the list_item.xml file
        // and sets the release resource to the getmRelease from the currentMovie object
        TextView release = listItem.findViewById(R.id.textView_release);
        release.setText(currentMovie.getmRelease());

        // returns the listItem object
        return listItem;
    }
}
