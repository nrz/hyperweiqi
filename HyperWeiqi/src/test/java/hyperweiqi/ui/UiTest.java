package hyperweiqi.ui;

import hyperweiqi.domain.Player;
import hyperweiqi.domain.StoneLocation;
import hyperweiqi.logic.Logic;
import org.junit.Assert;
import org.junit.Test;

public class UiTest {

    public UiTest() {
        Logic logic = new Logic();
        Ui ui = new Ui(logic) {

            @Override
            protected void createComponents() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getBoardSize() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public StoneLocation getMove() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Player.Type getPlayer1Type() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Player.Type getPlayer2Type() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        Assert.assertEquals(ui.getLogic(), logic);
    }

    @Test
    public void testStart() {
    }

}
