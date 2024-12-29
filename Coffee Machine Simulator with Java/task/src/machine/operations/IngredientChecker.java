package machine.operations;

import machine.Coffee;

public interface IngredientChecker {
    boolean hasCleaned(Coffee coffee);

    boolean hasEnoughIngredients(Coffee coffee);

    void deductIngredients(Coffee coffee);
}
