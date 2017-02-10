package hyperweiqi.domain;

import hyperweiqi.logic.Move;
import hyperweiqi.ui.Ui;
import java.util.ArrayList;
import java.util.List;

public class Game {

    private final int boardSize;
    private final Board board;
    private int moveIndex;
    private StoneLocation ko;
    private final Player player1;
    private final Player player2;
    private final List<Move> moves;
    private final Ui ui;

    public Game(int boardSize, Player player1, Player player2, Ui ui) {
        this.boardSize = boardSize;
        this.board = new Board(this.boardSize);
        this.moveIndex = 0;
        this.ko = null;
        this.player1 = player1;
        this.player2 = player2;
        this.moves = new ArrayList<>();
        this.ui = ui;
    }

    public void start() {
        // To start the game.
    }

    public int getBoardSize() {
        return this.boardSize;
    }

    public Board getBoard() {
        return this.board;
    }

    public int getMoveIndex() {
        return this.moveIndex;
    }

    public StoneLocation getKo() {
        return this.ko;
    }

    public Player getPlayer1() {
        return this.player1;
    }

    public Player getPlayer2() {
        return this.player2;
    }

    public boolean doMove() {
        // If move is legal, it is executed and true is returned.
        // Otherwise (if move is illegal) false is returned.
        // This method also updates information about moves and ko situations.

        // TODO: implement this method!
        return false;
    }

    private void setMoveIndex(int moveIndex) {
        this.moveIndex = moveIndex;
    }

    private void setKo(StoneLocation ko) {
        // This is a private method because ko situation
        // is caused by doing a move.
        this.ko = ko;
    }

    public Move getNthMove(int moveIndex) {
        return this.moves.get(moveIndex);
    }
}
