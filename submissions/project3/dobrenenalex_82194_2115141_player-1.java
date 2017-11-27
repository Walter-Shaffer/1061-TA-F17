/* player.java 
 * Author:  Alex Dobrenen 
 * Submission Date:  November 3
 * Purpose: A brief paragraph description of the 
 * program. What does it do? Models the data and actions associated with the person playing the game. 
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
 */

import java.util.Scanner; 
public class player 
{
	//Vars
	private String name = "";
	private int fastestWin = 1000000;
	private int gamesCompleted = 0;
	private Scanner keyboard = new Scanner(System.in);
	
	//Methods
	//Read in guess
	public String askForGuess()
	{
		String guess;
		do
		{
			System.out.println("Please enter your guess(Positive Value): ");
			guess = keyboard.next();
			if(guess.charAt(0) == '-')
			{
				System.out.println("Please enter your guess(Positive Value): ");
				guess = keyboard.next();
			}
		}while(guess.charAt(0) == '-');
		
		return guess;
	}
	//Returns player name
	public String getName()
	{
		return name;
	}
	//Returns High score
	public int getFastestWin()
	{
		return fastestWin;
	}
	//Returns total games
	public int getGamesCompleted()
	{
		return gamesCompleted;
	}
	//Sets name
	public void setName(String name)
	{
		this.name = name;
	}
	//Update stats
	public void updateStats(int numMovesTakenToWin)
	{
		gamesCompleted++;
		if(numMovesTakenToWin < fastestWin)
		{
			fastestWin = numMovesTakenToWin;
		}
	}
}
