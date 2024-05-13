public class Main {
    public static void main(String[] args) {
        int[] intArray = {0, 1, 10, 20, -10, 100, 121, 123, -121, -1}; //add cases
        for (int integer : intArray) {
            System.out.println(integer + " -> " + isPalindromeBestCase(integer));
        }
    }

    public static boolean isPalindrome(int x) {
        int temp = x;
        int reversed = 0;
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return x >= 0 && x == reversed;
    }

    public static boolean isPalindromeBestCase(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return x == reversed || x == reversed / 10;
    }
}