/*
		* Drawing.java
		* Author: Spalding Latham
		* Submission Date: [10/10/2017]
		*
		* Purpose: This program takes an input for the number of stars and how many times the pattern
		* is repeated and outputs a pattern of stars
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
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many times do you want to repeat the figure? ");
		
		int repeat = input.nextInt();
		
		{
		
		while (repeat < 1){ //loop that reprompts user if the input is incorrect
			System.out.print("Invalid input \n");
			return;
		
		}
	
		System.out.print("Indicate the number of stars (>1): ");
		}
		
		int stars = input.nextInt();
		
		while (stars < 1){ //loop that reprompts user if the input is incorrect
			System.out.print("Invalid input \n");
			return;
		
		}
		
		int a;
		int b; 
		
		System.out.println();
		
		for (int d = 0; d < repeat; d++){ //outermost loop that reads how many times the user wants to repeat the pattern 
			
	    
		for (a = 0; a < stars; a++){
			
			for (b = 0; b < stars - a; b++){ //loop for the stars in decreasing order
				System.out.print("* ");}
				System.out.print("\n");
		}
			
	
	   
		for(a = 0; a < stars; a++){
	            
		 for(b = 0; b <= a; b++){ //loop for stars in increasing order
	         System.out.print("* ");}
	         System.out.print("\n");}
	        
	
	
	
		
		}
		}    
	

	


}
