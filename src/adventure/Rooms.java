package adventure;

import java.util.HashMap;
import java.util.Map;

public class Rooms extends Room {

    public Rooms(int roomID, String description) {
        super(roomID, description);
    }

    private static Map<Integer, Room> rooms = new HashMap<Integer, Room>();
    public static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static Map<Integer, Room> getRooms() {
        rooms.put(0, new Room(0, "You have quit the game."));
        rooms.put(1, new Room(1, "Your journey begins facing a dark cave with a daunting " +
                "sign that reads, \"" + ANSI_RED + "BEWARE" + ANSI_RESET + "\" written in what seems to be blood."));
        rooms.put(2, new Room(2, "You are at the first fork in the cave, it is pitch black dark, " +
                "but you see a light shining to the West. There seems to be an object to the East, but you cannot " +
                "make out what it is. \nWhich direction will you head?"));
        rooms.put(3, new Room(3, "You have arrived to what seems to be an empty room with a candle" +
                "lit. It seems like someone has been here recently. \nYou see a staircase leading down to the West " +
                "and are immediately curious, but get sidetracked by the cries of a woman to the south. Where will " +
                "you go?"));
        rooms.put(4, new Room(4, "You have stumbled upon what seems to be a bed made out of " +
                "foraged materials and a note that has been neatly tucked underneath a pillow."));
        rooms.put(5, new Room(5, "You make your way down the winding staircase, barely able to see " +
                "your hand in front of your face. \nA light peeks out as you approach the bottom of the staircase. As" +
                "you carefully peak around the stone pillar, you see mountains of gold and jewels. " + ANSI_GREEN
                + "\nYou have stumbled upon the lost treasure!" + ANSI_RESET));
        rooms.put(6, new Room(6, "You find yourself in a dark room, but you hear whimpering coming" +
                " from the corner. As you approach the corner, the woman flings herself at you! Oh no, its a " +
                "banshee! " + ANSI_RED + "\nYOU ARE DEAD! \u2620" + ANSI_RESET));
        rooms.put(7, new Room(7, "You walk into a well lit room and find various sets of rubies and" +
                " pearls on a desk along with a sign that advises more treasure to be found to the West. \nWhere" +
                " do you go?"));
        rooms.put(8, new Room(8, "You are sitting in front of a computer learning Java"));
        rooms.put(9, new Room(9, "You are sitting in front of a computer learning Java"));
        rooms.put(10, new Room(10, "You are sitting in front of a computer learning Java"));
        rooms.put(11, new Room(11, "You are sitting in front of a computer learning Java"));
        return rooms;
    }
}
