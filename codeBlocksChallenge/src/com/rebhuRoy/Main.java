package com.rebhuRoy;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        if (gameOver == true) {
            int finalScore = score + (levelCompleted + bonus);
            System.out.println(" your final score was " + finalScore);
        }
    /*    //score = finalScore;
dss
        sfhs;
        l;score
                */

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int secondScore = score + (levelCompleted * bonus);
            System.out.printf("second score was" +

            " my new score ");
        }

    }
}
