import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();
        String line = scanner.nextLine();
        String[] stringArray = line.split(" ");
        int[] arrayOfIntFromString = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            arrayOfIntFromString[i] = Integer.parseInt((stringArray[i]));
        }

        boolean compare = true;
        for (int i = 0; i < length - 1; i++) {
            if (arrayOfIntFromString[i] > arrayOfIntFromString[i + 1]) {
                compare = false;
                break;
            }
        }

        System.out.print(compare);
    }
}