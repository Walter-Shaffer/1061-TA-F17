/*
 * [Bagels].java 
 * Author: [Aneri Desai]
 * Submission Date: [11/1/2017]
 * 
 * Purpose: In the project I learned the how to use objects plus repeat all the stuff from beggining like loops, uml diagrams and many more methods. 
 * 
 *  Statement of Academic Honesty:
 *  
 *  The following code represent my own work. I have neither received nor given inappropriate assistance. 
 *  I have not copied or modified code from any source other than the course webpage or the course textbook.
 *  I recognize that any unauthorized assistance or plagiarism will be handled in accordance with the policies
 *  at Clemson University and the policies of this course. I recognize that my work is based on an assignment 
 *  created by the School of Computing at Clemson Univeristy. Any publishing or posting of source code for this 
 *  project is strictly prohibited unless you have written consent from the instructor.  
 */			
			
import java.util.Scanner;			
			
public class Bagels { 			
			
	public static void main(String[] args) {		
		Scanner keyboard = new Scanner(System.in);	
		String letter = "";	
		
		Engine engine1 = new Engine();	//add new object to get use the variables from other classes
		Player player1 = new Player();	
		Validator validator1 = new Validator();	
			
		System.out.println("Welcome!");	
			
		do{	
			int min = -1; //set min value for fastest moves
			int i = 1;    //for number of games
			System.out.print("Enter the number of digits to use: ");	
			int number1 = keyboard.nextInt();	
			engine1.setNumDigits(number1);	//got numDigits from engine class
			
			System.out.print("Enter the player's name: ");	
			String name1 = keyboard.next();	
			player1.setName(name1);	//name from player class
			
			
			do{	 //added do while loop for the reset 
				int number_counts = 0;
				System.out.println();	
				System.out.println("Starting game #" + i + ".");	
			
				int[] guessNums = {};	
				engine1.generateNewSecret();;	//generate random guess from engine class
			
				do { //to play the game again 
					System.out.print("Enter your guess: ");
					String guess = keyboard.next();
					number_counts++;
					guessNums = engine1.convertNumToDigitArray(guess); //convert guess to array
				}while(!Validator.validateGuess(engine1.getSecretNumber(), guessNums, engine1.getNumDigits()));	
		
				System.out.print("Congratulations! " + "You won in " + number_counts + " moves.");	
				System.out.println();	
				System.out.println();	
				System.out.println("Statistics for " + name1 + ":");	
				System.out.println("Games completed: " + i);	
				i++;	
				System.out.println("Number of digits: " + number1);	
				
					if(min<0)  //if stment for the fastest win 
						min =number_counts;
					if(number_counts< min){
						min = number_counts ;
					}
				
				System.out.println("Fastest win: " + min + " guesses");	
				System.out.println("p - Play again");	
				System.out.println("r - Reset game");	
				System.out.println("q - Quit");	
				System.out.println();	
				System.out.print("What would you like to do? ");	
				
				letter = keyboard.next();	
				if(letter.startsWith("q")) {	
					System.out.println();
					System.out.println("Goodbye!");
				}	
				System.out.println();
			}while(letter.startsWith("p"));
			
		}while(letter.startsWith("r"));	
			
	}		
			
}			


