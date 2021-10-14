package com.moqeethcodes;

public class EvenDigitSum {

    private static final int INVALID_VALUE = -1;
    public static int getEvenDigitSum(int number){
        int digit = 0;
        int sum = 0;
        if(number < 0){
            return INVALID_VALUE;
        }

        while (number > 0){
            digit = number % 10;
            number /= 10;

            if(digit % 2 == 0){
                sum += digit;
            }
        }
        return sum;
    }
}
