/*
* [Drawing].java 
* Author: [Aneri Desai]
* Submission Date: [10/12/2017]
* 
* Purpose: In the lab we learned we learned how to do different types of pattern in java using for loops and also practiced nested loops more. 
* 			 
* 
*  Statement of Academic Honesty:
*  
*  The following code represent my own work. I have neither received nor given inappropriate assistance. 
*  I have not copied or modified code from any source other than the course webpage or the course textbook.
*  I recognize that any unauthorized assistance or plagiarism will be handled in accordance with the policies
*  at Clemson University and the policies of this course. I recognize that my work is based on an assignment 
*  created by the School of Computing at Clemson Univeristy. Any publishing or posting of source code for this 
*  project is strictly prohibited unless you have written consent from the instructor.  
*/
package lab6;

import java.util.Scanner;
public class Drawing {

	public static void main(String[] args) {
		
		int i,j,z, max;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many times do you want to repeat the figure?");
		int m = input.nextInt();
		if(m<1) {
			System.out.println("Invalid output");
		}else {
		System.out.print("Indicate the number of stars(>1):\t");
		int row_num = input.nextInt();
		max = row_num;
		
		for(z=m;z>0; z--) {
		
			for (i=1; i<=row_num; i++) {
				if(i>1)
					System.out.println();
				for(j=max;j>0; j--) {
					System.out.print("*");
				}
				max--;
			}
			max++;
			for (i=1; i<=row_num; i++) {
					System.out.println();
				for(	j=1;j<=max; j++) {
					System.out.print("*");
				}
				max++;
			
			}max--;
				System.out.println();
		
		}
	  }
	}
}