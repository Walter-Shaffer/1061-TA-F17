/*
* Player.java
* Author: Timothy Morse
* Submission Date: Oct 29, 2017
*
* Purpose: Handles player functions for Pico, Fermi, Bagel
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
*/
import java.util.Scanner;
public class Player {
 //Declarations
 String name = "";
 int fastestWin = Integer.MAX_VALUE;
 int gamesCompleted = 0;
 Scanner keyboard = new Scanner(System.in);
 
 //Asks for user inputs and returns it as a String
 public String askForGuess(){
	 System.out.println("Enter your guess: ");
	 String toReturn = keyboard.nextLine();
	 return toReturn;
 }
 
 //returns this.name
 public String getName(){
	 return this.name;
 }
 //returns this.fastestWin
 public int getFastestWin(){
	 return this.fastestWin;
 }
 //returns this.gamesCompleted
 public int getGamesCompleted(){
	 return this.gamesCompleted;
 }
 //sets this.name to the input
 public void setName(String name){
	 this.name = name;
 }
 //updates this.fastestWin and this.gamesCompleted.
 //this.fastestWin is only updated if the input is smaller than 
 //this.fastestWin
 public void updateStats(int numberOfMovesTakenToWin){
	 gamesCompleted++;
	 if(numberOfMovesTakenToWin<this.fastestWin){
		 this.fastestWin = numberOfMovesTakenToWin;
	 }else if(numberOfMovesTakenToWin == 0){
		 this.fastestWin = 0;
	 }else{
		//don't
	 }
 	}
}

