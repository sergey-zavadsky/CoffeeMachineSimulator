package machine.operations;

import machine.Coffee;
import machine.ui.UserInterface;

public class BuyOperation {
    private final IngredientChecker ingredientChecker;

    public BuyOperation(IngredientChecker ingredientChecker) {
        this.ingredientChecker = ingredientChecker;
    }

    public void buyCoffee(Coffee coffee) {
        if (!ingredientChecker.hasCleaned(coffee)) {
            System.out.println("I need cleaning!");
        } else if (ingredientChecker.hasEnoughIngredients(coffee)) {
            System.out.println("Yes, I can make that amount of coffee");
            ingredientChecker.deductIngredients(coffee);
        } else {
            System.out.println("No, I can't make a coffee");
        }
    }
}
