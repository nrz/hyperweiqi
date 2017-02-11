package hyperweiqi.ui;

import hyperweiqi.domain.Board;
import hyperweiqi.domain.Game;
import hyperweiqi.domain.Player;
import static hyperweiqi.domain.Player.Type.AI;
import static hyperweiqi.domain.Player.Type.HUMAN;
import hyperweiqi.domain.Stone;
import static hyperweiqi.domain.Stone.Color.BLACK;
import static hyperweiqi.domain.Stone.Color.WHITE;
import hyperweiqi.domain.StoneLocation;
import hyperweiqi.logic.Logic;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Cli class provides an implementation of command-line interface.
 */
public class Cli extends Ui {

    private final Scanner scanner;

    public Cli(Logic logic) {
        super(logic);
        this.scanner = new Scanner(System.in);
    }

    /**
     * Nothing to do here, as this class does not create any components.
     */
    @Override
    protected void createComponents() {
    }

    @Override
    public void drawGameState(Game game) {
        Board board = game.getBoard();

        for (int x = 0; x < board.getSize(); x++) {
            for (int y = 0; y < board.getSize(); y++) {
                Stone stone = board.at(x, y);
                char stoneChar;
                if (stone == null) {
                    stoneChar = '.';
                } else if (stone.getColor() == BLACK) {
                    stoneChar = 'B';
                } else if (stone.getColor() == WHITE) {
                    stoneChar = 'W';
                } else {
                    stoneChar = '.';
                }
                System.out.print(stoneChar);
            }
            System.out.println();
        }
    }

    @Override
    public StoneLocation getMove() {
        while (true) {
            System.out.print("Give your move: ");
            String input = this.scanner.nextLine();

            if (!this.validateInput(input)) {
                System.out.println("Invalid input. Give input in the following format:\n"
                        + "x, y\n"
                        + "where x is the x-coordinate and\n"
                        + "y is the y-coordinate");
                continue;
            }

            Pattern pattern = Pattern.compile("\\s*([0-9]+)\\s*,\\s*([0-9]+)\\s*");
            Matcher matcher = pattern.matcher(input);
            String xCoordinate = matcher.group(1);
            String yCoordinate = matcher.group(2);
            int x = Integer.parseInt(xCoordinate);
            int y = Integer.parseInt(yCoordinate);

            return new StoneLocation(x, y);
        }
    }

    @Override
    public int getBoardSize() {
        while (true) {
            System.out.print("Board size: ");
            String boardSizeString = this.scanner.nextLine();

            try {
                int boardSize = Integer.parseInt(boardSizeString);
                if (boardSize < 1 || boardSize > 101) {
                    System.out.println("Invalid input. Board size must be an integer between 1 and 101.");
                    continue;
                }
                return boardSize;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Board size must be an integer between 1 and 101.");
            }
        }
    }

    @Override
    public Player.Type getPlayer1Type() {
        return this.getPlayerType(1);
    }

    @Override
    public Player.Type getPlayer2Type() {
        return this.getPlayerType(2);
    }

    private Player.Type getPlayerType(int playerId) {
        while (true) {
            System.out.print("Player type (human/ai) of player " + playerId + " (Enter defaults to HUMAN): ");
            String playerType = this.scanner.nextLine();
            if (playerType.trim().isEmpty()) {
                return HUMAN;
            } else if (playerType.trim().toLowerCase().matches("human")) {
                return HUMAN;
            } else if (playerType.trim().toLowerCase().matches("ai")) {
                return AI;
            }
            System.out.println("Player type must be either \"human\" or \"ai\"!");
        }
    }

    private boolean validateInput(String input) {
        // Validate the input.
        // The input format should be: `\s*[0-9]+\s*,\s*[0-9]+\s*`.
        return input.matches("\\s*[0-9]+\\s*,\\s*[0-9]+\\s*");
    }
}
