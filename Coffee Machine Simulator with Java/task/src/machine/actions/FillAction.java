package machine.actions;

import machine.operations.FillOperation;
import machine.ui.UserInterface;

public class FillAction implements Action {
    private final UserInterface userInterface;
    private final FillOperation fillOperation;

    public FillAction(UserInterface userInterface, FillOperation fillOperation) {
        this.userInterface = userInterface;
        this.fillOperation = fillOperation;
    }

    @Override
    public void execute() {
        userInterface.showMessage("Write how many ml of water you want to add:");
        int water = userInterface.getUserChoice();

        userInterface.showMessage("Write how many ml of milk you want to add:");
        int milk = userInterface.getUserChoice();

        userInterface.showMessage("Write how many grams of coffee beans you want to add:");
        int coffeeBeans = userInterface.getUserChoice();

        userInterface.showMessage("Write how many disposable cups you want to add:");
        int cups = userInterface.getUserChoice();

        fillOperation.addIngredients(water, milk, coffeeBeans, cups);
        userInterface.showMessage("Ingredients added successfully.");
    }
}
