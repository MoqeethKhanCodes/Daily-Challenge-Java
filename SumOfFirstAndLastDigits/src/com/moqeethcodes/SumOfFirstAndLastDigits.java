package com.moqeethcodes;

public class SumOfFirstAndLastDigits {

    private static final int INVALID_VALUE = -1;

    public static int sumFirstAndLastDigit(int number){

        if(number < 0){
            return INVALID_VALUE;
        }
        int firstDigit = 0,lastDigit = 0;
        int sum;

        lastDigit = number % 10;
        while(number != 0){

            firstDigit = number % 10;

            number = number / 10;


        }

        sum = firstDigit + lastDigit;

        return sum;

    }

}
