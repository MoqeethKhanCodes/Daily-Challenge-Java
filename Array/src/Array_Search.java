import java.util.Arrays;

public class Array_Search {

    public static void main(String[] args) {
        String[] stringArray = {"Anne", "Zaid", "Yousuf", "Jane", "Khan"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));

        if (Arrays.binarySearch(stringArray,"Zaid") >= 0) {
            System.out.println("Found Zaid in the list");
        }

        int[] firstArray = {1,2,3,4,5};
        int[] secondArray = {1,2,3,4,5};

        checkIfArraysAreEqual(firstArray, secondArray);

        int[] thirdArray = {1,2,3,4,5};
        int[] fourthArray = {1,2,3,4,5,0};

        checkIfArraysAreEqual(thirdArray, fourthArray);

    }

    public static void checkIfArraysAreEqual(int[] first, int[] second) {
        System.out.println("Print | First Array from Comparison : " + Arrays.toString(first)
        + "\nPrint | Second Array from Comparison : " + Arrays.toString(second));

        if(Arrays.equals(first, second)) {
            System.out.println("Result | Both Arrays are equal");
        }else {
            System.out.println("Result | Both Arrays are NOT equal");
        }

        System.out.println("------------------");
    }
}
