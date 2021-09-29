package com.udemylearning;

public class Main {

    public static void main(String[] args) {
        String playerName;
        int playerScore;

        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Moqeeth", 1);

        playerPosition = calculateHighScorePosition(900);
        displayHighScorePosition("Khan", playerPosition);

        playerPosition = calculateHighScorePosition(400);
        displayHighScorePosition("Ahmed", playerPosition);

        playerPosition = calculateHighScorePosition(50);
        displayHighScorePosition("Abdul", playerPosition);

        playerPosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Khan", playerPosition);

        playerPosition = calculateHighScorePosition(500);
        displayHighScorePosition("Musk", playerPosition);

        playerPosition = calculateHighScorePosition(100);
        displayHighScorePosition("Elon", playerPosition);

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4; //assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        }else if(playerScore >= 500) {
            position = 2;
        } else if(playerScore >= 100){
            position = 3;
        }

        return position;

    }
}





