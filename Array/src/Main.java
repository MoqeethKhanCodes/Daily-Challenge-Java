import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numberArray = {1,2,3,4,5};

        //int[] numberArray = new int[]{1,2,3,4,5}; //valid

        /* Invalid Instantiation
        * int[] numberArray = new int[];
        * numberArray = {1,2,3,4,5};
        * */

        System.out.println("-------------------------");

        //Length
        int arrayLength = numberArray.length;
        System.out.println("Length of Array = " + arrayLength);
        System.out.println("Last = " + numberArray[arrayLength - 1]);

        System.out.println("-------------------------");
        System.out.println("--Print Array Elements ");

        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i] + " ");
        }

        System.out.println("-------------------------");
        System.out.println("--Print Array Elements with Enhanced For Loop/ For-Each Loop ");

        for (int number : numberArray) {
            System.out.println(number + " ");
        }

        System.out.println("-------------------------");
        System.out.println("--Other way to instantiate an array ");
        int[] numberArray1;
        numberArray1 = new int[]{5,4,3,2,1};

        int arrayLength1 = numberArray1.length;
        for (int i = 0; i < arrayLength1; i++) {
            System.out.print( " " + numberArray1[i]);
        }

        System.out.println("\n-------------------------");
        System.out.println("--Other way to instantiate and print elements of an array ");

        int[] numberArray2;
        numberArray2 = new int[5]; // Empty Array of size 5

        int arrayLength2 = numberArray1.length;
        for (int i = 0; i < arrayLength2; i++) {
            System.out.print( " " + numberArray1[i]); // Prints [0,0,0,0,0]
        }

        for (int i = 0; i < arrayLength2; i++) {
            numberArray2[i] = arrayLength2 - i; //used to insert {5,4,3,2,1}
        }

        System.out.println("\nPrint Array Object ");
        System.out.println(numberArray2); // Wrong way to print the Array Object / Prints I@214c265e -- 'I' means Integer and @ with Hexadecimal Value
        System.out.println(numberArray2.toString()); // Wrong way to print the Array Object

        System.out.println(Arrays.toString(numberArray2));

        System.out.println("-------------------------");
        Object objectVariable = numberArray2;
        if (objectVariable instanceof int[]) {
            System.out.println("objectVariable is really an int array");
        }

        System.out.println("-------------------------");
        System.out.println("Object Class ");
        Object[] objectArray = new Object[4];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = 2.2;
        objectArray[3] = numberArray2;

        System.out.println(Arrays.toString(objectArray));

    }
}