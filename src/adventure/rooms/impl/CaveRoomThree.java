package adventure.rooms.impl;

import adventure.rooms.Room;

import java.util.HashMap;
import java.util.Map;

public class CaveRoomThree implements Room{
    int roomID = 3;
    String roomDetails ="You have arrived to what seems to be an empty room with a candle" +
            " lit. It seems like someone has been here recently. \nYou see a staircase leading down to the West " +
            "and are immediately curious, but get sidetracked by the cries of a woman to the south.";
    Map<String, Integer> exits = new HashMap<>();

    public CaveRoomThree() {
        exits.put("S", 5);
        exits.put("W", 4);
        exits.put("E", 1);
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
