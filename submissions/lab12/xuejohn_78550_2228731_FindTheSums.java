/*
 * FindTheSums.java
 * Author: John Xue
 * Submission Date: Nov. 28, 2017
 *
 * Purpose: Find all horizontally or vertically adjacent values in the
 * input array that equal a value and put them into a new output array,
 * and values that aren't in a horizontal sum equal to that value would
 * be set to zero in the output array.
 *
 * Statement of Academic Honesty:
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized assistance
 * or plagiarism will be handled in accordance with the policies at
 * Clemson University and the policies of this course. I recognize that my
 * work is based on an assignment created by the School of Computing at
 * Clemson University. Any publishing or posting of source code
 * for this project is strictly prohibited unless you have written
 * consent from the instructor.
 */

public class FindTheSums {
	// Return array a in a string format
	public static String arrayToString(int[][] a) {
		String output = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length - 1; j++) {
				output += a[i][j] + " ";
			}
			if (i == a.length - 1) {
				output += a[i][a[i].length - 1] + "";
			} else {
				output += a[i][a[i].length - 1] + "\n";
			}
		}
		return output;
	}
	
	// Return array that has values that sums to sumToFind horizontally
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[i][j] = 0;
			}
		}
		int gap = 1;
		while (gap <= a[0].length) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if (j + gap <= a[i].length) {
						int sum = 0;
						for (int k = j; k < j + gap; k++) {
							sum += a[i][k];
						}
						if (sum == sumToFind) {
							for (int k = j; k < j + gap; k++) {
								b[i][k] = a[i][k];
							}
						}
					}
				}
			}
			gap++;
		}
		return b;
	}

	// Return array that has values that sums to sumToFind vertically
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		// Switch rows and columns in array a
		int[][] a_new = new int[a[0].length][a.length];
		for (int j = 0; j < a[0].length; j++) {
			for (int i = 0; i < a.length; i++) {
				a_new[j][i] = a[i][j];
			}
		}
		// Use horizontalSums method to affect modified array a
		int[][] b_new = horizontalSums(a_new, sumToFind);
		// Switch array b to original position
		int[][] b = new int[b_new[0].length][b_new.length];
		for (int j = 0; j < b_new[0].length; j++) {
			for (int i = 0; i < b_new.length; i++) {
				b[j][i] = b_new[i][j];
			}
		}
		return b;
	}
}