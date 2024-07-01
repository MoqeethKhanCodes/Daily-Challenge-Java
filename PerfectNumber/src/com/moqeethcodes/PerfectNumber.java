package com.moqeethcodes;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number){
        // checking input
        if(number < 1){
            return false;
        }
        // sum of factors
        int sumOfFactors = 0;
        for(int i = 1; i  < number; i++){
            if((number % i) == 0){
                sumOfFactors += i;
            }
        }
        // checking perfect number
        return sumOfFactors == number;

    }

    public static boolean isPerfectNumber1(int number) {
        // checking input
        if (number < 1) {
            return false;
        }
        // sum of factors
        int sumOfFactors = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (i != number && number % i == 0) {
                sumOfFactors += i;

            }
        }
        // checking perfect number
        return sumOfFactors == number;
    }

}
