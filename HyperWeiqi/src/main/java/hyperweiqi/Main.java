package hyperweiqi;

import hyperweiqi.logic.Logic;
import hyperweiqi.ui.Cli;
import hyperweiqi.ui.Gui;
import hyperweiqi.ui.Ui;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author antti
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to HyperWeiqi!");
        Logic logic = new Logic();

        Ui.Type uiType = Ui.Type.CLI;

        List<String> argsList = Arrays.asList(args);

        if (argsList.contains("--gui") && !argsList.contains("--cli")) {
            uiType = Ui.Type.GUI;
        }

        Ui ui;

        if (uiType == Ui.Type.GUI) {
            ui = new Gui(logic);
        } else {
            ui = new Cli(logic);
        }

        ui.start();
    }
}
