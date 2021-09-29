package com.udemylearning;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am Scared of Aliens");
        }

        int topScore = 90 ;
        if(topScore < 100){
            System.out.println("You got the high score!");
        }

        //Logical AND Operators
        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)){//false
            System.out.println("Greater than second top score and less than 100  " );
        }

        //Logical OR Operators
        if((topScore > 89) ||(secondTopScore <= 89)){//true
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        /*ERRORif(newValue=50){
            System.out.println("This is not supposed to happen");
        }*/
        if(newValue==50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar = true){//valid in case of boolean type
            System.out.println("This is not supposed to happen");
        }
        if(isCar){//true
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }



    }
}
