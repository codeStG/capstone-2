package adventure;

public class Player{
    private String name;
    private String description;
    private Room room;

    public Player(String name, String description, Room room) {
        this.name = name;
        this. description = description;
        this.room = room;
    }

    public Room getRoom() {
        return this.room;
    }
}
