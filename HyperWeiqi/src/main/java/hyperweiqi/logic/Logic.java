package hyperweiqi.logic;

import hyperweiqi.ai.AiPlayer;
import hyperweiqi.domain.Game;
import hyperweiqi.domain.Player;
import static hyperweiqi.domain.Player.Type.AI;
import static hyperweiqi.domain.Player.Type.HUMAN;
import hyperweiqi.ui.Ui;

/**
 * Logic is a top-level logic class.
 */
public class Logic {

    private Ui ui;

    public Logic() {
        this.ui = null;
    }

    public void setUi(Ui ui) {
        this.ui = ui;
    }

    public void start() {

        int boardSize = this.ui.getBoardSize();
        Player.Type player1Type = this.ui.getPlayer1Type();
        Player.Type player2Type = this.ui.getPlayer2Type();

        Player player1;
        Player player2;

        if (player1Type == HUMAN) {
            player1 = new HumanPlayer("human player #1", this.ui);
        } else if (player1Type == AI) {
            player1 = new AiPlayer("AI player #1");
        } else {
            player1 = new HumanPlayer("human player #1", this.ui);
        }

        if (player2Type == HUMAN) {
            player2 = new HumanPlayer("human player #2", this.ui);
        } else if (player2Type == AI) {
            player2 = new AiPlayer("AI player #2");
        } else {
            player2 = new HumanPlayer("human player #2", this.ui);
        }

        Game game = new Game(boardSize, player1, player2, this.ui);

        game.start();

        while (true) {
            System.out.println("Running...");
            break;
        }
    }
}
