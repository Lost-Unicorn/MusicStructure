package com.example.donna.musicapp;


public class Album {

    private String mSong;
    private String mArtist;
    private String mAlbum;


    public Album(String song, String artist, String album) {
        mSong = song;
        mArtist = artist;
        mAlbum = album;
    }

    public String getSong() {
        return mSong;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getAlbum() {
        return mAlbum;
    }
}

