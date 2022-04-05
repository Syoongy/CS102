import java.util.Random;

public class Minesweeper {
    public char[][] board;

    public Minesweeper(int numRows, int numColumns, int numBombs) {
        this.board = new char[numRows + 2][numColumns + 2];
        for (char[] row : board) {
            for (int i = 0; i < row.length; i++) {
                row[i] = '!';
            }
        }
        this.placeBombs(numBombs);
        this.countBombs();
    }

    public void placeBombs(int numBombs) {
        Random r = new Random();
        int numPlaced = 0;

        while (numPlaced < numBombs) {
            int x = r.nextInt(board.length - 2) + 1;
            int y = r.nextInt(board[0].length - 2) + 1;

            if (board[x][y] == '!') {
                board[x][y] = 'B';
                numPlaced++;
            }
        }
    }

    public void countBombs() {
        int numRows = board.length;
        int numColumns = board[0].length;

        for (int i = 1; i < numRows - 1; i++) {
            for (int j = 1; j < numColumns - 1; j++) {

                if (board[i][j] != 'B') {
                    int numSurroundingBombs = this.countSurroundingBombs(i, j);
                    char charToPlace = '-';

                    if (numSurroundingBombs != 0) {
                        charToPlace = (char) ('0' + numSurroundingBombs);
                    }

                    board[i][j] = charToPlace;
                }

            }
        }
    }

    public int countSurroundingBombs(int x, int y) {
        int count = 0;

        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (board[i][j] == 'B') {
                    count++;
                }
            }
        }

        return count;
    }

    public String toString() {
        String output = "";
        System.out.println("hello");
        for (char[] row : board) {
            for (char cell : row) {
                if (cell != '!') {
                    output += cell + " | ";
                }
            }
            output += "\n";
        }

        return output;
    }
}
