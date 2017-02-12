package hyperweiqi.ui;

import hyperweiqi.ai.AiPlayer;
import hyperweiqi.domain.Game;
import hyperweiqi.domain.Player;
import static hyperweiqi.domain.Player.Type.AI;
import static hyperweiqi.domain.Player.Type.HUMAN;
import hyperweiqi.domain.StoneLocation;
import hyperweiqi.logic.HumanPlayer;
import hyperweiqi.logic.Logic;
import javax.swing.JFrame;

/**
 * Gui class provides an implementation of a graphical user interface.
 */
public class Gui extends Ui {

    public Gui(Logic logic) {
        super(logic);
    }

    public void setPlayer1Type(Player.Type player1Type) {
        String playerName = super.getLogic().getGame().getPlayer1().getName();

        if (player1Type == HUMAN) {
            super.getLogic().getGame().setPlayer1(new HumanPlayer(playerName));
        } else if (player1Type == AI) {
            super.getLogic().getGame().setPlayer1(new AiPlayer(playerName));
        }
    }

    public void setPlayer2Type(Player.Type player2Type) {
        String playerName = super.getLogic().getGame().getPlayer2().getName();

        if (player2Type == HUMAN) {
            super.getLogic().getGame().setPlayer2(new HumanPlayer(playerName));
        } else if (player2Type == AI) {
            super.getLogic().getGame().setPlayer2(new AiPlayer(playerName));
        }
    }

    @Override
    protected void createComponents() {
        // Swing stuff.
        String title = "HyperWeiqi";
        JFrame jframe = new JFrame(title);
    }

    @Override
    public void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void drawGameState(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public StoneLocation getMove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getBoardSize() {
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
}
