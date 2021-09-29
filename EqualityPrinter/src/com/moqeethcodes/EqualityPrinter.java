package com.moqeethcodes;

public class EqualityPrinter {

    private static final String INVALID_VALUES = "Invalid Value";

    public static void printEqual(int firstNumber,int secondNumber,int thirdNumber){
        if(firstNumber < 0 || secondNumber < 0 || thirdNumber < 0){
            System.out.println(INVALID_VALUES);
        }else if(firstNumber == secondNumber && secondNumber == thirdNumber){
            System.out.println("All numbers are equal");
        }else if(firstNumber != secondNumber && secondNumber!= thirdNumber && firstNumber!= thirdNumber){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }
}
