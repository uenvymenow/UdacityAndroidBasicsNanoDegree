/*

This project is a project used as a learning example for myself from the site Medium.com posted by
Nikhil Bansal at https://medium.com/mindorks/custom-array-adapters-made-easy-b6c4930560dd
 */

package com.example.u_n_v.movieproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private MovieAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assigns the layout ListView to the listView variable
        listView = findViewById(R.id.movies_list);

        // Creates an ArrayList with the Movie data type
        ArrayList<Movie> moviesList = new ArrayList<>();

        // Adds the list of movies with the arguments for the drawable image, the name of the movie and the year released
        moviesList.add(new Movie(R.drawable.movie_after_earth, "After Earth", "2013"));
        moviesList.add(new Movie(R.drawable.movie_baby_driver, "Baby Driver", "2017"));
        moviesList.add(new Movie(R.drawable.movie_deadpool, "Deadpool 2", "2018"));
        moviesList.add(new Movie(R.drawable.movie_divergent, "Divergent", "2014"));
        moviesList.add(new Movie(R.drawable.movie_fight_club, "Fight Club", "1999"));
        moviesList.add(new Movie(R.drawable.movie_jaws, "Jaws", "1975"));
        moviesList.add(new Movie(R.drawable.movie_pirates, "Pirates of the Caribbean", "2011"));
        moviesList.add(new Movie(R.drawable.movie_star_wars, "Star Wars", "2016"));
        moviesList.add(new Movie(R.drawable.movie_the_grey, "The Grey", "2011"));

        // Sets the mAdapter variable to the new MovieAdapter object with arguments of context
        // and moviesList to pass the list of movies
        mAdapter = new MovieAdapter(this, moviesList);

        // Sets the mAdapter to the listView object that was created above
        listView.setAdapter(mAdapter);

    }
}
