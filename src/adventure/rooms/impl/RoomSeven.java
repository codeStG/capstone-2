package adventure.rooms.impl;

import adventure.rooms.Room;

import java.util.HashMap;
import java.util.Map;

public class RoomSeven implements Room{
    int roomID = 7;
    String roomDetails = "You walk into a well lit room and find various sets of rubies and" +
            " pearls on a desk along with a sign that advises more treasure to be found to the West.\n" +
            "You spot some body armor on the ground by the desk. It has been added to your inventory.";
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
        exits.put("N", 4);
        exits.put("W", 6);
        return new HashMap<String, Integer>(exits);
    }
}
