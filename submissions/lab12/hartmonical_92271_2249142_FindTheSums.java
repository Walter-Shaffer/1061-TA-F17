/* 
 *  FindTheSums.java
 *  Author:  Monica Hart
 *  Submission Date:  11/30/2017 
 *  
 *  Purpose: This program uses information from a testing file
 *  to convert arrays to strings and find numbers in a line in
 *  the array that add up to an entered number.
 *  
 *  Statement of Academic Honesty: 
 *  
 *  The following code represents my own work. I have neither 
 *  received nor given inappropriate assistance. I have not copied 
 *  or modified code from any source other than the course webpage 
 *  or the course textbook. I recognize that any unauthorized 
 *  assistance or plagiarism will be handled in accordance  
 *  with the policies at Clemson University and the 
 *  policies of this course. I recognize that my work is based 
 *  on an assignment created by the School of Computing 
 *  at Clemson University. Any publishing or posting 
 *  of source code for this project is strictly prohibited 
 *  unless you have written consent from the instructor.   
 */

public class FindTheSums {

	//convert entered array into string
	public static String arrayToString(int[][] a){
		
		String result = ""; //string to be filled in and returned
		
		//loop through rows
		for (int r = 0; r < a.length; r++){
			
			//loop through columns
			for (int c = 0; c < a[r].length; c++){
				
				//add number to string with space unless it's the last number in the row
				if (c < a[r].length - 1)
					result += a[r][c] + " ";
				else
					result += a[r][c];
				
			}
			
			//add line break to every line but the last
			if (r < a.length - 1)
				result += "\n";
			
		}
		
		return result;
		
	}
	
	//returns array with ints filled in that add up horizontally to sumToFind
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		
		int[][] b = new int[a.length][a[0].length]; //new array to be filled in
		
		//loop through rows
		for (int i = 0; i < a.length; i++){
			
			//loop through columns
			for (int j = 0; j < a[i].length; j++){
				
				int sum = a[i][j];
				int j2; //column to compare

				//loop through columns to compare and adds numbers until the sum is
				//equal to or greater than sumToFind
				for (j2 = j; sum < sumToFind && j2 + 1 < a[i].length;){
					
					j2++;
					sum += a[i][j2];
					
				}
				
				//replace 0s in int[][] b with ints that add to sumToFind
				if (sum == sumToFind){
					for (int x = j; x <= j2; x++)
						b[i][x] = a[i][x];
				}
									
				
			}
			
		}
		
		return b;
		
	}
	
	//returns array with ints filled in that add up vertically to sumToFind
	public static int[][] verticalSums(int[][] a, int sumToFind){
		
		int[][] b = new int[a.length][a[0].length]; //new array to be filled in
		
		//loop through columns
		for (int j = 0; j < a[0].length; j++){
			
			//loop through rows
			for (int i = 0; i < a.length; i++){
						
				int sum = a[i][j];
				int i2; //row to compare
		
				//loop through rows to compare and adds numbers until the sum is
				//equal to or greater than sumToFind
				for (i2 = i; sum < sumToFind && i2 + 1 < a.length;){
							
					i2++;
					sum += a[i2][j];
							
				}
					
				//replace 0s in int[][] b with ints that add to sumToFind
				if (sum == sumToFind){
					for (int x = i; x <= i2; x++)
						b[x][j] = a[x][j];
				}
											
						
			}
					
		}
				
		return b;
		
		
	}
	
	
	
}
