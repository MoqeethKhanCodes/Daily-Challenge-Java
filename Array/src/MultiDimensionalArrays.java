import java.util.Arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        // Creating a 2D array of size 4x4 (4 rows and 4 columns)
        int[][] nestedArray = new int[4][4];

        // Printing the top-level array reference (not deeply printed)
        System.out.println(Arrays.toString(nestedArray));
        System.out.println("NestedArray.length = " + nestedArray.length);

        // Printing each row as a reference (initial values are 0s)
        for (int[] outer : nestedArray) {
            System.out.println(Arrays.toString(outer));
        }

        // Iterating with index-based loop to print all elements row by row
        for (int i = 0; i < nestedArray.length; i++) {
            var innerArray = nestedArray[i];
            for (int j = 0; j < innerArray.length; j++) {
                System.out.print(nestedArray[i][j] + " ");
            }
            System.out.println();
        }

        // Using enhanced for-each loop to print all elements
        for (var outer : nestedArray) {
            for (var element : outer) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Printing the 2D array using deepToString to show contents of inner arrays
        System.out.println(Arrays.deepToString(nestedArray));

        // Populating the array with values: row index * 10 + column index + 1
        for (int i = 0; i < nestedArray.length; i++) {
            var innerArray = nestedArray[i];
            for (int j = 0; j < innerArray.length; j++) {
                nestedArray[i][j] = (i * 10) + (j + 1);
            }
        }
        // Printing the updated array after assigning values
        System.out.println(Arrays.deepToString(nestedArray));

        // Reassigning the second row (index 1) with a new 1D array of size 3
        nestedArray[1] = new int[]{10, 20, 30};

        //Anonymous Array Reassignment Not Allowed - Compilation Error
        //nestedArray[1] = {10,20,30}; //This is because anonymous arrays must be initialized with 'new int[]'

        // Printing the array again to see the effect of reassignment
        System.out.println(Arrays.deepToString(nestedArray));

        // Creating an Object array with 3 elements (can hold any object type)
        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));

        // First element is a 1D array of Strings
        anyArray[0] = new String[]{"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new String[][]{
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };

        // Second element is a 2D array of Strings (jagged array)
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int[2][2][2];
        // Third element is a 3D array of Strings (jagged array)
        System.out.println(Arrays.deepToString(anyArray));

        // Iterating over each element in the Object array to print the class name of the element
        for (Object element : anyArray) {

            System.out.println("Element type = " + element.getClass().getSimpleName());

            // Default toString() of the object (not useful for arrays)
            System.out.println("Element toString() = " + element);

            // Safely cast to Object[] and print using deepToString()
            // Works because all array types in Java extend Object[] (including String[] and String[][])
            System.out.println(Arrays.deepToString((Object[]) element));
        }
    }
}
