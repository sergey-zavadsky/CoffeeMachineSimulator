import java.util.*;

public class Main {

    public static int[] getFirstAndLast(int[] args) {
        if (args.length > 1) {
            return new int[]{args[0], args[args.length - 1]};
        } else if (args.length == 1) {
            return new int[]{args[0], args[0]};
        } else {
            return new int[]{};
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}