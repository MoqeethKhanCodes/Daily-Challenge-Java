package com.udemylearning;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Float Minimum Value: " + myMinFloatValue);
        System.out.println("Float Maximum Value: " + myMaxFloatValue);
        System.out.println("Double Minimum Value: " + myMinDoubleValue);
        System.out.println("Double Maximum Value: " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = (float) 5.25;//usage of flaat is discouraged these days
        double myDoubleValue = 5.25;
        System.out.println("Int: " + myIntValue);
        System.out.println("Float: " + myFloatValue);
        System.out.println("Double: " + myDoubleValue);

        int myIntValue1 = 5 / 3;
        float myFloatValue1 = 5f / 3f;
        double myDoubleValue1 = 5.00 / 3.00;
        System.out.println("Integer Precision: " + myIntValue1);
        System.out.println("Float Precision: " + myFloatValue1);
        System.out.println("Double Precision: " + myDoubleValue1);

        //Pounds to Kilogram Challenge
        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilograms: " + convertedKilograms);
        
        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
