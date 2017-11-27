//Player.java
//Author: Benjamin VonKeller
//Submission Date: 11/3/2017
//Purpose: This class file stores the data and guesses as strings and holds the statistics of the player
//Statement of Academic Honesty:
//The following code represents my own work. I have neither
//received nor given inappropriate assistance. I have not copied
//or modified code from any source other than the course webpage
//or the course textbook. I recognize that any unauthorized
//assistance or plagiarism will be handled in accordance
//with the policies at Clemson University and the
//policies of this course. I recognize that my work is based
//on an assignment created by the School of Computing
//at Clemson University. Any publishing or posting
//of source code for this project is strictly prohibited
//unless you have written consent from the instructor.
import java.util.Scanner;
public class Player {

	private String name;
	private int fastestWin;
	private int gamesCompleted = 0;
	private Scanner keyboard = new Scanner(System.in);
	
	public String askForGuess() {
		String guess = keyboard.next();
		return guess;
	}
	
	public String getName() {
		return name;
	}
	
	public int getFastestWin() {
		return fastestWin;
	}
	
	public int getGamesCompleted() {
		return gamesCompleted;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void updateStats (int numberOfMovesTakenToWin) {
		gamesCompleted++;
		if (gamesCompleted == 1) {
			fastestWin = numberOfMovesTakenToWin;
			
		}
		else {
			if (fastestWin > numberOfMovesTakenToWin) {
				fastestWin = numberOfMovesTakenToWin;
			}
		}
	}
}
