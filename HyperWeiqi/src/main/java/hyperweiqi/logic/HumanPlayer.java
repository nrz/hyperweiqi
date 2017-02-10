package hyperweiqi.logic;

import hyperweiqi.domain.Player;
import static hyperweiqi.domain.Player.Type.HUMAN;
import hyperweiqi.domain.StoneLocation;
import hyperweiqi.ui.Ui;

/**
 * HumanPlayer class provides functionality to get move input from a human,
 * using a given user interface.
 */
public class HumanPlayer extends Player {

    private final Ui ui;

    public HumanPlayer(String name, Ui ui) {
        super(name, HUMAN);
        this.ui = ui;
    }

    @Override
    public StoneLocation getMove() {
        return this.ui.getMove();
    }
}
