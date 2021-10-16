package com.moqeethcodes;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            sum += sc.nextInt();
            count++;

        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double)sum / count));
        sc.close();
    }
}
