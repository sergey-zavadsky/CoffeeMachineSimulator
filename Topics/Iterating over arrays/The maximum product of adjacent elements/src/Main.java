import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] userNextRow = scanner.nextLine().split(" ");


        int[] convertedArray = convertStringToIntArray(userNextRow);
        int[] multiplied = arrayMultipliedData(convertedArray);
        findMaxInArray(multiplied);

        scanner.close();
    }

    public static int[] convertStringToIntArray(String[] array) {
        int arrayLength = array.length;
        int[] result = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            result[i] = Integer.parseInt(array[i]);
        }
        return result;
    }

    public static int[] arrayMultipliedData(int[] array) {
        int[] result = new int[array.length];

        for (int i = 0; i < array.length - 1; i++) {
            result[i] = array[i] * array[i + 1];

        }
        return result;
    }

    public static void findMaxInArray(int[] array) {
        int findMaxInArray = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1] && array[i] > findMaxInArray) {
                findMaxInArray = array[i];
            }
        }
        System.out.println(findMaxInArray);
    }
}