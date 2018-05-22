package com.example.u_n_v.musicapp.AlbumAdapters;

public class Albums {

    private int mAlbumImageID;
    private String mAlbumName;
    private static final int NO_IMAGE_PROVIDED = -1;

    // Constructor where there is no album image
    public Albums(String albumName){
        mAlbumName = albumName;
    }

    // Constructor where there is an album image
    public Albums(int albumImageID, String albumName){
        mAlbumImageID = albumImageID;
        mAlbumName = albumName;
    }

    public String getAlbumName(){
        return mAlbumName;
    }

    public int getAlbumImageID(){
        return mAlbumImageID;
    }

    public boolean hasAlbumImage(){
        return mAlbumImageID != NO_IMAGE_PROVIDED;
    }
}
