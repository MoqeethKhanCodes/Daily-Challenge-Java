import java.util.Arrays;
import java.util.Random;

public class Array_Sort {

    public static void main(String[] args) {
        int[] randomArray = getRandomArray(6, 1000);
        System.out.println("Unsorted Random Array : " + Arrays.toString(randomArray));

        int[] sortedArray = sortIntegers(randomArray);
        System.out.println("Sorted Array : " + Arrays.toString(sortedArray));
    }

    /** Array of Random Values*/
    public static int[] getRandomArray(int arrayLength, int arraySize) {

        Random random = new Random();
        int[] firstArray = new int[arrayLength];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt(arraySize);
        }
        return firstArray;
    }

    /** Sorting Array in Descending Order*/
    private static int[] sortIntegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    swap(sortedArray, i);
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    /** Swapping Array Elements*/
    private static void swap(int[] array, int i) {
        int temp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = temp;
    }

}
