/*
* Bagels.java
* Author: Mark Blasko
* Submission Date: 11/2/17
* Purpose: The purpose of the program is to use Engine, Player, and Validator classes to play a mastermind like game 
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance
* with the policies at Clemson University and the
* policies of this course. I recognize that my work is based
* on an assignment created by the School of Computing
* at Clemson University. Any publishing or posting
* of source code for this project is strictly prohibited
* unless you have written consent from the instructor.
*/
import java.util.Scanner;

public class Bagels {


  public static void main(String [] args) {

    Scanner keyboard = new Scanner(System.in);
    String name = "";
    String number = "";
    int i = 0;
    int x = 1;
    int fastestWin = 0;
    boolean resetGame = true;
    boolean playAgain = true;
    Player playerObject = new Player();
    Engine engineObject = new Engine();
    Validator validatorObject = new Validator();

    while (playAgain == true) {
    if (resetGame == true) {
    System.out.print("Enter the number of digits to use: ");
    int numDigits = keyboard.nextInt();
    engineObject.setNumDigits(numDigits);

    System.out.print("Enter the players name: "); //Scanner inside set method in Player class
    name = keyboard.next();
    playerObject.setName(name);
    System.out.println();

}   //if for Reset Game

    engineObject.generateNewSecret(); //keep outside of loop so new array is not generated
    engineObject.getSecretNumber();


    System.out.println("Starting game #" + x);

    do {
    number = playerObject.askForGuess(); //number equal to return value of askForGuess
    i++; //number of moves
}

    while(validatorObject.validateGuess(engineObject.getSecretNumber(), engineObject.convertNumToDigitArray(number), engineObject.getNumDigits()) == false);

    if (x == 1) {
      fastestWin = i;
    }
    if (fastestWin > i) {
      fastestWin = i;
    }

    System.out.println("Congratulations! You won in " + i + " moves.");
    System.out.println();
    playerObject.updateStats(fastestWin, x);

    System.out.println("Statistics for " + playerObject.getName() + ":");
    System.out.println("Games completed: " + playerObject.getGamesCompleted());
    System.out.println("Number of digits: " + engineObject.getNumDigits());

    System.out.println("Fastest Win: " + playerObject.getFastestWin() + " guesses");
    System.out.println("p - Play again");
    System.out.println("r - Reset game");
    System.out.println("q - Quit");
    System.out.println();
    System.out.print("What would you like to do? ");
    String choice = keyboard.next();
    System.out.println();

    if (choice.equalsIgnoreCase("r")) { //to prevent
      resetGame = true;
      playAgain = true;
      x = 1; //resets games completed
      i = 0; //resets moves
      fastestWin = 0;
    }
    if (choice.equalsIgnoreCase("p")) {
      resetGame = false;
      playAgain = true;
      x++; //number of games completed
      i = 0; //resets moves
    }
    if (choice.equalsIgnoreCase("q")) {
      System.out.println("Goodbye!");
      System.exit(0);
    }

  } //end of outer loop

  } //End of main

} //End of class
