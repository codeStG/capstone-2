package adventure.rooms.impl;

import adventure.constants.Constants;
import adventure.rooms.Room;

import java.util.HashMap;
import java.util.Map;

public class RoomSix implements Room{
    int roomID = 6;
    String roomDetails = "You find yourself in a dark room, but you hear whimpering coming" +
            " from the corner.\nAs you approach the corner, the woman flings herself at you! Oh no, its a " +
            "banshee!";

    private static boolean gameWinner = false;
    private static boolean gameLoser = true;
    Map<String, Integer> exits = new HashMap<>();

    @Override
    public int getRoomID() {
        return roomID;
    }

    @Override
    public boolean isWinRoom() {
        return gameWinner;
    }

    @Override
    public boolean isLoseRoom() {
        return gameLoser;
    }

    @Override
    public void setWinningRoom() {
        gameWinner = true;
        gameLoser = false;
    }

    @Override
    public String displayDetails() {
        if(gameLoser) {
            return roomDetails;
        }
        roomDetails = "You spot a banshee whimpering in the corner of the room. She leaps out to attack you!\n" +
                "Luckily, you have the sword from the skeleton and you plunge it through her heart. You have won the " +
                "battle!";
        return roomDetails;
    }

    @Override
    public void displayWinMessage() {
        System.out.println(Constants.ANSI_GREEN + "\u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 " +
                "\u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605\u2605 " +
                "\u2605 \u2605 \u2605 \u2605");
        System.out.println("CONGRATULATIONS, YOU HAVE DEFEATED THE BANSHEE!");
        System.out.println("\t\t\tLEVEL ONE HAS BEEN WON!");
        System.out.println("\u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 " +
                "\u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605\u2605 \u2605 \u2605 \u2605 \u2605" +
                Constants.ANSI_RESET);
        System.out.println("Come back and play again to see if you can find the treasure!");
    }

    @Override
    public void displayLoseMessage() {
        System.out.println(Constants.ANSI_RED + "\u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620 " +
                "\u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620");
        System.out.println("YOU HAVE BEEN DEFEATED BY THE BANSHEE!");
        System.out.println("\t\t\tLEVEL ONE LOST");
        System.out.println("\u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620 " +
                "\u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620" + Constants.ANSI_RESET);
        System.out.println("Come back and try again!");
    }

    @Override
    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
