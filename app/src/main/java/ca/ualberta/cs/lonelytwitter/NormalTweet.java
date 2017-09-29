/*
 *Class Name: tweet
 *
 * Version: Version1.0
 *
 * Date: September 28, 2017
 *
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditionsof the Code of Students Behavior at University of Alberta.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Al on 2017-09-14.
 */
/**
 * Repersents  a NormalTweet
 *
 * @author Xinrui Lu
 * @version 1.0
 * @see tweet extends from tweet
 * @since 1.0
 *
 */


public class NormalTweet extends tweet {
    /**
     *
     * @param message parameter is message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     *
     * @param message parameter is message
     * @param date parameter is date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }
    @Override
    /**
     * Construct isImportant objects
     *
     * @return Boolean return false
     */

    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}
