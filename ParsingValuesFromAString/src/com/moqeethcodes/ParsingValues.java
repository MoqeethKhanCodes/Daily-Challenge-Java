package com.moqeethcodes;

public class ParsingValues {

    public static void main(String[] args) {

        String numberAsString = "2021";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        System.out.println("------------------------------");

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        System.out.println("------------------------------");

        String numberAsString1 = "2000.5";
        double number1 = Double.parseDouble(numberAsString);
        numberAsString1 += 1;
        number1 += 1;

        System.out.println("numberAsString1 = " + numberAsString1);
        System.out.println("number1 = " + number1);

        System.out.println("---------------------------------");

        // NumberFormat Exception
        /*String numberAsString2 ="2548d";
        int number2 = Integer.parseInt(numberAsString2);

        System.out.println("Different Datatypes In A String = " + number2);
*/

    }



}
