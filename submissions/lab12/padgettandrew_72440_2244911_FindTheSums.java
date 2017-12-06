/*
* FindTheSums.java
* Author: Andrew Padgett
* Submission Date: 11/30/17
*
* Purpose: Receives a 2D array of integers and searches horizontally
* 		   and vertically for adjacent integers that sum up to a
* 		   specified number. Creates new 2D array that only prints
* 		   those integers that sum to the specified number. All other
* 		   integers are replaced with 0s.
*
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
	
	/*
	 * Returns a formatted String to create a table out
	 * of a 2D array a. Each row corresponds to the integers
	 * contained in each index of the first array in a.
	 */
	public static String arrayToString(int[][] a){
		String arrayString = "";
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				arrayString += a[i][j];
				if (j != a[i].length - 1)
					arrayString += " ";
			}
			if (i != a.length -1)
				arrayString += "\n";
		}	
		return arrayString;
	}
	
	/*
	 * Searches horizontally through the 2D array for adjacent numbers
	 * that sum up to equal sumToFind. When a group of numbers is found
	 * that equal sumToFind, those numbers are assigned to the same positions
	 * in 2D array b. Loop on current row ends when sum is less than sumToFind
	 * and the loop has reached the end of the current row. Loops through each
	 * row repeating this process.
	 */
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int sum = 0;
				for (int k = j; k < a[i].length; k++) {
					sum += a[i][k];
					if (sum == sumToFind) {
						for (int l = j; l < k + 1; l++)
							b[i][l] = a[i][l];
						sum = 0;
						k = a[i].length;
					}
					if (sum > sumToFind)
						k = a[i].length;
					if (sum < sumToFind && k == a[i].length - 1) {
						k = a[i].length;
						j = a[i].length;
					}
				}				
			}
		}
		return b;
	}
	
	/*
	 * Searches vertically through the 2D array for adjacent numbers
	 * that sum up to equal sumToFind. When a group of numbers is found
	 * that equal sumToFind, those numbers are assigned to the same positions
	 * in 2D array b. Loop on current column ends when sum is less than sumToFind
	 * and the loop has reached the end of the current column. Loops through each
	 * column repeating this process.
	 */
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int sum = 0;
				for (int k = j; k < a.length; k++) {
					sum += a[k][i];
					if (sum == sumToFind) {
						for (int l = j; l < k + 1; l++)
							b[l][i] = a[l][i];
						sum = 0;
						k = a.length;
					}
					if (sum > sumToFind)
						k = a.length;
					if (sum < sumToFind && k == a.length - 1) {
						k = a.length;
						j = a.length;
					}
				}				
			}
		}
		return b;		
	}
}
