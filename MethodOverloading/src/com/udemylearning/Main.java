package com.udemylearning;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Moqeeth", 980);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static  int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName+ " scored " + score + " points");
        return  score * 1000;
    }

    public static  int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return  score * 1000;
    }

    public static  int calculateScore() {
        System.out.println("No Player Name, No Player Score.");
        return 0;
    }
    
}
