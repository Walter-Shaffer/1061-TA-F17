/*
* FindTheSums.java
* Author: Timothy Morse
* Submission Date: 28/11/2017
*
* Purpose: Finds sums in an array, horiontally or vertically.
* The sum is an input, meaning it can change from run to run.
* The phrasing on that is really janky, but I can't think of how else to explain it.
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

	//Converts the input array to a String
	public static String arrayToString(int[][] a){
		String toReturn = "";
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				toReturn+=a[i][j];
				if(j<a[i].length-1){
					toReturn+=" ";
				}
			}
			if(i<a.length-1){
				toReturn+="\n";
			}
		}
		return toReturn;
	}
	
	//Finds horizontal sums of value sumToFind in the input array
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[1].length];
		for(int i=0;i<a.length;i++){//for every array in the array
			for(int j=0;j<a[i].length;j++){//for every value in the current array
				int runningSum = a[i][j];//make a running sum
				for(int k =1;j+k<a[i].length;k++){//run forward horizontally
					runningSum+=a[i][j+k];
					if(runningSum==sumToFind){
						for(int l=0;l<k+1;l++){//adds values to the array
							b[i][j+l]=a[i][j+l];
						}
						k=a.length;
					}else if(runningSum>sumToFind){
						if(b[i][j]<1){
							b[i][j]=0;
						}
						k=a.length;
					}
				}
			}
		}
		return b;
	}
	
	//Finds vertical sums of value sumToFind in the input array
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[1].length];
		for(int i=0;i<a.length;i++){//for every array in the array
			for(int j=0;j<a[i].length;j++){//for every value in the current array
				int runningSum = a[i][j];//make a running sum
				for(int k =1;i+k<a.length;k++){//run forward horizontally
					runningSum+=a[i+k][j];
					if(runningSum==sumToFind){
						for(int l=0;l<k+1;l++){//adds values to the array
							b[i+l][j]=a[i+l][j];
						}
						k=a.length;
					}else if(runningSum>sumToFind){
						if(b[i][j]<1){
							b[i][j]=0;
						}
						k=a.length;
					}
				}
			}
		}
		return b;
	}

}
