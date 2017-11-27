
import java.util.Scanner;
 
/*
* Bagels.java
* Author: Matthew Held
* Submission Date: 11-2-17
*
* Purpose:
* The purpose of this class is to act as the "driver" that
* users will execute to play the game.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance
* with the policies at Clemson University and the
* policies of this course. I recognize that my work is based
* on an assignment created by the School of Computing
* at Clemson University. Any publishing or posting
* of source code for this project is strictly prohibited
* unless you have written consent from the instructor.
*
* I Agree
*
*/
 
public class Bagels {
 
       public static void main(String[] args) {
             
              //Declare Scanner & Engine Objects
              Scanner keyboard = new Scanner(System.in);
              Engine engine = new Engine();
             
              //Declare Variables
              boolean hasUserQuit = false;
              boolean hasUserRestarted = false;
              int[] currentGuess;
              int numOfGuesses;
             
              //Print Start Message To Console
              System.out.println("Welcome!");
             
              //Main Loop
              while (hasUserQuit != true) {
                   
                    //Reset Game Variables
                    hasUserRestarted = false;
                    Player player = new Player();
                   
                    //Print Message
                    System.out.print("Enter the number of digits to use: ");
                   
                    //Set Value In engine
                     engine.setNumDigits(keyboard.nextInt());
                   
                    //Print Message
                    System.out.print("Enter the player's name: ");
                   
                    //Set Value In player
                    player.setName(keyboard.next());
                   
                    //Secondary Loop
                    while (hasUserRestarted != true) {
                          
                           //Reset Game Variables
                           currentGuess = null;
                           numOfGuesses = 1;
                          
                           //Print Message To Console
                           System.out.println();
                           System.out.println("Starting game #" + (player.getGamesCompleted() + 1) + ".");
                          
                           //Make New Secret Number
                           engine.generateNewSecret();
                          
                           //Set Value Of currentGuess
                           currentGuess = engine.convertNumToDigitArray(player.askForGuess());
                          
                           //Guess Loop
                           while (Validator.validateGuess(engine.getSecretNumber(), currentGuess, engine.getNumDigits()) == false) {
                                 
                                  //Set Value Of currentGuess
                                  currentGuess = engine.convertNumToDigitArray(player.askForGuess());
                                 
                                  //Update numOfGuesses
                                  numOfGuesses++;
                                 
                           }
                          
                           //Call updateStats
                           player.updateStats(numOfGuesses);
                          
                           //Print Message To Console
                           System.out.println("Congratulations! You won in " + numOfGuesses + " moves.");
                           System.out.println();
                           System.out.println("Statistics for " + player.getName() + ":");
                           System.out.println("Games completed: " + player.getGamesCompleted());
                           System.out.println("Number of digits: " + engine.getNumDigits());
                           System.out.println("Fastest win: " + player.getFastestWin() + " guesses");
                           System.out.println("p - Play again");
                           System.out.println("r - Reset game");
                           System.out.println("q - Quit");
                           System.out.println("");
                           System.out.print("What would you like to do? ");
                          
                           //Read Input & Print A Line To Console
                           String input = keyboard.next();
                           System.out.println("");
                          
                           //Decide What To Do Based On Input
                           if (input.equals("q")) {
                                 
                                  //Print Message To Console
                                  System.out.println("Goodbye!");
                                 
                                  //Exit Program
                                  System.exit(0);
                                 
                           } else if (input.equals("r")) {
                                 
                                  //Update Value
                                  hasUserRestarted = true;
                                 
                           }
                          
                    }
                   
              }
 
       }
 
}