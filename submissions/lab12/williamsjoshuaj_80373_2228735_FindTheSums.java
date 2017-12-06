/*
* FindTheSums.java
* Author: Joshua Williams
* Submission Date: 
*
* Purpose: This program has multiple functions that are used to compute horizontal and vertical
* sums of two dimensional arrays.
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
	public static String arrayToString(int[][] a){
		String returnString = "";
		for(int i = 0; i<a.length;i++){
			for(int j = 0; j<a[0].length;j++){
				returnString += a[i][j];
				if(j<a[0].length-1){
				returnString += " ";
				}
			}
			if(i<a.length-1){
			returnString += "\n";
			}
		}
		return returnString;
	}
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[0].length];
		for(int i = 0; i< b.length; i++){
			for(int j = 0; j< b[0].length; j++){
				int sum = 0;
				int numbersAdded = 0;
				int counter = 0;
				while(sum < sumToFind && j+counter<b[0].length){
					sum += a[i][j+counter];
					counter+=1;
					numbersAdded+=1;
				}
				if(sum == sumToFind){
					for(int k = 0; k<numbersAdded; k++){
					b[i][j+k] = a[i][j+k];
					}
				}
			}
		}
		return b;
	}
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[0].length];
		for(int i = 0; i< b.length; i++){
			for(int j = 0; j< b[0].length; j++){
				int sum = 0;
				int numbersAdded = 0;
				int counter = 0;
				while(sum < sumToFind && i+counter<b.length){
					sum += a[i+counter][j];
					counter+=1;
					numbersAdded+=1;
				}
				if(sum == sumToFind){
					for(int k = 0; k<numbersAdded; k++){
					b[i+k][j] = a[i+k][j];
					}
				}
			}
		}
		return b;
	}
}
