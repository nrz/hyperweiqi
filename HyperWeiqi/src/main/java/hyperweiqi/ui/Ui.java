package hyperweiqi.ui;

import hyperweiqi.ai.AiPlayer;
import hyperweiqi.domain.Game;
import hyperweiqi.domain.Player;
import static hyperweiqi.domain.Player.Type.AI;
import static hyperweiqi.domain.Player.Type.HUMAN;
import hyperweiqi.domain.StoneLocation;
import hyperweiqi.logic.HumanPlayer;
import hyperweiqi.logic.Logic;

/**
 * Abstract class Ui functions as a common interface for command-line interface
 * & graphical user interface. Both Cli and Gui extend Ui class.
 */
public abstract class Ui {

    private final Logic logic;

    public enum Type {

        CLI, GUI
    }

    public Ui(Logic logic) {
        this.logic = logic;
    }

    public void start() {
        int boardSize = this.getBoardSize();
        Player.Type player1Type = this.getPlayerType();
        Player.Type player2Type = this.getPlayerType();

        Player player1;
        Player player2;

        if (player1Type == HUMAN) {
            player1 = new HumanPlayer("human player #1", this);
        } else if (player1Type == AI) {
            player1 = new AiPlayer("AI player #1");
        } else {
            player1 = new HumanPlayer("human player #1", this);
        }

        if (player2Type == HUMAN) {
            player2 = new HumanPlayer("human player #2", this);
        } else if (player2Type == AI) {
            player2 = new AiPlayer("AI player #2");
        } else {
            player2 = new HumanPlayer("human player #2", this);
        }

        Game game = new Game(boardSize, player1, player2, this);

        game.start();
    }

    public Logic getLogic() {
        return this.logic;
    }

    abstract public int getBoardSize();

    abstract public Player.Type getPlayerType();

    abstract public StoneLocation getMove();
}
