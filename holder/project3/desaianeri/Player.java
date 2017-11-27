/*
 * [Players].java 
 * Author: [Aneri Desai]
 * Submission Date: [11/1/2017]
 * 
 * Purpose: In the project I learned the how to use objects plus repeat all the stuff from beggining like loops, uml diagrams and many more methods. 
 * 
 *  Statement of Academic Honesty:
 *  
 *  The following code represent my own work. I have neither received nor given inappropriate assistance. 
 *  I have not copied or modified code from any source other than the course webpage or the course textbook.
 *  I recognize that any unauthorized assistance or plagiarism will be handled in accordance with the policies
 *  at Clemson University and the policies of this course. I recognize that my work is based on an assignment 
 *  created by the School of Computing at Clemson Univeristy. Any publishing or posting of source code for this 
 *  project is strictly prohibited unless you have written consent from the instructor.  
 */	
import java.util.Scanner;

public class Player {
	
	private String name; //declare public varibales 
	private int fastestWin;
	private int gamesCompleted;
	Scanner keyboard = new Scanner(System.in);
	
	
	public String askForGuess() { //ask for guess method
		System.out.print("Enter your guess");
		String askForGuess = keyboard.next();
		return askForGuess;
	}
	
	public String getName() { //get method 
		return name;
	}
	
	public int getFastestWin() {
		return fastestWin;
	}
	
	public int getGamesCompleted() {
		return gamesCompleted;
	}
	
	public void setName(String name) { //set method 
		this.name = name;
	}
	
	public void updateStats(int numbersOfMovesTakenToWin) {//to updatestate
	}
}
