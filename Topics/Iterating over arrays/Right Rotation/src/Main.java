import java.sql.Array;
import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        int[] result = new int[arr.length];
        if (steps > result.length) {
            steps = (steps % arr.length);
        }
        for (int i = steps; i < result.length; i++) {
            result[i] = arr[i - steps];
        }
        for (int i = 0; i < steps; i++) {
            result[i] = arr[arr.length - steps + i];
        }
        for (int i : result) {
            System.out.print(i + " ");
        }

    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

    }
}
