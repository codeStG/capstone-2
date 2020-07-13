package adventure.levels;

import adventure.constants.Constants;
import adventure.players.Player;
import adventure.rooms.Room;

import java.util.Map;

public abstract class Level{
    private boolean winOrLose;

    abstract public Room getCurrentRoom();

    abstract public void setCurrentRoom();

    abstract public void getRoomDetails(Player player);

    abstract public void getExit(Player player, Room currentRoom);

    public boolean getWinOrLose() {
        return winOrLose;
    }

    public void setWinOrLose(boolean bool) {
        winOrLose = bool;
    }

    public void displayExits(Player player, Room currentRoom) {
        Map<String, Integer> exits = currentRoom.getExits();
        System.out.print("The available exits are: ");
        for(String exit: exits.keySet()) {
            System.out.print("\t" + Constants.ANSI_CYAN + exit + Constants.ANSI_RESET);
        }
            System.out.println("\nWhere will you go, " + player.getName() + "?");
    }
}
