package adventure.rooms.impl;

import adventure.constants.Constants;
import adventure.rooms.Room;

import java.util.HashMap;
import java.util.Map;

public class RoomFive implements Room{
    int roomID = 5;
    String roomDetails = "You make your way down the winding staircase, barely able to see " +
            "your hand in front of your face. \nA light peeks out as you approach the bottom of the staircase. As" +
            " you carefully peak around the stone pillar, you see mountains of gold and jewels. " + Constants.ANSI_GREEN
                + "\nYou have stumbled upon the lost treasure!" + Constants.ANSI_RESET;
    boolean gameWinner = true;
    boolean gameLoser = false;
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
        //Empty body. not used here.
    }

    @Override
    public String displayDetails() {
        return roomDetails;
    }

    @Override
    public Map<String, Integer> getExits() {
        //no exits for Level 5. This should be a game winner.
        return new HashMap<String, Integer>(exits);
    }

    public void displayWinMessage() {
        System.out.println(Constants.ANSI_GREEN + "\u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 " +
                "\u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605\u2605 \u2605 " +
                "\u2605 \u2605 \u2605");
        System.out.println("CONGRATULATIONS, YOU HAVE FOUND THE HIDDEN TREASURE!");
        System.out.println("\t\t\tLEVEL ONE HAS BEEN WON!");
        System.out.println("\u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 " +
                "\u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605\u2605 \u2605 \u2605 \u2605 \u2605" +
                Constants.ANSI_RESET);
        System.out.println("Come back and play again to see if you can find even more treasure or defeat the " +
                "monsters!");
    }

    @Override
    public void displayLoseMessage() {

    }
}
