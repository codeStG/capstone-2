package adventure;

import java.util.HashMap;
import java.util.Map;

class Rooms extends Room{
    private final int roomID;
    private final String description;
    private final Map<String, Integer> exits;

    private static Map<Integer, Room> rooms = new HashMap<Integer, Room>();
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";

    //*******************************************************************************
    //Possibly add another parameter to determine whether or not treasure was found??
    //*******************************************************************************

    public Rooms(int roomID, String description) {
        this.roomID = roomID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
        this.exits.put("Q", 0);
    }

    public static Map<Integer, Room> getRooms() {
        rooms.put(0, new Rooms(0, "You have quit the game."));
        rooms.put(1, new Rooms(1, "Your journey begins facing a dark cave with a daunting " +
                "sign that reads, \"" + ANSI_RED + "BEWARE" + ANSI_RESET + "\" written in what seems to be blood."));
        rooms.put(2, new Rooms(2, "You are at the first fork in the cave, it is pitch black dark, " +
                "but you see a light shining to the West. There seems to be an object to the East, but you cannot " +
                "make out what it is."));
        rooms.put(3, new Rooms(3, "You have arrived to what seems to be an empty room with a candle" +
                " lit. It seems like someone has been here recently. \nYou see a staircase leading down to the West " +
                "and are immediately curious, but get sidetracked by the cries of a woman to the south."));
        rooms.put(4, new Rooms(4, "You have stumbled upon what seems to be a bed made out of " +
                "foraged materials and a note that has been neatly tucked underneath a pillow."));
        rooms.put(5, new Rooms(5, "You make your way down the winding staircase, barely able to see " +
                "your hand in front of your face. \nA light peeks out as you approach the bottom of the staircase. As" +
                " you carefully peak around the stone pillar, you see mountains of gold and jewels. " + ANSI_GREEN
                + "\nYou have stumbled upon the lost treasure!" + ANSI_RESET));
        rooms.put(6, new Rooms(6, "You find yourself in a dark room, but you hear whimpering coming" +
                " from the corner. As you approach the corner, the woman flings herself at you! Oh no, its a " +
                "banshee! " + ANSI_RED + "\nYOU ARE DEAD! \u2620" + ANSI_RESET));
        rooms.put(7, new Rooms(7, "You walk into a well lit room and find various sets of rubies and" +
                " pearls on a desk along with a sign that advises more treasure to be found to the West. \nWhere" +
                " do you go?"));
        rooms.put(8, new Rooms(8, "You notice a sign in this next room that reads:\n" + ANSI_RED + "\tCAVE " +
                "CREATURE AHEAD\n\tTURN BACK OR FACE DEATH \u2620" + ANSI_RESET));
        rooms.put(9, new Rooms(9, "You spot a skeleton on the ground with a sword in its hand. The sword" +
                " has been added to your inventory and will aid you against the cave creature ahead."));
        rooms.put(10, new Rooms(10, "You have arrived at the lair of the cave creature. The fight begins!"));

        rooms.get(1).addExit("S", 2);

        rooms.get(2).addExit("W", 3);
        rooms.get(2).addExit("E", 4);

        rooms.get(3).addExit("S", 6);
        rooms.get(3).addExit("W", 5);
        rooms.get(3).addExit("E", 2);

        rooms.get(4).addExit("S", 7);
        rooms.get(4).addExit("E", 8);
        rooms.get(4).addExit("W", 2);

        //no exits for Room 5. This should be a game winner.

        //no exits for Room 6. This should be a game loser.

        rooms.get(7).addExit("N", 4);
        rooms.get(7).addExit("W", 6);

        rooms.get(8).addExit("S", 9);
        rooms.get(8).addExit("W", 4);

        //Room 9 is where the sword is found and should be added to inventory.
        rooms.get(9).addExit("S", 10);
        rooms.get(9).addExit("N", 8);

        return rooms;
    }

    @Override
    void addExit(String direction, int roomID) {
        //The String direction represents the string value of North, East, South and West and relates it to the proper
        //roomID in relation to the direction chosen.
        exits.put(direction, roomID);
    }

//    @Override
//    int getRoomID() {
//        return roomID;
//    }

    @Override
    String getDescription() {
        return description;
    }

    @Override
    Map<String, Integer> getExits() {
        //When getting the exits map we return a copy of it, not the original. This helps to ensure that the map of
        //exits cannot be manipulated.
        return new HashMap<String, Integer>(exits);
    }

    @Override
    public String getName() {
        String roomName = String.valueOf(roomID);
        return roomName;
    }
}
