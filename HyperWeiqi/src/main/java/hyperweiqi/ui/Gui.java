package hyperweiqi.ui;

import hyperweiqi.ai.AiPlayer;
import hyperweiqi.domain.Game;
import hyperweiqi.domain.Player;
import static hyperweiqi.domain.Player.Type.AI;
import static hyperweiqi.domain.Player.Type.HUMAN;
import hyperweiqi.domain.StoneLocation;
import hyperweiqi.logic.HumanPlayer;
import hyperweiqi.logic.Logic;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Gui class provides an implementation of a graphical user interface.
 */
public class Gui extends Ui {

    private JFrame jframe;

    public Gui(Logic logic) {
        super(logic);
    }

    @Override
    public void run() {
        // Swing stuff.
        String title = "HyperWeiqi";
        this.jframe = new JFrame(title);
        this.jframe.setPreferredSize(new Dimension(1000, 1000));
        this.jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.createComponents(this.jframe.getContentPane());
        this.jframe.pack();
        this.jframe.setVisible(true);
    }

    protected void createComponents(Container container) {

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
