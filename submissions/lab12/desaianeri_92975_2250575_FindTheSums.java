/*		
 * [LetterFrequencies].java 		
 * Author: [Aneri Desai]		
 * Submission Date: [12/01/2017]		
 * 		
 * Purpose: In the lab we learned how to do the 2d array and had to lot a lot of critical analysis.  		
 * 		
 *  Statement of Academic Honesty:		
 *  		
 *  The following code represent my own work. I have neither received nor given inappropriate assistance. 		
 *  I have not copied or modified code from any source other than the course webpage or the course textbook.		
 *  I recognize that any unauthorized assistance or plagiarism will be handled in accordance with the policies		
 *  at Clemson University and the policies of this course. I recognize that my work is based on an assignment 		
 *  created by the School of Computing at Clemson Univeristy. Any publishing or posting of source code for this 		
 *  project is strictly prohibited unless you have written consent from the instructor.  		
 */		
public class FindTheSums {

	public static String arrayToString(int[][] a) {

		String string = "";  

		for (int i = 0; i < a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(j>0)
					string = string + " "+ a[i][j];//for numbers greater thn 0 it will add them in a string with space
				else 
					string = string + a[i][j];//do not add space after the last number or first number
			}
			if(i<a.length-1)
				string += "\n";//to get it into new line
		}
		return string;

	}
	public static int[][] horizontalSums(int [][] a, int sumToFind){
		int[][]b =  new int[a.length][a[0].length];
		
		for(int i =0; i<a.length;i++) { //row loop
			int q = 0;
			
			for(int j = 0; j<a[0].length;j++){ //column loop
				int sum = 0;
				int[] row = new int[a[0].length]; //new array to store values
				
				for(int column=q; column<a[0].length; column++) { //to get the sum at each index
					sum = sum+a[i][column];
					
					if(sum<= sumToFind) {
						row[column] = a[i][column]; //storing values into row
					}
					
					if(sum == sumToFind) { 
						for(int p=column; p>-1; p--) {
							if(b[i][p]==0) {
								b[i][p] = row[p];//storing row values into column
							}
						}
					}else if(sum>sumToFind) {
						b[i][column] = 0;
						break;
					}
					
				}
				q +=1; 
			}
		}
		return b;
	}
				

public static int[][] verticalSums(int[][] a, int sumToFind){
	int[][]b =  new int[a.length][a[0].length];
	
	for(int j = 0; j<a[0].length;j++){ //column loop
		int q = 0;
		for(int i =0; i<a.length;i++) { //row loop
			
				int sum = 0;
				int[] col = new int[a.length]; //new array to store values
				
				for(int column=q; column<a.length; column++) { //to get the sum at each index
					sum = sum+a[column][j];
					
					if(sum<= sumToFind) {
						col[column] = a[column][j]; //storing values into row
					}
					
					if(sum == sumToFind) {
						for(int p=column; p>-1; p--) {
							if(b[p][j]==0) {
								b[p][j] = col[p];//storing row values into column
							}
						
						//break;
						}
					}else if(sum>sumToFind) {
						b[column][j] = 0;
						break;
					}
					//}
				}
				q +=1; 
			}
		}
		return b;
	}
}

