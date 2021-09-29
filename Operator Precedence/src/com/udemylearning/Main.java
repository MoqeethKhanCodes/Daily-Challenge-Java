package com.udemylearning;

public class Main {

    public static void main(String[] args) {
	    double myFirstValue = 20.00d;
	    double mySecondValue = 80.00d;

	    //double myValuesTotal = myFirstValue + mySecondValue * 100.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;

        System.out.println("MyValuesTotal = " + myValuesTotal);

	    double theRemainder = myValuesTotal % 40;

        System.out.println("theRemainder = " + theRemainder);

        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

	    if(!isNoRemainder){
            System.out.println("Got some remainder");

        }

	    /*boolean isCar = false;
        if(isCar) {
            System.out.println("isCar is true");
        }

        isCar = true;
	    boolean wasCar = isCar ? true : false;
	    if(wasCar){
            System.out.println("wasCar is true");
        }*/


	    


    }
}
