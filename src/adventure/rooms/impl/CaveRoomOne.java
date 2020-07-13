package adventure.rooms.impl;

import adventure.constants.Constants;
import adventure.rooms.Room;

import java.util.HashMap;
import java.util.Map;

public class CaveRoomOne implements Room{
    int roomID = 1;
    String roomDetails ="Your journey begins facing a dark cave with a daunting " +
            "sign that reads, \"" + Constants.ANSI_RED + "BEWARE" + Constants.ANSI_RESET + "\" written in what seems " +
            "to be blood.";
    Map<String, Integer> exits = new HashMap<>();

    public CaveRoomOne() {
        exits.put("S", 1);
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
