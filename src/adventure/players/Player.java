package adventure.players;

public class Player {
    private final String name;
    private boolean hasSword = false;
    private boolean hasArmor = false;

    public Player(String name) {
        final String firstLetter = name.substring(0, 1).toUpperCase();
        final String remainingName = name.substring(1).toLowerCase();
        this.name = firstLetter + remainingName;
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
