package com.udemylearning;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Statements
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This are Statements");

        System.out.println("This is" +
                "another"+
                "still more.");

        //Same line multi statement code is valid but not recommended
        int anotherVariable = 50;myVariable--;System.out.println("This is another one");//Valid But not readable


    }
}
