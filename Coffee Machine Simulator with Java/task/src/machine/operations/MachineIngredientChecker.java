package machine.operations;

import machine.Coffee;
import machine.state.CoffeeMachineState;

public class MachineIngredientChecker implements IngredientChecker {
    private final CoffeeMachineState state;

    public MachineIngredientChecker(CoffeeMachineState state) {
        this.state = state;
    }

    @Override
    public boolean hasCleaned(Coffee coffee) {
        state.addCupsMade(coffee.getCups());
        return state.cleanedAfterCups() <= 10;
    }


    @Override
    public boolean hasEnoughIngredients(Coffee coffee) {
        return state.getWater() >= coffee.getWater() &&
                state.getMilk() >= coffee.getMilk() &&
                state.getCoffeeBeans() >= coffee.getCoffeeBeans() &&
                state.getCups() >= coffee.getCups();

    }

    @Override
    public void deductIngredients(Coffee coffee) {
        state.useWater(coffee.getWater());
        state.useMilk(coffee.getMilk());
        state.useCoffeeBeans(coffee.getCoffeeBeans());
        state.useCups(coffee.getCups());
        state.addMoney(coffee.getMoney());
    }
}
