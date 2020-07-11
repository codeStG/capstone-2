package adventure.executor;

import adventure.constants.Constants;
import adventure.levels.Level;
import adventure.levels.LevelOne;
import adventure.paths.Directions;
import adventure.players.Player;
import adventure.rooms.Room;

import java.util.Map;
import java.util.Scanner;

//I made this class final because it should not be subclassed. This class is only responsible for holding the logic
// necessary to play the game.
 public final class GameRunner {

    public static void runGame() {
        Scanner scanner = new Scanner(System.in);
        Level levelOne = new LevelOne();
        Map<Integer, Room> rooms = levelOne.getRooms();
        Map<String, String> directions = Directions.getDirections();

        int room = 1;
        System.out.println("Welcome Warrior! What is your name?");
        Player player = new Player(scanner.nextLine());


        System.out.println();
        while(true) {
            //This is so that we can shorthand rooms.get(room) since it is used to frequently.
            Room currentRoom = rooms.get(room);

            //First we display the details of the current room.
            System.out.println(currentRoom.displayDetails());

            //This switch statement performs the operations necessary on the rooms that have items that must be added
            // to the players inventory and the rooms that are winning and losing rooms.
            switch(room) {
                case 5:
                    currentRoom.displayWinMessage();
                    break;
                case 6:
                    if(player.getHasSword()) {
                        currentRoom.setWinningRoom();
                        currentRoom.displayWinMessage();
                        break;
                    }
                    currentRoom.displayLoseMessage();
                    break;
                case 7:
                    player.pickupArmor();
                    break;
                case 9:
                    player.pickupSword();
                    break;
                case 10:
                    if (player.getHasSword() && player.getHasArmor()) {
                        currentRoom.setWinningRoom();
                        currentRoom.displayWinMessage();
                        break;
                    }
                    currentRoom.displayLoseMessage();
                    break;
                default:
                    break;
            }

            //Here we create a Map of exits that relate to the exits available to the current room the player is in.
            Map<String, Integer> exits = currentRoom.getExits();
            System.out.print("The available exits are: ");
            for(String exit: exits.keySet()) {
                System.out.print("\t" + Constants.ANSI_CYAN + exit + Constants.ANSI_RESET);
            }
            System.out.println("\nWhere will you go, " + player.getName() + "?");
            System.out.println("Does the player have the sword? " + player.getHasSword());

            //The line below is to test the values of the current rooms win and lose variables.
            System.out.println(currentRoom.isWinRoom() + " " + currentRoom.isLoseRoom());

            //Here we take in the desired direction the player would like to go and then convert it to uppercase.
            // Once it has been converted to uppercase, we check if the direction is longer than 1 character; if so,
            // we split it into an array of individual words and check to see if any of the words match the
            // directions that are allowed to be entered, which are stored in the directions array which is gotten
            // from the Directions class. If so, we set the direction variable to the value associated with the key
            // (word variable). This allows us to use the words North, East, South, and West instead of only N, E, S,
            // and W.
            String direction = scanner.nextLine().toUpperCase();
            System.out.println();
            if(direction.length() > 1) {
                String[] words = direction.split("\\W+");
                for(String word: words) {
                    if(directions.containsKey(word)) {
                        direction = directions.get(word);
                        break;
                    }
                }
            }

            //Here we check to make sure the direction variable that was set above matches a key inside of the exits
            // Map. If so, we set the room equal to the room mapped to that exit direction. If not, the user gets an
            // error message stating that the direction entered in invalid.
            if(exits.containsKey(direction)) {
                room = exits.get(direction);
            } else {
                System.out.println(Constants.ANSI_YELLOW + "Invalid direction entered." + Constants.ANSI_RESET);
            }
        }
    }
}
