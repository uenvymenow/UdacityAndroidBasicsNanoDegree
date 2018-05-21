package com.example.u_n_v.musicapp.ArtistAdapters;

public class Artists {
    private String mArtistName;
    private int mArtistImageID;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Artists(int artistImage, String artistName){
        mArtistImageID = artistImage;
        mArtistName = artistName;
    }

    public String getArtistName(){
        return mArtistName;
    }

    public int getArtistImageID(){
        return mArtistImageID;
    }

    public boolean hasArtistImage(){
        return mArtistImageID != NO_IMAGE_PROVIDED;
    }
}
