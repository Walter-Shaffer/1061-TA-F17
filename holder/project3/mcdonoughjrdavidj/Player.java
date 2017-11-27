/*
*Player.java
* Author:  David McDonough
* Submission Date:  November 3rd, 2017
* Purpose: Player class takes the guess from the user and updates stats such as fastest win and games completed
* Statement of Academic Honesty:
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
	private int fastestWin;
	private int gamesCompleted;
	private int[] guess;
	private String guess1;
	
	private Scanner keyboard= new Scanner(System.in);
	
	//takes the guess from the user 
	public String askForGuess(){
		System.out.print("Enter guess: ");
		guess1= keyboard.nextLine();
		
		return guess1;
		
	}
	
	public int[] getGuess(){
		
		int[]guess= new int[guess1.length()];
		String temp;
		for(int i=0;i<guess1.length();i++){
			temp = guess1.charAt(i)+"";
			int temps = Integer.parseInt(temp);

			guess[i]=temps;
		}
		return guess;
	}
	
	//Returns the name
	public String getName(){
		String name2= name;
		return name2;
	}
	
	//get method that gets the fastest win
	public int getFastestWin(){
		int attempt=0;
		
		if(fastestWin>attempt){
			fastestWin=attempt;
		}
		else{
			attempt = attempt;
		}
		
		return fastestWin;
	}
	
	//get method that returns the amount of games completed
	public int getGamesCompleted(){
		
		return gamesCompleted;
	}
	
	//sets a name for the user - user inputed using scanner
	public void setName(String nametemp){
		System.out.print("Enter name here: ");
		nametemp = keyboard.nextLine();
		
		
		name = nametemp;
	}
	
	//updates the games completed
	public void updateStats(){
		gamesCompleted++;
		int attempt = 0;
		attempt++;
	}
	

}

