package com.rebhuRoy;

public class Main {

    public static void main(String[] args) {
        int score;

        int highScore =calculateHighScorePosintion(1500);
        displayHighScorePosition("john ",highScore);
        highScore = calculateHighScorePosintion(900);
        displayHighScorePosition("Tom ",highScore);

        highScore = calculateHighScorePosintion(400);
        displayHighScorePosition("Dick ",highScore);

        highScore = calculateHighScorePosintion(1000);
        displayHighScorePosition("Harry ",highScore);
        highScore = calculateHighScorePosintion(50);
        displayHighScorePosition("Rebhu ",highScore);
    }

    public static void displayHighScorePosition(String playernName, int highScore) {
        System.out.println(playernName + "Manage to get into position " +
                highScore + "  on the high socre table");
    }

    public static int calculateHighScorePosintion(int score) {

        if (score >= 1000) {
            return 1;
        } else if ((score >= 500 )&& (score < 1000)) {
            return 2;
        } else if ((score >= 100) && (score < 500)) {
            return 3;
        } else {
            return 4;
        }
    }
}
