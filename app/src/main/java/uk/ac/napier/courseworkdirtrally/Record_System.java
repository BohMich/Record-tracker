package uk.ac.napier.courseworkdirtrally;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abdek on 09/02/2017.
 * This class works as a facade class, encapsulating all classes and funtions
 * Im not sure if that will work when it comes to implementing this in android environment
 * if not, i will ditch the facade and embed the classes in the main activity or somehthign
 */

public class Record_System {

    //Create a database of Players, Races and Sessions
    private List<Player> playerList = new ArrayList<>();
    private List<Track> trackList = new ArrayList<>();

    private List<Session> sessions = new ArrayList<>();

    public void AddPlayer(String name){
        playerList.add(new Player(name));
    }

    public void AddTrackList(String country,String trackName){
       trackList.add(new Track(country,trackName));
    }

    public void AddSession(Player player,Track track){
        sessions.add(new Session(player,track));
    }




}
