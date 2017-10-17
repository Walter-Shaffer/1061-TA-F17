/*
*Drawing.java
* Author:  David McDonough
* Submission Date:  October 12th, 2017
* Purpose: Displays amount of user inputed stars in decrementing order then incrementing order. Loops through the stars if user calls for it.
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
		int number;
		int count = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many times do you want to repeat the figure? ");
		count = keyboard.nextInt();//asks for users input on amount of times to loop through the stars
		if (count <= 0){
			System.out.println("Invalid input entered");
			System.exit(0);//program will terminate if count is less than 0
		}
		
		System.out.println("Indicate the number of stars (>1): ");
		number = keyboard.nextInt();//asks the user for amount of stars to be inputed
		if(number <= 1){
			System.out.println("Invalid input entered");
			System.exit(0);//program will terminate if number of stars inputed is less than or equal to 1
		}
		
		

			while (count > 0){//Keeps count of the amount of times the stars loop
				for (int i = number; i > 0; i--){//decrements the stars
					for (int j = 1; j <= i; j++){
					System.out.print("*");
				}
				System.out.println("");
				}
				for (int i = 1; i <= number; i++){//increments the stars
					for(int j = 0; j < i; j++){
					System.out.print("*");
				}
				System.out.println("");
			}
			count--;
		}
	
	}
}

