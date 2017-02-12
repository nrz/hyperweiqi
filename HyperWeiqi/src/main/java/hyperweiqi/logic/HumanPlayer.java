package hyperweiqi.logic;

import hyperweiqi.domain.Player;
import static hyperweiqi.domain.Player.Type.HUMAN;
import hyperweiqi.domain.StoneLocation;

/**
 * HumanPlayer class provides functionality to get move input from a human,
 * using a given user interface.
 */
public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name, HUMAN);
    }

    @Override
    public StoneLocation getMove() {
        // TODO: implement this function!
        return null;
    }
}
