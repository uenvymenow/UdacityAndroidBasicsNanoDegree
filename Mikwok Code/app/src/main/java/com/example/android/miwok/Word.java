package com.example.android.miwok;

public class Word {

    // Set state of Word class with a Miwok translation variable and a default translation variable
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    // Create a new Word object
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // Method to retrieve the default translation
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    // Method to retrieve the Miwok translation
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
