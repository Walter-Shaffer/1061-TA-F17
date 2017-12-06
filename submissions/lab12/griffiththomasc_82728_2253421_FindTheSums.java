
/*
* [FindTheSums].java
* Author: [Thomas Griffith]
* Submission Date: [December, 1 2017]
*
* Purpose: The purpose of the FindTheSums is to find the sums of an integer array both horizontaly and vertically when the sum adds up to a certian number  then the rest are zero 
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

	
	public static String arrayToString(int [][] a){
		String A = "";
		//i is row     j is column
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				A = A + a[i][j];
				if (j < a[0].length -1)
					A += " ";
					}
					if (i < a.length-1)
						A += ( "\n");
						
			}
			

	
		return A;
	}
	
	public static int[][]  horizantalSums(int[][] a , int sumToFind){
		
		int[][] sOutput2 = new int[a.length][a[0].length];
		
		for(int everyRow = 0; everyRow < a.length; everyRow++){
			int total = 0;
		
			for (int i = 0; i < a[everyRow].length; i++) {
				 total = 0;
				 int end = 0;
			
				for (int rowplace = i; rowplace < a[everyRow].length; rowplace++) {
					
					total = total + a[everyRow][rowplace];
					
					if (total > sumToFind ){
						end = rowplace;
					
						rowplace = a[everyRow].length;
						total = 0;
					}
				  if (total == sumToFind ){
					  for (int addingToOutput = i; addingToOutput < rowplace + 1; addingToOutput++) {
							sOutput2[everyRow][addingToOutput] = a[everyRow][addingToOutput];
							
						}
		
					end = rowplace;
					
					rowplace = a[everyRow].length;
					total = 0;
				}
					
					
					
					
					
				}
			
				total = 0;
				
			}
			
	}
			
		return sOutput2;
		
	}
	
	public static int[][] verticalSums(int[][] a , int sumToFind){
int[][] sOutput2 = new int[a.length][a[0].length];
		//rows
		for(int everyRow = 0; everyRow < a[0].length; everyRow++){
			int total = 0;
		
			for (int i = 0; i < a.length; i++) {
				 total = 0;
				 int end = 0;
			//columns
				for (int rowplace = i; rowplace < a.length; rowplace++) {
					
					total = total + a[rowplace][everyRow];
					
					if (total > sumToFind ){
						end = rowplace;
					
						rowplace = a.length;
						total = 0;
					}
				  if (total == sumToFind ){
					  for (int addingToOutput = i; addingToOutput < rowplace + 1; addingToOutput++) {
							sOutput2[addingToOutput][everyRow] = a[addingToOutput][everyRow];
							
						}
		
					end = rowplace;
					
					rowplace = a[rowplace].length;
					total = 0;
				}
					
					
					
					
					
				}
			
				total = 0;
				
			}
			
	}
			
		return sOutput2;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
