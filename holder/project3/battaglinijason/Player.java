/*
* [Player].java
* Author: [Jason Battaglini]
* Submission Date: [11/03/17]
*
* Purpose: Provides necessaary objects and methods for the bagels class to run.
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
	private int gamesCompleted;
	private Scanner keyboard= new Scanner(System.in);
	//returns the guess inputed by the user
	public String askForGuess(){
		String guess=keyboard.nextLine();
		return guess;
		
	}
	//returns the name of the user
	public String getName(){
		return name;
	}
	//returns the fastest win the user obtains
	public int getFastestWin(){
		return fastestWin;
	}
	//returns how many games the user completed
	public int getGamesCompleted(){
		return gamesCompleted;
	}
	//sets the name of the user
	public void setName(String name){
		this.name=name;
		//updates the statistics of the game
	}
	public void updateStats(int numberOfMovesTakenToWin){
		numberOfMovesTakenToWin=1;
		numberOfMovesTakenToWin++;
		
		//gamesCompleted++;
		//gamesCompleted++
		
		
		
	}
	 

}
