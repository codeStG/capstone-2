package adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class LevelOne extends Level{
    private static Map<Integer, Level> rooms = new HashMap<>();
    private static Random random = new Random();
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";

    public LevelOne(int roomID, String roomDetails, boolean gameWinner, boolean gameLoser) {
        super(roomID, roomDetails, gameWinner, gameLoser);
    }

    //*******************************************************************************
    //Possibly add another parameter to determine whether or not treasure was found??
    //*******************************************************************************

    public static Map<Integer, Level> getRooms() {
        rooms.put(0, new LevelOne(0, "You have quit the game.", false, false));
        rooms.put(1, new LevelOne(1, "Your journey begins facing a dark cave with a daunting " +
                "sign that reads, \"" + ANSI_RED + "BEWARE" + ANSI_RESET + "\" written in what seems to be blood.",
                false, false));
        rooms.put(2, new LevelOne(2, "You are at the first fork in the cave. It is pitch black dark, " +
                "but you see a light shining to the West. There seems to be an object to the East, but you cannot " +
                "make out what it is.", false, false));
        rooms.put(3, new LevelOne(3, "You have arrived to what seems to be an empty room with a candle" +
                " lit. It seems like someone has been here recently. \nYou see a staircase leading down to the West " +
                "and are immediately curious, but get sidetracked by the cries of a woman to the south.", false,
                false));
        rooms.put(4, new LevelOne(4, "You have stumbled upon what seems to be a bed made out of " +
                "foraged materials.", false, false));
        rooms.put(5, new LevelOne(5, "You make your way down the winding staircase, barely able to see " +
                "your hand in front of your face. \nA light peeks out as you approach the bottom of the staircase. As" +
                " you carefully peak around the stone pillar, you see mountains of gold and jewels. " + ANSI_GREEN
                + "\nYou have stumbled upon the lost treasure!" + ANSI_RESET, false, false));
        //For room 6, gameWinner could be true if the player has the sword? Just an idea
        rooms.put(6, new LevelOne(6, "You find yourself in a dark room, but you hear whimpering coming" +
                " from the corner. As you approach the corner, the woman flings herself at you! Oh no, its a " +
                "banshee! " + ANSI_RED + "\nYOU ARE DEAD! \u2620" + ANSI_RESET, false, true));
        rooms.put(7, new LevelOne(7, "You walk into a well lit room and find various sets of rubies and" +
                " pearls on a desk along with a sign that advises more treasure to be found to the West. \nWhere" +
                " do you go?", false, false));
        rooms.put(8, new LevelOne(8, "You notice a sign in this next room that reads:\n" + ANSI_RED + "\tCAVE " +
                "CREATURE AHEAD\n\tTURN BACK OR FACE DEATH \u2620" + ANSI_RESET, false, false));
        rooms.put(9, new LevelOne(9, "You spot a skeleton on the ground with a sword in its hand. The sword" +
                " has been added to your inventory and will aid you against the cave creature ahead.", false, false));

        boolean battleWon = random.nextBoolean();
        rooms.put(10, new LevelOne(10, "You have arrived at the lair of the cave creature. The fight begins!",
                battleWon, !battleWon));

        rooms.get(1).exitPoint("S", 2);

        rooms.get(2).exitPoint("W", 3);
        rooms.get(2).exitPoint("E", 4);

        rooms.get(3).exitPoint("S", 6);
        rooms.get(3).exitPoint("W", 5);
        rooms.get(3).exitPoint("E", 2);

        rooms.get(4).exitPoint("S", 7);
        rooms.get(4).exitPoint("E", 8);
        rooms.get(4).exitPoint("W", 2);

        //no exits for Level 5. This should be a game winner.

        //no exits for Level 6. This should be a game loser.

        rooms.get(7).exitPoint("N", 4);
        rooms.get(7).exitPoint("W", 6);

        rooms.get(8).exitPoint("S", 9);
        rooms.get(8).exitPoint("W", 4);

        //Level 9 is where the sword is found and should be added to inventory.
        rooms.get(9).exitPoint("S", 10);
        rooms.get(9).exitPoint("N", 8);

        return rooms;
    }

    @Override
    public void displayWinMessage() {
        System.out.println(ANSI_GREEN + "\u2605\u2605\u2605\u2605\u2605\u2605\u2605\u2605\u2605\u2605\u2605\u2605" +
                "\u2605\u2605\u2605\u2605");
        System.out.println("CONGRATULATIONS, YOU HAVE FOUND THE HIDDEN TREASURE!");
        System.out.println("\tLEVEL ONE HAS BEEN WON!");
        System.out.println("\u2605\u2605\u2605\u2605\u2605\u2605\u2605\u2605\u2605\u2605\u2605\u2605\u2605\u2605" +
                "\u2605\u2605" + ANSI_RESET);
        System.out.println("Come back and play again to see if you can find even more treasure!");
    }
}
