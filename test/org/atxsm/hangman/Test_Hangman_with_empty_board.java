package org.atxsm.hangman;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Test_Hangman_with_empty_board {

    private Hangman hangman;

    @Before
    public void setup() {
        hangman = new Hangman("w");
    }

    @Test
    public void should_not_be_dead() {
        assertFalse(hangman.isManDead());
    }

    @Test
    public void should_not_have_won_yet() {
        assertFalse(hangman.hasWon());
    }
}
