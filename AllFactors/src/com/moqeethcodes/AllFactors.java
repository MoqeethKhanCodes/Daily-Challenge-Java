package com.moqeethcodes;

public class AllFactors {

    private static final String INVALID_VALUE = "Invalid Value";

    public static void printFactors(int numbers) {

        if (numbers < 1) {
            System.out.println(INVALID_VALUE);
        }
        int factor = 1;
        while (factor <= numbers) {
            if (numbers % factor == 0) {
                System.out.print(factor + " ");
            }
            factor++;
        }

    }
}
