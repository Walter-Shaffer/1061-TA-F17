/*
 * Drawing.java
 * Author: Mitchell Lamb
 * Submission Date: 10/13/2017
 * 
 * Purpose: The purpose of this program is to ask the user for an integer
 * greater than 1, and then display an inverted right triangle of stars
 * whose sides have the specified number of stars, then display a right
 * triangle of stars, then ask the user the number of times they want 
 * the drawing to be displayed, then display the stars that amount of times.
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
		int input; // User input for amount of stars
		int repeat; // User input for how many times to repeat
		
		// Ask user how many times to repeat
		System.out.print("How many times do you want to repeat the figure? ");
		repeat = keyboard.nextInt();
		
		// If user enters an integer less than 1 for repeating, terminate program
		if (repeat<1) {
			System.out.print("Invalid Input");
			keyboard.close();
			return;
		} 
			
		// Ask user how many stars they want
		System.out.print("Indicate the number of stars (>1): ");
		input = keyboard.nextInt();
		
		// If user enters an integer equal or lesser than 1 for the stars, terminate program
		if (input<=1) {
			System.out.print("Invalid Input");
			keyboard.close();
			return;
		}
		
		System.out.print("\n");
		
		// Loop to repeat stars
		for(int i=0; repeat>i; i++) {
			
			// Loop for inverted right triangle
			for(int x = 0; input > x; x++) {
				for(int y = input; y-x>0; y--) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
			
			// Loop for right triangle
			for(int x = 1; input >= x; x++) {
				for(int y = 1;y<=x;y++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}
		
		keyboard.close(); // Close scanner
		
	}
}
