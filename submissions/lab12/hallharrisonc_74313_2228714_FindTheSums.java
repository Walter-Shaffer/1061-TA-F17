/*                                                                                                                                                                                                                 
 * FindTheSums.java                                                                                                                                                                                          
 * Author: Harrison Hall                                                                                                                                                                                           
 * Submission Date: November 27, 2017                                                                                                                                                                              
 *                                                                                                                                                                                                                 
 * Purpose: Program returns array containing only integers adding to
 * the given sum. Can compute horizontally and vertically. 
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
		String returnString = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				returnString = returnString + a[i][j] + " ";
				if (j == a[0].length - 1){
					returnString = returnString.substring(0,returnString.length() - 1);
				}
			}
			if (i < a.length - 1){
				returnString = returnString + "\n";
			} else {
				//returnString = returnString.substring(0,returnString.length() - 1); //for testing
			}
		}
		return returnString;
	}
	
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[0].length]; //makes b size of a with 0's
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				b[i][j] = 0;
			}
		}
		
		for (int row = 0; row < a.length; row++) { //I switched from i's and j's to help me do program logic easier
			for (int column = 0; column < a[0].length; column++) {
				int currentSum = a[row][column];
				boolean notAbove = (currentSum <= sumToFind);
				if (currentSum == sumToFind) {
					b[row][column] = a[row][column];
				} else {
					for (int newColumn = column + 1; newColumn < a[0].length; newColumn++) {
						if (notAbove) {
							currentSum += a[row][newColumn];
						}
						notAbove = (currentSum <= sumToFind);
						if (currentSum == sumToFind) {
							for (int newnewColumn = column; newnewColumn <= newColumn; newnewColumn++) {
								b[row][newnewColumn] = a[row][newnewColumn];
							}
						}
					}
				}
			}
		}
		
		return b;
	}
	
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[0].length]; //makes b size of a with 0's
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				b[i][j] = 0;
			}
		}
		
		for (int column = 0; column < a[0].length; column++) { //I switched from i's and j's to help me do program logic easier
			for (int row = 0; row < a.length; row++) {
				int rowSum = a[row][column];
				boolean notAbove = (rowSum <= sumToFind);
				if (rowSum == sumToFind) {
					b[row][column] = a[row][column];
				} else {
					for (int newRow = row + 1; newRow < a.length; newRow++) {
						if (notAbove) {
							rowSum += a[newRow][column];
						}
						notAbove = (rowSum <= sumToFind);
						if (rowSum == sumToFind) {
							for (int newnewRow = row; newnewRow <= newRow; newnewRow++) {
								b[newnewRow][column] = a[newnewRow][column];
							}
						}
					}
				}
			}
		}
		
		return b;
	}
	
}
