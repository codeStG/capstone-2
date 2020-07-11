package adventure.rooms.impl;

import adventure.constants.Constants;
import adventure.rooms.Room;

import java.util.HashMap;
import java.util.Map;

public class RoomEight implements Room{
    int roomID = 8;
    String roomDetails = "You notice a sign in this next room that reads:\n" + Constants.ANSI_RED + "\tSHADOW " +
            "BEAST AHEAD\n\tTURN BACK OR FACE DEATH \u2620" + Constants.ANSI_RESET;
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
        exits.put("S", 9);
        exits.put("W", 4);
        return new HashMap<String, Integer>(exits);
    }
}
