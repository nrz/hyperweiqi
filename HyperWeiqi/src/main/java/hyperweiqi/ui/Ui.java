package hyperweiqi.ui;

import hyperweiqi.domain.Game;
import hyperweiqi.domain.Player;
import hyperweiqi.domain.StoneLocation;
import hyperweiqi.logic.Logic;

/**
 * Abstract class Ui functions as a common interface for command-line interface
 * & graphical user interface. Both Cli and Gui extend Ui class.
 */
public abstract class Ui implements Runnable {

    private final Logic logic;

    public enum Type {

        CLI, GUI
    }

    public Ui(Logic logic) {
        this.logic = logic;
    }

    public boolean isSwing() {
        // By default user is neither Swing nor anything else in particular.
        return false;
    }

    public void start() {
        this.logic.start();
    }

    public Logic getLogic() {
        return this.logic;
    }

    @Override
    abstract public void run();

    abstract public int getBoardSize();

    /**
     * A method for getting Player.Type of player 1. Command-line interfaces
     * typically implement this by asking the user upon call of this method,
     * whereas graphical user interfaces typically return the currently selected
     * value of player type.
     *
     * @return
     */
    abstract public Player.Type getPlayer1Type();

    /**
     * A method for getting Player.Type of player 2. Command-line interfaces
     * typically implement this by asking the user upon call of this method,
     * whereas graphical user interfaces typically return the currently selected
     * value of player type.
     *
     * @return
     */
    abstract public Player.Type getPlayer2Type();

    /**
     * A method for the number of handicap stones given for black. 0 means no
     * handicap stones, in which case black begins the game. 1..9 means is a
     * valid number of handicap stones, white begins the game after the handicap
     * stones given to black are set on board. Negative values should be dealt
     * as no handicap (0) and any value greater than 9 should be dealt like 9 (a
     * handicap of 9 stones).
     *
     * @return
     */
    public int getHandicap() {
        return this.logic.getGame().getHandicap();
    }

    /**
     * A method for drawing the current game state on screen.
     *
     * @param game
     */
    abstract public void drawGameState(Game game);

    /**
     * A method for getting the next move (StoneLocation). Command-line
     * interfaces typically implement this by asking the user upon call of this
     * method, whereas graphical user interfaces typically return the currently
     * selected value of player type.
     *
     * @return
     */
    abstract public StoneLocation getMove();
}
