/*
* Player.java
* Author: Andrew Padgett
* Submission Date: 
*
* Purpose: Player class returns and updates information relating to
* 		   the user of the program.
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


//import Scanner class
//
import java.util.Scanner;

public class Player {
	
	//declare private instance variables
	//
	private String name;
	private int fastestWin = 1000;
	private int gamesCompleted;
	
	//create Scanner keyboard
	//
	private Scanner keyboard = new Scanner(System.in);
		
	//returns the number entered by the user as a string
	//
	public String askForGuess() {
		System.out.print("Enter your guess: ");
		String guess = keyboard.next();
		return guess;
	}
		
	//returns name
	//
	public String getName(){
		return name;
	}
	
	//returns fastestWin
	//
	public int getFastestWin(){
		return fastestWin;
	}
	
	//returns gamesCompleted
	//
	public int getGamesCompleted(){
		return gamesCompleted;
	}
	
	//sets name equal to string newName
	public void setName(String newName){
		name = newName;
	}
	
	//increments gamesCompleted by 1 when called.
	//if statement updates fastestWin by setting fastestWin equals to
	//numberOfMovesTaken when numberOfMovesTaken is larger
	//
	public void updateStats(int numberOfMovesTakenToWin){
		gamesCompleted++;
		if (numberOfMovesTakenToWin < fastestWin)
			fastestWin = numberOfMovesTakenToWin;
		else;
	}
	

}
