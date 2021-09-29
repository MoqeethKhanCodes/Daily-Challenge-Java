package com.udemylearning;

public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }else{
            return -1;
        }
    }


}
//version: 1
    /*public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore();

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("--------------------------------------------------------------------------------");

        if (gameOver) {           //gameOver == true
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


    }
    public static void calculateScore() {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score + (levelCompleted * bonus);
        finalScore += 1000;
        System.out.println("Your final score was " + finalScore);
    }*/


//version: 2
/*    public static void main(String[] args) {



        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted,
                                      int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }
    }*/


//version: 3
    /*public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }
    }*/