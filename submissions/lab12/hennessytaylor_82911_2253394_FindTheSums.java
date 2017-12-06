
public class FindTheSums {
	/*
	* FindTheSums.java
	* Author: Taylor Hennessy
	* Submission Date: 12/1/2017
	*
	* Purpose: to find adjacent values that add up to a specified sum.
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
	
	//convert a two dimensional array into a string
	public static String arrayToString(int[][] a){
		//create a string variable to house the converted array
		String arrayString = "";
		
		//shove the array values into the string using a nested loop
		//rows
		for (int i = 0; i < a.length; i++){
			//columns
			for (int j = 0; j < a[i].length; j++){
				arrayString = arrayString + a[i][j];
				//if you're on the last column, don't add the space
				if (j != (a[i].length - 1)){
					arrayString = arrayString + " ";
				}
			}
			//if you're on the last row, don't add the newline
			if (i != a.length - 1){
				arrayString = arrayString + "\n";
			}
		}
		
		//return the new string
		return arrayString;
	}
	
	//determine which numbers have a horizontal sum equivalent to that passed to the method
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		//create an array to hold the answer
		int[][] horizontalSums = new int[a.length][a[0].length];
		//initialize the sum being found to false
		boolean sumFound = false;
		//initialize the summation variable "checksum" to 0
		int checkSum = 0;
		
		//make an array of the same size and length, but full of zeroes
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				horizontalSums[i][j] = 0;
			}
		}

		//ROW IS i
		//COLUMN IS j
		//loops down to the next row
		for (int i = 0; i < a.length; i++)
		{
			//loops over to the next column
			for (int j = 0; j < a[i].length; j++){
				//loops inside the row, changing what set the sum is being checked on
				for(int k = 0; k < a[i].length; k++)
				{
					checkSum = 0;
					sumFound = false;
					//check the sum
					for (int l = k; l < a[i].length && !(sumFound); l++)
					{
						checkSum += a[i][l];
						//if at any point the current sum is the sum
						//needing to be found, change sumFound to true
						if (checkSum == sumToFind)
						{
							sumFound = true;
							//loop the sum numbers into the zero array
							for (int m = k; m <= l; m++){
								horizontalSums[i][m] = a[i][m];
							}
						}
					}
				}
			}
		}
		

		return horizontalSums;
	}
	
	public static int[][] verticalSums(int[][] a, int sumToFind){
		//create an array to hold the answer
		int[][] verticalSums = new int[a.length][a[0].length];
		//initialize the sum being found to false
		boolean sumFound = false;
		//initialize the summation variable "checksum" to 0
		int checkSum = 0;
		
		//make an array of the same size and length, but full of zeroes
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				verticalSums[i][j] = 0;
			}
		}

		//ROW IS j
		//COLUMN IS  i
		//loops over to the next column
		for (int i = 0; i < a[0].length; i++)
		{
			//loops down to the next row
			for (int j = 0; j < a.length; j++){
				//loops inside the column, changing what set the sum is being checked on
				for(int k = 0; k < a.length; k++)
				{
					checkSum = 0;
					sumFound = false;
					//checks the sum vertically
					for (int l = k; l < a.length && !(sumFound); l++)
					{
						checkSum += a[l][i];
						//if at any point the current sum is the sum
						//needing to be found, change sumFound to true
						if (checkSum == sumToFind)
						{
							sumFound = true;
							//loop the sum numbers into the zero array
							for (int m = k; m <= l; m++){
								verticalSums[m][i] = a[m][i];
							}
						}
					}
				}
			}
		}
		
		return verticalSums;
	}

}
