/*
* FindTheSums.java
* Author: Heather Wright
* Submission Date: December 1, 2017
*
* Purpose: This program has three methods that are invoked
* in the FindTheSumsTester class. The arrayToString method
* prints out the array in an organized fashion. The 
* horizontalSums method reads through the array horizontally
* and checks to see if a string of numbers sums to the input
* number. It returns an array that replaces the numbers that
* dont sum to the number with 0s.The verticalSums does the 
* same thing except its checks the sums vertically as opposed
* to horizontally. 
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
		String array = "";
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				array += a[i][j];
				if(j < a[0].length - 1){
					array += " ";
				}
			}
			if(i < a.length - 1) {
				array += "\n";
			}
		}
		return array;
	}
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int[][] copy = new int[a.length][a[0].length]; 
		boolean[][] b = new boolean[a.length][a[0].length]; 
		for(int k = 0; k < copy.length; k++) {
			for(int f = 0; f < copy[0].length; f++) {
				copy[k][f] = a[k][f];
			}
		}
		for(int o = 0; o < b.length; o++) {
			for(int r = 0; r < b[0].length; r++) {
				b[o][r] = false;
			}
		}
		int sum = 0; 
		for(int i = 0; i < copy.length; i++) {
			for(int j = 0; j < copy[0].length; j++) {
				int increment = j;
				sum = copy[i][j];
				int flag = j + 1;
				while(sum < sumToFind ) {
					if(flag < copy[0].length) {
						sum += copy[i][flag];
						flag++;
					}
					else {
						sum = sumToFind + 1;
					}
				}
				if(sum == sumToFind) {
					while(increment < flag) {
						b[i][increment] = true;
						increment++;
					}
				}
			}
		}
		for(int q = 0; q < copy.length; q++) {
			for(int c = 0; c < copy[0].length; c++) {
				if(b[q][c] == false) {
					copy[q][c] = 0;
				}
			}
		}
		return copy;
	}
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int[][] copy = new int[a.length][a[0].length]; 
		boolean[][] b = new boolean[a.length][a[0].length]; 
		for(int k = 0; k < copy.length; k++) {
			for(int f = 0; f < copy[0].length; f++) {
				copy[k][f] = a[k][f];
			}
		}
		for(int o = 0; o < b.length; o++) {
			for(int r = 0; r < b[0].length; r++) {
				b[o][r] = false;
			}
		}
		int sum = 0;
		for(int i = 0; i < copy[0].length; i++) {
			for(int j = 0; j < copy.length; j++) {
				int increment = j;
				sum = copy[j][i];
				int flag = j + 1;
				while(sum < sumToFind) {
					if(flag < copy.length) {
						sum += copy[flag][i];
						flag++;
					}
					else {
						sum = sumToFind + 1;
					}
				}
				if(sum == sumToFind) {
					while(increment < flag) {
						b[increment][i] = true;
						increment++;
					}
				}
			}
			
		}
		for(int q = 0; q < copy[0].length; q++) {
			for(int c = 0; c < copy.length; c++) {
				if(b[c][q] == false) {
					copy[c][q] = 0;
				}
			}
		}
		return copy;
	}
}
