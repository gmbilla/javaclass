package com.gmbilla.training.games;

/**
 * @author Gian Marco Sibilla
 */
public abstract class Game implements Playable {

    protected boolean result = false;

    @Override
    public boolean hasWon() {
        return result;
    }

}
