package com.example.u_n_v.musicapp.SongAdapters;

public class Songs {

    private int mAlbumImageID;
    private String mSongName;
    private int NO_IMAGE_PROVIDED = -1;

    // Constructor if no image is available
    public Songs(String songName){
        mSongName = songName;
    }

    // Constructor if image is available
    public Songs(int albumImageID, String songName){
        mAlbumImageID = albumImageID;
        mSongName = songName;
    }

    // Returns the name of the song
    public String getSongName(){
        return mSongName;
    }

    // Returns the albumID
    public int getAlbumImageID(){
        return mAlbumImageID;
    }

    // Checks if there is an album image
    public boolean hasAlbumImageID(){
        return mAlbumImageID != NO_IMAGE_PROVIDED;
    }

}
