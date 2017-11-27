/*
* [player].java
* Author: [Anthony Frazier]
* Submission Date: [11/3/17]
*
* Purpose:Creates several functions that are useful for main class such as storing stats for
* the player
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagarism will be handled in accordance
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
	private int fastestWin = Integer.MAX_VALUE;
	private int gamesCompleted;
	
	//aks the player for a guess and then passes the value back
	public String askForGuess(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your guess:   ");
		String guess = keyboard.next();
		return guess;
	}
	//retrieves player's name
	public String getName(){
		return name;
	}
	//retrieves player's fastest win 
	public int getFastestWin(){
		return fastestWin;
	}
	//retrieves the number of games the player has completed
	public int gamesCompleted(){
		return gamesCompleted;
	}
	//sets the players name
	public void setName(String name){
		this.name = name;
	}
	//checks to see if the fastest moves needs to be updated, increases games played by one
	public void updateStats(int numberOfMoves){
		gamesCompleted ++;
		if(numberOfMoves < fastestWin){
			fastestWin = numberOfMoves;
		}
	}
	
}
