package com.moqeethcodes;

public class DiagonalStar {

    private static final String INVALID_VALUE = "Invalid Value";
    public static void printSqareStar(int number){
        if (number < 5) {
            System.out.println(INVALID_VALUE);
        }

        for(int row = 0; row < number; row++){
            for (int col = 0; col < number; col++) {
                if (row == 0 || row == number - 1 || col == 0 || col == number-1 || row == col || row + col == number -1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
