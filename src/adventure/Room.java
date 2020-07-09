package adventure;

import java.util.Map;

public abstract class Room implements Thing{

    abstract void addExit(String direction, int roomID);

//    abstract int getRoomID();

    abstract String getDescription();

    abstract Map<String, Integer> getExits();
}
