/* FindTheSums.java 
 * Author:  Alex Dobrenen 
 * Submission Date:  December 1
 * Purpose: A brief paragraph description of the 
 * program. What does it do? Word search with numbers 
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
public class FindTheSums 
{
	
	//Converts array to a string
	public static String arrayToString(int[][] a)
	{
		String array = "";
		
		for(int x = 0; x < a.length; x++)//start for horizontal
		{
			for(int y = 0; y < a[0].length; y++) // start for vertical
			{
				if(y < a[0].length)
					array = array + a[x][y];
				if(y != a[0].length-1)
					array = array + " ";
			}//end for
			if(x != a.length-1)
				array = array + "\n";
		}//end for
		
		return array;
	}
	
	//finds horizontal sums
	public static int[][] horizontalSums(int [][] a, int sumToFind)
	{
		int [][] b = new int[a.length][a[0].length];
		
		for(int startRow = 0; startRow < a.length; startRow++)
		{
			for(int startCol = 0; startCol < a[startRow].length; startCol++)
			{
				int [] maybeCorrect = new int [a[0].length];
				int index = startCol;
				int total = 0;
				while((index < a[startRow].length) && (total < sumToFind))
				{
					total += a[startRow][index];
					maybeCorrect[index] = a[startRow][index];
					index++;
				}
				if(total == sumToFind)
				{
					for(int z = 0; z < maybeCorrect.length; z++)
					{
						b[startRow][z] = maybeCorrect[z];
					}
				}
			}
		}
		return b;
	}
	
	//finds vertical sums
	public static int[][] verticalSums(int [][] a, int sumToFind)
	{
		int [][] b = new int[a.length][a[0].length];
		;
		
		for(int startCol = 0; startCol < a.length; startCol++)
		{
			for(int startRow = 0; startRow < a[startCol].length; startRow++)
			{
				int [] maybeCorrect = new int [a[0].length];
				int index = startRow;
				int total = 0;
				while((index < a[startCol].length) && (total < sumToFind))
				{
					total += a[startCol][index];
					maybeCorrect[index] = a[startCol][index];
					index++;
				}
				if(total == sumToFind)
				{
					for(int z = 0; z < maybeCorrect.length; z++)
					{
						b[startCol][z] = maybeCorrect[z];
					}
				}
			}
			
		}
		return b;
	}

}
