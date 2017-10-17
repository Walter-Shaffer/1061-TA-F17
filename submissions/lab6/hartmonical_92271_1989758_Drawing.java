/*
 * Drawing.java
 * Author: Monica Hart
 * Submission Date: 10/10/2017
 *
 * Purpose: This program prints out a triangle of stars in
 * different sized determined by user input.
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
		
		//variables
		int numStarsStart; //entered amount of stars
		int numStars; //stars for each line
		int numStarsCount; //count down
		int numFiguresStart; //entered amount of figures
		int numFigures; //count figures
		
		//ask user input for number of figures
		System.out.print("How many times do you want to repeat the figure? ");
		numFiguresStart = keyboard.nextInt();
		
		//check number of figures entered
		if (numFiguresStart >= 1){
			
			//ask user input for number of stars
			System.out.print("Indicate the number of stars (>1): ");
			numStarsStart = keyboard.nextInt();
			
			//start counting figures
			for (numFigures = 1; numFigures <= numFiguresStart; numFigures++){
				
				//check number of stars entered
				if (numStarsStart > 1){
					//start counting stars
					for (numStarsCount = numStarsStart; numStarsCount > 0; numStarsCount--){
						System.out.println("");
						for (numStars = numStarsCount; numStars > 0; numStars--){
							System.out.print("*");
						}
					}
					for (numStarsCount = 1; numStarsCount <= numStarsStart; numStarsCount++){
						System.out.println("");
						for (numStars = 1; numStars <= numStarsCount; numStars++){
							System.out.print("*");
						}
					}
				}
				else {
					System.out.println("Invalid Input");
					numFigures = numFiguresStart + 1; //exit loop
				}
			}
		}
		else {
			System.out.println("Invalid Input");
		}
		
	}

}
