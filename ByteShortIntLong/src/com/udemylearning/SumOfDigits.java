package com.udemylearning;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String args[]) {
        int rem,sum = 0;
        System.out.println("Enter the required size of the array :: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while(number != 0){
            rem = number%10;
            sum = sum + rem;
            number = number/10;

        }
        System.out.println("Sum Of Digit \n"+sum);
    }
}