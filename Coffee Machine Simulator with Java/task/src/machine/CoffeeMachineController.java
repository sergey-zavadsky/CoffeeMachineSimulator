package machine;

import machine.actions.Action;
import machine.ui.UserInterface;

import java.util.Map;

public class CoffeeMachineController {
    private final UserInterface userInterface;
    private final Map<String, Action> actions;

    public CoffeeMachineController(UserInterface userInterface, Map<String, Action> actions) {
        this.userInterface = userInterface;
        this.actions = actions;
    }

    public void run() {
        while (true) {
            userInterface.ShowMainMenu();
            String userInput = userInterface.getUserInput();
            Action action = actions.getOrDefault(userInput, () -> userInterface.showMessage("Invalid action!"));
            action.execute();
        }
    }
}
