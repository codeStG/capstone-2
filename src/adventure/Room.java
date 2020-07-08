package adventure;

import java.util.HashMap;
import java.util.Map;

public class Room{
    private final int roomID;
    private final String description;
    private final Map<String, Integer> exits;

    public Room(int roomID, String description) {
        this.roomID = roomID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
    }

    //*******************************************************************************
    //Possibly add another parameter to determine whether or not treasure was found??
    //*******************************************************************************
    public void addExit(String direction, int roomID) {
        //The String direction represents the string value of North, East, South and West and relates it to the proper
        //roomID in relation to the direction chosen.
        exits.put(direction, roomID);
    }

    public int getRoomID() {
        return roomID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        //When getting the exits map we return a copy of it, not the original. This helps to ensure that the map of
        //exits cannot be manipulated.
        return new HashMap<String, Integer>(exits);
    }
}
