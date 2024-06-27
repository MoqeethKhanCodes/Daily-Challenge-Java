import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while(true) {
            System.out.println("Enter the number : " );
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Process Terminated");
                break;
            }
            if (isEven(number)) {
                System.out.println(number + " -> Even");
            }else {
                System.out.println(number + " -> Odd");
            }
        }

    }

    public static boolean isEven (int n) {
        return n % 2 == 0;
    }

    // Time Complexity : O(1) || Space Complexity : O(1)
    public static boolean isEven1(int n)
    {

        // Return true if
        // n/2 does not result
        // in a float value.
        return ((n / 2) * 2 == n);
    }

    // Time Complexity : O(n) || Space Complexity : O(1)
    public static boolean isEven2(int n)
    {
        boolean isEven = true;

        for (int i = 1; i <= n; i++)
            isEven = !isEven;

        return isEven;
    }

    // Time Complexity : O(1) || Space Complexity : O(1) || returns 0 for even || Bitwise Operation
    public static int isEven3(int n)
    {

        // n&1 is 1, then
        // odd, else even
        return (n & 1);
    }
}