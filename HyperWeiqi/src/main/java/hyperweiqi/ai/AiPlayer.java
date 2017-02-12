package hyperweiqi.ai;

import hyperweiqi.domain.Player;
import static hyperweiqi.domain.Player.Type.AI;
import hyperweiqi.domain.StoneLocation;

/**
 * AiPlayer class provides AI functionality.
 */
public class AiPlayer extends Player {

    public AiPlayer(String name) {
        super(name, AI);
    }

    @Override
    public StoneLocation getMove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
