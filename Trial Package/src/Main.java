import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        /*int answer = numberChallenge(0, 1000);
        System.out.println("Sum = " + answer);*/

        //System.out.println(isPrime(17));

        //countPrime(20);

        //System.out.println(isPalindrome(121));
        //System.out.println(isPalindrome(12341));

        //System.out.println(sumFirstAndLastDigit1(5));

        //System.out.println(getEvenDigitSum(123456789));

        System.out.println(hasSharedDigitOptimized(99,91));
    }

    public static int numberChallenge(int low, int high) {
        int count = 0;
        int sum = 0;
        for (int currentNumber = low; currentNumber < high; currentNumber++) {
            if (currentNumber % 5 == 0 && currentNumber % 3 == 0 && count <= 5) {
                sum += currentNumber;
                count++;
                System.out.println("Found a match = " + currentNumber);
            }
        }
        return sum;
    }

    public static void countPrime(int limit) {

        int counter = 0;
        for (int number = 2; number <= limit; number++) {
            if (isPrime(number)) {
                System.out.println(number + " is a Prime Number");
                counter++;
            }
        }
        System.out.println("Total number of Prime Numbers in the range 0 and " + limit + " is " + counter);
    }

    public static boolean isPrime(int number) {
        if(number == 17) {
            String hi = "Hello";
        }
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome (int number) {
        int reverse = 0;
        int originalNumber = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number /= 10;

        }
        if (originalNumber == reverse) {

            return true;
        }
        return false;
    }

    public static int sumFirstAndLastDigit  (int number) {

        if(number < 0) {
            return -1;
        }

        int firstDigit = 0;
        int tempNumber = number;
        int lastDigit = 0;
        while (tempNumber != 0) {
            if(lastDigit == 0) {
                lastDigit = number % 10;
            }

            firstDigit = tempNumber;
            tempNumber /= 10;
        }

        return firstDigit + lastDigit;
    }

    public static int sumFirstAndLastDigit1  (int number) {

        if(number < 0) {
            return -1;
        }

        int firstDigit = 0;
        int tempNumber = number;
        int lastDigit = number % 10;
        while (tempNumber != 0) {
            firstDigit = tempNumber;
            tempNumber /= 10;
        }

        return firstDigit + lastDigit;
    }

    public static int getEvenDigitSum (int number) {
        if(number < 0) {
            return -1;
        }

        int sumOfEvenDigits = 0;
        while (number != 0) {
            int currentDigit = number % 10;

            if (isEven(currentDigit)) {
                sumOfEvenDigits += currentDigit;
            }
            number /= 10;
        }
        return sumOfEvenDigits;

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

    // Time Complexity : O(1) || Space Complexity : O(1) || returns 0 for even
    public static int isEven3(int n)
    {

        // n&1 is 1, then
        // odd, else even
        return (n & 1);
    }

    public static boolean hasSharedDigit (int firstNumber, int secondNumber) {
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }
        HashSet<Integer> uniqueNums = new HashSet<>();

        while(firstNumber != 0) {
            int currentDigit = firstNumber % 10;
            uniqueNums.add(currentDigit);
            firstNumber /= 10;
        }
        while(secondNumber != 0) {
            if (uniqueNums.contains(secondNumber % 10)) {
                return true;
            }
            secondNumber /= 10;
        }
        return false;
    }

    public static boolean hasSharedDigitOptimized(int firstNumber, int secondNumber) {
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }
        int firstNoFirstDigit = firstNumber / 10;
        int firstNoSecondDigit = firstNumber % 10;

        int secondNoFirstDigit = secondNumber / 10;
        int secondNoSecondDigit = secondNumber % 10;

        return firstNoFirstDigit == secondNoFirstDigit || firstNoFirstDigit == secondNoSecondDigit || firstNoSecondDigit == secondNoFirstDigit || firstNoSecondDigit == secondNoSecondDigit;
    }

}