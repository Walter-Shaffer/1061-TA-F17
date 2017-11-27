/*
* Player.java
* Author: Harrison Hall
* Submission Date: November 1, 2017
*
* Purpose: this class has methods and variables related to the player
* of the bagel game. 
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
	private String name;
	private int fastestWin;
	private int gamesCompleted = 0;
	
	
	
	public String askForGuess(){ //This method asks for a guess and returns the guess as a string
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your guess: ");
		keyboard = new Scanner(System.in);
		return keyboard.nextLine();
	}
	
	public String getName(){ //method returns private string variable name
		return this.name;
	}
	
	public int getFastestWin(){ //method returns private integer variable fastestWin
		return this.fastestWin;
	}
	
	public int getGamesCompleted(){ //method returns private integer variable of the games completed
		return this.gamesCompleted;
	}
	
	
	
	
	public void setName(String userName){ //Sets the object's name as the userName input into the method
		this.name = userName;
	}
	
	public void updateStats(int numberOfMovesTakenToWin){ //This will update stats based on simple comparisons
		this.gamesCompleted++;
		if (numberOfMovesTakenToWin < fastestWin){
			this.fastestWin = numberOfMovesTakenToWin;
		} else if (this.gamesCompleted == 1){
			this.fastestWin = numberOfMovesTakenToWin;
		}
		if (numberOfMovesTakenToWin == 1000000){ //this is the reset/restart case value, NOBODY should take a million moves to win. If (true){ GO SEE A DOCTOR! }
			this.fastestWin = 0;
			this.gamesCompleted = 0;
		}
	}
	
}
