package adventure.rooms.impl;

import adventure.rooms.Room;

import java.util.HashMap;
import java.util.Map;

//Level 9 is where the sword is found and should be added to inventory.
public class RoomNine implements Room{
    int roomID = 9;
    String roomDetails = "You spot a skeleton on the ground with a sword in its hand. The sword" +
            " has been added to your inventory and will aid you against the Shadow Beast ahead.";
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
        exits.put("S", 10);
        exits.put("N", 8);
        return new HashMap<String, Integer>(exits);
    }
}
