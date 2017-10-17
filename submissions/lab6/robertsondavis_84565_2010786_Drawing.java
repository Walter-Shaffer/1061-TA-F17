/*
     * Drawing.Java
     * Author: Davis Robertson
     * Submission Date: October 13th, 2017
     * 
     * Purpose: This program takes the hours of work put in a week, and, using several different
     * variables, calculates the Gross and Net Pay of the job, as well as show you how much of
     * it was deducted and from where (in taxes)
     * 
     * Statement of Academic Honesty:
     * 
     * The following code represents my own work. I have neither received nor given inappropriate 
     * assistance. I have not copied or modified code from any source other than the course 
     * webpage or the course textbook. I recognize that any unauthorized assistance or 
     * plagiarism will be handled in accordance with the policies at Clemson University and 
     * the policies of this course. I recognize that my work is based on an assignment created
     * by the School of Computing at Clemson University. Any publishing or posting of source
     * code for this project is strictly prohibited unless you have written consent from the 
     * instructor.
     */
import java.util.Scanner;

public class Drawing {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("How many times do you want to repeat the figure? ");
		int figureNumber = keyboard.nextInt();
		
	    if (figureNumber < 0){
		System.out.println("Invalid Input");
		System.exit(0);
		}else{
		
		}System.out.printf("Indicate the number of stars (>1):");
		int starNumber = keyboard.nextInt();
		keyboard.close();
		
		for (int i=0; i<figureNumber; i++);
		{
		for (int i=0; i<starNumber; i++)
        {
            for (int j=starNumber; j>i; j--)
            {    
                System.out.print("*");
            }
            System.out.println("");
		        }    
		for( int i = 1; i <= starNumber; i++ )
		{
	        for( int j = 0; j < i; j++ )
	        {
	            System.out.print("*");

	        }
	        System.out.println();
	}
	}
}
}

