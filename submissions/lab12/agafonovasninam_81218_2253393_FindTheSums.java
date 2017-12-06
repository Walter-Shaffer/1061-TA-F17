/*
* FindTheSums.java
* Author:  Nina Agafonovas
* Submission Date:  December 1, 2017
* Purpose: Search a 2D array vertically and horizontally for sums.
* Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance
* with the policies at Clemson University and the
* policies of this course. I recognize that my work is based
* on an assignment created by the School of Computing
* at Clemson University. Any publishing or posting
* of source code for this project is strictly prohibited
* unless you have written consent from the instructor.
*/

	public class FindTheSums {
		
		
		//this methods returns a string representation of the values in array a.
	    public static String arrayToString(int[][] a)
	    

	    {
	        String tempString = "";
	        for(int row=0; row < a.length; row++)					//outer loop to run through the length of array a
	        {
	            for(int column = 0; column < a[0].length; column++) // inner loop to search 2nd dimension of array
	            {
	                tempString = tempString + a[row][column];
	               if(column < a[0].length-1)					// values in columns have a single space between them
	                  tempString = tempString + " ";			// starting after index 0 and not after the last index
	            }
	            if(row < a.length-1) 							// needed to make the array have it's 10x10 shape
	                tempString = tempString + "\n";	
	                											// Each row needs a newline character between
	        } 
	        
	        return tempString;
	    }
	    
	    
	    
	    //create condition where if the number itself equals sumtoFind assign it to 
	    
	    
	    public static int[][] horizontalSums(int[][] a,int sumToFind)
	    //this method will create a new output array called b that has the same dimensions as a.
	    {
	    	int[][] b = new int[a.length][a[0].length];
	    	int checkStart = 0;
	    	while (checkStart < a[0].length){	
	    		for (int row = 0; row < a.length; row++){		//outer loop that goes down the rows after checking each frame (column) 
	    			int goalSum = 0;							//goalSum goes back to zero once the sum in found (or not found)
	    			for (int column = checkStart; column < a[row].length; column++){	//moves through each frame in the row  column)
	    				goalSum = goalSum + a[row][column];					//add number at frame to the goalSum 
	    				if(goalSum == sumToFind){							//when the goal sum equals the sumToFind
	    					for (int i = checkStart; i <= column; i++){		//for loop 
	    					b[row][i] = a[row][i];					//copies the previous values from the array to the new array when the sum is found.
	    				}
	    			}}
	    		}
	    		checkStart++; // changes the new starting point for the next iteration
	    	}
	    	return b;
	     }
	  
	
	
	 public static int[][] verticalSums(int[][] a,int sumToFind)
	    //this method will create a new output array called b that has the same dimensions as a. 
	 	// ***Basically figure out how to swap x (row) and y(column) coordinates 
	 {
	    	int[][] b = new int[a.length][a[0].length];
	    	int checkStart = 0;
	    	while (checkStart < a[0].length){	
	    		for (int row = 0; row < a.length; row++){				//outer loop that goes down the column after checking each frame (column) 
	    			int goalSum = 0;									//goalSum goes back to zero once the sum in found (or not found)
	    			
	    			for (int column = checkStart; column < a.length; column++){	//swapped a[0]
	    				
	    				goalSum = goalSum + a[column][row];					//add number at frame to the goalSum 
	    				if(goalSum == sumToFind){							//when the goal sum equals the sumToFind
	    					for (int i = checkStart; i <= column; i++){		//for loop 
	    						
	    					b[i][row] = a[i][row];					//copies the previous values from the array to the new array when the sum is found.
	    															// and swap coordinates
	    					
	    					}
	    			}}
	    		}
	    		checkStart++; // changes the new starting point for the next iteration
	    	}
	    	return b;
	     }}
	
	
	
	
	
	
	
	
	
	