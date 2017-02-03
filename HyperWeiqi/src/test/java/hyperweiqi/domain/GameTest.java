package hyperweiqi.domain;

import hyperweiqi.ai.AiPlayer;
import hyperweiqi.logic.HumanPlayer;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GameTest {

    public GameTest() {
    }

    @Test
    public void testGame() {
        int boardSize = 3;

        Player player1 = new AiPlayer("AI player");
        Player player2 = new HumanPlayer("Human player", null);

        Game game = new Game(boardSize, player1, player2);
        assertEquals(game.getBoardSize(), boardSize);
        assertEquals(game.getBoard().getSize(), boardSize);
        assertEquals(game.getMoveIndex(), 0);
        assertEquals(game.getKo(), null);
        assertEquals(game.getPlayer1(), player1);
        assertEquals(game.getPlayer2(), player2);
    }
}
