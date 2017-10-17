import java.util.Scanner;

/*
* Drawing.java
* Author: Jack Maggard
* Submission Date: 10/10/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* This program draws a right triangle and reflects it across
* the x-axis. It repeats this figure as many times as the user wants. 
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
public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many times do you want to repeat the figure? ");//prompt user for desired repetitions
		int repeat = keyboard.nextInt();//int value for amount of repeats. Will be used in the controlling loop
		System.out.println(""); 
		System.out.print("Indicate the number of stars (>1): ");//prompt the user for the desired number of stars 
		int stars = keyboard.nextInt();
		if (stars> 1) {
			
			for (int x = 0; x < repeat; x++) {//loop will repeat however many times the user wants
				for (int j = 0; j < stars; j++) {
					for (int i = stars; i > j; i--) {
						System.out.print("*");
					}
					System.out.println();
				}
				for (int j = 0; j < stars; j++) {
					for (int i = 0; i < j + 1; i++) {//reverse the loop from before
						System.out.print("*");
					}
					System.out.println();//so the next row of stars starts on the next line

				}
			}

		}
		else if(stars<=1)
			System.out.println("Invalid Input");//Response if the user inputs an integer less than 2
	}
}
