package com.example.aaron.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find profile_picture ImageView
        ImageView profilePictureImageView = findViewById(R.id.profile_picture);
        // Add resource to profile_picture ImageView
        profilePictureImageView.setImageResource(R.drawable.random_dice);

        // Locate name TextView
        TextView nameTextView = findViewById(R.id.name);
        // set name TextView text
        nameTextView.setText("Aaron");

        // Locate birthday TextView
        TextView birthdayTextView = findViewById(R.id.birthday);
        // set birthday TextView text
        birthdayTextView.setText("July 20");

        // Locate Country TextView
        TextView countryTextView = findViewById(R.id.country);
        // set country TextView text
        countryTextView.setText("United States");
    }
}
