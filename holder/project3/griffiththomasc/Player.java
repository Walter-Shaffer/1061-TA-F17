/*

* [Player].java

* Author: [Thomas Griffith]

* Submission Date: [November, 3 2017]

*

* Purpose: this class recreates the actions delivered by the

*  user during this game and stores the data of his name his 

*  best times and number of games.

*  

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

	// variables initialized

	private String name;

	private int fastestWin;

	private int gamesCompleted;

	public Scanner keyboard = new Scanner(System.in);

	// this method calls for your guess, the number you that you think the

	// computer has.

	public String askForGuess() {

		System.out.print("Enter your guess: ");

		String keyboardGuess = keyboard.nextLine();

		return keyboardGuess;

	}

	// gets your name and saves it as a variable

	public String getName() {

		return name;

	}

	// gets your fastest win

	public int getFastestWin() {

		return 1;

	}

	// gets how many games you have played in a row

	int complete = 0;

	public int getGamesCompleted() {

		complete++;

		;

		return complete;

	}

	// sets the variable name to a string entered by the user

	public void setName(String a) {

		this.name = a;

	}

	// the status of the player withthe name and all the variables associated

	// with the class player

	public void updateStatus(int num) {

		System.out.println("");

		System.out.println("Statistics for " + name + ":");

		System.out.println("Games completed: " + gamesCompleted);

		System.out.println("Number of digits: " + num);

		System.out.println("Fastest win: " + fastestWin + " guesses");

		System.out.println("p - Play again");

		System.out.println("r - Reset game");

		System.out.println("q - Quit");

	}

}