import java.util.Arrays;

public class Array_ReverseArray {
    public static void main(String[] args) {
        int[] numberArray = {1,2,3,4,5};
        reverse(numberArray);
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
}
