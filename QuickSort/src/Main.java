import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);

        }

        System.out.println("Before : ");
        printArray(numbers);

        QuickSortAlgorithm.quickSort(numbers, 0, numbers.length - 1);

        System.out.println("After : ");
        printArray(numbers);
    }

    private static void printArray(int[] numberArray) {

        for (int number : numberArray) {
            System.out.print("\t" + number);
        }
    }
}