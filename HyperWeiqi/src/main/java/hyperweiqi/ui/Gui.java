package hyperweiqi.ui;

import hyperweiqi.domain.Game;
import hyperweiqi.domain.Player;
import static hyperweiqi.domain.Player.Type.HUMAN;
import hyperweiqi.domain.StoneLocation;
import hyperweiqi.logic.Logic;
import javax.swing.JFrame;

/**
 * Gui class provides an implementation of a graphical user interface.
 */
public class Gui extends Ui {

    private Player.Type player1Type;
    private Player.Type player2Type;
    private int boardSize;

    public Gui(Logic logic) {
        super(logic);

        // Human players by default.
        this.player1Type = HUMAN;
        this.player2Type = HUMAN;

        // Standard-sized board by default.
        this.boardSize = 19;
    }

    public void setPlayer1Type(Player.Type player1Type) {
        this.player1Type = player1Type;
    }

    public void setPlayer2Type(Player.Type player2Type) {
        this.player2Type = player2Type;
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
        return this.boardSize;
    }

    @Override
    public Player.Type getPlayer1Type() {
        return this.player1Type;
    }

    @Override
    public Player.Type getPlayer2Type() {
        return this.player2Type;
    }
}
