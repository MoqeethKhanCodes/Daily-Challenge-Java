package com.moqeethcodes;

public class GreatestCommonFactor {

    private static final int INVALID_VALUE = -1;
    public static int getGreatestCommonDivisor(int numberOne,int numberTwo) {
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
}
