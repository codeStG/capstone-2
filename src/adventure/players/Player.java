package adventure.players;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Player {
    private final String name;
    private boolean hasSword = false;
    private boolean hasArmor = false;

    public Player(String name) {
        String[] temp = name.split("\\W+");
        List<String> inputName = Arrays.asList(temp);
        List<String> capitalizedName =
                inputName.stream().map(n -> Character.toUpperCase(n.charAt(0)) + n.substring(1).toLowerCase()).collect(Collectors.toList());
        this.name = String.join(" ", capitalizedName);
    }

    public boolean getHasSword() {
        return hasSword;
    }

    public boolean getHasArmor() {
        return hasArmor;
    }

    public void pickupSword() {
        hasSword = true;
    }

    public void pickupArmor() {
        hasArmor = true;
    }

    public String getName() {
        return name;
    }
}
