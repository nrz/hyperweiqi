package hyperweiqi.logic;

import hyperweiqi.domain.Player;
import static hyperweiqi.domain.Player.Type.HUMAN;
import hyperweiqi.domain.StoneLocation;
import hyperweiqi.ui.Ui;

/**
 *
 * @author antti
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
