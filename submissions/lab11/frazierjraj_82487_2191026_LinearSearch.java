/*
* [LinearSearch].java
* Author: [Anthony Frazier]
* Submission Date: [11/17/17]
*
* Purpose:Preforms a search on command line arguments for first occurrence of the word or number 
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagarism will be handled in accordance
* with the policies at Clemson University and the
* policies of this course. I recognize that my work is based
* on an assignment created by the School of Computing
* at Clemson University. Any publishing or posting
* of source code for this project is strictly prohibited
* unless you have written consent from the instructor.
*/
public class LinearSearch {

	public static int getFirstIndex(double item, double[] x){
		for(int i = 0; i<x.length; i++){
			if(item == x[i]){
				return i; 
			}
		}
		return -1;
	}
	public static int getFirstIndex(String item, String[] x){
		for(int i = 0; i<x.length; i++){
			if(item.equalsIgnoreCase(x[i])){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean notFound = true;
		if(args[0].equalsIgnoreCase("-s")){	
			String searchString = args[1];
			for(int i = 3; i<args.length && notFound;i++){
				if(args[i].equals(searchString)){
				System.out.println(args[1] + " found in x at index " + (i-3));	
				notFound = false;
				}
			}
			if(notFound){
				System.out.println(searchString + " not found in x");
			}
		}
		else if(args[0].equalsIgnoreCase("-d")){
			double searchNumber = Double.parseDouble(args[1]);
			for(int i = 3; i<args.length && notFound;i++){
				if(Double.parseDouble(args[i])==searchNumber){
					System.out.println(Double.parseDouble(args[1]) + " found in x at index " + (i-3));	
					notFound = false;
					}
				}
				if(notFound){
					System.out.println(Double.parseDouble(args[1]) + " not found in x");
				}	
		}
	}
}
