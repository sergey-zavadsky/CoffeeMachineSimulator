package machine.actions;

import machine.operations.CleanOperation;
import machine.ui.UserInterface;

public class CleanAction implements Action {
    private final UserInterface userInterface;
    private final CleanOperation cleanOperation;


    public CleanAction(UserInterface userInterface, CleanOperation cleanOperation) {
        this.cleanOperation = cleanOperation;
        this.userInterface = userInterface;
    }

    @Override
    public void execute() {
        cleanOperation.cleanMachine();
        userInterface.showMessage("I have been cleaned!");
    }
}
