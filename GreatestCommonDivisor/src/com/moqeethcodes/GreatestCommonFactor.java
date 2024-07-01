package com.moqeethcodes;

public class GreatestCommonFactor {

    private static final int INVALID_VALUE = -1;

    public static int getGreatestCommonDivisor12(int first, int second) {
        int gcd = 0;
        if (first < 10 || second < 10) {
            return INVALID_VALUE;
        }

        for (int i = 1; i <= first / 2 || i <= second / 2; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int getGreatestCommonDivisor1(int numberOne, int numberTwo) {
        if (numberOne < 10 || numberTwo < 10) {
            return INVALID_VALUE;
        }

        while (numberOne != numberTwo) {
            if (numberOne > numberTwo) {
                numberOne = numberOne - numberTwo;

            } else {
                numberTwo = numberTwo - numberOne;
            }
        }
        return numberOne;
    }

    //Optimized Code using Euclidean Algorithm
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }
        return first;
    }


}
