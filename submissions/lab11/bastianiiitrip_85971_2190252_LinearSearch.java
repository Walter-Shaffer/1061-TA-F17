/*
* CPSC-1060.java
* Author: Trip Bastian
* Submission Date: November 17, 2017
*
* Purpose: 
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
public class LinearSearch {
	public static void main(String[] args) {
		int index=-2;
		if(args[0].equals("-s")){
			index = LinearSearch.getFirstIndex(args[1], args);
		}
		else if (args[0].equals("-d")){
			double newArgs[] = new double[(args.length-3)];
			for(int n=3;n<args.length;n++){
				newArgs[n-3]= Double.valueOf(args[n]);
			}
			index = LinearSearch.getFirstIndex(Double.valueOf(args[1]), newArgs);
		}
		if(index==-1){
			System.out.println(args[1]+" not found in x");
		}
		else{
			System.out.println(args[1]+" found in x at index "+index);
		}
	}
	public static int getFirstIndex(double item, double[] x){
		for(int i=0; i<x.length;i++){
			if(x[i]==item){
				return i;
			}
		}
		return -1;
	}
	public static int getFirstIndex(String item, String[] x){
		for(int i=3; i<x.length;i++){
			if(x[i].equals(item)){
				return i-3;
			}
		}
		return -1;
	}
}