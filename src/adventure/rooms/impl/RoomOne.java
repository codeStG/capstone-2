package adventure.rooms.impl;

import adventure.constants.Constants;
import adventure.rooms.Room;

import java.util.HashMap;
import java.util.Map;

public class RoomOne implements Room{
    int roomID = 1;
    String roomDetails ="Your journey begins facing a dark cave with a daunting " +
            "sign that reads, \"" + Constants.ANSI_RED + "BEWARE" + Constants.ANSI_RESET + "\" written in what seems " +
            "to be blood.";
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
    public void toggleWinOrLoseRoom() {
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
        exits.put("S", 2);
        return new HashMap<String, Integer>(exits);
    }
}
