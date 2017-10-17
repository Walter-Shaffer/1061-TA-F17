/* 
*Drawing.java
*Author: Jason Battaglini
*Submission Date: 10/10/17
*
*Purpose: The purpose of this lab is to make an inverse right triangle
*followed by a normal right triangle after the user inputs the amount
*of desired stars.This will repeat as many times as the user inputs.
*
*Statement of Academic Honesty:
*
*The following code represents my own work. I have neither
*received nor given inappropriate assistance. I have not copied
*or modified code from any source other than the course webpage
*or the course textbook. I recognize that any unauthorized
*assistance or plagiarism will be handled  in accordance
*with the policies at CLemson University and the
*policies of this course. I recognize that my work is based
*on an assignment created by the School of Computing
*at Clemson University. Any publishing or posting
*of source code for this project is strictly prohibited
*unless you have written consent from the instructor.
*/
import java.util.Scanner;
public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
		
		System.out.println("How many times do you want to repeat this figure? ");

		
		int repeat=keyboard.nextInt();
		if (repeat<1){
			System.out.println("Invalid Input");
		System.exit(0);
		}
		else
		System.out.println("Indicate the number of stars (>1): ");
		int rows=keyboard.nextInt();
		
		for(int x=repeat; x>=1; x--){
		for(int i=rows; i>=1; i--){
			for(int stars=0;stars<i; stars++){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=1; i<=rows; i++){
			for(int stars=1;stars<=i;stars++){
				System.out.print("*");
			}
			System.out.println("");
			}
		}
			
	}
}



