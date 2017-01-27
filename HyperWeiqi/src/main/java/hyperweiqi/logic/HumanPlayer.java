package hyperweiqi.logic;

import hyperweiqi.domain.Player;
import static hyperweiqi.domain.Player.Type.HUMAN;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name, HUMAN);
    }

    @Override
    public Move getMove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
