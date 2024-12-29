package machine.actions;

import machine.operations.TakeOperation;
import machine.ui.UserInterface;

public class TakeAction implements Action {
    private final UserInterface userInterface;
    private final TakeOperation takeOperation;

    public TakeAction(UserInterface userInterface, TakeOperation takeOperation) {
        this.userInterface = userInterface;
        this.takeOperation = takeOperation;
    }

    @Override
    public void execute() {
        int money = takeOperation.takeMoney();
        userInterface.showMessage("I gave you $" + money);
    }
}
