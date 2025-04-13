public class VarArgs {

    /**Variable Arguments : Can be used to supplement any number of arguments
     * Syntax:
     * methodDeclaration(dataType... varName)
     * Two Rules:
     * 1) Only one varargs parameter is allowed per method.
     * 2) It must be the last parameter in the method signature.
     * */
    public static void main(String... args) {
        System.out.println("Hello World again");

        // Case 0: Passing an array to a varargs method
        // Varargs can accept an array of any datatype
        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);

        // Case 1: Passing a single argument to the varargs method.
        System.out.println("_".repeat(20));
        printText("Hello");

        // Case 2: Passing multiple arguments to the varargs method
        System.out.println("_".repeat(20));
        printText("Hello","World", "again");

        // Case 3: Passing no arguments to the varargs method
        System.out.println("_".repeat(20));
        printText();

        // Example of working with an array (not related to varargs directly)
        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));

    }

    private static void printText(String... textArray){

        for (String text : textArray) {
            System.out.println(text);
        }
    }

    private static void printText1(int... integerArray){

        for (int number : integerArray) {
            System.out.println(number);
        }
    }

    public static void printAny(Object... elements) {
        System.out.println("Number of arguments: " + elements.length);
        for (Object obj : elements) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
