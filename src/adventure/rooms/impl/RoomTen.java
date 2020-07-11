package adventure.rooms.impl;

import adventure.constants.Constants;
import adventure.rooms.Room;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//Room 10 is the boss room
public class RoomTen implements Room{
    int roomID = 10;
    String roomDetails = "You have arrived at the lair of the cave creature. The fight begins!";
    boolean gameWinner = false;
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
    public void toggleWinOrLoseRoom() {
        Random random = new Random();
        boolean battleWon = random.nextBoolean();
        gameWinner = battleWon;
        gameLoser = !battleWon;
    }

    @Override
    public String displayDetails() {
        return roomDetails;
    }

    @Override
    public void displayWinMessage() {

    }

    @Override
    public void displayLoseMessage() {

    }

    @Override
    public Map<String, Integer> getExits() {
        //No exits for Room 10. You either win or lose.
        return new HashMap<String, Integer>(exits);
    }
}
