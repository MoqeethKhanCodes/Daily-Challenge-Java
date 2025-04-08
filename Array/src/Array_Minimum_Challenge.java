import java.util.Arrays;
import java.util.Scanner;

public class Array_Minimum_Challenge {
    public static void main(String[] args) {
        int[] inputArray = readIntegers();
        System.out.println("Minimum : " + findMin(inputArray));

        System.out.println("_____________________\nSolution  : \n");

        int[] inputArray1 = readIntegersSolution();
        System.out.println(findMinSolution(inputArray1));
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " values to be inserted in the array : ");
        for (int i = 0; i < numbers.length; i++) {
            int numberInput = scanner.nextInt();
            numbers[i] = numberInput;
        }
        System.out.println(Arrays.toString(numbers));

        return numbers;
    }

    private static int findMin(int[] numbers) {
        int minimum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }
        return minimum;
    }

    /**
     * Solution
     */
    private static int[] readIntegersSolution() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas: "); //int[] arr = {29, 4, 6, 80, 0};
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 1; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    private static int findMinSolution(int[] numbers) {
        int minimum = Integer.MAX_VALUE;
        for (int numberElement : numbers) {
            if (numberElement < minimum) {
                minimum = numberElement;
            }
        }
        return minimum;
    }
}
