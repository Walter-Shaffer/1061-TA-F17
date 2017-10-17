/*
* [Drawing].java
* Author:Thomas
* Submission Date: October 12, 2017
*
* Purpose: This lab is designed to test your loop skills and to allow 
* the user to input a repeating number and the number of stars so that 
* in counts down then back up in pattern
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
		
		System.out.print("How many times do you want to repeat the figure? ");

		Scanner Repeat = new Scanner(System.in);

		int loopy = Repeat.nextInt();


		System.out.print("Indicate the number of stars (>1): ");

		Scanner Input = new Scanner(System.in);

		int number = Input.nextInt();

		int i;

		int j;

		for(int z = 0; z < loopy; z++){

		for(i = 0; i < number; i++){


		for(j = i; j < number; j++){

		System.out.print("*");


		}

		System.out.println("");


		}

		for(i = 0; i < number; i++){


		for(j = -1; j < i; j++){

		System.out.print("*");


		}

		System.out.println("");


		}



		}

		}

		}
