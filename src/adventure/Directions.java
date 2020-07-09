package adventure;

import java.util.HashMap;
import java.util.Map;

public class Directions {
    private static Map<String, String> words = new HashMap<String, String>();

    static Map<String, String> getDirections() {
        words.put("QUIT", "Q");
        words.put("NORTH", "N");
        words.put("EAST", "E");
        words.put("SOUTH", "S");
        words.put("WEST", "W");
        return words;
    }
}
