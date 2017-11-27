/* 
 * Player.java 
 * Author:  Jackie Doan  
 * Submission Date:  11/2/17 
 * 
 * Purpose:
 * This program is used in order to create the player
 * and attach the statistics of fastest win and completed wins.
 * this will also be the player itself.
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
	//Variable intialization
	private String name;
	private int fastestWin;
	private int gamesCompleted;
	private Scanner keyboard = new Scanner(System.in);
	String guess;
	//User Input of Numbers
	public int numInput(){
		int userNumInput = keyboard.nextInt();
		return userNumInput;
	}
	//User Input of String
	public String input(){
		String userInput = keyboard.next();
		return userInput;
	}
	//User Input of Guess
	public String askForGuess(){
		guess = keyboard.next();
		return guess;
	}
	//returns the name of the player
	public String getName(){
		return name;
	}
	//returns the fastest win
	public int getFastestWin(){
		return fastestWin;
	}
	//returns the amount of games completed
	public int getGamesCompleted(){
		return gamesCompleted;
	}
	//gets the name of the player
	public void setName(String name){
		this.name = name;
	}
	//updates the amount of played games
	//and the fastest wins
	public void updateStats(int numberOfMovesTakenToWin){
		if(gamesCompleted == 0){
			fastestWin = numberOfMovesTakenToWin;
		}
		if(numberOfMovesTakenToWin < fastestWin){
			fastestWin = numberOfMovesTakenToWin;
		}
		gamesCompleted++;
	}
}