/*
* Drawing.java
* Author: Joshua Williams
* Submission Date: 10/10/17
*
* Purpose: 
* 	The program will receive two integers from the user: the number of times the program repeats,
*  and the number of stars the program will build up to. The program will then display stars in a 
*  formatted way depending on the values displayed.
* 
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
		int numberOfStars, numberOfRepeats;
		System.out.print("How many times do you want to repeat the figure? ");
		numberOfRepeats = keyboard.nextInt();//Getting the user's input on how many times the program should loop
		if (numberOfRepeats < 1) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		System.out.print("Indicate the number of stars (>1): ");
		numberOfStars = keyboard.nextInt();//Getting the user's input on how many stars should be displayed
		System.out.print("\n");
		if (numberOfStars <= 1) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		for (int i = 0; i < numberOfRepeats; i++) {//This for loop runs the inside code a user inputed amount of times
			for (int j = numberOfStars; j > 0; j--) {//This double for loop creates the downwards incrementing stars
				for (int k = j; k > 0; k--) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
			for (int j = 1; j <= numberOfStars; j++) {//This double for loop creates the upwards incrementing stars
				for (int k = 0; k < j; k++) {
					System.out.print("*");
				}
				System.out.print("\n");

			}
		}
	}
}