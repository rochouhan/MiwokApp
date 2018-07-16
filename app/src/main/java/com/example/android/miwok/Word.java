package com.example.android.miwok;

import android.content.Context;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = -1;
    private int mAudioResourceId = -1;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

//    public void setDefaultTranslation(String word){
//        mDefaultTranslation = word;
//    }
//
//    public void setMiwokTranslation(String translation){
//        mMiwokTranslation = translation;
//    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){return mImageResourceId; }

    public int getAudioResourceId(){return mAudioResourceId;}
}

