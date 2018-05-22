package com.example.u_n_v.musicapp.ArtistAdapters;

public class Artists {
    private String mArtistName;
    private int mArtistImageID;
    private static final int NO_IMAGE_PROVIDED = -1;

    // Constructor where no Artist image is available
    public Artists(String artistName){
        mArtistName = artistName;
    }

    // Constructor where artist image is available
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
