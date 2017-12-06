/*
* FindTheSums.java
* Author: Jack Maggard
* Submission Date: 11/31/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* This program takes 2-dimensional arrays and finds
* the sequences of integers where the sum is the 
* desired sum.
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
	public static String arrayToString(int[][] a) {//converts 2 dimensional array to readable string
		String output = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				output = output + a[i][j];//adding array values to string
				if (j < a[0].length - 1)//formatting the spaces
					output = output + " ";
			}
			if (i < a.length - 1)//formatting the next lines
				output = output + "\n";
		}

		return output;
	}

	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				b[i][j] = 0;
		int k = 0;
		for (int i = 0; i < b.length; i++) {//loop rows
			k = 0;
			for (int j = 0; j < b[0].length; j++) {//loop columns
				k = 0;
				for (int z = j; z < b[0].length; z++) {
					k += a[i][z];
					if (k == sumToFind) {//all values are 0 unless they add up to desired sum
						for (int index = j; index <= z; index++)
							b[i][index] = a[i][index];//change values to array a values
					}
				}

			}
		}
		return b;
	}

	public static int[][] verticalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				b[i][j] = 0;
		for (int i = 0; i < a.length; i++) {//loop for rows
			for (int j = 0; j < a[0].length; j++) {//loop for columns
				int k = 0;
				for (int z = i; z < a.length; z++) {
					k += a[z][j];
					if (k == sumToFind) {//all values are 0 unless they add up to desired sum
						for (int index = i; index <= z; index++)
							b[index][j] = a[index][j];//change values to array a values
					}
				}

			}
		}
		return b;
	}

}
