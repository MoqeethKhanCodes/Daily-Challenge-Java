import java.util.Scanner;

public class Array_Sort_Challenge {

    public static void main(String[] args) {
        int[] givenArray = getIntegers(7);

        int[] sortedArray = sortIntegers(givenArray);

        printArray(sortedArray);
    }

    public static int[] getIntegers(int size) {
        int[] intArray = new int[size];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < intArray.length; i++) {
            int input = scanner.nextInt();
            intArray[i] = input;
        }

        return intArray;
    }

    public static void printArray(int[] array) {
        int counter = 0;
        for (int number : array) {
            System.out.println("Element " + counter + " contents " + number);
            counter++;
        }
    }

    public static int[] sortIntegers(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] < intArray[j]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return intArray;
    }
}

