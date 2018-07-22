public class GameBoard {

    public enum Mark{
        MARK_X {
            @Override
            public String toString()
            {
                return "X";
            }
        },
        MARK_0{
            @Override
            public String toString()
            {
                return "0";
            }
        },
        MARK_FREE{
            @Override
            public String toString()
            {
                return "_";
            }
        }
    };

    private Mark board[][];
    private byte emptySpaces;
    private Mark winner;

    public GameBoard()
    {
        board = new Mark[3][3];
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Mark.MARK_FREE;
            }
        }
        emptySpaces = 9;
        winner = Mark.MARK_FREE;
    }

    public boolean isGameOver()
    {
        if(winner != Mark.MARK_FREE)
        {
            return true;
        }
        else if(emptySpaces == 0)
        {
            return true;
        }
        return false;
    }

    private void setWinner(int row, int column)
    {
        if(board[row][0].equals(board[row][1]) &&
                board[row][1].equals(board[row][2]))
        {
            winner = board[row][0];
        }
        else if(board[0][column].equals(board[1][column]) &&
                board[1][column].equals(board[2][column]))
        {
            winner = board[0][column];
        }
        else if(board[0][0].equals(board[1][1]) &&
                board[1][1].equals(board[2][2]))
        {
            winner = board[0][0];
        }
        else if(board[0][2].equals(board[1][1]) &&
                board[1][1].equals(board[2][0]))
        {
            winner = board[0][2];
        }
    }

    public boolean move(int[] coord, Mark type)
    {
        int row    = coord[0] - 1;
        int column = coord[1] - 1;
        if(board[row][column].equals(Mark.MARK_FREE))
        {
            board[row][column] = type;
            emptySpaces--;
            setWinner(row,column);
            return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder("");
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                result.append(board[i][j]);
            }
            result.append("\n");
        }
        return result.toString();
    }

    public boolean isWinner(Mark type)
    {
        return winner.equals(type);
    }
}
