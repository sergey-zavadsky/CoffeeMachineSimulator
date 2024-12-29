package machine.operations;

import machine.state.CoffeeMachineState;

public class FillOperation {
    private final CoffeeMachineState coffeeMachineState;

    public FillOperation(CoffeeMachineState coffeeMachineState) {
        this.coffeeMachineState = coffeeMachineState;
    }

    public void addIngredients(int water, int milk, int coffeeBeans, int cups) {
        coffeeMachineState.addWater(water);
        coffeeMachineState.addMilk(milk);
        coffeeMachineState.addCoffeeBeans(coffeeBeans);
        coffeeMachineState.addCups(cups);
    }
}
