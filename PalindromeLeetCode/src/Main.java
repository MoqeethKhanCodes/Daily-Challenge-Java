public class Main {
    public static void main(String[] args) {
        int[] intArray = {1, 100, 121, 123, -121, -1}; //add cases
        for (int integer : intArray) {
            System.out.println(integer + " -> " + isPalindrome(integer));
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

        return x > 0 && x == reversed;
    }
}