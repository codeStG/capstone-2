package adventure.rooms;

import java.util.Map;

public interface Room {
//    void exitPoint(String direction, int roomID);

    int getRoomID();

    boolean isWinRoom();

    boolean isLoseRoom();

    void toggleWinOrLoseRoom();

    String displayDetails();

    void displayWinMessage();

    void displayLoseMessage();

    //When getting the exits map we return a copy of it, not the original. This helps to ensure that the map of
    //exits cannot be manipulated.
    Map<String, Integer> getExits();
}
