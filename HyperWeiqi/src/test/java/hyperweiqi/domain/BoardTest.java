package hyperweiqi.domain;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoardTest {

    public BoardTest() {
    }

    @Test
    public void testBoardConstructor() {
        int boardSize = 3;
        Board board = new Board(boardSize);
        assertEquals(board.getSize(), boardSize);

        // No stones anywhere on the board.
        for (int y = 0; y < boardSize; y++) {
            for (int x = 0; x < boardSize; x++) {
                assertEquals(board.at(x, y), new Stone(Stone.Color.NO_STONE, x, y));
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

        Stone whiteStoneX0Y0 = new Stone(Stone.Color.WHITE, locationX0Y0);
        board.placeStone(whiteStoneX0Y0, locationX0Y0);
        assertEquals(board.at(locationX0Y0.getX(), locationX0Y0.getY()), whiteStoneX0Y0);

        StoneLocation locationX1Y1 = new StoneLocation(1, 1);
        Stone whiteStoneX1Y1 = new Stone(Stone.Color.WHITE, locationX1Y1);
        board.placeStone(whiteStoneX1Y1, locationX1Y1);
        assertEquals(board.at(locationX1Y1.getX(), locationX1Y1.getY()), whiteStoneX1Y1);

        Stone blackStoneX1Y1 = new Stone(Stone.Color.BLACK, locationX1Y1);
        board.placeStone(blackStoneX1Y1, locationX1Y1);
        assertEquals(board.at(locationX1Y1.getX(), locationX1Y1.getY()), blackStoneX1Y1);

        StoneLocation locationX2Y2 = new StoneLocation(2, 2);
        Stone whiteStoneX2Y2 = new Stone(Stone.Color.WHITE, locationX2Y2);
        board.placeStone(whiteStoneX2Y2, locationX2Y2);
        assertEquals(board.at(locationX2Y2.getX(), locationX2Y2.getY()), whiteStoneX2Y2);

        Stone blackStoneX2Y2 = new Stone(Stone.Color.BLACK, locationX2Y2);
        board.placeStone(blackStoneX2Y2, locationX2Y2);
        assertEquals(board.at(locationX2Y2.getX(), locationX2Y2.getY()), blackStoneX2Y2);

        StoneLocation locationX2Y1 = new StoneLocation(2, 1);
        Stone whiteStoneX2Y1 = new Stone(Stone.Color.WHITE, locationX2Y1);
        board.placeStone(whiteStoneX2Y1, locationX2Y1);
        assertEquals(board.at(locationX2Y1.getX(), locationX2Y1.getY()), whiteStoneX2Y1);

        Stone blackStoneX2Y1 = new Stone(Stone.Color.BLACK, locationX2Y1);
        board.placeStone(blackStoneX2Y1, locationX2Y1);
        assertEquals(board.at(locationX2Y1.getX(), locationX2Y1.getY()), blackStoneX2Y1);
    }
}
