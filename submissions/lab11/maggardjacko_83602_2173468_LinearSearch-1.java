/*
* LinearSearch.java
* Author: Jack Maggard
* Submission Date: 11/14/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* This program takes command line arguments
* and looks for a match of either a double or
* a String variable 
* 
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
		int z = 0;
		int count = -1;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == item) {
				z = i;
				count += 1;
			}
			if (count != -1)
				i = x.length - 1;//this is used to end the for loop because we have to find the first index
		}
		if (count == -1)
			return -1;//if the return is -1, prints that the item was not found
		else
			return z;//returns the index of the number in the array

	}

	public static int getFirstIndex(String item, String[] x) {
		int z = 0;//same comments as last one
		int count = -1;
		for (int i = 0; i < x.length; i++) {
			if (x[i].equals(item)) {
				z = i;
				count += 1;
			}
			if (count != -1)
				i = x.length - 1;
		}
		if (count == -1)
			return -1;
		else
			return z;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index;
		if (args[0].contains("d")) {//check if first argument wants a double search
			double[] d = new double[args.length - 3];//shortens the array to not include first 3 items
			for (int j = 3; j < args.length; j++) {
				d[j - 3] = Double.parseDouble(args[j]);//parses double from String values
			}
			double n = Double.parseDouble(args[1]);//the number that is being searched for
			index = getFirstIndex(n, d);
			if (index == -1) {
				System.out.println(n + " not found in x");//return value defaults to -1 if item not found
			} else
				System.out.println(n + " found in x at index " + (index));//if item is found, returns index
		} else if (args[0].contains("s")) {
			String[] args1 = new String[args.length - 3];
			for (int i = 3; i < args.length; i++)//same code as double search besides double wrapper class
				args1[i - 3] = args[i];
			index = getFirstIndex(args[1], args1);
			if (index == -1) {
				System.out.println(args[1] + " not found in x");
			} else
				System.out.println(args[1] + " found in x at index " + (index));
		}
		
	}

}
