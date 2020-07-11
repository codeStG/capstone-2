package adventure.levels;

import adventure.rooms.Room;

import java.util.Map;

public abstract class Level{

    abstract public Map<Integer, Room> getRooms();

//    abstract public void displayWinMessage();
//
//    abstract public void displayLoseMessage();
}
