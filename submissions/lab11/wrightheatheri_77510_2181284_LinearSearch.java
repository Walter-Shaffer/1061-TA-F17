/*
* LinearSearch.java
* Author: Heather Wright
* Submission Date: November 15, 2017
*
* Purpose: This program searches through an array of either strings
* or doubles to find the first index of the users input. As opposed
* to using the basic Scanner class this program uses the command line
* input as its inputs. This means that the given array of args is created
* through the command line input. If the term being searched isn't found in
* the array the getFirstIndex methods return -1. This tells the main method
* to print that the item wasnt found in the array. If the term is found then 
* the array prints the term and the index where it was found. If the 
* term is repeated in the input the method only returns the first
* index of the term.
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
	public static int getFirstIndex(double item, double[] x) {
		boolean flag = true;
		int i = 0;
		int firstIndex = 0;
		if(x.length == 0) {
			firstIndex = -1;
		}
		else {
			while(flag == true && i < x.length) {  
				if(item == x[i]) {
					firstIndex = i;
					flag = false;
				}
				else {
					firstIndex = -1;
				}
				i++;
			}
		}
		return firstIndex;
	}
	public static int getFirstIndex(String item, String[] x) {
		boolean flag = true;
		int i = 0;
		int firstIndex = 0;
		if(x.length == 0) {
			firstIndex = -1;
		}
		else {
			while(flag == true && i < x.length) {  
				if(item.equals(x[i])) {
					firstIndex = i;
					flag = false;
				}
				else {
					firstIndex = -1;
				}
				i++;
		}
		}
		return firstIndex;
	}
	public static void main(String[] args) {
		if(args[0].equals("-d")) {
			double[] args2 = new double[args.length-3];
			for(int i = 0; i < args2.length; i++) {
				args2[i] = Double.parseDouble(args[i+3]); 
			}
			int firstIndex = getFirstIndex(Double.parseDouble(args[1]), args2);
			if(firstIndex == -1) {
				System.out.println(Double.parseDouble(args[1]) + " not found in x ");
			}
			else {
				System.out.println(Double.parseDouble(args[1]) + " found in x at index " + firstIndex);
			}
		}
		else if(args[0].equals("-s")) {
			String[] args2 = new String[args.length-3];
			for(int i = 0; i < args2.length; i++) {
				args2[i] = args[i+3];
			}
			int firstIndex = getFirstIndex(args[1], args2);
			if(firstIndex == -1) {
				System.out.println(args[1] + " not found in x ");
			}
			else {
				System.out.println(args[1] + " found in x at index " + firstIndex);
			}
		}
	}
}
