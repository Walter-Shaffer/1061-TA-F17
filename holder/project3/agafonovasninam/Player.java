
/*
* Player.java
* Author:  Nina Agafonovas
* Submission Date:  November 2, 2017
* Purpose: This class contains the methods that model the actions associated with the person playing the game.
* Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
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
	private int fastestWin = Integer.MAX_VALUE; //initialize to super big number to compare fastestWin to. So any game I play will be less than this
	private int gamesCompleted;
	private Scanner keyboard = new Scanner(System.in);//For reading in user input

public String askForGuess(){
	System.out.print("Enter your guess: ");
	return keyboard.next();					//guess is read in from the keyboard
}


public String getName(){					//method returns the player's name		
	return name;

}
public int getFastestWin(){					//method returns high score
	return fastestWin;			
}

public int getGamesCompleted(){				// method returns the games played
	return gamesCompleted;			
	
}

public void setName(String name){			// method sets the player's name
	this.name = name;
}

public void updateStats(int numberOfMovesTakenToWin){ //this updates the gamesCompleted field 
	gamesCompleted++;
	if(fastestWin > numberOfMovesTakenToWin){		//If the numberOfMovesTakenToWin the current game is less than the fastestWin 
		fastestWin = numberOfMovesTakenToWin;		//(which it will always be bc fastestWin is at MAX value, than the current numberOfMovesTakenToWin
	}												//becomes the new highscore. This updates every game.




}

}