/*
* CPSC-1060.java
* Author: Trip Bastian
* Submission Date: November 30, 2017
*
* Purpose: To find the series of numbers that add up to a given sum.
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
		String s = "";
		for(int i = 0;i<a.length;i++){
			for(int j = 0;j<a[i].length;j++){
				s += (a[i][j]);
				if(j<(a[i].length-1)){
					s += " ";
				}
			}
			if(i<(a.length-1)){
				s += "\n";
			}
		}
		return s;
	}
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int sum, destination = 0;
		boolean lessThanRequired;
		int[][] b = new int[a.length][a[0].length];   												
		for(int row = 0;row<a.length;row++){  		  												
			for(int firstDigit = 0;firstDigit<a[0].length;firstDigit++){							
				sum = 0;
				lessThanRequired = true;
				for(int secondDigit = firstDigit;secondDigit<a[0].length&&lessThanRequired==true;secondDigit++){	
					sum += a[row][secondDigit];
					if(sum==sumToFind){
						lessThanRequired = false;
						destination = secondDigit;
					}
					if(sum>sumToFind){
						lessThanRequired = false;
					}
				}
				if(lessThanRequired == false && sum==sumToFind){
					for(int i=firstDigit;i<=destination;i++){
						b[row][i]=a[row][i];
					}
				}
				destination = 0;
			}
		}
		return b;
	}
	public static int[][] verticalSums(int[][] a, int sumToFind){
		return switcheroo(horizontalSums(switcheroo(a), sumToFind));
	}
	public static int[][] switcheroo(int[][] a){
		int[][] b = new int[a[0].length][a.length];
		for(int i = 0;i <  a[0].length;i++){
			for(int j = 0;j < a.length;j++){
				b[i][j]=a[j][i];
			}
		}
		return b;
	}
}