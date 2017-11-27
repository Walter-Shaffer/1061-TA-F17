
/*
* Bagels.java
* Author: Jack Maggard
* Submission Date: 10/31/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* This program is a game that randomly generates an integer and
* the user has to guess what the integer is. If they get one number right they are 
* told. Then they guess again until they get the whole number right. 
* 
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
	private int fastestWin = Integer.MAX_VALUE;
	private int gamesCompleted;
	private Scanner keyboard = new Scanner(System.in);

	// ask user for their guess
	public String askForGuess() {
		System.out.print("Enter your guess: ");
		String guess = keyboard.next();
		return guess;
	}

	// returns the objects name
	public String getName() {
		return name;
	}

	// returns the players fastest win
	public int getFastestWin() {
		return fastestWin;

	}

	// returns the players number of completed games
	public int getGamesCompleted() {
		return gamesCompleted;
	}

	// sets the players name
	public void setName(String name) {
		this.name = name;

	}

	// updates the stats so the games completed is increased and the fastest win
	// is changed if this fastest win is faster.
	public void updateStats(int moves) {
		gamesCompleted = gamesCompleted + 1;
		if (moves < fastestWin) {
			fastestWin = moves;
		}
	}

}
