/*
*FindTheSums.java
* Author:  David McDonough
* Submission Date:  December 1st, 2017
* Purpose: Finds numbers in an array that equal a certain number horizontally and vertically
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance
* with the policies at Clemson University and the
* policies of this course. I recognize that my work is based
* on an assignment created by the School of Computing
* at Clemson University. Any publishing or posting
* of source code for this project is strictly prohibited
* unless you have written consent from the instructor.
*/
public class FindTheSums {
	
	public static String arrayToString(int[][] a){
		String string = "";
		
		//loops through array and puts them in a neat order
		//tests whether the array passes or fails
		for (int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++){
				string = string + a[i][j];
				if(j < a[0].length - 1)
					string = string + " ";
			}
			if(i < a.length - 1)
				string = string + "\n";
		}
		return string;
				
	}
	
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[0].length];
		boolean[][] checker = new boolean[a.length][a[0].length];
		
			//loops through array horizontally and finds elements that equal a specified number
			for(int row = 0; row < a.length; row++){
				int col = 0;
				int check = 0;
				int total = 0;
				while(col < a[0].length){
					if(total < sumToFind){
						total = total + a[row][col];
						col++;
					}
					if(total > sumToFind){
						check++;
						col = check;
						total = 0;
					}
					if(total == sumToFind){
						for(int k = check; k < col; k++)
							checker[row][k] = true;
							check++;
							col = check;
							total = 0;
						
						}
							
					}
				}
					for(int i = 0; i < a.length; i++){
						for(int j = 0; j < a[0].length; j++){
							if(checker[i][j])
								b[i][j] = a[i][j];
							else
								b[i][j] = 0;
						}	
							
					}		
		return b;
	}
	
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int [][] c = new int[a.length][a[0].length];
		boolean[][] checker = new boolean[a.length][a[0].length];
		
		//loops through array vertically and finds elements in the array that equal a specified sum
		for(int j = 0; j < a.length; j++){
			int row = 0;
			int check = 0;
			int total = 0;
		while(row < a.length){
			if(total < sumToFind){
				total += a[row][j];
				row++;
			}
			if(total > sumToFind){
				check++;
				row = check;
				total = 0;
			}
			if(total == sumToFind){
				for(int k = check; k < row; k++)
					checker[k][j] = true;
					check++;
					row = check;
					total = 0;
				
				}
			}
		}
		
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++){
				if(checker[i][j])
					c[i][j] = a[i][j];
					else
						c[i][j] = 0;
			}
		}
		
		return c;
	}
}
