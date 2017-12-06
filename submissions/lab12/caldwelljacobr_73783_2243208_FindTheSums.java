/*
* FindTheSums.java
* Author: Jacob Caldwell
* Submission Date: 12/01/2017
*
* Purpose: To search a double array for a sum that is already declared
* in horizontal rows as well as vertical columns, and print the array
* in a neat output
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
	
	public static String arrayToString(int[][] a) {
		String printArray = "";
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a[i].length; k++) {
				printArray += a[i][k];
				if (k + 1 < a[i].length) {
					printArray += " ";
				}
			}
			if (i + 1 < a.length) {
				printArray += "\n";
			}
		}
		return printArray;
	}
	
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		int m = a.length;
		int n = a[0].length;
		int[][] b = new int[m][n];
		boolean[][] partOfSum = new boolean[m][n];
		for (int x = 0; x < partOfSum.length; x++) {
			for (int y = 0; y < partOfSum[x].length; y++) {
				partOfSum[x][y] = false;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int sumTest = 0;
				for (int k = j; k < a[i].length; k++) {
					sumTest += a[i][k];
					if (sumTest == sumToFind) {
						for (int l = j; l <= k; l++) {
							partOfSum[i][l] = true;
						}
					}
					if (sumTest > sumToFind) {
						k = a[i].length;
					}					
				}
			}
		}
		for (int i = 0; i < partOfSum.length; i++) {
			for (int j = 0; j < partOfSum[i].length; j++) {
				if (partOfSum[i][j] == true) {
					b[i][j] = a[i][j];
				}
			}
		}
		return b;
	}
	
	
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		int m = a.length;
		int n = a[0].length;
		int[][] b = new int[m][n];
		boolean[][] partOfSum = new boolean[m][n];
		for (int x = 0; x < partOfSum.length; x++) {
			for (int y = 0; y < partOfSum[x].length; y++) {
				partOfSum[x][y] = false;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int sumTest = 0;
				for (int k = i; k < a.length; k++) {
					sumTest += a[k][j];
					if (sumTest == sumToFind) {
						for (int l = i; l <= k; l++) {
							partOfSum[l][j] = true;
						}
					}
					if (sumTest > sumToFind) {
						k = a.length;
					}					
				}
			}
		}
		for (int i = 0; i < partOfSum.length; i++) {
			for (int j = 0; j < partOfSum[i].length; j++) {
				if (partOfSum[i][j] == true) {
					b[i][j] = a[i][j];
				}
			}
		}
		return b;
	}
	
	
}
