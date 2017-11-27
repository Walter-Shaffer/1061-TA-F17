import java.util.Scanner;

/* 
Player.java
Author: Sean Meade
Submission Date: 11/2
Purpose: Keeps track of player information necessary for the 
Bagels class to run properly. 

Statement of Academic Honesty:
The following code represents my own work. I have neither
received nor given inappropriate assistance. I have not copied
or modified code from any source other than the course webpage
or the course textbook. I recognize that any unauthorized 
assistance or plagiarism will be handled in accordance
with policies at Clemson University and the
policies of this course. I recognize that my work is based
on an assignment created by the School of Computing
at Clemson University. Any publishing or posting 
of source code for this project is strictly prohibited 
unless you have written consent from the instructor. 
*/
public class Player {

	private String name; //Declares the instance variables. 
	private int fastestWin = Integer.MAX_VALUE;
	private int gamesCompleted;
	private Scanner keyboard = new Scanner(System.in);
	
	public String askForGuess(){ //Asks the player for their guess and takes it from the keyboard. 
		System.out.print("Enter your guess: ");
		String guess = keyboard.next();
		return guess;
	}
	
	public String getName(){ //Returns the name instance variable. 
		return name;
	}
	
	public int getFastestWin(){ //Returns the fastestWin instance variable. 
		return fastestWin;
	}

	public int getGamesCompleted(){ //Returns the gamesCompleted instance variable.
		return gamesCompleted;
	}
	
	public void setName(String name){ //Sets the name instance variable to whatever input the player game to the Bagel's class. 
		this.name = name;
	}
	
	public void updateStats(int newScore){ //Increments the gamesCompleted and changes the high score as long as the player's latest score is less than the previous high score. 
		gamesCompleted++;
		if (newScore < fastestWin){
			fastestWin = newScore;
		}
	}
	
}
