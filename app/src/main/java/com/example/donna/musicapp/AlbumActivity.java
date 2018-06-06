package com.example.donna.musicapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album);


        // Create an ArrayList
        ArrayList<Album> albums = new ArrayList<Album>();

        albums.add(new Album("The Boys Are Back", "Dropkick Murphys", "Signed and Sealed in Blood"));
        albums.add(new Album("Prisoner's Song", "Dropkick Murphys", "Signed and Sealed in Blood"));
        albums.add(new Album("Rose Tattoo", "Dropkick Murphys", "Signed and Sealed in Blood"));
        albums.add(new Album("Burn", "Dropkick Murphys", "Signed and Sealed in Blood"));
        albums.add(new Album("Jimmy Collins' Wake", "Dropkick Murphys", "Signed and Sealed in Blood"));
        albums.add(new Album("The Season's Upon Us", "Dropkick Murphys", "Signed and Sealed in Blood"));
        albums.add(new Album("The Battle Rages On", "Dropkick Murphys", "Signed and Sealed in Blood"));
        albums.add(new Album("Don't Tear Us Apart", "Dropkick Murphys", "Signed and Sealed in Blood"));
        albums.add(new Album("My Hero", "Dropkick Murphys", "Signed and Sealed in Blood"));
        albums.add(new Album("Out On The Town", "Dropkick Murphys", "Signed and Sealed in Blood"));
        albums.add(new Album("Out of Our Heads", "Dropkick Murphys", "Signed and Sealed in Blood"));
        albums.add(new Album("End of the Night", "Dropkick Murphys", "Signed and Sealed in Blood"));
        albums.add(new Album("The Boys of Fall", "Kenny Chesney", "Hemingway's Whiskey"));
        albums.add(new Album("Live a Little", "Kenny Chesney", "Hemingway's Whiskey"));
        albums.add(new Album("Coastal", "Kenny Chesney", "Hemingway's Whiskey"));
        albums.add(new Album("You and Tequila (featuring Grace Potter)", "Kenny Chesney", "Hemingway's Whiskey"));
        albums.add(new Album("Seven Days", "Kenny Chesney", "Hemingway's Whiskey"));
        albums.add(new Album("Small Y'all (featuring George Jones)", "Kenny Chesney", "Hemingway's Whiskey"));
        albums.add(new Album("Where I Grew Up", "Kenny Chesney", "Hemingway's Whiskey"));
        albums.add(new Album("Reality", "Kenny Chesney", "Hemingway's Whiskey"));
        albums.add(new Album("Round and Round", "Kenny Chesney", "Hemingway's Whiskey"));
        albums.add(new Album("Somewhere with You", "Kenny Chesney", "Hemingway's Whiskey"));
        albums.add(new Album("Hemingway's Whiskey", "Kenny Chesney", "Hemingway's Whiskey"));
        albums.add(new Album("Break On Through", "THE DOORS", "THE DOORS"));
        albums.add(new Album("Soul Kitchen", "THE DOORS", "THE DOORS"));
        albums.add(new Album("The Crystal Ship", "THE DOORS", "THE DOORS"));
        albums.add(new Album("Twentieth Century Fox", "THE DOORS", "THE DOORS"));
        albums.add(new Album("Alabama Song (Whisky Bar)", "THE DOORS", "THE DOORS"));
        albums.add(new Album("Light My Fire", "THE DOORS", "THE DOORS"));
        albums.add(new Album("Back Door Man", "THE DOORS", "THE DOORS"));
        albums.add(new Album("I Looked at You", "THE DOORS", "THE DOORS"));
        albums.add(new Album("End of the Night", "THE DOORS", "THE DOORS"));
        albums.add(new Album("Take It as It Comes", "THE DOORS", "THE DOORS"));
        albums.add(new Album("The End", "THE DOORS", "THE DOORS"));
        albums.add(new Album("Nancy Whisky", "The Clancy Brothers and Tommy Makem", "Isn't It Grand Boys"));
        albums.add(new Album("Isn't It Grand Boys", "The Clancy Brothers and Tommy Makem", "Isn't It Grand Boys6"));
        albums.add(new Album("song21", "The Clancy Brothers and Tommy Makem", "Hemingway's Whiskey"));
        albums.add(new Album("song21", "artist1", "Hemingway's Whiskey"));
        albums.add(new Album("song21", "artist1", "Hemingway's Whiskey"));


        //Create arrayApdater
        AlbumAdapter adapter = new AlbumAdapter(this, albums);
        // Cast to listView
        ListView listView = (ListView) findViewById(R.id.album_list);
        // Set adapter to listView
        listView.setAdapter(adapter);


    }

}
