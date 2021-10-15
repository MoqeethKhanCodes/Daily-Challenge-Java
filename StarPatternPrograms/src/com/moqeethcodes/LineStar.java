package com.moqeethcodes;

import java.util.Scanner;

public class LineStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = sc.nextInt();


        for (int i = 1 ; i <= number; i++){
            System.out.print("* ");
        }

    }
}
