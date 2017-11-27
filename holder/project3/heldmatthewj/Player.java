
import java.util.Scanner;
 
/*
* Player.java
* Author: Matthew Held
* Submission Date: 11-2-17
*
* Purpose:
* The purpose of this class is to model the data and actions
* associated with the person playing the game.
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
 
public class Player {
      
       //Declare Variables
       private String name = "NONE";
       private int fastestWin = Integer.MAX_VALUE;
       private int gamesCompleted = 0;
       private Scanner keyboard = new Scanner(System.in);
      
       /*
       * Using the keyboard field, the guess is read in from the keyboard.
       */
       public String askForGuess() {
             
              //Print Message To Console
              System.out.print("Enter your guess: ");
             
              //Read Input
              return keyboard.next();
             
       }
      
       /*
       * Returns the player's name.
       */
       public String getName() {
             
              //Return Value
              return name;
             
       }
      
       /*
       * Returns the fastest win.
       */
       public int getFastestWin() {
             
              //Return Value
              return fastestWin;
             
       }
      
       /*
       * Returns the number of games completed.
       */
       public int getGamesCompleted() {
             
              //Return Value
              return gamesCompleted;
             
       }
      
       /*
       * Sets the player's name.
       */
       public void setName(String newName) {
             
              //Set Value
              name = newName;
             
       }
      
       /*
       * Should be called once after finishing each game. Updates the
        * gamesCompleted field and possibly the fastestWin field.
       */
       public void updateStats(int guesses) {
             
              //Increment gamesCompleted By 1
              gamesCompleted++;
             
              //If guesses Is Less Then The fastestWin Then Change fastestWin To guesses
              if (guesses < fastestWin) {
                   
                    fastestWin = guesses;
                   
              }
             
       }
      
}