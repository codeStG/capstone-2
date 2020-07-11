package adventure.rooms.impl;

import adventure.rooms.Room;

import java.util.HashMap;
import java.util.Map;

public class RoomFour implements Room{
    int roomID = 4;
    String roomDetails = "You have stumbled upon what seems to be a bed made out of foraged materials.";
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
        exits.put("S", 7);
        exits.put("E", 8);
        exits.put("W", 2);
        return new HashMap<String, Integer>(exits);
    }
}
