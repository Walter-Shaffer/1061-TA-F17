import java.util.Scanner;
/*
* Player.java
* Author: Heather Wright
* Submission Date: November 3, 2017
*
* Purpose: This class contains all the data on the player.
* It has methods to return the name, fastestWin, and 
* gamesCompleted. It also sets the name and updates the stats
* which sets the fastestWin and gamesCompleted. The guess method
* is invoked when the system asks the user for a guess. It returns
* the users guess as a string.
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
public class Player {
	private String name;
	private int fastestWin;
	private int gamesCompleted;
	Scanner keyboard = new Scanner(System.in);
	
	public String askForGuess(){ //prompts the user to enter a guess and returns that string
		System.out.print("Enter your guess: ");
		String guess = keyboard.nextLine();
		return guess;
	}
	public String getName(){ //returns the name of the variable
		return name;
	}
	public int getFastestWin(){ //returns the fastest win
		return fastestWin;
	}
	public int getGamesCompleted(){ //returns the number of games completed
		return gamesCompleted;
	}
	public void setName(String name){ //changes the name to the inputed name
		this.name = name;
	}
	public void updateStats(int gamesCompleted, int fastestWin){ //updates the stats
		this.gamesCompleted = gamesCompleted; //games completed always increments by 1 unless it is reset
		if(this.fastestWin == 0) { //if the fatestWin = 0 the game just started and the inputed fastest win will be the fastest win
			this.fastestWin = fastestWin;
		}
		if(fastestWin < this.fastestWin) { //if the inputed fastest win is less than this.fastest win it will set fastest win to the new value
			this.fastestWin = fastestWin;
		}
	}
}
