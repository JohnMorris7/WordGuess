package com.github.zipcodewilmington;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {

    public Hangman() {}
    
    public static void main(String[] args) {
        Hangman game = new Hangman();
        game.rungame();
    }

    private void rungame() {
    }

    String[] word = {"prosper", "code", "frown", "allow", "function", "cotton", "output", "loyalty", "suburb", "tool", "string", "amuse", "woman", "circle", "poison", "worry", "set", "snack", "pest", "average"};
        Scanner scanner = new Scanner(System.in);
        Random randomWord = new Random();
        int randomWordGenerator = randomWord.nextInt(0, 20);
        int numberOfGuesses = 0;
        int maxNumberOfGuesses = randomWord.toString().length();
        char[] currentRandomWord;
        char[] currentGuessWord;
    
    private void runGame() {
        announceGame();
        initializeGameState();
        while (!isWordGuessed()) {
            printStatus();
            process(getNextGuess());
            numberOfGuesses++;
            if(numberOfGuesses == maxNumberOfGuesses) {
                System.out.println("Game Over You Lose");
            }
            
        }
        playAgainPrompt();
    }
    public void printArray(char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i] + " ");
        }
    }
    public void announceGame() {
        System.out.println("Ready to play Hangman");
    }
    
    public void gameOver() {
        System.out.println("Game over you Lose");
    }
    
    public void initializeGameState() {
        System.out.println("Guess a Letter: ");
        // need to figure out how to take into account different length words..  currentGuessWord = new char[] {'_'}; 
        currentRandomWord = word[randomWordGenerator].toCharArray();
    }
    
    public Character getNextGuess() {
        System.out.println();
        return scanner.next().charAt(0);
    }
    
    public boolean isWordGuessed() {
        if (currentRandomWord == currentGuessWord) {
            return true;
        } else {
            return false;
        }
    }
        public void printStatus() {
            this.printArray(currentGuessWord);
        }
        
        public void process(Character guess){
            for (int i = 0; i < currentRandomWord.length; i++) {
                if (currentRandomWord[i] == guess) {
                    currentGuessWord[i] = currentRandomWord[i];
                }
            }
        }
        
        public void playerLoses() {
            System.out.println("You lose you have 0 guesses left");
            playAgainPrompt();
        }
        
        public void playerWins() {
            System.out.println("You Win");
            playAgainPrompt();
        }
        
        public void playAgainPrompt() {
            System.out.println("Would you like to play again? \n 1 for yes or 2 for no");
            int playerInput = scanner.nextInt();
            if (playerInput == 1); {
                runGame();
            } 
            
    }
}


