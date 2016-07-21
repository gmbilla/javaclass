package com.gmbilla.training.games;

/**
 * @author Gian Marco Sibilla
 */
public class Main {

    static Game randomGame() {
        return new TwoDiceGame();
    }

    public static void main(String[] args) {
        Game g = randomGame();

        g.play();

        System.out.println("Results: " + g.getResult());

        if (g.hasWon()) {
            System.out.println("YAAAY!");
        } else {
            System.out.println("D'oh!");
        }
    }

}
