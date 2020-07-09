package adventure;

public class Player implements Thing{
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
