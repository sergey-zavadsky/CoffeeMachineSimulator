package machine.state;

public class CoffeeMachineState {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int cups;
    private int money;
    private int cupsMade;

    public CoffeeMachineState(int water, int milk, int coffeeBeans, int cups, int money, int cupsMade) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cups = cups;
        this.money = money;
        this.cupsMade = cupsMade;
    }

    // Get actions
    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getCups() {
        return cups;
    }

    public int getMoney() {
        return money;
    }

    public int cleanedAfterCups() {
        return cupsMade;
    }

    // Add actions
    public void addWater(int amount) {
        this.water += amount;
    }

    public void addMilk(int amount) {
        this.milk += amount;
    }

    public void addCoffeeBeans(int amount) {
        this.coffeeBeans += amount;
    }

    public void addCups(int amount) {
        this.cups += amount;
    }

    public void addMoney(int amount) {
        this.money += amount;
    }

    public void addCupsMade(int amount) {
        this.cupsMade += amount;
    }

    // Remove actions
    public void useWater(int amount) {
        this.water -= amount;
    }

    public void useMilk(int amount) {
        this.milk -= amount;
    }

    public void useCoffeeBeans(int amount) {
        this.coffeeBeans -= amount;
    }

    public void useCups(int amount) {
        this.cups -= amount;
    }

    public void removeMoney(int amount) {
        this.money -= amount;
    }

    public void cleanMachine() {
        this.cupsMade = 0;
    }

    public String getMachineState() {
        return "The coffee machine has:\n" +
                water + " ml of water\n" +
                milk + " ml of milk\n" +
                coffeeBeans + " g of coffee beans\n" +
                cups + " disposable cups\n" +
                "$" + money + " of money";
    }
}


