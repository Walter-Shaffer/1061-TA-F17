/*
* FindTheSums.java
* Author:  Alejandro Pardo
* Submission Date:  December 1
* Purpose: This program prints out a 2D Array and searches horizontally and vertically for the sum of the desired number
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

	public static String arrayToString(int[][] a) {
		String arrayString = "";
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[0].length; column++) {
				arrayString += a[row][column] + " ";
			}
			arrayString = arrayString.substring(0, arrayString.length() - 1);
			arrayString += "\n";
		}
		return arrayString.substring(0, arrayString.length() - 1);
	}

	public static int[][] horizontalSums(int[][] a, int sumtoFind) {
		int sum=0;
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[0].length; column++) {
			
			}
		}return a;

	}

	public static int[][] verticalSums(int[][] a, int sumToFind) {
		int sum=0;
		int[][] b = new int[a.length][a[0].length];
		int total = 0;
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[0].length; column++) {
			if(total < sumToFind){
			}
		}

	}return a;

	}}
