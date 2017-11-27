/* 
 * 
 * Player.java 
 * Author:  Paul Orecchia  
 * Submission Date:  10/31/17 
 * 
 * Purpose: The purpose of this program is to set and store values about the user such as
 *  their name and fastest win
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
		
	
	public String askForGuess(){ //asks for the user to input their guess
		System.out.print("Enter your guess: ");
		return keyboard.next();
	}
	public String getName(){ //returns the name of the user
		return name;
	}
	public int getFastestWin(){ //returns the fastest win
		return fastestWin;
	}
	public int getGamesCompleted(){ //returns the games completed
		return gamesCompleted;
	}
	public void setName(String name){ //prompts user to set their name. this also resets the games stats since its a new user
		this.name=name;
		fastestWin=0;
		gamesCompleted=0;		
	}
	public void updateStats(int  numberOfMovesTakenToWin){// Updates the fastest win and the games completed
		if (fastestWin==0){
			fastestWin=numberOfMovesTakenToWin;
		}else if (numberOfMovesTakenToWin<fastestWin){
			fastestWin=numberOfMovesTakenToWin;		
		}else{
		}
		gamesCompleted++;
	}
	
}
