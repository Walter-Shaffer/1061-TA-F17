/*
		* Player.java
		* Author: Spalding Latham
		* Submission Date: [11/3/2017]
		*
		* Purpose: The Player class models the data and actions associated with the person playing the game. 
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
		*/import java.util.Scanner;
public class Player {
	
	private String name;
	private int fastestWin;
	private int gamesCompleted;
	private Scanner keyboard = new Scanner(System.in);
	
	
	//guess is read in from the keyboard
	public String askForGuess(){
		System.out.print("Enter your guess: ");
		String guess = keyboard.next();
		return guess;
	}
	
	
	//gets the player's name
	public String getName(){
		System.out.print("Enter the player's name: ");
		String name = keyboard.next();
		return name;
	}
	
	
	
	//returns the fastest win
	public int getFastestWin(){
		return fastestWin;
	}
	
	
	//returns games completed
	public int gamesCompleted(){
		return gamesCompleted;
	}
	
	
	//sets the Players name
	public void setName(String name){
		name = this.name;
	}
	
	
	//updates the stats
	public void updateStats(int numberOfMovesTakenToWin){
		gamesCompleted = gamesCompleted  + 1;
		
		fastestWin = numberOfMovesTakenToWin;
		
		if(numberOfMovesTakenToWin < fastestWin){
			numberOfMovesTakenToWin = fastestWin;
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
