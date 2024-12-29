package machine;

public class Coffee {
    private final int water;
    private final int milk;
    private final int coffeeBeans;
    private final int cups;
    private final int money;

    public Coffee(int water, int milk, int coffeeBeans, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cups = cups;
        this.money = money;
    }

    public static Coffee cappuccino() {
        return new Coffee(200, 100, 12, 1, 6);
    }

    public static Coffee latte() {
        return new Coffee(350, 75, 20, 1, 7);
    }

    public static Coffee espresso() {
        return new Coffee(250, 0, 16, 1, 4);
    }

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
}
