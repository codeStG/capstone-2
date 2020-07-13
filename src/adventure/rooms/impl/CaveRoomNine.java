package adventure.rooms.impl;

import adventure.rooms.Room;

import java.util.HashMap;
import java.util.Map;

public class CaveRoomNine implements Room{
    int roomID = 9;
    String roomDetails = "You spot a skeleton on the ground with a sword in its hand. The sword" +
            " has been added to your inventory and will aid you against the Shadow Beast ahead.";
    Map<String, Integer> exits = new HashMap<>();

    public CaveRoomNine() {
        exits.put("S", 9);
        exits.put("N", 7);
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
