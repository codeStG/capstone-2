package adventure.rooms.impl;

import adventure.rooms.Room;

import java.util.HashMap;
import java.util.Map;

public class CaveRoomFour implements Room{
    int roomID = 4;
    String roomDetails = "You have stumbled upon what seems to be a bed made out of foraged materials.";
    Map<String, Integer> exits = new HashMap<>();

    public CaveRoomFour() {
        exits.put("S", 6);
        exits.put("E", 7);
        exits.put("W", 1);
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
