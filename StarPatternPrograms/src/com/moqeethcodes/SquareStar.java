package com.moqeethcodes;

import java.util.Scanner;

public class SquareStar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++){ // Row
            for (int j = 1; j <= number ; j++){ // Columns
                System.out.print("* ");
            }
            System.out.println(" ");

        }

    }

}
