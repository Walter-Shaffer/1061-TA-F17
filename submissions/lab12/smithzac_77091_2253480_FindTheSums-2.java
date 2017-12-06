/*FindTheSums.java
 * Zachary Smith
 * 12-1-17
 * This program takes a 2D array and searches though it both
 * horizontally and vertically for a specific sum. If the
 * integer is part of the sum, then it it kept, if not
 * it is replaced by a zero. After that, it returns the
 * updated table.
 * Statement of Academic Honesty:
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
 */
public class FindTheSums {

	public static String arrayToString(int[][] a)
	{
		String table = "";
		for(int row = 0; row < a.length; row++)// scrolls through each row
		{
			for(int column = 0; column < a[row].length; column++)//scroll through each column
			{
				if(column != 0)//adds a space as long as it doesn't follow the last character in the row
				{
					table += " ";
				}
				table += (a[row][column]);
			}
			if(a[row] != a[a.length -1])//adds a new line as long as it doesn't follow the last character overall
			{
				table += "\n";
			}
			
		}
		return(table);
	}
	
	public static int[][] horizontalSums(int[][] a, int sumToFind)
	{
		int[][] b = new int[a.length][a[0].length];
		
		for(int column = 0; column < a[0].length; column++)// scrolls through each column
		{
			for(int row = 0; row < a.length; row++)//scrolls through each row
			{
				int sum = 0;
				for(int nextColumn = column; nextColumn < a[row].length; nextColumn++)//keeps looking through the columns
				{
					sum += a[row][nextColumn];//adds each integer to the sum
						if(sum == sumToFind)
						{
							for(int search = column; search <= nextColumn; search++)
							{	
								b[row][search] = a[row][search];//makes the array b match array a
							}	
						}
				}
			}
		}
		return b;
	}	
		
		
	public static int[][] verticalSums(int[][] a, int sumToFind)
	{
		int[][] b = new int[a.length][a[0].length];
		
		for(int row = 0; row < a.length; row++)//scrolls through each row
		{
			for(int column = 0; column < a[0].length; column++)//scrolls through each column
			{
				int sum = 0;
				for(int nextRow = row; nextRow < a.length; nextRow++)//keeps looking through the rows
				{
					sum += a[nextRow][column];//adds each integer to the sum
						if(sum == sumToFind)
						{
							for(int search = row; search <= nextRow; search++)
							{	
								b[search][column] = a[search][column];//makes the array b match array a
							}	
						}
				}
			}
		}
		return b;
	}
}

/*
 * 				Horizontal
 * 
 * Start at top left corner, check to see if the number in the top left 
 * spot make up the sumToFind. If they do, "highlight" it, and move on. If
 * not, move to the int to the right one spot, and do the same. Do this for,
 * all ints in the top row, and after the last one, move down to the line 
 * below. Do this for all rows.
 * 
 * 				Vertical
 * 
 * Start at top left corner, and search down the column to find sequences.
 * Once at the end, go back up to the top of the colimn, and move one space
 * to the right on the top row, and go down the column again. Do this for
 * all columns.
 * 
 * */
