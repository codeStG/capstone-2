package adventure;

import java.util.Map;
import java.util.Scanner;

public class Main {
//    private static Map<Integer, Room> rooms = new HashMap<Integer, Room>();
//    public static final String ANSI_RESET = "\u001B[0m";
//    private static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Room> rooms = Rooms.getRooms();

//        rooms.put(0, new Room(0, "You have quit the game."));
//        rooms.put(1, new Room(1, "Your journey begins facing a dark cave with a daunting sign that reads, " +
//        ANSI_RED + "\"BEWARE\" " + ANSI_RESET + "written in what seems to be blood."));
//        rooms.put(2, new Room(2, "You are sitting in front of a computer learning Java"));
//        rooms.put(3, new Room(3, "You are sitting in front of a computer learning Java"));
//        rooms.put(4, new Room(4, "You are sitting in front of a computer learning Java"));
//        rooms.put(5, new Room(5, "You are sitting in front of a computer learning Java"));
//        rooms.put(6, new Room(6, "You are sitting in front of a computer learning Java"));
//        rooms.put(7, new Room(7, "You are sitting in front of a computer learning Java"));
//        rooms.put(8, new Room(8, "You are sitting in front of a computer learning Java"));
//        rooms.put(9, new Room(9, "You are sitting in front of a computer learning Java"));
//        rooms.put(10, new Room(10, "You are sitting in front of a computer learning Java"));
//        rooms.put(11, new Room(11, "You are sitting in front of a computer learning Java"));

        int room = 1;
        while(true) {
            System.out.println(rooms.get(room).getDescription());
            if(room == 0) {
                break;
            }

            room = scanner.nextInt();
            if(!rooms.containsKey(room)) {
                System.out.println("You cannot go in that direction");
            }
        }

    }
}
