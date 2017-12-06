/*
 * FindTheSums.java
 * Author: Andre Washington
 * 
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. 
 * I have neither received nor given inappropriate assistance. I have not copied
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
		String stringA = " ";
		for(int row = 0; row < a.length; row++){
			for (int column = 0; column < a[0].length; column++){
				stringA += a[row][column];
				
				if (column < a[0].length-1)
					stringA +=  " ";
			}
			if(row < a.length-1)
				stringA += "\n";
		}
		return stringA;
	}
	public static int [][] horizontalSums(int[][]a, int sumToFind){
		int[][]b = new int [a.length][a[0].length];
		for(int row = 0; row < a.length; row++){
			for(int column = 0 ; column < a[0].length; column++){
				int sum = 0;
				int temp;
				for (temp = column; temp < a[row].length && sum!= sumToFind; temp++){
						sum+=a[row][temp];}
				
				if(sum==sumToFind){
					for(int i = column; i < temp; i++){
						b[row][i]=a[row][i];
					}
				}
			}
		}
	}
	return b;
	
	
	public static int [][] verticalSUms(int[][] a, int sumToFind){
		int b [][] = new int[a.length][a[0].length];
		boolean check[][]= new boolean[a.length][a[0].length];
		
		for (int column = 0; column< a[0].length; column++){
			int row = 0; int look1 = 0; int sum = 0;
			while (row < a.length){
				if(sum<sumToFind){
					sum = sum+a[row][column];
					row++;
				}
				
				
				if (sum > sumToFind){
					look1++; row = look1;
					sum = 0;
				}
				
					if(sum == SumToFind){
						for(int n = look1; n < row; n++)
							check[n][column] = true;
						look1++; row = look1;
						sum = 0;
				}
			}
			for (int i = 0; i < a.length; i++){
				for(int j = 0; j < a.length; j++){
					if(check[i][j]){
						b[i][j] = a [i][j];}
					else
						b[i][j] = 0;
					}
				}
		
		}
		return b;
		
	}
	
	
}
