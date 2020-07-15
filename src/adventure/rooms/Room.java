package adventure.rooms;

import java.util.Map;

public interface Room {
    int getRoomID();

    String displayDetails();

    Map<String, Integer> getExits();
}
