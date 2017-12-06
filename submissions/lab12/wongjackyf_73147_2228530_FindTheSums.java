/**
 * FindTheSums.java
 * Author: Jacky Wong
 * Submission Date: 11/28/2017
 * 
 * Purpose: This programs neatly prints arrays and finds the
 * horizontal and vertical sums for a 2 dimensional input
 * array and a given sum to find.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance
 * with the policies at Clemson university and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the School of Computing
 * at Clemson University. Any publishing or posting
 * of source code for this project is strictly prohibited
 * unless you have written consent from the instructor.
 */

public class FindTheSums {

	public static String arrayToString(int[][] a) {
		String tempArrayString = "";
		for (int i = 0; i <= (a.length - 1); i++) {		// Sweep through each row
			for (int j = 0; j <= (a[i].length - 1); j++) {		// Sweep through each element in row
				if (j == (a[i].length - 1)) {		// If is the last element
					tempArrayString = tempArrayString + a[i][j];
				}
				else {		// Otherwise (not last element)
					tempArrayString = tempArrayString + a[i][j] + " ";
				}
			}
			if (i != a.length - 1){		// Adds new line if not on last one
				tempArrayString = tempArrayString + "\n";
			}
		}
		return tempArrayString;
	}
	
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[1].length];		// Create new array with same dimensions as a
		int testingSum = 0, numberElements = 0, checkIndex = 0;		// Current working sum; how many numbers are being used; which index is being added
		boolean equalsFind = false;
		for (int i = 0; i <= (a.length - 1); i++) {		// Sweep through rows
			for (int j = 0; j <= (a[i].length - 1); j++) {		// Sweep through columns
				checkIndex = j;
				while ((equalsFind == false) && (checkIndex <= a[i].length - 1)) {		// While sum is not found and checking index is not out of bounds
					testingSum += a[i][checkIndex];
					numberElements += 1;
					if (testingSum == sumToFind) {		// If the working sum is found
						equalsFind = true;
						for (int k = j; k <= (j + numberElements - 1); k++) {
							b[i][k] = a[i][k];		// Replace elements in b with those in a
						}
					}
					checkIndex += 1;
				}
				testingSum = 0;		// Reset values
				numberElements = 0;
				equalsFind = false;
			}
		}
		return b;
	}
	
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[1].length];		// Create new array with same dimensions as a
		int testingSum = 0, numberElements = 0, checkIndex = 0;		// Same purposes as above
		boolean equalsFind = false;
		for (int j = 0; j <= (a[1].length - 1); j++) {		// Sweep through columns
			for (int i = 0; i <= (a.length - 1); i++) {		// Sweep through rows
				checkIndex = i;
				while ((equalsFind == false) && (checkIndex <= a.length - 1)) {		// While sum is not found and checking index is not out of bounds
					testingSum += a[checkIndex][j];
					numberElements += 1;
					if (testingSum == sumToFind) {		// If working sum is found
						equalsFind = true;
						for (int k = i; k <= (i + numberElements - 1); k++) {
							b[k][j] = a[k][j];		// Replace elements in b with those in a
						}
					}
					checkIndex += 1;
				}
				testingSum = 0;		// Reset values
				numberElements = 0;
				equalsFind = false;
			}
		}
		return b;
	}
	
}
