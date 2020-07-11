package adventure.rooms.impl;

import adventure.rooms.Room;

import java.util.HashMap;
import java.util.Map;

public class RoomTwo implements Room{
    int roomID = 2;
    String roomDetails ="You are at the first fork in the cave. It is pitch black dark, " +
            "but you see a light shining to the West. There seems to be an object to the East, but you cannot " +
            "make out what it is.";
    boolean gameWinner = false;
    boolean gameLoser = false;
    Map<String, Integer> exits = new HashMap<>();

    @Override
    public int getRoomID() {
        return roomID;
    }

    @Override
    public boolean isWinRoom() {
        return gameWinner;
    }

    @Override
    public boolean isLoseRoom() {
        return gameLoser;
    }

    @Override
    public void setWinningRoom() {
        //Empty body. not used here.
    }

    @Override
    public String displayDetails() {
        return roomDetails;
    }

    @Override
    public void displayWinMessage() {

    }

    @Override
    public void displayLoseMessage() {

    }

    @Override
    public Map<String, Integer> getExits() {
        exits.put("W", 3);
        exits.put("E", 4);
        return new HashMap<String, Integer>(exits);
    }
}
