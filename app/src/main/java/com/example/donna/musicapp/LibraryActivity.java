package com.example.donna.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song);

        // Create an ArrayList
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("The Boys Are Back", "Dropkick Murphys", "Signed and Sealed in Blood"));
        songs.add(new Song("Prisoner's Song", "Dropkick Murphys", "Signed and Sealed in Blood"));
        songs.add(new Song("Rose Tattoo", "Dropkick Murphys", "Signed and Sealed in Blood"));
        songs.add(new Song("Burn", "Dropkick Murphys", "Signed and Sealed in Blood"));
        songs.add(new Song("Jimmy Collins' Wake", "Dropkick Murphys", "Signed and Sealed in Blood"));
        songs.add(new Song("The Season's Upon Us", "Dropkick Murphys", "Signed and Sealed in Blood"));
        songs.add(new Song("The Battle Rages On", "Dropkick Murphys", "Signed and Sealed in Blood"));
        songs.add(new Song("Don't Tear Us Apart", "Dropkick Murphys", "Signed and Sealed in Blood"));
        songs.add(new Song("My Hero", "Dropkick Murphys", "Signed and Sealed in Blood"));
        songs.add(new Song("Out On The Town", "Dropkick Murphys", "Signed and Sealed in Blood"));
        songs.add(new Song("Out of Our Heads", "Dropkick Murphys", "Signed and Sealed in Blood"));
        songs.add(new Song("End of the Night", "Dropkick Murphys", "Signed and Sealed in Blood"));
        songs.add(new Song("The Boys of Fall", "Kenny Chesney", "Hemingway's Whiskey"));
        songs.add(new Song("Live a Little", "Kenny Chesney", "Hemingway's Whiskey"));
        songs.add(new Song("Coastal", "Kenny Chesney", "Hemingway's Whiskey"));
        songs.add(new Song("You and Tequila (featuring Grace Potter)", "Kenny Chesney", "Hemingway's Whiskey"));
        songs.add(new Song("Seven Days", "Kenny Chesney", "Hemingway's Whiskey"));
        songs.add(new Song("Small Y'all (featuring George Jones)", "Kenny Chesney", "Hemingway's Whiskey"));
        songs.add(new Song("Where I Grew Up", "Kenny Chesney", "Hemingway's Whiskey"));
        songs.add(new Song("Reality", "Kenny Chesney", "Hemingway's Whiskey"));
        songs.add(new Song("Round and Round", "Kenny Chesney", "Hemingway's Whiskey"));
        songs.add(new Song("Somewhere with You", "Kenny Chesney", "Hemingway's Whiskey"));
        songs.add(new Song("Hemingway's Whiskey", "Kenny Chesney", "Hemingway's Whiskey"));
        songs.add(new Song("Break On Through", "THE DOORS", "THE DOORS"));
        songs.add(new Song("Soul Kitchen", "THE DOORS", "THE DOORS"));
        songs.add(new Song("The Crystal Ship", "THE DOORS", "THE DOORS"));
        songs.add(new Song("Twentieth Century Fox", "THE DOORS", "THE DOORS"));
        songs.add(new Song("Alabama Song (Whisky Bar)", "THE DOORS", "THE DOORS"));
        songs.add(new Song("Light My Fire", "THE DOORS", "THE DOORS"));
        songs.add(new Song("Back Door Man", "THE DOORS", "THE DOORS"));
        songs.add(new Song("I Looked at You", "THE DOORS", "THE DOORS"));
        songs.add(new Song("End of the Night", "THE DOORS", "THE DOORS"));
        songs.add(new Song("Take It as It Comes", "THE DOORS", "THE DOORS"));
        songs.add(new Song("The End", "THE DOORS", "THE DOORS"));
        songs.add(new Song("Nancy Whisky", "The Clancy Brothers and Tommy Makem", "Isn't It Grand Boys"));
        songs.add(new Song("Isn't It Grand Boys", "The Clancy Brothers and Tommy Makem", "Isn't It Grand Boys6"));

        //Create arrayApdater
        SongAdapter adapter = new SongAdapter(this, songs);
        // Cast to listView
        ListView listView = findViewById(R.id.list);
        // Set adapter to listView
        listView.setAdapter(adapter);

    }
}
