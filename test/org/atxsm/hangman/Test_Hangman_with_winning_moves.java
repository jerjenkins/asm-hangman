package org.atxsm.hangman;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Test_Hangman_with_winning_moves {

    private Hangman hangman;

    @Before
    public void setup() {
        hangman = new Hangman("w");
        hangman.guess('w');
    }

    @Test
    public void should_not_be_dead() {
        assertFalse(hangman.isManDead());
    }

    @Test
    public void should_have_won() {
        assertTrue(hangman.hasWon());
    }
}
