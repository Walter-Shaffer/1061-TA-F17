/* StarGraph.java 
 * Author:  Alex Dobrenen 
 * Submission Date:  OCt 20  
 * Purpose: A brief paragraph description of the 
 * program. What does it do? In the program, both the values for x  and y  are  
 * computed based  on  input  from  the  user.  Once  the  values  are  found,  
 * the  program  should print them out as indicated by the examples. The program 
 * should also print out a graphical representation of the function, using a 
 * sequence of ‘*’s to indicate the magnitude of y.  
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

public class StarGraph //Start Class
{

	public static void main(String[] args) //Start Main
	{
		//Input
		Scanner input = new Scanner(System.in);
		int nth;
		double xmin;
		double inc;
		
		//Input nth(number of values)
		System.out.print("Please enter the number of X values to process: ");
		nth = input.nextInt();
		if(nth > 0) //Start IfElse
		{
			//Input minimum values
			System.out.print("Enter a minimum value for x: ");
			xmin = input.nextDouble();
			//Input incremental value
			System.out.print("Enter the ammount to increment x by: ");
			inc = input.nextDouble();
			if(inc > 0)//Start IfElse
			{
				//X and Y arrays
				double[] x = new double[nth];
				double[] y = new double[nth];
				
				x[0] = xmin;
				for(int i = 1; i < x.length; i++)
				{
					x[i] += x[i-1] + inc;
				}
				
				for(int i = 0; i < x.length; i++)//Start For
				{
					y[i] = 20.0 * Math.abs(Math.sin(x[i]));
					//System.out.println(y[i]);
				}//End for
				
				//Value output
				System.out.println("Values");
				for(int i = 0; i < x.length; i++) //Start for
				{
					System.out.print("x: ");
					System.out.printf("%.3f", x[i]);
					System.out.print("\ty: ");
					System.out.printf("%.3f", y[i]);
					System.out.println();
				} //End For
				System.out.println();
				//Star Output
				//Messed up Test Cases 9(wrong places)
				System.out.println("Graph");
				for(int i = 0; i < x.length; i++) //Start for
				{
					int stars = Math.abs((int) y[i]);
					System.out.print(": ");
					for(int s = 1; s <= stars; s++)//Start For
					{
						System.out.print("*");
					}//End For
					System.out.println();
				}//End For
			}
			else
			{
				System.out.println("Incremental value should be greater than 0.");
			}//End IfElse
		}
		else
		{
			System.out.println("Number of x values must be greater than 0.");
		}//End IfElse
		
		//Close Scanner
		input.close();
	}//End Main
}//End Class
