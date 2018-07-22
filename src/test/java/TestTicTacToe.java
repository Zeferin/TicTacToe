import org.junit.Test;

public class TestTicTacToe extends TicTacToe{

    private int[][] coords;
    private int nextMove;

    TestTicTacToe(String player1, String player2, int[][] coords)
    {
        super(player1, player2);
        this.coords = coords;
        nextMove=0;
    }

    TestTicTacToe()
    {
        super("","");
    }

    @Override
    protected int[] getCoord()
    {
        return coords[nextMove++];
    }
}
