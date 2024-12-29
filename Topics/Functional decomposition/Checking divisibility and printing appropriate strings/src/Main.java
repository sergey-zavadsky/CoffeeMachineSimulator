import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        // function calls of isDivByThree, isDivByFive, isDivByThreeAndFive will be here
        boolean div35 = isDivByThreeAndFive(num);
        boolean div3 = isDivByThree(num);
        boolean div5 = isDivByFive(num);


        if (div35){
            System.out.println("FizzBuzz");
        } else if (div3){
            System.out.println("Fizz");
        } else if (div5){
            System.out.println("Buzz");
        } else {
            System.out.println("None");
        }

        scanner.close();
    }
    // function isDivByThree will be here
    public static boolean isDivByThree(int value){
        boolean result = false;
        if (value%3 == 0){
            result=true;
        }
        return result;
    }

    // function isDivByFive will be here
    public static boolean isDivByFive(int value){
        boolean result = false;
        if (value%5 == 0){
            result=true;
        }
        return result;
    }
    // function isDivByThreeAndFive will be here
    public static boolean isDivByThreeAndFive(int value){
        boolean result = false;
        if (value%5 == 0 && value%3==0){
            result=true;
        }
        return result;
    }

}