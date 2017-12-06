//FindTheSums.java
//Author: Benjamin VonKeller
//Submission Date: 12/01/2017
//Purpose: this program takes a 2d array and searches for a specified sum from adjacent numbers.
//Statement of Academic Honesty:
//The following code represents my own work. I have neither
//received nor given inappropriate assistance. I have not copied
//or modified code from any source other than the course webpage
//or the course textbook. I recognize that any unauthorized
//assistance or plagiarism will be handled in accordance
//with the policies at Clemson University and the
//policies of this course. I recognize that my work is based
//on an assignment created by the School of Computing
//at Clemson University. Any publishing or posting
//of source code for this project is strictly prohibited
//unless you have written consent from the instructor.
public class FindTheSums {

	public static String arrayToString(int [][] a){
		String b = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				b = b + a[i][j] + " ";
			}
			b = b + "\n";
		}
		return b;
	}
	
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[0].length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[0].length; j++) {
				int l = j;
				k = 0;
				while (l < a[0].length) {
					k = k + a[i][l];
					if (k == sumToFind) {
						for (int m = j; m < l; m++) {
						b[i][m] = a[i][m];
						}
						l = a[0].length + 1;
					}
					else if (k > sumToFind) {
						for (int m = j; m < l; m++) {
							b[i][m] = 0;
						}
						l = a[0].length + 1;
					}
					l++;
					
				}
			}
		}
		return a;
		
	}
	
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		int k = 0;
		for (int i = 0; i < a[0].length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				int l = j;
				k = 0;
				while (l < a.length) {
					k = k + a[j][i];
					if (k == sumToFind) {
						l = a.length + 1;
						b[j][i] = a[j][i];
					}
					else if (k > sumToFind) {
						l = a.length + 1;
					}
					
				}
			}
		}
		return a;
		
	}
	
}
