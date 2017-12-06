/*
* FindTheSums.java
* Author: Lydia Shealy
* Submission Date: 11/30/17
*
* Purpose: finds all numbers that add up to a certain 
* sum vertically and horizontally.
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
		String b = "joomFACE";
		String strArray = ""; 
		for(int i =0; i<a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				strArray += String.valueOf(a[i][j]); 
				//System.out.print(a[i][j]); 
				if (j+1<a[i].length){
					strArray += " "; 
					//System.out.print(" ");
				}
				else{
					
				}
			}
			if(i+1<a.length){
				strArray += "\n"; 
				//System.out.print(".\n");
			}
			//System.out.print("\n"); 
		}
		//System.out.print("\n");
		//System.out.print(strArray); 
		return strArray; 
	}
	
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int b[][] = new int[a.length][a[0].length];
		int sum = 0; 
		int numOfAdds = 1; 
		//steps through the rows
		for(int row = 0; row < a.length; row++){
			
			
			//steps through the columns
			for(int i = 0; i < a[row].length; i++){
				sum = a[row][i];
				numOfAdds = 1;
				for(int j = i + 1; j < a[row].length; j++, numOfAdds++){
					sum += a[row][j];
					if(sum == sumToFind){
						int start = j-numOfAdds; 
						int finish = j; 
						for(int k = start; k <= finish; k++){
							b[row][k] = a[row][k]; 
						}
						sum = 0; 
						numOfAdds = 0; 
					}
					else{
						
					}
				}
			}
				
		}
		return b; 
	}
	
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int b[][] = new int[a.length][a[0].length];
		int sum = 0; 
		int numOfAdds = 1; 
		
		
		//steps through the columns
		for(int column = 0; column < a[0].length; column++){
			
			
			//steps through the columns
			for(int i = 0; i < a.length; i++){
				sum = a[i][column];
				numOfAdds = 1;
				for(int j = i + 1; j < a.length; j++, numOfAdds++){
					sum += a[j][column];
					if(sum == sumToFind){
						int start = j-numOfAdds; 
						int finish = j; 
						for(int k = start; k <= finish; k++){
							b[k][column] = a[k][column]; 
						}
						sum = 0; 
						numOfAdds = 0; 
					}
					else{
						
					}
				}
			}
				
		}
		return b; 
	}
}
