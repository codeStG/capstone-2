package adventure;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Room> rooms = Rooms.getRooms();
        Map<String, String> directions = Directions.getDirections();


        int room = 1;
        while(true) {
            System.out.println(rooms.get(room).getDescription());
            if(room == 0) {
                break;
            }

            Map<String, Integer> exits = rooms.get(room).getExits();
            System.out.print("The available exits are: ");
            for(String exit: exits.keySet()) {
                System.out.print("\t" + exit);
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if(direction.length() > 1) {
                String[] words = direction.split("\\W+");
                for(String word: words) {
                    if(directions.containsKey(word)) {
                        direction = directions.get(word);
                        break;
                    }
                }
            }

            if(exits.containsKey(direction)) {
                room = exits.get(direction);
            } else {
                System.out.println("Invalid direction.");
            }
        }
    }
}
