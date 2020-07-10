package adventure;

import java.util.Map;
import java.util.Scanner;

//I made this class final because it should not be subclassed. This class is only responsible for holding the logic
// necessary to play the game.
 final class GameRunner {

    static void runGame() {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Level> rooms = LevelOne.getRooms();
        Map<String, String> directions = Directions.getDirections();
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_CYAN = "\u001B[36m";


        int room = 1;
        System.out.println("Welcome Warrior! What is your name?");
        Player player = new Player(scanner.nextLine());

        System.out.println();
        while(true) {
            System.out.println(rooms.get(room).displayDetails());
            if(room == 0) {
                break;
            }

            Map<String, Integer> exits = rooms.get(room).getExits();
            System.out.print("The available exits are: ");
            for(String exit: exits.keySet()) {
                System.out.print("\t" + ANSI_CYAN + exit + ANSI_RESET);
            }
            System.out.println("\nWhere will you go, " + player.getName() + "?");
            //The line below is to test the values of the current rooms win and lose variables.
            System.out.println(rooms.get(room).isWinRoom() + " " + rooms.get(room).isLoseRoom());

            String direction = scanner.nextLine().toUpperCase();
            if(direction.length() > 1) {
                String[] words = direction.split("\\W+");
                for(String word: words) {
                    if(directions.containsKey(word)) {
                        direction = directions.get(word);
                        System.out.println();
                        break;
                    }
                }
            }

            if(exits.containsKey(direction)) {
                room = exits.get(direction);
                System.out.println(room + " - " + direction);
                System.out.println(player.getHasSword());
                if(room == 9) {
                    player.setHasSword(true);
                } else if(room == 5) {
                    LevelOne levelOne = new LevelOne();
                    levelOne.displayWinMessage();
                }
            } else {
                System.out.println("Invalid direction.");
            }
        }
    }
}
