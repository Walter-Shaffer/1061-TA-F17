import java.util.*;


public class Player {
	
	/*
	* Player.java
	* Author: Taylor Hennessy
	* Submission Date: 11/3/2017
	*
	* Purpose: Player class for the Pico, Fermi, Bagel game. Allows the
	* 			user to play Pico, Fermi, Bagel with the computer.
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

	private static String name;
	private static int fastestWin = Integer.MAX_VALUE;
	private static int gamesCompleted = 0;
	//scanner object to read 
	private static Scanner keyboard= new Scanner(System.in);
	
	// get the guess from the user
	public static String askForGuess(){
		//get the guess
		String guess = keyboard.next();
		
		return guess;
	}
	
	// return the name of the user
	public static String getName(){
		
		return name;
	}
	
	// return the user's fastest win
	public static int getFastestWin(){
		
		return fastestWin;
	}
	
	// return the number of games completed
	public static int getGamesCompleted(){
		
		return gamesCompleted;
	}
	
	// set the name of the player to the passed value
	public static void setName(String s){
		name = s;
	}
	
	//if the number of guesses from the game is less than the high score, update high score
	//add one to the games completed
	public static void updateStats(int numGuess) {
		
		if (numGuess < fastestWin){
			fastestWin = numGuess;
		}
		
		gamesCompleted++;
		
	}
}
