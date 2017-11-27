import java.util.Scanner;
/*
* Player.java
* Author: Lydia Shealy
* Submission Date: 11/2/17
*
* Purpose: Represents the player in the game and their stats for
* their game session. Holds their name and their number of games
* and records for their games. It also gets and sets those stats 
* as well as grabbing their guess. 
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
	//instance variables for Player object 
	private String name = "Player1";
	private int fastestWin = Integer.MAX_VALUE; 
	private int gamesCompleted = 0;
	private Scanner keyboard = new Scanner(System.in); 
	
	//asks for user's guess
	public String askForGuess(){
		return keyboard.nextLine(); 
	}
	
	//sets the player name
	public void setName(String name){
		this.name = name; 
	}
	
	//returns player name
	public String getName(){
		return name; 
	}
	
	//returns the fastest win a player has completed the game
	public int getFastestWin(){
		return fastestWin; 
	}
	
	//returns number of games completed
	public int getGamesCompleted(){
		return gamesCompleted; 
	}
	
	
	//updates the player stats 
	public void updateStats(int guesses){
		gamesCompleted++; 
		if (guesses < fastestWin){
			fastestWin = guesses; 
		}
	}
	
	
	/**a test method to view values
	public String testValues(){
		return "The name of the player is: " + this.name;
	}*/

}
