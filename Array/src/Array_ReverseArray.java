import java.util.Arrays;

public class Array_ReverseArray {
    public static void main(String[] args) {
        int[] numberArray = {1,2,3,4,5};
        reverse1(numberArray);
        System.out.println(Arrays.toString(numberArray));
    }

    public static void reverse(int[] numberArray) {
        for (int i = 0; i < numberArray.length/2; i++) {
                int j = numberArray.length - 1 - i;
                numberArray[i] = numberArray[i] + numberArray[j];
                numberArray[j] = numberArray[i] - numberArray[j];
                numberArray[i] = numberArray[i] - numberArray[j];

        }
    }

    private static void reverse1(int[] numberArray) {
        System.out.println("Array = " + Arrays.toString(numberArray));

        for (int i = 0; i < numberArray.length/2; i++) {
            int reverseCounter = numberArray.length - 1 - i;

            numberArray[i] = numberArray[i] + numberArray[reverseCounter];
            numberArray[reverseCounter] = numberArray[i] - numberArray[reverseCounter];
            numberArray[i] = numberArray[i] - numberArray[reverseCounter];
        }

        System.out.println("Reversed array = " + Arrays.toString(numberArray));
    }
}
