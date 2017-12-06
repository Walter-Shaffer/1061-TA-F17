/*
* FindTheSums.java
* Author: Elias Weglarz
* Submission Date: 10/13/17
*
* Purpose: Given a sum, this program determines the adjacent values in a double array that sum to the given value.
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

public class FindTheSums {

	public static String arrayToString(int[][] a){
		String x = "";
		for(int i = 0; i < a.length; i++){
			for(int k = 0; k < a[0].length; k++){
				x = x + a[i][k]+ " ";
			}
			x = x + "\n";
		}
		return x;
	}
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int[][] x = new int[a.length][a[0].length];
		int r = 0;
		while(r < a.length){
			int sum = 0;
			int c = 0;
			while(c < a.length){
				sum += a[r][c];
				x[r][c] = a[r][c];
				if (sum >= sumToFind){
					return x;	
				}
				c++;
			}
			r++;
		}
		return x;
	}
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int[][] x = new int[a.length][a[0].length];
		int c = 0;
		while(c < a.length){
			int sum = 0;
			int r = 0;
			while(r < a.length){
				sum += a[r][c];
				x[r][c] = a[r][c];
				if (sum >= sumToFind){
					return x;
				}
				r++;
			}
			c++;
		}
		return x;
	}
	
}
