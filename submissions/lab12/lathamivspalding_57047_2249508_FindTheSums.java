/*
* [FindTheSums].java
* Author: [Spalding Latham]
* Submission Date: [12/01/2017]
*
* Purpose: This program searches through a 2d int array and prints the horizontal and vertical sums.
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
*/public class FindTheSums {
	
	//method to convert a 2d array into an organized rectangle
	public static String arrayToString(int[][] a){	
	
	String intString = "";
	for(int i = 0; i < a.length; i++){
		for(int j = 0; j < a[i].length; j++){
		
			if (j != 0){
				intString += " ";
			}
			intString += a[i][j];
		}
		
		
	//prevents the newline under the last column
	if(a[i] != a[a.length - 1]){
		intString += "\n";
		}
	}
	
	return intString;
}
	
	
	
	//method to find the horizontal adjacent values that sum up to the sumToFind
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
	    
		//new int[][] to store the horizontal sums
		int[][] b = new int[a.length][a[0].length];
	    
		int column = 0;
	    
		//outermost while loop that loops through the columns
		while (column < a[0].length) {
	        //for loop that loops through the rows
			for (int row = 0; row < a.length; row++) {
	           
				int sum = 0;
	            
	            //loop to update the sum when less than sumToFind
	            for (int j = column; j < a[row].length; j++) {
	                sum += a[row][j];
	                
	                //when the sum is equal to the sumToFind, it runs through a loop to update b[][]
	                if (sum == sumToFind){
	                	for(int i = column; i <= j; i++){
	                    b[row][i] = a[row][i];
	                	}
	                }
	            }

	        }
	        column++;
	    }
	    return b;
	}
		
				
			
	public static int[][] verticalSums(int[][] a, int sumToFind){
		//new int[][] to store the horizontal sums, initialized to all values equal 0
		int[][] b = new int[a.length][a[0].length];
	
		
			    
		int column = 0;
		int row = 0;
			    
		    //outermost while loop that loops through the rows
			while (row < a.length) {
			    //for loop that loops through the columns
				for (column = 0; column < a[0].length; column++) {
			           
			    int sum = 0;
			            
			        //loop to update the sum when less than sumToFind
			        for (int j = row; j < a.length; j++) {
			        sum += a[j][column];
			               
			        //when the sum is equal to the sumToFind, it runs through a loop to update b[][]
		            if (sum == sumToFind){
			            for(int i = row; i <= j; i++){
			            b[i][column] = a[i][column];
			            }
			    }
		}

			    }
	 row++;
	}
	 return b;
  }
						
		

		
		
	
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
		 
	
}

