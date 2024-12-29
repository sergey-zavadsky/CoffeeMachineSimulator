package machine.operations;

import machine.state.CoffeeMachineState;

public class CleanOperation {
    private final CoffeeMachineState coffeeMachineState;

    public CleanOperation(CoffeeMachineState coffeeMachineState) {
        this.coffeeMachineState = coffeeMachineState;
    }

    public void cleanMachine() {
        coffeeMachineState.cleanMachine();
    }
}
