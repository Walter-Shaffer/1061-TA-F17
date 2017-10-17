/*
* Drawing.java
* Author: Daniel Christensen
* Submission Date: 10/13/17
*
* Purpose: After asking for the desired length of the triangles and desired number of iterations of the pattern,
* this program prints a pretty picture of a sequence of triangles followed by inverted triangles. 
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
		
		Scanner keyboard = new Scanner(System.in);//get all user input
		System.out.println("How many times would you like to repeat the figure?");
		final int triangles = keyboard.nextInt();
		System.out.println("Indicate the number of stars (>1):");
		final int stars = keyboard.nextInt();
		keyboard.close();
		
		int iteration = 0 ;
		
		while(iteration<triangles) {//this loop prints the desired number of iterations of the pattern
			for(int j = 0; j<stars; j++) {//this begins new lines for the first triangle
				for (int i = j; i< stars;i++) {//this loop prints the stars for each line
					if (i == (stars-1)) {//begins a new line when it reaches desired length
						System.out.printf("%s%n","*");
					}
					else {
						System.out.printf("*");
					}
				}
				
			}
			for (int j = stars; j>0; j--) {//same as previous loop, but inverts the triangle
				for (int i = j; i<=stars; i++) {
					if (i == (stars)) {
						System.out.printf("%s%n","*");
					}
					else {
						System.out.printf("*");
					}
				}
			}
			iteration++;//keeps track of how many figures have been printed
		}
		
		
	}

}
