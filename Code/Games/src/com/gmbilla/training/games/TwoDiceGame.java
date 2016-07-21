package com.gmbilla.training.games;

import java.util.Random;

/**
 * @author Gian Marco Sibilla
 */
public class TwoDiceGame extends DiceGame {


    @Override
    protected int[] rollDice() {
        Random r = new Random();
        // Random number btw 1 and 6:
        int[] numbers = new int[2];
        numbers[0] = r.nextInt(6) + 1;
        numbers[1] = r.nextInt(6) + 1;

        return numbers;
    }

    @Override
    protected boolean validateResult(int[] results) {
        for (int v : results)
            if (v % 2 != 0)
                return false;

        return true;
    }
}
