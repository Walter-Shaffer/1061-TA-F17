/*
* Player.java
* Author: Julia Owens
* Submission Date: 11/3/2017
*
* Purpose: A program that will play the guessing game Pico, Fermi, Bagel.  
*
* Statement of Academic Honesty:
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
*
*/

import java.util.Scanner;
public class Player {
	private String name;
	private int fastestWin;
	private int gamesCompleted;
	private Scanner keyboard = new Scanner(System.in);
	
	public String askForGuess() {
		System.out.println("Please enter your guess: ");
		String guess = keyboard.nextLine();
		return guess;
	}
	// requests a guess from the player
	
	public String getName() {
		return this.name;
	}
	// retrieves the users name
	
	public int getFastestWin() {
		return this.fastestWin;
    }
	// retrieves the current record for fastest win

    public int getGamesCompleted() {
        return this.gamesCompleted;
    }
    // returns the number of games won

    public void setName(String name) {
        this.name = name;
    }
    // sets the player name

    public void updateStats(int numberOfMovesTakenToWin) {
        if (this.gamesCompleted == 1) {
            this.fastestWin = numberOfMovesTakenToWin;
        } 
        else {
            if (this.fastestWin > numberOfMovesTakenToWin) {
                this.fastestWin = numberOfMovesTakenToWin;
            }
        }
    // updates the fastest win if necessary and increments number of games completed
    }
}
