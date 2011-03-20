package org.atxsm.hangman;

/*
    TODO - Missing Features
    - Seeing current board
    - handling spaces
    - special characters
    - double guessing letters
    - guessing after win/loss
    -
 */
public class Hangman {
    private int guesses;
    private char[] board;
    private String word;

    public Hangman(String word) {
        this.word = word;
        this.board = new char[word.length()];
    }

    public void guess(Character letter) {
        if(letterIsPresent(letter)) {
            updateBoard(letter);
        } else {
            spendGuess();
        }
    }

    public boolean hasWon() {
        return word.equals(new String(board));
    }

    public boolean isManDead() {
        return guesses > 4;
    }

    private boolean letterIsPresent(char letter) {
        return word.contains(String.valueOf(letter));
    }

    private void updateBoard(char letter) {
        int index = 0;
        for (Character wordLetter : this.word.toCharArray()) {
            if(wordLetter.equals(letter)) {
                board[index] = Character.toLowerCase(letter);
                index++;
            }
        }
    }

    private void spendGuess() {
        guesses++;
    }
}
