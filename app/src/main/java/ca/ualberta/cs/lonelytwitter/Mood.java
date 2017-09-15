package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Al on 2017-09-14.
 */

public class Mood {

    private String mood;
    private Date date;

    public Mood(String mood) {
        this.mood = mood;
        this.date = new Date();
    }

    public Mood(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date;

    }

    public Date getDate() {
        return date;

    }

    public String getMood() {
        return mood;

    }

    public Boolean isSad() {
        return false;
    }
}
