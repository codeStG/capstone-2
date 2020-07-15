package adventure.rooms.impl;

import adventure.rooms.Room;

import java.util.HashMap;
import java.util.Map;

public class CaveRoomSeven implements Room{
    int roomID = 7;
    String roomDetails = "You walk into a well lit room and find various sets of rubies and" +
            " pearls on a desk along with a sign that advises more treasure to be found to the West.\n" +
            "You spot some body armor on the ground by the desk. It has been added to your inventory.";
    Map<String, Integer> exits = new HashMap<>();

    public CaveRoomSeven() {
        exits.put("N", 3);
        exits.put("W", 5);
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
