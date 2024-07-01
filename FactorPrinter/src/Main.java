public class Main {
    public static void main(String[] args) {
        printFactors2(100);
    }

    //Time Complexity : O(n)
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
    //Time Complexity : O(n/2)
    public static void printFactors1(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number/2; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
            System.out.println(number);
        }
    }

    //Time Complexity : O(sq[n])
    public static void printFactors2(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    System.out.println(i);
                    if (i != number / i) {
                        System.out.println(number / i);
                    }
                }
            }
        }
    }
}