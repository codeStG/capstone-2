package adventure.rooms.impl;

import adventure.constants.Constants;
import adventure.rooms.Room;

import java.util.HashMap;
import java.util.Map;

public class CaveRoomFive implements Room{
    int roomID = 5;
    String roomDetails = "You make your way down the winding staircase, barely able to see " +
            "your hand in front of your face. \nA light peeks out as you approach the bottom of the staircase. As" +
            " you carefully peak around the stone pillar, you see mountains of gold and jewels. " + Constants.ANSI_GREEN
                + "\nYou have stumbled upon the lost treasure!" + Constants.ANSI_RESET;
    Map<String, Integer> exits = new HashMap<>();

    @Override
    public int getRoomID() {
        return roomID;
    }

    @Override
    public String displayDetails() {
        return roomDetails;
    }

    @Override
    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
