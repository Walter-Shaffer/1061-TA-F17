/*
* Drawing.java

* Author: Lydia Shealy
* Submission Date: 10/12/17
*
* Purpose: To print out a pattern of stars and repeat the pattern
* based on user input. 
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

public class Drawing {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 	
		
		//initialize variables 
		int numberOfStars; 
		int numberOfPatterns; 
		int i; 	
		
		//ask for how many times they want to repeat
		System.out.print("How many times do you want to repeat the figure? " );
		numberOfPatterns = keyboard.nextInt();
		
		//checks that the number is 1 or greater 
		if (numberOfPatterns <= 0){
			System.out.println("Invalid Input");
			System.exit(0);
		}	 
		
		//asks for how many stars they want
		System.out.print("Indicate the number of stars (>1): ");	
		numberOfStars = keyboard.nextInt();
		keyboard.close(); 
		
		//checks that the number is greater than 1 
		if (numberOfStars <= 1){
			System.out.println("Invalid Input");
			System.exit(0);
		}
			
		
		System.out.println( );
		
		//loops the pattern of the stars
		while (numberOfPatterns > 0){
			
			//prints out the first half of the pattern 
			for(i = numberOfStars; i > 0; i--){
				
				//prints a single line of stars
				for (int j = i ; j>0 ; j--){
					System.out.print("*");
				}
				//prints a new line to start more stars on
				System.out.println( );
			}
			
			//prints out the second half of the pattern 
			for (i = numberOfStars; i > 0 ; i--){
				 
				for (int j = i ;j <= numberOfStars ; j++){
					System.out.print("*");
				}
				
				System.out.println( );
			}	
			
			numberOfPatterns--; 			
		}		
	}
}
