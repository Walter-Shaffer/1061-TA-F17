/* 
*FindTheSums.java
*Author: Sean Meade
*Submission Date: 11/30
*Purpose: To search arrays for a certain sum, find horizontally
*or vertically adjacent values in the array that add up to that sum, 
*and converts arrays to a readable form. 
*
*Statement of Academic Honesty:
*The following code represents my own work. I have neither
*received nor given inappropriate assistance. I have not copied
*or modified code from any source other than the course webpage
*or the course textbook. I recognize that any unauthorized 
*assistance or plagiarism will be handled in accordance
*with policies at Clemson University and the
*policies of this course. I recognize that my work is based
*on an assignment created by the School of Computing
*at Clemson University. Any publishing or posting 
*of source code for this project is strictly prohibited 
*unless you have written consent from the instructor. 
*/
public class FindTheSums {

	public static String arrayToString(int[][] a){ //Converts arrays to a readable form. 
		String stringOfArray = ""; //Creates an empty String. 
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				stringOfArray += (a[i][j]);
				if( (j != (a[i].length - 1) ) ){
					stringOfArray += (" "); //Does not add a space after the last column. 
				}
			}
			if( (i != (a.length - 1) ) ){
				stringOfArray += ("\n"); //Does not add a new line after the last row. 
			}
		}
		return stringOfArray;
	}
	
	public static int[][] horizontalSums(int[][] a, int sumToFind){ //Searches arrays horizontally for a sum. 
		int[][] b = new int[a.length][a[0].length]; //Creates an array the same dimensions as a. 
		for(int i = 0; i < a.length; i++){ //Loops through the rows. 
			int limit = 0; //Sets a limit so that eliminated values won't get searched again. 
			for(int j = 0; j < a[i].length; j++){ //Loops through the columns. 
				int sumMade = 0; //Creates a value to fill. 
				for(int k = 0; ( ((j - k) >= limit) && (sumMade < sumToFind) ) ; k++){
					sumMade += a[i][j - k]; //Sums up a[i][j] and the values behind it. 
				}
				for(int k = 1; ( (sumMade < sumToFind) && ((j + k) < a[i].length) ) ; k++){
					sumMade += a[i][j + k]; //Sums up the values after a[i][j].
				}
				if(sumMade == sumToFind){ //Sets b[i][j] equal to a[i][j] other if the sum found is correct. 
					b[i][j] = a[i][j];
				}
				//Otherwise  b[i][j] is set to zero. 
				else if(sumMade > sumToFind){ 
					b[i][j] = 0;
					limit ++; //If the found value is larger than the correct one, it's possible the current value will interfere with the others, so the limit is increased. 
				}
				else{
					b[i][j] = 0;
				}
			}
		}
		return b; //Returns b. 
	}

	public static int[][] verticalSums(int[][] a, int sumToFind){ //Searches arrays vertically for a sum.
		int[][] b = new int[a.length][a[0].length]; //Creates an array the same dimensions as a. 
		for(int j = 0; j < a[0].length; j++){ //Loops through the columns.
			int limit = 0; //Sets a limit so that eliminated values won't get searched again.
				for(int i = 0; i < a.length; i++){ //Loops through the rows.
				int sumMade = 0; //Creates a value to fill.
				for(int k = 0; ( ((i - k) >= limit) && (sumMade < sumToFind) ) ; k++){
					sumMade += a[i - k][j]; //Sums up a[i][j] and the values above it. 
				}
				for(int k = 1; ( (sumMade < sumToFind) && ((i + k) < a.length) ) ; k++){ 
					sumMade += a[i + k][j]; //Sums up a[i][j] and the values below it. 
				}
				if(sumMade == sumToFind){  //Sets b[i][j] equal to a[i][j] other if the sum found is correct.
					b[i][j] = a[i][j];
				}
				//Otherwise  b[i][j] is set to zero.
				else if(sumMade > sumToFind){ //If the found value is larger than the correct one, it's possible the current value will interfere with the others, so the limit is increased. 
					b[i][j] = 0;
					limit ++; 
				}
				else{
						b[i][j] = 0;
				}
			}
		}
		return b; //Returns b. 
	}
}

