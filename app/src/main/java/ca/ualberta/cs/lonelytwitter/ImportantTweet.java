/*
 *Class Name: ImportantTweet
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
 * Repersents  a ImortantTweet
 *
 * @author Xinrui Lu
 * @version 1.0
 * @see tweet
 * @since 1.0
 *
 */


public class ImportantTweet extends tweet {
    /**
     *
     * @param message parameter is message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     *
     * @param message parameter is message
     * @param date parameter is date
     */

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }
    @Override
/**
 * Construct isImportant objects
 *
 * @return Boolean return ture
 */
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
