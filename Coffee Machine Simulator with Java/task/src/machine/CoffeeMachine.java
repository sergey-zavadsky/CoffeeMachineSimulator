package machine;

import machine.actions.*;
import machine.operations.*;
import machine.state.CoffeeMachineState;
import machine.ui.UserInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        CoffeeMachineState coffeeMachineState = new CoffeeMachineState(400, 540, 120, 9, 550, 0);
        UserInterface userInterface = new UserInterface(new Scanner(System.in));

        IngredientChecker ingredientChecker = new MachineIngredientChecker(coffeeMachineState);
        BuyOperation buyOperation = new BuyOperation(ingredientChecker);
        TakeOperation takeOperation = new TakeOperation(coffeeMachineState);
        FillOperation fillOperation = new FillOperation(coffeeMachineState);
        CleanOperation cleanOperation = new CleanOperation(coffeeMachineState);

        Map<String, Action> actions = new HashMap<>();
        actions.put("buy", new BuyAction(buyOperation, userInterface));
        actions.put("fill", new FillAction(userInterface, fillOperation));
        actions.put("take", new TakeAction(userInterface, takeOperation));
        actions.put("clean", new CleanAction(userInterface, cleanOperation));
        actions.put("remaining", new RemainingAction(userInterface, coffeeMachineState));
        actions.put("exit", () -> System.exit(0));

        CoffeeMachineController controller = new CoffeeMachineController(userInterface, actions);
        controller.run();
    }
}
