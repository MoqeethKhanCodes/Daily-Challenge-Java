package com.moqeethcodes;

public class LeftDecreasingTriangleStar {
    public static void main(String[] args) {
        int n = 5;
        
        //number of spaces
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("  ");//double space
            }
            //number of stars
            for (int j = i; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
