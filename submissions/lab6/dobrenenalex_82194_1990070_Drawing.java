/* Drawing.java 
 * Author:  Alex Dobrenen 
 * Submission Date:  Oct 13  
 * Purpose: A brief paragraph description of the 
 * program. What does it do? asks the user for an integer greater than 
 * 1 and displays an inverted right triangle of stars whose sides have the specified number of stars
 * Statement of Academic Honesty:  
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

//Class Start
public class Drawing 
{
	//Main Start
	public static void main(String[] args) 
	{
		int stars = 0;
		int rounds = 0;
		Scanner keyInput = new Scanner(System.in);
		
		System.out.print("Indicate # of Rounds (Integer Value >1): ");
		rounds = keyInput.nextInt();
		System.out.print("Indicate # of Stars (Integer Value >1): ");
		stars = keyInput.nextInt();
		
		if((stars <= 1) || (rounds <= 1))
		{
			System.out.print("Invalid Input, bye!");
		}
		else
		{
			for(int r = rounds; r > 0; r--)
			{
				for(int s = stars; s > 0; s--)
				{
					for(int a = s; a > 0; a--)
					{
						System.out.print("*");
					}
					System.out.println();
				}
				for(int s = 1; stars >= s; s++)
				{
					for(int a = s; a > 0; a--)
					{
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
	}//Main End

} //Class End
