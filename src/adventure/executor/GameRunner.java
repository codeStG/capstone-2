package adventure.executor;

import adventure.levels.Level;
import adventure.levels.LevelOneCave;
import adventure.players.Player;

import java.util.Scanner;


public final class GameRunner {

    public static void runGame() {
        Scanner scanner = new Scanner(System.in);
        Level levelOneCave = new LevelOneCave();

        System.out.println("Welcome Warrior! What is your name?");
        Player player = new Player(scanner.nextLine());
        System.out.println();

        while(!levelOneCave.getWinOrLose()) {
            levelOneCave.getRoomDetails(player);
            if(!levelOneCave.getWinOrLose()) {
                levelOneCave.getExit(player, levelOneCave.getCurrentRoom());
            }
        }

    }
 }
