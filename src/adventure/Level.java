package adventure;

import java.util.HashMap;
import java.util.Map;

public abstract class Level implements PhysicalObject{
    private final int roomID;
    private final String roomDetails;
    private final boolean gameWinner;
    private final boolean gameLoser;

    //private final boolean itemsFound; ???? this could be for treasure
    private final Map<String, Integer> exits;

    public Level(int roomID, String roomDetails, boolean gameWinner, boolean gameLoser) {
        this.roomID = roomID;
        this.roomDetails = roomDetails;
        this.gameWinner = gameWinner;
        this.gameLoser = gameLoser;
        this.exits = new HashMap<String, Integer>();
        this.exits.put("Q", 0);
    }

    public void exitPoint(String direction, int roomID) {
        //The String direction represents the string value of North, East, South and West and relates it to the proper
        //roomID in relation to the direction chosen.
        exits.put(direction, roomID);
    }

    public boolean isWinRoom() {
        return gameWinner;
    }

    public boolean isLoseRoom() {
        return gameLoser;
    }

    public String displayDetails() {
        return roomDetails;
    }

    public Map<String, Integer> getExits() {
        //When getting the exits map we return a copy of it, not the original. This helps to ensure that the map of
        //exits cannot be manipulated.
        return new HashMap<String, Integer>(exits);
    }

    //This method is forced to be implemented by the PhysicalObject interface.
    public String getName() {
        String roomName = String.valueOf(roomID);
        return roomName;
    }

    abstract public void displayWinMessage();

}
