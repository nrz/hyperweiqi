package hyperweiqi.ui;

import hyperweiqi.domain.Game;
import hyperweiqi.domain.Player;
import hyperweiqi.domain.StoneLocation;
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
        this.createComponents();
        this.logic.setUi(this);
        this.logic.start();
    }

    public Logic getLogic() {
        return this.logic;
    }

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

    /**
     * A method for initializing the user interface before starting the logic.
     */
    abstract protected void createComponents();
}
