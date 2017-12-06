/*
* FindTheSums.java
* Author: Michael Grimsley
* Submission Date: 12/1/2017
*
* Purpose: This progarm has 3 methods. One that changes a 2D array to a readable string
* and 2 that search horizontally and vertiacally through
* the 2D array for sums of a user specified value.
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

	
	//Changes array to  readable string
	public static String arrayToString(int[][] a){
		String str = ""; //empty string to be filled with values of the 2d array
		for (int i = 0; i < a.length; i++){ //for loop for rows
			
			//adds a new line if its not the first loop  
			if(i > 0)
			str += "\n";
			//for loop for columns
			for (int j = 0; j < a[0].length; j++){ 
			//adds the int to end of the string
			str += String.valueOf(a[i][j]);
			//adds space after value if and only if
			//it isn't the last int in a row
			if (j < ((a[0].length)-1)){
				str += " ";
			}
			}
			
		}
		//returns the string trimed of blanks 
		return str.trim();
	}
	//method searching horizontal values for sums of a specified value "sumToFind"
	public static int [][] horizontalSums(int[][] a, int sumToFind){
		//temp variable that holds a value from the 2d array
		int temp; 
		//empty array of zeros the same size as the input array
		int [][] b = new int[a.length][a[0].length];
		
		//for loop for rows
		for (int i = 0; i < a.length; i++){
			
			//for loop for columns
			for (int j = 0; j < a[i].length; j++){
				
				//temporary value set to what im checking "this" loop
				temp = a[i][j];
				
				//loop adding the temp value to the values
				//in front of it
				for (int k = 1; k < a[i].length; k++){
					
					//prevents index errors
					if (k+j < a[i].length){
						
						//adds temp value to values in
						//front of it one at a time
						temp = temp + a[i][j+k];
						
						//check each sum to see if it's
						//equal to sumToFind
						if (temp == sumToFind){
							
							//for loop to add a the index of 
							//accpted values to their coisponding spot
							//in array of zeros 'b'
							for (int q = 0; q <= k-j; q++){
								b[i][j+q]=a[i][j+q];
							}
						}
					}
					
				}
			}
		}
		//return b
		return b; 	
	}
	//the same as horizontalSums method but with rows and columns switched in for loops and indexs
	//so that it searches in reverse order. 
	public static int [][] verticalSums(int[][] a, int sumToFind){
		int temp; //temp variable that holds a value from the 2d array
		int [][] b = new int[a.length][a[0].length];
		
		for (int i = 0; i < a[0].length; i++){
			for (int j = 0; j < a.length; j++){
				temp = a[j][i];
				for (int k = 1; k < a.length; k++){
					if (k+j < a.length){
						temp = temp + a[j+k][i];
						if (temp == sumToFind){
							for (int q = 0; q <= k-j; q++){
								b[j+q][i]=a[j+q][i];
							}
						}
					}
					
				}
			}
		}
		return b;
	}
}
