package com.gmbilla.training.games;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Gian Marco Sibilla
 */
public abstract class DiceGame extends Game {

    private int[] numbers;

    @Override
    public void play() {
        numbers = rollDice();

        result = validateResult(numbers);
    }

    @Override
    public String getResult() {
        return "You tossed: " + Arrays.toString(numbers);
    }

    /**
     * Simulate the roll of some dice.
     *
     * @return the extracted numbers.
     */
    protected abstract int[] rollDice();

    protected abstract boolean validateResult(int[] results);

}
