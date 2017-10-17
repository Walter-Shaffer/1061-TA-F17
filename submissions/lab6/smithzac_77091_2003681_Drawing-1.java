/*Drawing.java


 * Zachary Smith
 * 10-12-17
 * This program takes a user inputed number of repeats and stars
 * and makes a specific pattern out of the inputs.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not 
 * copied or modified code from any other source other than 
 * the course webpage or the course textbook. I recognize that 
 * any unauthorized assistance or plagiarism will be handled in
 * accordance with the policies at Clemson University and the
 * policies of this course, I recognize that my work is based
 * on an assignment created by the School of Computing at 
 * Clemson University. Any publishing or posting of source
 * code for this project is strictly prohibited unless
 * you have written consent from the instructor.
 * 
 */

import java.util.Scanner;

public class Drawing {

	public static void main(String[] args) {
		
		int stars, repeat, count;
		
		String character = "*";
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many times do you want to repeat the figure? ");
		
		repeat = keyboard.nextInt();
		
		if(repeat < 1)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
		System.out.print("Indicate the number of stars (>1): ");
		
		stars = keyboard.nextInt();
		
		count = stars;
		
		if(stars <= 1)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		else
			for(int j = 0; j <= (repeat - 1); j ++)
			{
				System.out.println(String.format("\n%0" + count + "d", 0).replace("0", character));
				for(int i = 1; i <= (stars - 1); i++)
				{
					count--;
					System.out.println(String.format("%0" + count + "d", 0).replace("0", character));
				}
				System.out.println(String.format("%0" + count + "d", 0).replace("0", character));
				for(int k = 1; k <= (stars -1); k++)
				{
					count++;
					System.out.println(String.format("%0" + count + "d", 0).replace("0", character));
				}
			}	
	}

}
