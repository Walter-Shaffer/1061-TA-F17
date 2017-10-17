/*
* Drawing.java
* Author: Kevin Okinedo
* Submission Date: 10/10/17
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* This program uses nested for loops to output statements depending on the user's input.
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
		
		int stars, rows, amountOfstars, repeat;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many times do you want to repeat the figure?");
		repeat = input.nextInt();
		
		System.out.println("Indicate the number of stars  (>1) :");
		stars = input.nextInt();
		
		if (stars < 1 || repeat < 1){
			System.out.println("Invalid Input");
	}
		else {
			
			for(int x = 0; x < repeat; x++)		{
				for (rows = 1; rows <= stars; rows++){
					for (amountOfstars = stars ; amountOfstars >= rows; amountOfstars--){
						System.out.print("*");
					}
					System.out.println("");
					}
				
				for (rows = 1; rows <= stars; rows++){
					for (amountOfstars = 1; amountOfstars <=rows; amountOfstars++){
						System.out.print("*");
					}
					System.out.println("");
					}
				}
		}
	}
}
