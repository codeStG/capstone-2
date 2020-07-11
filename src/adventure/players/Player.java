package adventure.players;

public class Player {
    private String name;
    private boolean hasSword;
    private boolean hasArmor;

    public Player(String name) {
        this.name = name;
        this.hasSword = false;
        this.hasArmor = false;
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
        final String initialName = this.name;
        final String firstLetter = initialName.substring(0, 1).toUpperCase();
        final String remainingName = initialName.substring(1, initialName.length()).toLowerCase();
        this.name = firstLetter + remainingName;
        return name;
    }
}
