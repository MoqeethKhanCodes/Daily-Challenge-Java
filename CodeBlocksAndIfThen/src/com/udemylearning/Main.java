package com.udemylearning;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int score1 = 4000;
        int levelCompleted = 5;
        int bonus = 100;


        if (score == 5000) {
            System.out.println("Your score was 5000");
        }

        if (score1 == 4000)
            System.out.println("Your another score was 4000");

        System.out.println("This was executed");


        if (score < 5000) {
            System.out.println("Hi");
        } else {
            System.out.println("Bye");
        }

        if (score <= 5000) {
            System.out.println("Your score was less than or equal to 5000 ");
        } else {
            System.out.println("Got here");
        }


        if (score1 < 5000 && score1 > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score1 < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        System.out.println("--------------------------------------------------------------------------------");

        if (gameOver) {           //gameOver == true
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        System.out.println("--------------------------------------------------------------------------------");

//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        if(gameOver){
//
//            int finalScore = newScore + (newLevelCompleted * newBonus);
//            System.out.println("Your Final Score for second time was " + finalScore);
//        }
        //Reassigning the same variable name with new values
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your Final Score for second time was " + finalScore);
        }
    }

}


