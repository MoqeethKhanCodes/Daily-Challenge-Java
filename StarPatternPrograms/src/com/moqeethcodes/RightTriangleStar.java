package com.moqeethcodes;

import java.util.Scanner;

public class RightTriangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size = sc.nextInt();

        for (int row = 1; row <= size; row++){
            for (int column = 1; column <= row; column++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
