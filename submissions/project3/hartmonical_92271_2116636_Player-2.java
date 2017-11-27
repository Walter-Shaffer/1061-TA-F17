import java.util.Scanner;

/* 
 * File name: Stat.java
 * Author: Monica Hart
 * Submission Date: 11/3/2017
 *
 * This program does the following:
 * This program stores player information and performs player
 * based functions to be used in the Bagels.java file
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
 *
 */

public class Player {
	
	private String name; //the first name of the player
	private int fastestWin = Integer.MAX_VALUE; //how quickly player guessed number
	private int gamesCompleted = 0; //number of games completed
	private Scanner keyboard = new Scanner(System.in);
	
	//guess read from keyboard
	public String askForGuess(){
	
		String guess = keyboard.next();
		return guess;
		
	}
	
	//return player name
	public String getName(){
		
		return name;
		
	}
	
	//return fastest win
	public int getFastestWin(){
		
		return fastestWin;
		
	}
	
	//return number of games completed
	public int getGamesCompleted(){
		
		return gamesCompleted;
		
	}
	
	//set player name
	public void setName(String name){
		
		this.name = name;
		
	}
	
	//updates gamesCompleted and possible fastestWin
	public void updateStats(int numberOfMovesTakenToWin){
		
		gamesCompleted++;
		
		if (numberOfMovesTakenToWin < fastestWin)
			fastestWin = numberOfMovesTakenToWin;
		
	}
	
}
