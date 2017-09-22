package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Al on 2017-09-14.
 */

public abstract class tweet implements Tweetable{
    private String message;
    private Date date;

    public tweet(String message){
        this.message = message;
        this.date = new Date();

    }
    public tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }
    public void setDate(Date date){
        this.date = date;

    }
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <= 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();

        }
    }
    public Date getDate(){
        return date;

    }

    public String getMessage(){
        return message;

    }
    public Boolean isImportant(){
        return false;
    }

    public String toString(){
        return date.toString() + " | "  + message;
    }
}
