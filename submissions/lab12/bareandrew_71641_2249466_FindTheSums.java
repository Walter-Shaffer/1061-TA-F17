/*
* FindTheSums.java
* Author: Andrew Bare
* Submission Date: 12/1/17
*
* Purpose: 
* 
* This Class contains methods that find the given sum to search for
* that occur in subsequent rows and columns of given 2 dimensional arrays
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
	
	public static String arrayToString (int[][] a){
		
		String toPrint="";
		
		//loop that fills each row
		for (int i = 0; i<a.length; i++){
			
			//loop for each column and prints everything
			for (int j = 0; j<a[i].length; j++){
				
				
				toPrint =toPrint.concat(Integer.toString(a[i][j]));
				
				
//				System.out.println(toPrint);
//				System.out.println(j +"\n");
				//make sure no extra spaces on ends of row
				if (j!=a[i].length-1){
					toPrint =toPrint.concat(" ");
				}
				else{
//					System.out.println(a.length-1 +" This is a.Length");
					if (i!= a.length-1)
						toPrint =toPrint.concat("\n");
				}
				//System.out.print(toPrint);
			}
			
		}
		//System.out.print("here");
		return toPrint;
	}
	
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[0].length];	//MIGHT NEED TO CHECK NULLS
		
		//loop to check in each row
		for (int i = 0; i<a.length; i++){			
			
			//loop to check in each column
			for (int j = 0; j<a[i].length; j++){
				
				int sum = 0;
				int count = j;
				//loop to check each number's subsequent numbers and see if they add to sum
				while (sum!=sumToFind && count<a[i].length){
					sum+=a[i][count];
					
//					System.out.println("count: " +count);
//					System.out.println("Sum: " + sum);
					
					count++;
					
					
					
					if(sum==sumToFind){
						b[i][j] = a[i][j];
						//System.out.println("FOUND ONE");
						
						//loop back to add all the parts of the sum into b
						for (int k = count-1; k>j;k--){
							b[i][k] = a[i][k];
						}
					}
				}
			}
		}
		return b;
	}
	
	//For each number i want to add every subsequent number, with a loop that goes
	//until the number is exact or exceeds, then moving on to the next number
	
	
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[0].length];	//MIGHT NEED TO CHECK NULLS
		
		//loop to check in each column
		for (int i = 0; i<a[0].length; i++){			
			
			//loop to check in each row
			for (int j = 0; j<a.length; j++){
				
				int sum = 0;
				int count = j;
				//loop to check each number's subsequent numbers and see if they add to sum
				while (sum!=sumToFind && count<a.length){
					sum+=a[count][i];
//					System.out.println("\nAdded " +a[count][i]);
//					System.out.println("i: " +i);
//					System.out.println("count: " +count);
//					System.out.println("Sum: " + sum);
					
					count++;
					
					
					
					if(sum==sumToFind){
						b[j][i] = a[j][i];
//						System.out.println("FOUND ONE AT " + i + " "+ j + " "+ count);
						
						//loop back to add all the parts of the sum into b
						for (int k = count-1; k>j;k--){
							b[k][i] = a[k][i];
						}
					}
				}
			}
		}
		return b;
	}
	

}
