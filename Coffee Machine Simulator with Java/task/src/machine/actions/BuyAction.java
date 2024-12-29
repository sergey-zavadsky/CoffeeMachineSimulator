package machine.actions;

import machine.operations.BuyOperation;
import machine.Coffee;
import machine.ui.UserInterface;

public class BuyAction implements Action {
    private final BuyOperation buyOperation;
    private final UserInterface userInterface;

    public BuyAction(BuyOperation buyOperation, UserInterface userInterface) {
        this.buyOperation = buyOperation;
        this.userInterface = userInterface;
    }

    @Override
    public void execute() {
        userInterface.ShowBuyMenu();
        int choice = userInterface.getUserChoice();
        Coffee coffee;
        switch (choice) {
            case 1 -> coffee = Coffee.espresso();
            case 2 -> coffee = Coffee.latte();
            case 3 -> coffee = Coffee.cappuccino();
            default -> {
                userInterface.showMessage("Invalid choice.");
                return;
            }
        }
        buyOperation.buyCoffee(coffee);
    }
}
