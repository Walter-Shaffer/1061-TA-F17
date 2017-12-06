/*
 * FindTheSums.java
 * Author: Christopher Hicks
 * Submission Date 11/28/2017
 * 
 * Purpose: To create a 2D array and practice problem solving skills.
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
public class FindTheSums {//start of class body
	public static String arrayToString(int[][] a) {//Array to string body
		String array = "";// space holder for string- what will be returned
		for(int b = 0; b < a.length; b++){//loop start
			for(int c = 0;c < a[b].length;c++){// loop checking for white space
				array += a[b][c];
				if (c != (a[b].length - 1))
					array += (" ");
			}// loop checking for white space end
			if(b != (a.length -1))//line break at \n 
				array += ("\n");
		}
		return array;// returns array
	}// end of String arrayToString
	public static int[][] horizontalSums(int[][] a, int sumToFind){// start of body
		int horizonSum = 0; // holds the users sum value to search for
		int index = 0;//value of index
		int columnCount = 0;//number of columns
		int[][] horizontalArray = new int[a.length][a[0].length];// pulls in the array a[][]
		for( int b = 0;b < a.length; b++){//Start of main loop
			index = 0;
			for (int c = 0;c < a[b].length; c++){//start of loop checking for size
				columnCount++;
				horizonSum = 0;
				for(int d = c;d < a[b].length; d++){//start of loop checking for sum
					horizonSum += a[b][d];
					if(horizonSum > sumToFind){//start of if block
						d = a[b].length;
						index++;
						columnCount = 0;
					}
					else if (horizonSum == sumToFind){
						for(int i= c; i <= d; i++)
							horizontalArray[b][i] = a[b][i];
						index++;
						columnCount = 0;
					}// end else if
					else
						;// end if block
				}// end for loop
				
			}// end for loop
		}// end main for loop
		return horizontalArray;
	}//end body
	public static int[][] verticalSums(int[][] a, int sumToFind) {// start of body
		int verticalSum = 0;//Vertical Sum
		int index = 0;// index value
		int columnCount = 0;// number of Columns
		int[][] verticalArray = new int[a.length][a[0].length];// Vertical array deep copy
		for( int b = 0;b < a.length; b++){// Start of main for loop
			index = 0;
			for (int c = 0;c < a.length; c++){// start of for loop checking for sum
				columnCount++;
				verticalSum = 0;
				for(int d = c;d < a.length; d++){// sum checking
					verticalSum += a[d][b];
					if(verticalSum > sumToFind){// start if block
						d = a.length;
						index++;
						columnCount = 0;
					}
					else if (verticalSum == sumToFind){
						for (int i = 0;i <= d; i++){
							verticalArray[i][b] = a[i][b];
						index++;
						columnCount =0;
						}
					}
					else 
						;//end if block
				}// end for loop
			}// end for loop
		}// end main for loop
		return verticalArray;
	}// end body
}// end of class
