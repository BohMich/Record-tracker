package uk.ac.napier.courseworkdirtrally;

/**
 * Created by abdek on 09/02/2017.
 *
 * things to remember
 * 1. Class Player and Track are not inicialized before the session class
 * they only exists as strings in database and are build when session is created >?
 */

class Session {

    public Session(Player driver, Track track){
        this.driver = driver;
        this.track = track;

    }

    private Player driver;
    private Track track;
    private String carModel;
    private int date; //an int for nowm it is the date when the time was set
    private int time;  //an int for now, it is the time of the session.

}
