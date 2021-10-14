package com.moqeethcodes;

public class LargestPrime {

    private static final int INVALID_VALUE = -1;
    public static int getLargestPrime(int number) {

        if (number < 2) {
            return INVALID_VALUE;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }

        }
        return number;
    }
}
