package machine.operations;

import machine.state.CoffeeMachineState;

public class TakeOperation {
    private final CoffeeMachineState coffeeMachineState;

    public TakeOperation(CoffeeMachineState coffeeMachineState) {
        this.coffeeMachineState = coffeeMachineState;
    }

    public int takeMoney() {
        int currentMoney = coffeeMachineState.getMoney();
        coffeeMachineState.removeMoney(currentMoney);
        return currentMoney;
    }
}
