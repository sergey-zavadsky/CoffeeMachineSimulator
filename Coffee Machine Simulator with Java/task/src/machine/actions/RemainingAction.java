package machine.actions;

import machine.state.CoffeeMachineState;
import machine.ui.UserInterface;

public class RemainingAction implements Action {
    private final UserInterface userInterface;
    private final CoffeeMachineState coffeeMachineState;

    public RemainingAction(UserInterface userInterface, CoffeeMachineState coffeeMachineState) {
        this.userInterface = userInterface;
        this.coffeeMachineState = coffeeMachineState;
    }

    @Override
    public void execute() {
        String state = coffeeMachineState.getMachineState();
        userInterface.showMessage(state);
    }
}
