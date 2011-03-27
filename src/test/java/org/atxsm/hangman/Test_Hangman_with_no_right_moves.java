package org.atxsm.hangman;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Test_Hangman_with_no_right_moves {

    private Hangman hangman;

    @Before
    public void setup() {
        hangman = new Hangman("w");
        hangman.guess('a');
        hangman.guess('b');
        hangman.guess('c');
        hangman.guess('d');
        hangman.guess('e');
    }

    @Test
    public void should_be_dead() {
        assertTrue(hangman.isManDead());
    }

    @Test
    public void should_not_have_won() {
        assertFalse(hangman.hasWon());
    }
}
