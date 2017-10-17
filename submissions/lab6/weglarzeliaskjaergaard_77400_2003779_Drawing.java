/*
* Drawing.java
* Author: Elias Weglarz
* Submission Date: 10/12/17
*
* Purpose: Draw a right triangle that can be repeated multiple times.
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
		int count;
		System.out.println("How many times do you want to repeat the figure?:");
		count = keyboard.nextInt();
		if (count < 1){
			System.out.println("Invalid Input");
 			System.exit(0);
		}
		int inputNumber;
		System.out.println("Indicate the number of stairs (>1): ");
		inputNumber = keyboard.nextInt();
		if (inputNumber > 1){
		for (int i = 0; i <= count; i++){
	 		for (int k = 0; k <= inputNumber; k++){
	 		
	 			for (int j = inputNumber; j >= k ; j--){
	 				System.out.printf("*");
	 				}
	 			System.out.println("");
	 			}
	 		for (int k = 0; k <= inputNumber; k++){
	 			for (int j = 0; j <= k ; j++){
	 				System.out.printf("*");
	 				}
	 			System.out.println("");
	 			}
			}
		}
		else {
			System.out.println("Invalid Input");
 			System.exit(0);
		}
		
	}
}