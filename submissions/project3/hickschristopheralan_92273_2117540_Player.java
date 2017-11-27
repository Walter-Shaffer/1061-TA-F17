/*
 * Player.java
 * Author: Christopher Hicks
 * Submission Date 10/31/2017
 * 
 * Purpose: To create multiple classes within one java project to practice
 * good java programing.
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
import java.util.Scanner;		//Import Scanner

public class Player {			//Player Class Starts
	private String name;		//Name of player
	private int fastestWin;		//Fastest win by any player
	private int gamesCompleted;	//Number of games compleated
	private Scanner keyboard;	//Scanner to be used by askForGuess
	// This is to retrieve the user's guess
	
	public String askForGuess() {// prompts user for guess
		System.out.print("Enter your guess: \n");
		this.keyboard = new Scanner(System.in);
		return this.keyboard.nextLine();
		
	
		
	}
	public String getName(){// gets users name
		return this.name;
		
	}
	public int getFastestWin(){// gets Fastest Win
		return this.fastestWin;
	}
	public int getGamesCompleted (){// gets number of games completed
		return this.gamesCompleted;
	}
	public void setName(String name){// stores users name
		this.name = name;
	}
	public void updateStats(int numberOfMovesTakenToWin){// keeps th games completed and fastest win stats up to date
		this.gamesCompleted++;
		if(numberOfMovesTakenToWin < this.fastestWin){
			this.fastestWin= numberOfMovesTakenToWin;
		}
	}
}

