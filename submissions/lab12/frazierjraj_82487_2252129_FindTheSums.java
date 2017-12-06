/*
* [FindTheSums].java
* Author: [Anthony Frazier]
* Submission Date: [12/1/2017]
*
* Purpose: This program receives arrays and can print them out, or can search through them
* vertically or horizontally for a given number that it receives.
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
	String lol = "";
	for (int row = 0; row<a.length;row++){
		for(int column = 0; column <a[row].length; column++){
			if(column < a[row].length-1){
			lol = lol + a[row][column] + " ";
			}
			else{
				lol = lol +a[row][column];
			}
		}
		if(row< a.length-1){
			lol = lol +"\n";
	}
	}
	return lol;
	}
	public static int[][] verticalSums(int [][] a, int sumToFind){
		int total = 0;
		int [][] b = new int [a.length][a[0].length];
		for (int row = 0; row<a.length;row++){
			for(int column = 0; column <a[row].length; column++){
			b[row][column] = 0;	
			}
		}
		for (int row = 0; row<a.length;row++){
			for(int column = 0; column <a[row].length; column++){
				int sum = 0;
				for(int i = row; i<a.length;i++){
					sum += a[i][column];
					//System.out.println(sum);
					if(sum == sumToFind){
						for(int j =row; j<=i;j++){
							b[j][column]=a[j][column];
						}
						
					}
				}
			}
		}
		return b;
		
	}
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int total = 0;
		int [][] b = new int [a.length][a[0].length];
		for (int row = 0; row<a.length;row++){
			for(int column = 0; column <a[row].length; column++){
			b[row][column] = 0;	
			}
		}
		
		for (int row = 0; row<a.length;row++){
			for(int column = 0; column <a[row].length; column++){
				int sum = 0;
				for(int i = column; i<a[row].length;i++){
					sum += a[row][i];
					//System.out.println(sum);
					if(sum == sumToFind){
						for(int j =column; j<=i;j++){
							b[row][j]=a[row][j];
						}
						
					}
				}
			}
		}
		return b;
	}
	
	public static void main(String[] args) {
		int [][] test ={
				{1,8,0,3},
				{8,3,1,8},
		};
		System.out.print(arrayToString(test));
		//System.out.println(arrayToString((horizontalSums(test, 9))));
		//System.out.println(arrayToString((verticalSums(test, 9))));

	}
}