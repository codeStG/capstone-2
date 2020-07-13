package adventure.rooms.impl;

import adventure.rooms.Room;

import java.util.HashMap;
import java.util.Map;

public class CaveRoomTwo implements Room{
    int roomID = 2;
    String roomDetails ="You are at the first fork in the cave. It is pitch black dark, " +
            "but you see a light shining to the West. There seems to be an object to the East, but you cannot " +
            "make out what it is.";
    Map<String, Integer> exits = new HashMap<>();

    public CaveRoomTwo() {
        exits.put("W", 2);
        exits.put("E", 3);
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
