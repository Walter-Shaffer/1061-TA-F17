/*
* Player.java
* Author: Elias Weglarz
* Submission Date: 11/3/17
*
* Purpose: The class that holds the guess data and the player data for the Bagels class to call upon
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
	private String name;
	private int fastestWin;
	private int gamesCompleted = 0;
	private Scanner keyboard;
	
	//method to acquire guess from user
	public String askForGuess(){
		keyboard = new Scanner(System.in);
		String guess = keyboard.nextLine();
		return guess;
	}
	
	//acquires name from user
	public String getName(){
		return name;
	}
	//returns the fastest win integer
	public int getFastestWin(){
		return fastestWin;
	}
	//returns the games completed integer
	public int getGamesCompleted(){
		return gamesCompleted;
	}
	//sets a string "name" to be the instance variable name
	public void setName(String name){
		this.name = name;
	}
	//makes integer values of games completed and fastest win to the instance variables games completed and fastest win
	public void updateStats(int numberOfMovesTakenToWin){
		gamesCompleted++;
		if (gamesCompleted == 1){
			fastestWin = numberOfMovesTakenToWin;
		}
		else {
			if (fastestWin > numberOfMovesTakenToWin){
				fastestWin = numberOfMovesTakenToWin;
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
}
