package com.example.donna.musicapp;

public class Artist {
    //Artist

    private String mArtist;
    private String mSong;

    public Artist(String artist, String song) {

        mArtist = artist;
        mSong = song;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getSong() {
        return mSong;
    }
}
