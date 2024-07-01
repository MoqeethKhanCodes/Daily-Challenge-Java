public class Main {
    public static void main(String[] args) {
        printOddAndNumbers(5, 20);
        printOddAndNumbers(0, 100);
    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    private static void printEvenNumbers(int start, int end) {
        int counter = start;
        int evenCount = 0;
        System.out.println("Even Numbers \n");
        while (counter >= start && counter <= end) {
            if (isEvenNumber(counter)) {
                System.out.print(counter + " ");
                evenCount++;
            }
            counter++;
        }
        System.out.println("\nEven Count " + evenCount);
    }

    private static void printOddNumbers(int start, int end) {
        int counter = start;
        int oddCount = 0;
        System.out.println("Odd Numbers \n");
        while (counter >= start && counter <= end) {
            if (!isEvenNumber(counter)) {
                System.out.print(counter + " ");
                oddCount++;
            }
            counter++;
        }
        System.out.println("\nOdd Count " + oddCount);
    }

    private static void printOddAndNumbers(int start, int end) {
        printEvenNumbers(start, end);
        System.out.println("\n-------------------------------\n");
        printOddNumbers(start, end);
        System.out.println("\n-------------------------------\n");
    }

}