package com.example.hchoi.criminalintent;

/**
 * Created by hchoi on 2018-02-11.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();
    }
    public UUID getId() {
        return mId;
    }
    public String getTitle() {
        return mTitle;
    }
    public void setTitle(String title) {
        mTitle = title;
    }
}


