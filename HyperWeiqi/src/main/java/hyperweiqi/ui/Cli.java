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
import java.awt.Container;
import java.awt.Dimension;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Cli class provides an implementation of command-line interface.
 */
public class Cli extends Ui {

    private JFrame jframe;

    private final Scanner scanner;

    public Cli(Logic logic) {
        super(logic);
        this.scanner = new Scanner(System.in);
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
    }

    /**
     * Create the necessary components for a command-line interface.
     *
     * @param container
     */
    protected void createComponents(Container container) {

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
            System.out.print("Board size (Enter defaults to 19): ");
            String boardSizeString = this.scanner.nextLine();

            if (boardSizeString.trim().isEmpty()) {
                return 19; // standard-sized board is the default.
            }

            try {
                int boardSize = Integer.parseInt(boardSizeString.trim());
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

    @Override
    public int getHandicap() {
        while (true) {
            System.out.print("Number of handicap stones (Enter defaults to no handicap): ");
            String boardSizeString = this.scanner.nextLine();

            if (boardSizeString.trim().isEmpty()) {
                return 0; // standard-sized board is the default.
            }

            try {
                int numberOfHandicapStones = Integer.parseInt(boardSizeString.trim());
                if (numberOfHandicapStones < 0 || numberOfHandicapStones > 9) {
                    System.out.println("Invalid input. Number of handicap stones must be an integer between 0 and 9.");
                    continue;
                }
                return numberOfHandicapStones;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Number of handicap stones must be an integer between 0 and 9.");
            }
        }
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
