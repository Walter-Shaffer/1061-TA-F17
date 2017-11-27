
import java.util.Scanner;
import java.util.Random;

public class Bagels {
    Scanner keyboard = new Scanner(System.in);
    int     secretNumber = 0, 
            secretNumDigit1 = 0, 
            secretNumDigit2 = 0, 
            secretNumDigit3 = 0,
            guess = 0,
            guessDigit1 = 0,
            guessDigit2 = 0,
            guessDigit3 = 0;
    String stringGuess;

    public void playGame(){
        generateSecretNumber();
        secretNumberSplit(secretNumber);
        System.out.println("A random three-digit number between 100 and 999 has "
                + "been generated.\nPlease enter your guess:");
        do {
            guess = keyboard.nextInt();
            if ((guess < 100) || (guess > 999)) {
                System.out.println("Please enter a value between 100 and 999");
            }
            else {
                stringGuess = Integer.toString(guess);
                isGuessCorrect(stringGuess);
                printHint(stringGuess);
            }
        } while (isGuessCorrect(stringGuess) == false);
        System.out.println("Winner! The number was [" + secretNumber + "].");        
    }

    private void generateSecretNumber(){
        secretNumber = new Random().nextInt(899) + 100;
    }

    private boolean isGuessCorrect(String guess) {
        if (guess.equals(Integer.toString(secretNumber))) {
            return true;
        }
        else {
            return false;
        }
    }

    private void printHint(String guess){
        int guessInt = Integer.parseInt(guess);
        guessSplit(guessInt);
        if ((guessDigit1 != secretNumDigit1) || (guessDigit2 != secretNumDigit2)
                || (guessDigit3 != secretNumDigit3)) {
            if (guessDigit1 == secretNumDigit1) {
                System.out.print("Fermi ");
            }
            if (guessDigit2 == secretNumDigit2) {
                System.out.print("Fermi ");
            }
            if (guessDigit3 == secretNumDigit3) {
                System.out.print("Fermi ");
            }

            if (((guessDigit1 == secretNumDigit2) || (guessDigit1 == secretNumDigit3))
                    && (guessDigit1 != secretNumDigit1)){
                System.out.print("Pico ");
            }
            if (((guessDigit2 == secretNumDigit1) || (guessDigit2 == secretNumDigit3))
                    && (guessDigit2 != secretNumDigit2)){
                System.out.print("Pico ");
            }
            if (((guessDigit3 == secretNumDigit1) || (guessDigit3 == secretNumDigit2))
                    && (guessDigit3 != secretNumDigit3)){
                System.out.print("Pico ");
            }

            if        ((guessDigit1 != secretNumDigit1) 
                    && (guessDigit1 != secretNumDigit2)
                    && (guessDigit1 != secretNumDigit3)
                    && (guessDigit2 != secretNumDigit1)
                    && (guessDigit2 != secretNumDigit2)
                    && (guessDigit2 != secretNumDigit3)
                    && (guessDigit3 != secretNumDigit1)
                    && (guessDigit3 != secretNumDigit2)
                    && (guessDigit3 != secretNumDigit3)) 
            {
                System.out.print("Bagels");
            }
            System.out.println("\nThe number is not " + secretNumber);
        }
    }

//Splits secret number into separate digits, each digit is its own variable.
    public void secretNumberSplit(int secretNumber){
        secretNumDigit1 = secretNumber / 100;
        secretNumDigit2 = (secretNumber % 100) / 10;
        secretNumDigit3 = secretNumber % 10;
        //splits digits into variables
    }

//Splits guess into separate digits, each digit is its own variable.
    public void guessSplit(int guess){
        guessDigit1 = guess / 100;
        guessDigit2 = (guess % 100) / 10;
        guessDigit3 = guess % 10;
    }
}