package com.moqeethcodes;

import java.util.Scanner;

public class LeftTriangleStar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int row = 1; row <= size;row++){
            //number of spaces
            for (int column = row; column <= size; column++){
                System.out.println(" ");
            }
            //number of stars
            for (int column = 1; column <= row; column++){
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
