package hyperweiqi.domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class BoardTest {

    public BoardTest() {
    }

    @Test
    public void testBoardConstructor() {
        int boardSize = 3;
        Board board = new Board(boardSize);
        assertEquals(board.getSize(), boardSize);

        // Null everywhere on the board.
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                assertNull(board.at(i, j));
            }
        }
    }

    @Test
    public void testPlaceStone() {
        int boardSize = 3;
        Board board = new Board(boardSize);
        
        StoneLocation locationX0Y0 = new StoneLocation(0, 0);
        Stone blackStoneX0Y0 = new Stone(Stone.Color.BLACK, locationX0Y0);
        board.placeStone(blackStoneX0Y0, locationX0Y0);
        assertEquals(board.at(locationX0Y0.getX(), locationX0Y0.getY()), blackStoneX0Y0);

        StoneLocation locationX1Y1 = new StoneLocation(1, 1);
        Stone blackStoneX1Y1 = new Stone(Stone.Color.BLACK, locationX1Y1);
        board.placeStone(blackStoneX1Y1, locationX1Y1);
        assertEquals(board.at(locationX1Y1.getX(), locationX1Y1.getY()), blackStoneX1Y1);

        StoneLocation locationX2Y2 = new StoneLocation(2, 2);
        Stone whiteStoneX2Y2 = new Stone(Stone.Color.WHITE, locationX2Y2);
        board.placeStone(whiteStoneX2Y2, locationX2Y2);
        assertEquals(board.at(locationX2Y2.getX(), locationX2Y2.getY()), whiteStoneX2Y2);

        StoneLocation locationX2Y1 = new StoneLocation(2, 1);
        Stone whiteStoneX2Y1 = new Stone(Stone.Color.WHITE, locationX2Y1);
        board.placeStone(whiteStoneX2Y1, locationX2Y1);
        assertEquals(board.at(locationX2Y1.getX(), locationX2Y1.getY()), whiteStoneX2Y1);
    }
}