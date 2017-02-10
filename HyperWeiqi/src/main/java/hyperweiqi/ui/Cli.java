package hyperweiqi.ui;

import hyperweiqi.domain.Player;
import static hyperweiqi.domain.Player.Type.HUMAN;
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

    @Override
    public StoneLocation getMove() {
        while (true) {
            System.out.println("Give your move: ");
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
        // TODO: implement this function
        return 19;
    }

    @Override
    public Player.Type getPlayerType() {

        // TODO: implement this function
        return HUMAN;
    }

    private boolean validateInput(String input) {
        // Validate the input.
        // The input format should be: `\s*[0-9]+\s*,\s*[0-9]+\s*`.
        return input.matches("\\s*[0-9]+\\s*,\\s*[0-9]+\\s*");
    }
}
