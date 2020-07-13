package adventure.constants;

public class Constants {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static final String LEVEL_WON_EMOJI = ANSI_GREEN + "\u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 " +
            "\u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 \u2605" +
            "\u2605 \u2605 \u2605 \u2605\n" + ANSI_RESET;

    public static final String LEVEL_LOST_EMOJI = ANSI_RED + "\u2620 \u2620 \u2620 \u2620 \u2620 \u2620 " +
            "\u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620 \u2620\n" + ANSI_RESET;
}
