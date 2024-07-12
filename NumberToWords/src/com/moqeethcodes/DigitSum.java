package com.moqeethcodes;

public class DigitSum {

    private static final int INVALID_NUMBER = -1;

    public static void main(String[] args) {
        System.out.println(sumDigits(123));
        System.out.println("--------");
        System.out.println(sumDigits(1000));
        System.out.println("--------");
        System.out.println(sumDigits(2));
    }

    private static int sumDigits (int number) {
        int sum = 0;
        if(number < 0){
            return INVALID_NUMBER;
        }
        while (number > 0) {
            int lastDigit = number % 10;
            sum = sum + lastDigit;
            number = number / 10;
        }

        return sum;
    }
}
