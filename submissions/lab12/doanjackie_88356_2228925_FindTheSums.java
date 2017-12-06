/* 
 * FindTheSum.java 
 * Author:  Jackie Doan  
 * Submission Date:  11/28/17 
 * 
 * Purpose:
 * This program is used to find sums in a
 * 2D array and return new arrays that 
 * match the correct sum arrays
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
	//writes array to a certain string
	public static String arrayToString(int[][] a){
		String print = "";
		int x = getX(a);
		int y = getY(a);
		for (int i = 0; i < y; i++){
			for (int j = 0; j < x; j++){
				print += a[i][j];
				if (j != x-1){
					print += " ";
				}
			}
			if (i != y-1){
				print += "\n";
			}
		}
		return print;
	}
	//returns an array that has rows that
	//has continuous numbers that add up to
	//a specified sum
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int x = getX(a);
		int y = getY(a);
		int[][] sideSide = zeroArray(y, x);
		int sums;
		int count;
		for (int i = 0; i < y; i++){
			for(int j = 0; j < x; j++){
				sums = a[i][j];
				count = 0;
				for (int k = j + 1; k < x; k++){ 
					sums += a[i][k];
					count++;
					if (sums == sumToFind){
						for (int l = j; l <= j + count; l++){
							if (sideSide[i][l] == 0){
								sideSide[i][l] = a[i][l];
							}
						}
					}
				}
			}
		}
		return sideSide;
	}
	//returns an array that has columns that
	//has continuous numbers that add up to 
	//a specified sum
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int x = getX(a);
		int y = getY(a);
		int[][] topDown = zeroArray(y,x);
		int sums;
		int count;
		for (int i = 0; i < x; i++){
			for(int j = 0; j < y; j++){
				sums = a[j][i];
				count = 0;
				for (int k = j + 1; k < y; k++){ 
					sums += a[k][i];
					count++;
					if (sums == sumToFind){
						for (int l = j; l <= j + count; l++){
							if (topDown[l][i] == 0){
								topDown[l][i] = a[l][i];
							}
						}
					}
				}
			}
		}
		return topDown;
	}
	//Create a dummy array with the same
	//size as the original array in order
	//to get ready to insert the numbers
	//in specific locations depending on
	//use of horizontalSums or verticalSums
	public static int[][] zeroArray(int y, int x){
		int[][] zeroes = new int[y][x];
		for (int i = 0; i < y; i++){
			for(int j = 0; j < x; j++){
				zeroes[i][j] = 0;
			}
		}
		return zeroes;
	}
	//(was lazy) returns the amount of
	//rows there are in any given 2D array
	public static int getY(int[][] a){
		int y = a.length;
		return y;
	}
	//(was lazy) returns the amount of
	//columns there are in any given
	//2 dimensional array
	public static int getX(int[][] a){
		int x = a[0].length;
		return x;
	}
}
