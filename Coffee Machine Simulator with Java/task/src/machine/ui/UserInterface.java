package machine.ui;

import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    // Outputs

    public void ShowMainMenu() {
        System.out.println("Write action (buy, fill, take, clean, remaining, exit):");
    }

    public void ShowBuyMenu() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
    }

    public void ShowCleanMessage() {
        System.out.println("I need cleaning!");
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    // Inputs

    public String getUserInput() {
        return scanner.nextLine();
    }

    public int getUserChoice() {
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
}
