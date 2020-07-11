package adventure.players;

public class Player {
    private String name;
    private boolean hasSword;

    public Player(String name) {
        this.name = name;
        this.hasSword = false;
    }

    public boolean getHasSword() {
        return hasSword;
    }

    public void toggleHasSword() {
        hasSword = !hasSword;
    }

    public String getName() {
        final String initialName = this.name;
        final String firstLetter = initialName.substring(0, 1).toUpperCase();
        final String remainingName = initialName.substring(1, initialName.length()).toLowerCase();
        this.name = firstLetter + remainingName;
        return name;
    }
}
