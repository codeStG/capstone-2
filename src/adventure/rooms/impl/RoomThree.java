package adventure.rooms.impl;

import adventure.rooms.Room;

import java.util.HashMap;
import java.util.Map;

public class RoomThree implements Room{
    int roomID = 3;
    String roomDetails ="You have arrived to what seems to be an empty room with a candle" +
            " lit. It seems like someone has been here recently. \nYou see a staircase leading down to the West " +
            "and are immediately curious, but get sidetracked by the cries of a woman to the south.";
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
        exits.put("S", 6);
        exits.put("W", 5);
        exits.put("E", 2);
        return new HashMap<String, Integer>(exits);
    }
}
