package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Al on 2017-09-14.
 */

public class HappyMood extends Mood {
    public HappyMood(String mood) {
        super(mood);
    }

    public HappyMood(String mood, Date date) {
        super(mood, date);
    }
    @Override
    public Boolean isSad(){
        return Boolean.FALSE;
    }
}
