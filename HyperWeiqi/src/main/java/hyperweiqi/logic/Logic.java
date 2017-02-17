package hyperweiqi.logic;

import hyperweiqi.ai.AiPlayer;
import hyperweiqi.domain.Game;
import hyperweiqi.domain.Player;
import static hyperweiqi.domain.Player.Type.AI;
import static hyperweiqi.domain.Player.Type.HUMAN;

/**
 * Logic is a top-level logic class.
 */
public class Logic {

    private final static int DEFAULT_BOARD_SIZE = 19;
    private final static Player.Type DEFAULT_PLAYER1_TYPE = HUMAN;
    private final static Player.Type DEFAULT_PLAYER2_TYPE = HUMAN;
    private final static int DEFAULT_HANDICAP = 0;

    private Game game;

    public Logic() {
        int boardSize = Logic.DEFAULT_BOARD_SIZE;

        Player.Type player1Type = Logic.DEFAULT_PLAYER1_TYPE;

        Player player1;

        if (player1Type == HUMAN) {
            player1 = new HumanPlayer("human player #1");
        } else if (player1Type == AI) {
            player1 = new AiPlayer("AI player #1");
        } else {
            player1 = new HumanPlayer("human player #1");
        }

        Player.Type player2Type = Logic.DEFAULT_PLAYER2_TYPE;

        Player player2;

        if (player2Type == HUMAN) {
            player2 = new HumanPlayer("human player #2");
        } else if (player1Type == AI) {
            player2 = new AiPlayer("AI player #2");
        } else {
            player2 = new HumanPlayer("human player #2");
        }

        int handicap = Logic.DEFAULT_HANDICAP;

        this.game = new Game(boardSize, player1, player2, handicap);
    }

    public int getHandicap() {
        return this.game.getHandicap();
    }

    public Game getGame() {
        return this.game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void start() {
        System.out.println("Running...");
        while (true) {
        }
    }
}
