package adventure.levels;

import adventure.constants.Constants;
import adventure.paths.Directions;
import adventure.players.Player;
import adventure.rooms.Room;
import adventure.rooms.impl.*;

import java.util.Map;
import java.util.Scanner;

public class LevelOneCave extends Level {
    private static final Room[] rooms = {new CaveRoomOne(), new CaveRoomTwo(), new CaveRoomThree(), new CaveRoomFour(),
            new CaveRoomFive(), new CaveRoomSix(), new CaveRoomSeven(), new CaveRoomEight(), new CaveRoomNine(), new CaveRoomTen()};
    private static final Scanner scanner = new Scanner(System.in);
    private int roomIndex = 0;
    private Room currentRoom = rooms[roomIndex];

    @Override
    public Room getCurrentRoom() {
        return currentRoom;
    }

    @Override
    public void setCurrentRoom() {
        this.currentRoom = rooms[roomIndex];
    }

    @Override
    public void getRoomDetails(Player player) {
        System.out.println(currentRoom.displayDetails());

        switch (roomIndex) {
            case 4:
                setWinOrLose(true);
                System.out.println(Constants.LEVEL_WON_EMOJI + "CONGRATULATIONS, YOU HAVE FOUND THE HIDDEN " +
                        "TREASURE!\n\t\t\tLEVEL ONE HAS BEEN WON!\n" + Constants.LEVEL_WON_EMOJI + "Come back and play again to " +
                        "see if you can find even more treasure or defeat the monsters!");
                break;
            case 5:
                if (player.getHasSword()) {
                    setWinOrLose(true);
                    System.out.println(Constants.LEVEL_WON_EMOJI + "CONGRATULATIONS, YOU HAVE DEFEATED THE BANSHEE " +
                            "WITH THE SWORD" +
                            "!\n" +
                            "\t\t\tLEVEL ONE HAS BEEN WON!\n" + Constants.LEVEL_WON_EMOJI + "Come back and play " +
                            "again to see if you can find the treasure!");
                    break;
                }
                setWinOrLose(true);
                System.out.println(Constants.LEVEL_LOST_EMOJI + "YOU HAVE BEEN DEFEATED BY THE BANSHEE!\n" +
                        "\t\t\tLEVEL ONE LOST\n" + Constants.LEVEL_LOST_EMOJI + "Come back and try again!");
                break;
            case 6:
                player.pickupArmor();
                break;
            case 8:
                player.pickupSword();
                break;
            case 9:
                if (player.getHasSword() && player.getHasArmor()) {
                    setWinOrLose(true);
                    System.out.println(Constants.LEVEL_WON_EMOJI + "CONGRATULATIONS, YOU HAVE DEFEATED THE SHADOW BEAST!\n" +
                            "\t\t\tLEVEL ONE HAS BEEN WON!\n" + Constants.LEVEL_WON_EMOJI + "Come back and play again to see if you can find the treasure!");
                    break;
                }
                setWinOrLose(true);
                System.out.println(Constants.LEVEL_LOST_EMOJI + "YOU HAVE BEEN DEFEATED BY THE SHADOW BEAST!\n" +
                        "\t\t\tLEVEL ONE LOST\n" + Constants.LEVEL_LOST_EMOJI + "Come back and try again!");
                break;
            default:
                break;
        }
    }

    @Override
    public void getExit(Player player, Room currentRoom) {
        displayExits(player, currentRoom);
        String direction = scanner.nextLine().toUpperCase();

        Map<String, Integer> exits = currentRoom.getExits();
        System.out.println();

        if (direction.length() > 1) {
            String[] words = direction.split("\\W+");
            for (String word : words) {
                if (Directions.getDirections().containsKey(word)) {
                    direction = Directions.getDirections().get(word);
                    break;
                }
            }
        }

        if (exits.containsKey(direction)) {
            roomIndex = exits.get(direction);
            setCurrentRoom();
        } else {
            System.out.println(Constants.ANSI_YELLOW + "Invalid direction entered." + Constants.ANSI_RESET);
        }
    }
}