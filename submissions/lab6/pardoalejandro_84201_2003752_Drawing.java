/*
* Drawing.java
* Author:  Alejandro Pardo
* Submission Date:  October 12
* Purpose: This program will make the drawing of a left sided triangle made of stars and repeat itself as many times as the user wants. 
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
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

		System.out.print("How many times do you want to repeat the figure? "); //it asks the user the first question
		int Repeat = input.nextInt();//grabs the first integer answer
		if (Repeat < 0) {
			System.out.println("Invalid Input");
			System.exit(0);}// if the input is lower than 0, the output would give invalid input
		
		System.out.print("Indicate the number of stars (>1): ");
		//this is the second question asked to the user
		int NumberOfStars = input.nextInt();
		System.out.println("");
		for (int j = 1; j <= Repeat; j++) {//this for statement will repeat the drawing as many times as the user wants
			
			for (int x = NumberOfStars; x >= 1; x--) {
				for (int i = 1; x >= i; i++) {
					System.out.print("*");
				}
				System.out.println("");
			}// this for statement will print out the first half of the drawing
			for (int x = 1; x <= NumberOfStars; x++) {
				for (int i = 1; x >= i; i++) {
					System.out.print("*");
				}
				System.out.println("");
				// this for statement will print out the second half of the drawing
			}

		}
		
	}
}