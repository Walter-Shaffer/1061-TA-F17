/* 
 * 
 * FindTheSums.java 
 * Author:  Paul Orecchia  
 * Submission Date:  11/28/17 
 * 
 * Purpose: The purpose of this program is to find the sum in a 2d array
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
		String arrayToString="";
		for (int row=0; row<a.length; row++){
			for(int column=0; column<a[row].length; column++){
				if (row==0){
					if(column==0){
						arrayToString=Integer.toString(a[row][column]);
					}else{
						arrayToString=arrayToString+" "+Integer.toString(a[row][column]);
					}
				}else{
					if (column==0){
						arrayToString=arrayToString+"\n"+Integer.toString(a[row][column]);
					}else{
						arrayToString=arrayToString+" "+Integer.toString(a[row][column]);
					}
				}
			}	
		}
		return arrayToString;
	}
	 public static int[][] horizontalSums(int[][] a, int sumToFind){
		 int[][] b=new int[a.length][a[0].length];
		 int x=0;
		 for (int i=0; i<a.length;i++){
			 for(int j=0; j<a[i].length;j++){
				 x=0;
				 for (int s=j;s<a[i].length;s++){
					 x= x+a[i][s];
					 if (x==sumToFind){
						 for (int z=j;z<=s;s--){	
							 b[i][s]=a[i][s];
						 } 
					 }else{
						 if (b[i][s]>0){
						 }else{
							 b[i][s]=0;
						 }	 
					 }
				 }
			 }
		 }
			 
		 return b;
	 }
	 public static int[][] verticalSums(int[][] a, int sumToFind){
		 int[][] b=new int[a.length][a[0].length];
		 int x=0;
		 for (int i=0; i<a.length;i++){
			 for(int j=0; j<a[i].length;j++){
				 x=0;
				 for (int s=j;s<a.length;s++){
					 x= x+a[s][i];
					 if (x==sumToFind){
						 for (int z=j;z<=s;s--){	
							 b[s][i]=a[s][i];
						 } 
					 }else{
						 if (b[s][i]>0){
						 }else{
							 b[s][i]=0;
						 }	 
					 }
				 }
			 }
		 }
			 
		 return b;
	 } 
 }

