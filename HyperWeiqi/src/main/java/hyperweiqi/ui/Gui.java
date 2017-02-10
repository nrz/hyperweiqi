package hyperweiqi.ui;

import hyperweiqi.domain.Player;
import static hyperweiqi.domain.Player.Type.HUMAN;
import hyperweiqi.domain.StoneLocation;
import hyperweiqi.logic.Logic;

public class Gui extends Ui {

    public Gui(Logic logic) {
        super(logic);
    }

    @Override
    public void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public StoneLocation getMove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getBoardSize() {
        // TODO: implement this function
        return 19;
    }

    @Override
    public Player.Type getPlayer1Type() {
        // TODO: implement this function
        return HUMAN;
    }

    @Override
    public Player.Type getPlayer2Type() {
        // TODO: implement this function
        return HUMAN;
    }
}
