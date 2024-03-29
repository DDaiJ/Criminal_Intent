package com.example.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 *
 * An Instance of a Crime with unique ID, a title, a Date and an indication of whether the crime
 * has been solved
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }


    public Date getDate() {
        return mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }


    public void setTitle(String title) {
        mTitle = title;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
