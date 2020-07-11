package adventure.levels;

import adventure.rooms.Room;
import adventure.rooms.impl.*;

import java.util.HashMap;
import java.util.Map;

public class LevelOne extends Level {
    private static Map<Integer, Room> rooms = new HashMap<>();

    public Map<Integer, Room> getRooms() {
        rooms.put(1, new RoomOne());
        rooms.put(2, new RoomTwo());
        rooms.put(3, new RoomThree());
        rooms.put(4, new RoomFour());
        rooms.put(5, new RoomFive());
        rooms.put(6, new RoomSix());
        rooms.put(7, new RoomSeven());
        rooms.put(8, new RoomEight());
        rooms.put(9, new RoomNine());
        rooms.put(10, new RoomTen());
        return rooms;
    }
}
