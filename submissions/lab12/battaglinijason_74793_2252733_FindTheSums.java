/*
 * FindTheSums.java
 * Author: Jason Battaglini
 * Purpose: Given a sum to find, the program will loop through a given array
 * and find which values in the rows or columns add up to the sum.
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

public class FindTheSums{
	
//converts the given array into a readable string.
	public static String arrayToString (int[][] a){
		String toString = "";
		for (int r=0 ;r<a.length;r++) {
			for (int c=0;c<a[0].length;c++) {
				toString+=a[r][c];
					if (c<a[0].length-1)
					toString+=" ";
			}
					if (r<a.length-1)
					toString+="\n";
		}
		return toString;
	}
	//finds the numbers in the rows that add up to the sum to find
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int [][]b = new int[a.length][a[0].length] ;
		for (int r=0;r<a.length;r++) {
			for(int c=0;c<a[0].length;c++){
			int sum=0;
			//int temp=0;
			int temp;
			
			//int column=0;
			for (temp=c; temp<a[r].length && sum!=sumToFind;temp++){
				sum=sum+a[r][temp] ; 
			}
			if(sum==sumToFind){
				for (int i=c; i<temp;i++) {
					b[r][i]=a[r][i] ;
				}
			}
		}
		}
		return b ;
	}
	//find the numbers in the columns that add up to the sum to find
	
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int b[][]=new int[a.length][a[0].length];
		boolean verify[][]=new boolean[a.length][a[0].length];
		for (int c=0;c<a[0].length;c++){
			int r=0; 
			int confirm=0;
			int sum=0;
			while(r<a.length){
			
				if(sum<sumToFind){
					sum+=a[r][c];
					
					r++; 
				}
				if(sum>sumToFind){
					confirm++;
					r=confirm;
					sum=0; 
				}
				
				if (sum==sumToFind){
					for(int x=confirm;x<r;x++){
						verify[x][c] = true;
					confirm++;
					r=confirm;
					sum=0;
				}
					
			}
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a.length;j++){
					if (verify[i][j]){
						b[i][j]=a[i][j]; 
					}
					else 
						b[i][j]=0 ;
					
				}
			}
	
		
		
			}
			

}
		return b;
}
}
