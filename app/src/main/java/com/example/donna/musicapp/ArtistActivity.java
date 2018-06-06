package com.example.donna.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist);


        // Create an ArrayList
        ArrayList<Artist> artists = new ArrayList<Artist>();

        artists.add(new Artist("The Boys Are Back", "Dropkick Murphys"));
        artists.add(new Artist("Prisoner's Song", "Dropkick Murphys"));
        artists.add(new Artist("Rose Tattoo", "Dropkick Murphys"));
        artists.add(new Artist("Burn", "Dropkick Murphys"));
        artists.add(new Artist("Jimmy Collins' Wake", "Dropkick Murphys"));
        artists.add(new Artist("The Season's Upon Us", "Dropkick Murphys"));
        artists.add(new Artist("The Battle Rages On", "Dropkick Murphys"));
        artists.add(new Artist("Don't Tear Us Apart", "Dropkick Murphys"));
        artists.add(new Artist("My Hero", "Dropkick Murphys"));
        artists.add(new Artist("Out On The Town", "Dropkick Murphys"));
        artists.add(new Artist("Out of Our Heads", "Dropkick Murphys"));
        artists.add(new Artist("End of the Night", "Dropkick Murphys"));
        artists.add(new Artist("The Boys of Fall", "Kenny Chesney"));
        artists.add(new Artist("Live a Little", "Kenny Chesney"));
        artists.add(new Artist("Coastal", "Kenny Chesney"));
        artists.add(new Artist("You and Tequila (featuring Grace Potter)", "Kenny Chesney"));
        artists.add(new Artist("Seven Days", "Kenny Chesney"));
        artists.add(new Artist("Small Y'all (featuring George Jones)", "Kenny Chesney"));
        artists.add(new Artist("Where I Grew Up", "Kenny Chesney"));
        artists.add(new Artist("Reality", "Kenny Chesney"));
        artists.add(new Artist("Round and Round", "Kenny Chesney"));
        artists.add(new Artist("Somewhere with You", "Kenny Chesney"));
        artists.add(new Artist("Hemingway's Whiskey", "Kenny Chesney"));
        artists.add(new Artist("Break On Through", "THE DOORS"));
        artists.add(new Artist("Soul Kitchen", "THE DOORS"));
        artists.add(new Artist("The Crystal Ship", "THE DOORS"));
        artists.add(new Artist("Twentieth Century Fox", "THE DOORS"));
        artists.add(new Artist("Alabama Song (Whisky Bar)", "THE DOORS"));
        artists.add(new Artist("Light My Fire", "THE DOORS"));
        artists.add(new Artist("Back Door Man", "THE DOORS"));
        artists.add(new Artist("I Looked at You", "THE DOORS"));
        artists.add(new Artist("End of the Night", "THE DOORS"));
        artists.add(new Artist("Take It as It Comes", "THE DOORS"));
        artists.add(new Artist("The End", "THE DOORS"));
        artists.add(new Artist("Nancy Whisky", "The Clancy Brothers and Tommy Makem"));
        artists.add(new Artist("Isn't It Grand Boys", "The Clancy Brothers and Tommy Makem"));


//Create arrayAdapter
        ArtistAdapter adapter = new ArtistAdapter(this, artists);
        // Cast to listView
        ListView listView = findViewById(R.id.artist_list);
        // Set adapter to listView
        listView.setAdapter(adapter);

    }

}
