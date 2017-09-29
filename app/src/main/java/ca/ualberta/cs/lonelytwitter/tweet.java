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
 * Repersents  a tweet
 *
 * @author Xinrui Lu
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @see Tweetable
 * @since 1.0
 *
 */


public abstract class tweet implements Tweetable{
    private String message;
    private Date date;

    /**
     *
     * @param message
     */
    public tweet(String message){
        this.message = message;
        this.date = new Date();
        /**
         * Construct tweet objects
         *
         * @param message tweet messgae
         *
         * @param date tweet date
         */
    }
    public tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     *  Consruct setDate objects
     *
     * @param date
     */
    public void setDate(Date date){
        this.date = date;
/**
 *  Construct setMessage objects
 *
 * @param message setMessage message
 * @throws TweetTooLongException
 */
    }
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <= 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();

        }
    }

    /**
     * Construct getDate objects
     *
     * @return date return a date
     */
    public Date getDate(){
        return date;

    }

    /**
     *Construct getMessage objects
     *
     * @return message return a message
     */
    public String getMessage(){
        return message;

    }

    /**
     * Construct isImportant objects
     *
     * @return Boolean true or false
     */
    public Boolean isImportant(){
        return false;
    }

    /**
     * Construct toString objects
     *
     * @return date return a date and convert to string
     * @return message return a message
     */

    public String toString(){
        return date.toString() + " | "  + message;
    }
}
