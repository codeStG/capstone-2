package adventure.rooms.impl;

import adventure.constants.Constants;
import adventure.rooms.Room;

import java.util.HashMap;
import java.util.Map;

public class CaveRoomEight implements Room{
    int roomID = 8;
    String roomDetails = "You notice a sign in this next room that reads:\n" + Constants.ANSI_RED + "\tSHADOW " +
            "BEAST AHEAD\n\tTURN BACK OR FACE DEATH \u2620" + Constants.ANSI_RESET;
    Map<String, Integer> exits = new HashMap<>();

    public CaveRoomEight() {
        exits.put("S", 8);
        exits.put("W", 3);
    }

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
