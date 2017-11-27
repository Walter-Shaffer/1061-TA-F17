
/*
* Player.java
* Author:  Alejandro Pardo
* Submission Date:  November 2
* Purpose: the player class gets the basic information about the user, such as name. It also asks the user for the guess.
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
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
	private int fastestWin = Integer.MAX_VALUE;
	private int gamesCompleted;
	Scanner keyboard = new Scanner(System.in);

	public String askForGuess() { // this method is called in the main method
									// for the user to enter their guess
		System.out.print("Enter your guess: ");
		return keyboard.nextLine();
	}

	public String getName() { // this returns the user's name
		return this.name;
	}

	public int getFastestWin() { // this returns what the faster win was
		return fastestWin;
	}

	public int getGamesCompleted() {// how many games have been played
		return gamesCompleted;
	}

	public void setName(String name) { // it sets the name of the user
		this.name = name;
	}

	public void updateStats(int MovesTaken) {// it updates the statistics of the
												// game.
		gamesCompleted++;
		if (fastestWin > MovesTaken) {
			fastestWin = MovesTaken;
		}

	}
}