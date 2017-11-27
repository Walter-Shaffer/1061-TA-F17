/*
* Bagels.java
* Author: Michael Grimsley
* Submission Date: 11/3/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
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
public class Bagels {
public static void main(String[] agrs){
Scanner keyboard = new Scanner(System.in);

//making new objects 
Engine engineObj = new Engine();
Player playerObj = new Player();
System.out.println("Welcome!\n");
int x = 1;
//main while loop if player chooses to reset
while (x == 1){
System.out.println("Please enter the number of digits to use: ");
	engineObj.setNumDigits(keyboard.nextInt());
	engineObj.generateNewSecret();
	System.out.println("Enter the player's name: ");
	playerObj.setName(keyboard.next());
x = 0;
while (x == 0) {
	int status = 1;
	
	System.out.println("Starting game #" +(playerObj.getGamesCompleted() + 1));
	System.out.println("Enter your guess: ");
	//While the validator returns false the main keeps calling the valdiator medthod so the game keeps going untill there is a correct guess
	while ((Validator.validateGuess(engineObj.getSecretNumber(), engineObj.convertNumToDigitArray(playerObj.askForGuess()), engineObj.getNumDigits()))== false){
		System.out.println("Enter your guess: ");
		Validator.validateGuess(engineObj.getSecretNumber(), engineObj.convertNumToDigitArray(playerObj.askForGuess()), engineObj.getNumDigits());
		//increasing status the argument for .updateStatus method
		status++;
	}
//updating games played on win 
	playerObj.updateStatus(status);
	System.out.println("Congradualtions you won in: " +status+ " attempts");
	System.out.println("Staticstic for: " +playerObj.getName());
	System.out.println("Games Completed: " +playerObj.getGamesCompleted());
	System.out.println("Fastest Win: " +playerObj.getFastestWin());
	System.out.println("p - play again");
	System.out.println("r - Reset game");
	System.out.println("q - quit");
	System.out.println("\n What would you like to do? ");
	Character choice = keyboard.next().charAt(0);
	//if statement for final choice 
	if (choice == 'q'){
		System.out.println("Goodbye!");
		System.exit(0);
	}else if (choice == 'r'){
		engineObj = new Engine();
		playerObj = new Player();
		x=1;
	}else if (choice == 'p'){
		engineObj = new Engine();
		x=0;
	}
}
}
}
}
