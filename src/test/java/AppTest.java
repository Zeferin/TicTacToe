import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testWinX()
    {
        int coords[][] = {{1,1},{1,2},{1,3},{2,1},{2,2},{2,3},{3,3}};

        TestTicTacToe gameTest = new TestTicTacToe("Test1","Test2", coords);
        GameBoard.Mark winner = gameTest.play();
        assertEquals(GameBoard.Mark.MARK_X, winner);
    }

    @Test
    public void testWin0()
    {
        int coords[][] = {{1,2},{1,3},{2,3},{2,2},{1,1},{3,1}};
        TestTicTacToe gameTest = new TestTicTacToe("Test1","Test2", coords);
        GameBoard.Mark winner = gameTest.play();
        assertEquals(GameBoard.Mark.MARK_0, winner);
    }
}
