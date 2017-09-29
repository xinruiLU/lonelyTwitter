/*
 * Class Name: tweet
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
 * Repersents  a Tweetable
 *
 * @author Xinrui Lu
 * @version 1.0
 * @see tweet
 * @since 1.0
 *
 */

/**
 * Construct Tweetable objects call getDate and getMessage
 */
public interface Tweetable {
    public String getMessage();

    public Date getDate();

}
