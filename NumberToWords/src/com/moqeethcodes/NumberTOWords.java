package com.moqeethcodes;

public class NumberTOWords {

    private static final int INVALID_VALUE = -1;

    private static final int INVALID_INPUT = -1;

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println(INVALID_INPUT);
        }
        int lastDigit = 1, reverse = 0;
        number = reverse(number);

        while (number != 0) {

            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;

            number++;


            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
            number /= 10;
        }

    }

    public static int reverse(int number){

        int reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + (number % 10);
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){

        int count = 1;

        if(number < 0){
            return INVALID_VALUE;
        }

        while (number > 9){
            number /= 10;
            count++;

        }
        return count;

    }
}
