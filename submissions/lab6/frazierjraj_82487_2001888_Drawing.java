/*
* [Drawing].java
* Author: [Anthony Frazier]
* Submission Date: [10/12/17]
*
* Purpose:Prompts the user to enter a number of repitions and a number of stars. It then prints out the stars
* the number of times the user requested.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagarism will be handled in accordance
* with the policies at Clemson University and the
* policies of this course. I recognize that my work is based
* on an assignment created by the School of Computing
* at Clemson University. Any publishing or posting
* of source code for this project is strictly prohibited
* unless you have written consent from the instructor.
*/
import java.util.Scanner;
public class Drawing {

	public static void main(String[] args) {
		//declaring variables and initializing scanner
		Scanner input = new Scanner(System.in);
		int numberOfLoops = 0;
		int loopsExecuted = 0;
		int starNumber = 0;
		boolean validInput = true;
		
		//taking input for number of loops, also checking it to see if it's greater than zero, if it is not then makes validInput false
		System.out.print("How many times do you want to repeat the feature?");
		numberOfLoops = input.nextInt();
		if(numberOfLoops < 0){
			System.out.print("Invalid Input");
			validInput = false;
		}
		//in an else statement takes input for number of stars, that way it will only execute if a valid input was given for number of loops
		else{
			System.out.print("Indicate the number of stars (>1): ");
			starNumber = input.nextInt();
				if(starNumber < 0){
					System.out.print("Invalid Input");
					validInput = false;
				}
			}	
		//because star number is chaged while in the loop, I created a backup of it's orginal value that i reset it to each time the loop executes
		int bstarNumber = starNumber;
		//the loop executes while the number of loops executed is less than the number of loops inputed by the user and valid input is true
		while(loopsExecuted < numberOfLoops && validInput){
			starNumber = bstarNumber;
			//because i need the value of star number for the next loop, but star number is changed, i created the variable reverse lines to store its original value
			int reverseLines = starNumber;
			String stars = "*";
			//becuase the star number is equal to the total lines, it runs as many times as the user inputs star number
			while(starNumber > 0){
				//this is priting out stars the number of times the user input and then subtracting one from it on each loop
				for(int i = 0; starNumber - i > 0; i++){
					System.out.print(stars);
				}
				starNumber -= 1;
				System.out.print("\n");
			}
			//the loop below is essentially the same as the one above, but it is adding instead of subtracting
			int lines = 1;
			int rStarNumber = 0;
			while(lines <= reverseLines){
				for(int i = 0; rStarNumber + i < lines; i++){
					System.out.print(stars);
				}	
				lines += 1;
				System.out.print("\n");
			}
			//this incriments loops executed by one
			loopsExecuted += 1;
		}
	}	
}
