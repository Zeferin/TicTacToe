public class Player {

    private String name;
    private final GameBoard.Mark type;

    public Player(String name, GameBoard.Mark type)
    {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString()
    {
        return name;
    }
}
