package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String DefaultTranslation, String MiwokTranslation) {
        this.mDefaultTranslation = DefaultTranslation;
        this.mMiwokTranslation = MiwokTranslation;
    }

    public Word(String DefaultTranslation, String MiwokTranslation, int ImageResourceId) {
        this.mDefaultTranslation = DefaultTranslation;
        this.mMiwokTranslation = MiwokTranslation;
        this.mImageResourceId = ImageResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
