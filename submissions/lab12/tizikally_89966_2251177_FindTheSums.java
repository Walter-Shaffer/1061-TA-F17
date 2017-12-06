/* FindTheSums.Java
 * Author: Allison Tizik
 * Submission Date: 12/1/17
 * Purpose: The program takes a double array that is inputed 
 * and returns sums and strings. the arrayToString takes the
 * double array of numbers and formats it to string by row 
 * and column. Printing it as a double array would look.
 * horizontalSums method takes a inputted sum and runs through
 * each row looking to see if any of the numbers in the array
 * from each row produce that sum. verticalSums does the same
 * thing excpet looks through the columns to see if any of the
 * numbers added together equal the inputted sum.
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

    //the method returns a string that is a neat 
    //representation of the values in a double array
    public static String arrayToString(int [][] a){ 
	    String arrayString = "";
	    int column;
	    int row;
	    for (row = 0; row < a.length; row++){
		for(column = 0; column < a[0].length; column++){
		    if (column == 0){
			arrayString = arrayString + a[row][column];
		    } else 
			arrayString = arrayString + " " + a[row][column];
		}
		if(row < a.length-1){
		    arrayString = arrayString + "\n";
		    // gives the space between row
		}
	    }
       
	    return arrayString;
	}

    // method runs through horizontally looking for sums equal to sumToFind
	public static int[][] horizontalSums(int [][] a, int sumToFind){
	    boolean[][] check = new boolean[a.length][a[0].length];
	    int[][] b = new int[a.length][a[0].length]; // new output array b
	    for (int i=0; i<=a.length-1; i++){//keeping row the same
		int start = 0;
		int j = 0;
		int sum = 0;
    //reset the sum for each row, or when sum is greater than sumToFind
		while(j<=a[0].length-1){ //running through columns
		    if(sum < sumToFind){
			sum = sum + a[i][j];
			j++;//increases column
		    }
		    if (sum> sumToFind){ //resets
			start++;
			j = start;
			sum = 0;
		    }
		    if (sum == sumToFind){
	      	//keeps numbers that make sum=sumToFind
			for(int k = start; k<j; k++)
			    check[i][k] = true;
			start++;
			j = start;
			sum = 0;
		    }
		}
	    }
	    // sets array to the new array with zeros and sums
	    for(int i = 0; i<a.length; i++){
		for(int j= 0;  j< a[0].length; j++){
		    if(check[i][j])
			b[i][j] = a[i][j];
		    else
			b[i][j]= 0;
		}
	    }
	    
	    return b;
	}
	
    //runs through vertically looking for when sum equals sumToFind 
	public static int[][] verticalSums(int [][] a, int sumToFind){
	    boolean[][] check = new boolean[a.length][a[0].length];
	    int[][] b = new int[a.length][a[0].length];
	    for (int j=0; j <=a[0].length-1; j++){//column
		int start = 0;
		int i = 0; //row
		int sum = 0;
     //reset the sum for each column, or when sum doesnt equal sumToFind
		while(i<=a.length-1){
		    if(sum < sumToFind){
			sum = sum + a[i][j];
			i++; // increases row
		    }
		    if (sum> sumToFind){
	     	//resets the sum, and increases row by 1 from start
			start++;
			i = start;
			sum = 0;
		    }
		    if (sum == sumToFind){
			//saves numbers for when sum equal to sumToFind
			for(int k = start; k<i; k++){
			    check[k][j] = true;
			}
			start++;
			i = start;
			sum = 0;
		    }
		}
	    }
	    //saves new array with zeros and sums
	    for(int i = 0; i<a.length; i++){
		for(int j= 0; j < a[0].length; j++){
		    if(check[i][j])
			b[i][j] = a[i][j];
		    else
			b[i][j]= 0;
		}
	    }
	    
	    return b;
	}


}
