package com.udemylearning;

public class Main {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(1, 0);
        calcFeetAndInchesToCentimeters(6, 0);
        double centimeters = calcFeetAndInchesToCentimeters(10, 13);

        if(centimeters < 0.0 ){
            System.out.println("Invalid Parameters");
        }

        calcFeetAndInchesToCentimeters(100);
    }



    //Method Overloading: two parameters
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;

        }
        double centimeters = (feet * 12) * 2.54;   //  feet->inches->centimeters
        centimeters += inches * 2.54;       //  previous calculation + inches -> centimeters
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");


        return centimeters;
    }
    //Method Overloading: one parameter
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }
}
