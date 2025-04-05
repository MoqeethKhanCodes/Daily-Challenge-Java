import java.util.Arrays;
import java.util.Random;

public class Array_Operations {
    public static void main(String[] args) {

        /** Sort Array : Arrays.sort();*/
        int[] firstArray = getRandomArray(10);
        System.out.println("Unsorted Array : " + Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println("Sorted Array : " + Arrays.toString(firstArray));

        /* For Each Loop can only be used for read operations.
         * Cannot be used for update or write operation.
         * */
        /*for (int element : firstArray) {
            element = random.nextInt(100);
        }*/

        /** Fill Array with same value : Arrays.fill();*/
        int[] secondArray = new int[10];
        System.out.println("Array Initialized to Default : " + Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println("Using Arrays.fill() : " + Arrays.toString(secondArray));

        /** Copy one Array into another Array : Arrays.copyOf();*/
        int[] thirdArray = getRandomArray(10);
        System.out.println("Original Array : " + Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println("Copied Array : " + Arrays.toString(fourthArray));

        // Sorting / Changing Copied Array won't affect the original array
        Arrays.sort(fourthArray);
        System.out.println("After Sorting copied Array | Original Array : " + Arrays.toString(thirdArray));
        System.out.println("After Sorting copied Array | Copied Array : " + Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println("Smaller Array : " + Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println("Larger Array : " + Arrays.toString(largerArray));
    }

    public static int[] getRandomArray(int len) {
        Random random = new Random();

        /** Array of Random Values*/
        int[] firstArray = new int[len];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt(100);
        }

        return firstArray;

    }
}
