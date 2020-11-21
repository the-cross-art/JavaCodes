package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true,800,5,100);
        calculateScore(true,10000,8,200);

    }

    public static int calculateScore(boolean gameOver, int score , int levelComplete, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            finalScore +=1000;
            System.out.println("Your first score was " + finalScore);
        }
        return -1;

    }
}
