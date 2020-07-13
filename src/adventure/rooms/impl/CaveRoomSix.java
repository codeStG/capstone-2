package adventure.rooms.impl;

import adventure.rooms.Room;

import java.util.HashMap;
import java.util.Map;

public class CaveRoomSix implements Room{
    int roomID = 6;
    String roomDetails = "You find yourself in a dark room, but you hear whimpering coming" +
            " from the corner.\nAs you approach the corner, the woman flings herself at you! Oh no, its a " +
            "banshee!";
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
