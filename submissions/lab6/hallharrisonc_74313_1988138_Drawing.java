/*
* Drawing.java
* Author: Harrison Hall
* Submission Date: 10 October 2017
*
* Purpose: This program "draws" asterisks based on a few inputs.
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
		int repeatTimes = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many times do you want to repeat the figure? ");
		repeatTimes = keyboard.nextInt(); 
		if (repeatTimes < 1){ //Makes sure the repeat count is valid
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
		System.out.print("Indicate the number of stars (>1): ");
		int maxStars = keyboard.nextInt();
		if (maxStars < 2){ //Makes sure star count is valid
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
		keyboard.close();
		int runsLeft = maxStars;
		int stars = runsLeft;
		
		while (repeatTimes > 0){//Repeats main loop for the amount of times specified
			runsLeft = maxStars;
			stars = maxStars;
			while (runsLeft > 0){ //Prints stars counting down
				System.out.println("");
				stars = runsLeft;
				while (stars > 0){
					System.out.print("*");
					stars--;
				}
				runsLeft--;
			}
			
			runsLeft = 0;
			
			while (runsLeft < maxStars){ // runs until the runsLeft is equal to the maximum stars
				runsLeft++;
				stars = 0; //star count to 0
				System.out.println("");
				while (stars < runsLeft){ //runs while star count is less than the number of runs
					System.out.print("*");
					stars++;
				}
			}
			repeatTimes--;
		}
		

	}
}