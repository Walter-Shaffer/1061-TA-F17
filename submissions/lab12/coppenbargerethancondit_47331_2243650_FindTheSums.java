/**
* FindTheSums.java
* Author: Ethan Coppenbarger
* Submission Date: 11/14/2017
*
* Purpose: Search through an array to find numbers that add up to a sum
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
		char[] chara = new char[(a.length * a[0].length) * 2 - 1];
		int counter = 0;
		for(int i = 0; i < a.length; i++) {
			for(int f = 0; f < a[i].length; f++) {
				chara[counter] = (char)(a[i][f] + '0');
				if(counter < a.length*a[0].length*2-2) {
					chara[counter+1] = ' ';
				}
				counter += 2;
			}
			if(counter < a.length * a[0].length * 2) {
				chara[counter-1] = '\n';
			}
		}
		String outString = new String(chara);
		return outString;
	}
	
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];							//output array
		int tracker = 0;													//add numbers to this until you reach sumToFind
		int num = 0;														//keep track of how many nums you've added to tracker
		
		for(int i = 0; i < a.length; i++) {									//fill output with zeroes
			for(int j = 0; j < a[i].length; j++) {
				b[i][j] = 0;
			}
		}
		
		for(int i = 0; i < a.length; i++) {									//loop through array
			for(int j = 0; j < a[i].length; j++) {							//"			
				for(int f = j; f < a[i].length; f++) {						//add numbers to tracker for every number you are on
					tracker += a[i][f];										//add numbers to tracker
					num += 1;												//count numbers added
					if(tracker == sumToFind) {
						b[i][j] = a[i][j];									//set the number in the output array equal to the num in input					
						for(;num > 0; num--) {								//subtract 1 from num each time
							b[i][j+num-1] = a[i][j+num-1];					//set values in b equal to values in a that add to sumToFind and are not the first value
						}
						tracker = 0;
						num = 0;
					}
				}
				tracker = 0;												//reset counters if not already
				num = 0;
			}
		}
		return b;
	}
	
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];							//output array
		int tracker = 0;													//add numbers to this until you reach sumToFind
		int num = 0;														//keep track of how many nums you've added to tracker
		
		for(int i = 0; i < a.length; i++) {									//fill output with zeroes
			for(int j = 0; j < a[i].length; j++) {
				b[i][j] = 0;
			}
		}
		
		for(int i = 0; i < a[0].length; i++) {									//loop through array
			for(int j = 0; j < a.length; j++) {							//"			
				for(int f = j; f < a.length; f++) {						//add numbers to tracker for every number you are on
					tracker += a[f][i];										//add numbers to tracker
					num += 1;												//count numbers added
					if(tracker == sumToFind) {
						b[j][i] = a[j][i];									//set the number in the output array equal to the num in input					
						if(i+num-1<a.length) {
							for(;num > 0; num--) {							//subtract 1 from num each time
								b[j][i+num-1] = a[j][i+num-1];				//set values in b equal to values in a that add to sumToFind and are not the first value
							}
						}
						tracker = 0;
						num = 0;
					}
				}
				tracker = 0;												//reset counters if not already
				num = 0;
			}
		}
		return b;
	}
	

}
