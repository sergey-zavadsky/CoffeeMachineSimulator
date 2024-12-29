import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        switch (userInput){
            case "triangle":
                int firstTrValue = scanner.nextInt();
                int secondTrValue = scanner.nextInt();
                int thirdTrValue = scanner.nextInt();
                double s = ((double) (firstTrValue + secondTrValue + thirdTrValue) /2);
                double result = Math.sqrt((s*(s-firstTrValue)*(s-secondTrValue)*(s-thirdTrValue)));
                System.out.println(result);
                break;
            case "rectangle":
                int firstRecValue = scanner.nextInt();
                int secondRecValue = scanner.nextInt();
                System.out.println((double) firstRecValue * secondRecValue);
                break;
            case "circle":
                int firstCirValue = scanner.nextInt();
                System.out.println(firstCirValue*firstCirValue*3.14);
                break;
            default:
                System.out.println("Wrong input.");
        }
    }
}