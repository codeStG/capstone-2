package adventure.rooms.impl;

import adventure.constants.Constants;
import adventure.rooms.Room;

import java.util.HashMap;
import java.util.Map;

//Room 10 is the boss room
public class RoomTen implements Room{
    int roomID = 10;
    String roomDetails = "You have arrived at the lair of the Shadow Beast. The fight begins!";
    boolean gameWinner = false;
    boolean gameLoser = true;
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
        return roomDetails;
    }

    @Override
    public void displayWinMessage() {
        System.out.println(Constants.ANSI_GREEN + "\u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 " +
                "\u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605\u2605 \u2605 " +
                "\u2605 \u2605 \u2605");
        System.out.println("CONGRATULATIONS, YOU HAVE DEFEATED THE SHADOW BEAST!");
        System.out.println("\t\t\tLEVEL ONE HAS BEEN WON!");
        System.out.println("\u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 " +
                "\u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605\u2605 \u2605 \u2605 \u2605 " +
                "\u2605" + Constants.ANSI_RESET);
        System.out.println("Come back and play again to see if you can find the treasure!");
    }

    @Override
    public void displayLoseMessage() {
        System.out.println(Constants.ANSI_RED + "\u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620 " +
                "\u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620");
        System.out.println("YOU HAVE BEEN DEFEATED BY THE SHADOW BEAST!");
        System.out.println("\t\t\tLEVEL ONE LOST");
        System.out.println("\u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620 " +
                "\u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620" + Constants.ANSI_RESET);
        System.out.println("Come back and try again!");
    }

    @Override
    public Map<String, Integer> getExits() {
        //No exits for Room 10. You either win or lose.
        return new HashMap<String, Integer>(exits);
    }
}
