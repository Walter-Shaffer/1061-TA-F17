
/** @formatter:off
* FindTheSums.java
* Author: John Hollowell
* Submission Date: 11/28/2017
*
* Purpose: A program to find the vertical and horizontal sums in a 2 dimensional
* array matching a given sum and displaying the resultant array.
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
* @formatter:on
*/

public class FindTheSums {

	/**
	 * @param a
	 *            A rectangular, 2D integer array
	 * @return a multi-line, string representation of the array
	 */
	public static String arrayToString(int[][] a) {

		String returnString = "";

		for (int[] row : a) {
			for (int num : row) {
				returnString += num + " ";
			}
			returnString = returnString.substring(0, returnString.length() - 1) + "\n";
		}

		return returnString.substring(0, returnString.length() - 1);
	}

	/**
	 * Creates an array matching the dimensions of [a] containing only series of
	 * numbers adding up to [sumToFind] horizontally
	 * 
	 * @param a
	 *            A rectangular, 2D integer array
	 * @param sumToFind
	 *            The value to match to the row sums
	 * @return
	 */
	public static int[][] horizontalSums(int[][] a, int sumToFind) {

		int[][] b = initIntArray(a);
		for (int i = 0; i < a.length; i++) {
			int[] row = a[i];
			for (int j = 0; j < row.length; j++) {

				int sum = 0;
				int loc = 0;

				// sum row until end or >= [sumToFind]
				for (loc = j; (loc < row.length) && (sum < sumToFind); loc++) {
					sum += row[loc];

				}
				// add summed numbers to returned array if the correct sum is reached
				if (sum == sumToFind) {

					for (int start = j; start < loc; start++) {

						b[i][start] = row[start];
					}
				}
			}
		}

		return b;

	}

	/**
	 * Creates an array matching the dimensions of [a] containing only series of
	 * numbers adding up to [sumToFind] vertically
	 * 
	 * @param a
	 *            A rectangular, 2D integer array
	 * @param sumToFind
	 *            The value to match to the column sums
	 * @return
	 */
	public static int[][] verticalSums(int[][] a, int sumToFind) {

		int[][] b = initIntArray(a);
		for (int j = 0; j < a[0].length; j++) {
			for (int i = 0; i < a.length; i++) {

				int sum = 0;
				int loc = 0;

				// sum column until end or >= [sumToFind]
				for (loc = i; (loc < a.length) && (sum < sumToFind); loc++) {
					sum += a[loc][j];

				}
				// add summed numbers to returned array if the correct sum is reached
				if (sum == sumToFind) {

					for (int start = i; start < loc; start++) {

						b[start][j] = a[start][j];
					}
				}
			}
		}

		return b;

	}


	/**
	 * @param m
	 *            The number of rows
	 * @param n
	 *            The number of columns
	 * @param initialValue
	 *            An optional value to initialize each element to (0 if omitted)
	 * @return an array of m by n filled with [initialValue] (or 0 if omitted).
	 */
	private static int[][] initIntArray(int m, int n, int... initialValue) {

		int init = 0;
		// set [init] variable to parameter (if present)
		if (initialValue.length > 0) init = initialValue[0];

		// Initialize all locations to the initial value
		int[][] array = new int[m][n];
		for (int[] row : array) {
			for (int i = 0; i < row.length; i++) {
				row[i] = init;
			}
		}

		return array;
	}

	/**
	 * @param a
	 *            An array to which the returned array size will match
	 * @param initialValue
	 *            An optional value to initialize each element to (0 if omitted)
	 * @return an array matching [a]'s size filled with [initialValue] (or 0 if
	 *         omitted).
	 */
	private static int[][] initIntArray(int[][] a, int... initialValue) {

		return initIntArray(a.length, a[0].length, initialValue);
	}
}
