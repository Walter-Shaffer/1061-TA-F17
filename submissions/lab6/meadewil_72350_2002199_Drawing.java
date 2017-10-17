import java.util.Scanner;

/* 
LinkExtractor.java
Author: Sean Meade
Submission Date: 10/12
Purpose: Prints a pattern of stars that reverses itself and then
repeats. The number of stars and number of times the entire
pattern is repeated is determined by user input. 

Statement of Academic Honesty:
The following code represents my own work. I have neither
received nor given inappropriate assistance. I have not copied
or modified code from any source other than the course webpage
or the course textbook. I recognize that any unauthorized 
assistance or plagiarism will be handled in accordance
with policies at Clemson University and the
policies of this course. I recognize that my work is based
on an assignment created by the School of Computing
at Clemson University. Any publishing or posting 
of source code for this project is strictly prohibited 
unless you have written consent from the instructor. 
*/
public class Drawing {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many times do you want to repeat the figure? "); 
		int repeatNumber = keyboard.nextInt();
		
		if (repeatNumber >= 1){
			System.out.print("Indicate the number of stars (>1): "); //Asks for the number of stars the user wants displayed on the first row and sets that number equal to the variables needed.
			int inputNumber = keyboard.nextInt();
			int starNumber = inputNumber;
			int lineNumber = inputNumber;
			System.out.print("\n"); //Creates a space between the inputs and the outputs. 
		
			if (starNumber >= 1){ //Checks to see if the number given for stars is valid. 
				for (int intervalNumber = 0; intervalNumber < repeatNumber; intervalNumber++){ //Prints the same pattern of stars until the number of intervals on the screen matches the number given by the user. 
				
					for (starNumber--; starNumber >= 0; starNumber--){ //Prints a star until until there is one star less than the line should have.
						System.out.print("*");
						
						if (starNumber == 1){ //Prints the last star and restarts the loop until no more lines are needed. 
							System.out.println("*");
							lineNumber--; 
							starNumber = lineNumber;
						}
					}
					System.out.println(""); //Starts the reverse pattern on the next line. 
					
					for (starNumber = 1; starNumber < inputNumber; starNumber++){ //Prints a star until there are as many stars as the line should have. 
						System.out.print("*");
						
						if(starNumber == lineNumber){ //Resets the star number and starts another line until there are as many lines as needed. 
							starNumber = 0;
							lineNumber++;
							System.out.println("");
						}
					}
					if(lineNumber == inputNumber){ //Prints the last star of the last line in the entire interval and starts the next inverval on the next line. 
						System.out.print("*\n");
						}
					}
			}
			else
				System.out.println("Invalid Input"); //Displays an error message if the number of stars given is less than 1.
		}
		else
			System.out.println("Invalid Input"); //Displays an error message if the number of repeated figures given is less than 1.
		
		keyboard.close(); //Closes the keyboard. 
	}
}