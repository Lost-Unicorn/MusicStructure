package com.example.donna.musicapp;


public class Song {

    //Song
    private String mSong;
    private String mArtist;
    private String mAlbum;


    public Song(String song, String artist, String album) {
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

