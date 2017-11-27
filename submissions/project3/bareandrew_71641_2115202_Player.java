import java.util.Scanner;
/*
* Player.java
* Author: Andrew Bare
* Submission Date: 11/3/17
*
* Purpose: 
* This is the player class for a game called Pico Fermi Zilch
* It contains all the methods and data involved with a player in this
* game
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
public class Player {
	
	//Instance variables
	private String name = "";
	private int fastestWin = -1;
	private int gamesCompleted = 0;
	private Scanner keyboard = new Scanner(System.in);
	
	//asks the Player to make a guess
	public String askForGuess()
	{
		System.out.print("Enter your guess: ");
		return keyboard.next();
	}
	
	//returns the name from the variable
	public String getName()
	{
		return name;
	}
	
	//returns the fastest win
	public int getFastestWin()
	{
		return fastestWin;
	}
	
	//returns the # if games completed win
	public int getGamesCompleted()
	{
		return gamesCompleted;
	}
	
	//sets the name for the player
	public void setName(String s)
	{
		name = s;
	}
	
	//updates stats and checks to see if record is set
	public void updateStats (int numTurns)
	{
		//System.out.println("got here");
		gamesCompleted++;
		
		//if first game set fastest win
		if (fastestWin == -1)
		{
			fastestWin = numTurns;			
		}
		else //otherwise check if they set their record
		{
			if(numTurns < this.fastestWin)
				fastestWin = numTurns;
		}
	}

}
