package com.gmbilla.training.games;

/**
 * @author Gian Marco Sibilla
 */
public interface Playable {

    /**
     * Play the game.
     */
    void play();

    /**
     * Whether you won the last game or not.
     *
     * @return true if you won, false otherwise.
     */
    boolean hasWon();

    /**
     * Details on last game.
     *
     * @return Results description.
     */
    String getResult();

}
