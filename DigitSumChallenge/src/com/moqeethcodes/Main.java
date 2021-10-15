package com.moqeethcodes;

import java.util.Scanner;

public class Main {

    private static final int INVALID_NUMBER = -1;

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter a Number = ");
        int number = sc.nextInt();

        System.out.println("Sum Of Digits is " + sumDigits(number));


    }
    public static int sumDigits(int number){
        int sum = 0;
        if(number < 10){
            return INVALID_NUMBER;
        }else {
            while(number > 0){

                //extract least-significant digit
                int digit = number % 10;
                sum += digit;

                //drop the least-significant digit
                number /= 10; //same as number = number/10

            }
            return sum;

        }
    }
}
