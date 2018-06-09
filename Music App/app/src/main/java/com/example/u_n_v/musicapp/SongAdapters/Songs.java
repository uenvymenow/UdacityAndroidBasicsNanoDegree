package com.example.u_n_v.musicapp.SongAdapters;

public class Songs {

    private int mAlbumImageID;
    private String mSongName;
    private String mAlbumName;
    private int NO_IMAGE_PROVIDED = -1;

    // Constructor if no image is available
    public Songs(String songName, String albumName){
        mSongName = songName;
        mAlbumName = albumName;
    }

    // Constructor if image is available
    public Songs(int albumImageID, String albumName, String songName){
        mAlbumImageID = albumImageID;
        mSongName = songName;
        mAlbumName = albumName;
    }

    // Returns the name of the song
    public String getSongName(){
        return mSongName;
    }

    // Returns the albumID
    public int getAlbumImageID(){
        return mAlbumImageID;
    }

    // Returns the albumID
    public String getAlbumName(){
        return mAlbumName;
    }

    // Checks if there is an album image
    public boolean hasAlbumImageID(){
        return mAlbumImageID != NO_IMAGE_PROVIDED;
    }

}
