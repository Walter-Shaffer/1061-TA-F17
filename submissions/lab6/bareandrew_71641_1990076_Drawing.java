import java.util.Scanner;
/*
* Drawing.java
* Author: Andrew Bare
* Submission Date: 10/10/17
*
* Purpose: 
* 
* This program will take the number input by the user
* to make a triangle pattern with that number of stars
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
		//for keyboard input
		Scanner kb= new Scanner(System.in);
		
		//gets the input from the user
		System.out.print("How man times do you want to repeat the figure? ");
		int loopInput = kb.nextInt();
		
		//check input
		if (loopInput <1)
		{
			System.out.print("Invalid Input");
			System.exit(0);
		}
		//gets the input from the user
		System.out.print("Indicate the number of stars (>1): ");
		int numberInput = kb.nextInt();
		System.out.println("");
		
		//check input
		if (numberInput <=1)
		{
			System.out.print("Invalid Input");
			System.exit(0);
		}
		
		//loops as many times as the user specifies
		for (int q =0;q<loopInput;q++)
		{
			//loop to build the triangle vertical
			for (int i = numberInput; i > 0; i--)
			{
				//loop to build the triangle horizontal
				for (int j = i; j > 0; j--)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
			//loop to build the triangle vertical
			for (int i = 1; i <numberInput+1; i++)
			{
				//loop to build the triangle horizontal
				for (int j = 0; j < i; j++)
				{
					System.out.print("*");
				}
				System.out.println("");
			}	
		}
		
		
		
	}

}
