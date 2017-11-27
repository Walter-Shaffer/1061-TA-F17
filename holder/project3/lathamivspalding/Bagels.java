/*
		* Bagels.java
		* Author: Spalding Latham
		* Submission Date: [11/3/2017]
		*
		* Purpose: The Bagels class is the driver that users will use to execute the game
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

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Player player1 = new Player();
		Engine engine1 = new Engine();
		Validator validator1 = new Validator();
		
		char command;	
		char p = 'p';
		char r = 'r';
	//do-while loop so that the game resets when the user enters 'r'
	do{	
	System.out.print("Welcome!\nEnter the number of digits to use: ");
	int numDigits = input.nextInt();
	engine1.setNumDigits(numDigits);
 
	
	String name = player1.getName();
	
	//do-while loop that starts a new game when the user enters 'p'
	do{
	System.out.println();
	System.out.println("Starting game #" + (player1.gamesCompleted() + 1)*10/10);
	
	//generates the secret number
	engine1.generateNewSecret();
	int[] secret = engine1.getSecretNumber();
	
	boolean isTrue;
	int numberMoves = 0;
	
	//do-while loop that continues to ask for a guess while the user has not won the game
	do{
	numberMoves++;	
		
	String stringGuess = player1.askForGuess();
	//System.out.println("guess is " + guess);
	
	int[] guess = engine1.convertNumToDigitArray(stringGuess);

	isTrue = validator1.validateGuess(secret, guess, numDigits);
	
	
	
	
	}
	
	while(isTrue == false);
	
	System.out.println("Congratulations! You won in " + numberMoves + " moves" );
	
	player1.updateStats(numberMoves);
	int gamesCompleted = player1.gamesCompleted();
	int fastestWin = player1.getFastestWin();
	
	System.out.println("\nStatistics for " + name + ":");
	System.out.println("Games completed: " + gamesCompleted);
	System.out.println("Number of Moves: " + numberMoves);
	
	//if-else statement to get the correct fastest win
	if(numberMoves < fastestWin){
	System.out.println("Fastest Win: " + numberMoves);
	}
	else {
		System.out.println("Fastest Win: " + fastestWin);
	
	}
	
	
	System.out.println("p - Play Again");
	System.out.println("r - Reset Game");
	System.out.println("q - Quit");
	System.out.println();
	System.out.print("What would you like to do? ");
	command = input.next().charAt(0);
	System.out.println();
	//System.out.print(command);
	
	//exits the program when the user enters 'q'
	if (command == 'q'){
		System.out.print("Goodbye!");
		System.exit(0);
	}
	}while(command == p);
	
	} while(command == r);
	

	

	
	
	

    
		
		
		
		
		
		
		
		
		
		
		

	}

}
