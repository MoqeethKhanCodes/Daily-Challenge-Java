package com.moqeethcodes;

import java.util.Scanner;

public class RightDecreasingTriangleStar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size = sc.nextInt();

        for (int row = 1; row <= size; row++) {
            for (int column = row; column <= size; column++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
