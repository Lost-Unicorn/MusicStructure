package com.example.donna.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the song category
        TextView song = findViewById(R.id.song);

        // Set a click listener on that View
        song.setOnClickListener(new View.OnClickListener() {


            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongActivity}
                Intent songIntent = new Intent(MainActivity.this, SongActivity.class);

                // Start the new activity
                startActivity(songIntent);
            }
        });

        // Find the View that shows the album category
        TextView album = findViewById(R.id.album);

        // Set a click listener on that View
        album.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumActivity}
                Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);

                // Start the new activity
                startActivity(albumIntent);
            }
        });

        // Find the View that shows the artist_list category
        TextView artist = findViewById(R.id.artist);

        // Set a click listener on that View
        artist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistActivity}
                Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);

                // Start the new activity
                startActivity(artistIntent);
            }
        });

        // Find the View that shows the library category
        TextView library = findViewById(R.id.library);

        // Set a click listener on that View
        library.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent libraryIntent = new Intent(MainActivity.this, LibraryActivity.class);

                // Start the new activity
                startActivity(libraryIntent);
            }
        });


    }
}
