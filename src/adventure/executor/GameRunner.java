package adventure.executor;

import adventure.levels.Level;
import adventure.levels.LevelOneCave;
import adventure.players.Player;

import java.util.Scanner;


public final class GameRunner {
    private static GameRunner instance = null;

    private GameRunner() {
        runGame();
    }

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

    public static GameRunner getInstance() {
        if(instance == null) instance = new GameRunner();

        return instance;
    }

 }
