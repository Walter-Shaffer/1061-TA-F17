import java.util.Scanner;
/*
* Player.java
* Author: Joshua Williams
* Submission Date: 11/2/17
*
* Purpose: 
* 	This controls the player in the game Pico, Fermi, Bagel.
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
	private int fastestWin, gamesCompleted;
	private Scanner keyboard = new Scanner(System.in);
	public String askForGuess() {
		//This method asks for a guess and returns userinput
		System.out.print("Enter your guess: ");
		return keyboard.next();
	}

	public String getName() {
		//This method returns the variable name
		return name;
	}

	public int getFastestWin() {
		//This method returns the variable fastestWin
		return fastestWin;
	}

	public int getGamesCompleted() {
		//This method returns the variable gamesCompleted
		return gamesCompleted;
	}

	public void setName(String name) {
		//This number assigns name to the parameter name
		this.name = name;
	}

	public void updateStats(int numberOfMovesTakenToWin) {
		//This method updates the gamesCompleted and the fastestWin variables
		gamesCompleted += 1;
		if (fastestWin == 0 || fastestWin > numberOfMovesTakenToWin) {
			fastestWin = numberOfMovesTakenToWin;
		}
	}
}
