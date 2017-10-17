/*
* Drawing.java
* Author: Heather Wright
* Submission Date: October 11, 2017
*
* Purpose: This program takes input for the number of times the
* user wants their desired figure to repeat as well as the 
* number of starts they would like their drawing to have. 
* First the program and prints out the number of stars that the
* user entered using the inner for loop. This number is then lowered
* by one so there is one less star printed in the next line of code. 
* The next loop then builds the number of stars back up to its original 
* value. Creating a pyramid, or drawing of sorts. If the users inputs an
* invalid number the program terminates. 
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
		
		int numberOfStars;
		int numberOfRepeats;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How mant times do you want to repeat the figure? ");
		numberOfRepeats = keyboard.nextInt();
		if(numberOfRepeats < 1) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		System.out.print("Indicate the number of stars (>1): ");
		numberOfStars = keyboard.nextInt();
		if(numberOfStars <= 1) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		keyboard.close();
		
			for(int k = 1; k <= numberOfRepeats; k++) {
				for (int i = numberOfStars; i > 0; i--) {
					for (int j = 0; j < i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				for (int i = 1; i <= numberOfStars; i++) {
					for (int j = 0; j < i; j++) {
					System.out.print("*");
					}
					System.out.println();
				}
			}
	}

}
