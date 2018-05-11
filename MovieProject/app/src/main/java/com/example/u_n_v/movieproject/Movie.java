package com.example.u_n_v.movieproject;

public class Movie {
    private int mImageDrawable;
    private String mName;
    private String mRelease;

    // Constructor that is used to create an instance of the Movie object
    public Movie(int mImageDrawable, String mName, String mRelease){
        this.mImageDrawable = mImageDrawable;
        this.mName = mName;
        this.mRelease = mRelease;
    }

    public int getmImageDrawable(){
        return mImageDrawable;
    }

    public void setmImageDrawable(int mImageDrawable){
        this.mImageDrawable = mImageDrawable;
    }

    public String getmName(){
        return mName;
    }

    public void setmName(String mName){
        this.mName = mName;
    }

    public String getmRelease(){
        return mRelease;
    }

    public void setmRelease(String mRelease){
        this.mRelease = mRelease;
    }
}
