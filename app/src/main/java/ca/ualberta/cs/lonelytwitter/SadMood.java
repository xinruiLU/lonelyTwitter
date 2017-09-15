package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Al on 2017-09-14.
 */

public class SadMood extends Mood {
    public SadMood(String mood){
        super(mood);
    }

    public SadMood(String mood, Date date) {
        super(mood, date);
    }
    @Override
    public Boolean isSad(){
        return Boolean.TRUE;
    }
}
