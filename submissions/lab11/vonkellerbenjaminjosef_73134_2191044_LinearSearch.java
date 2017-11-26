//LinearSearch.java
//Author: Benjamin VonKeller
//Submission Date: 11/17/2017
//Purpose: This code takes command line arguments and searches for a specific word or number and returns the index at which that number or word occurs in the command line arguments.
//Statement of Academic Honesty:
//The following code represents my own work. I have neither
//received nor given inappropriate assistance. I have not copied
//or modified code from any source other than the course webpage
//or the course textbook. I recognize that any unauthorized
//assistance or plagiarism will be handled in accordance
//with the policies at Clemson University and the
//policies of this course. I recognize that my work is based
//on an assignment created by the School of Computing
//at Clemson University. Any publishing or posting
//of source code for this project is strictly prohibited
//unless you have written consent from the instructor.
public class LinearSearch {

	public static void main(String[] args) {
		String cmdString = "";
		double[] argsDouble = new double[args.length - 2];
		for (int i = 0; i < args.length; i++) {
			cmdString = cmdString + " " + args[i];
		}
		int stringIndex = cmdString.indexOf("-s");
		int doubleIndex = cmdString.indexOf("-d");
		int secondIndex = cmdString.indexOf("-x");
		if (stringIndex == -1 && doubleIndex == 1) {
			argsDouble[0] = Double.parseDouble(args[1]);
			for (int i = 3; i < args.length; i++) {
				argsDouble[i-2] = Double.parseDouble(args[i]);
			}
			if (getFirstIndex(argsDouble[0], argsDouble) != -1) {
				System.out.println(argsDouble[0] + " found in x at index " + getFirstIndex(argsDouble[0], argsDouble));
			}
			else {
				System.out.println(argsDouble[0] + " not found in x");
			}
		}
		else if (stringIndex == 1 && doubleIndex == -1) {
			if (getFirstIndex(args[1], args) != -1) {
				System.out.println(args[1] + " found in x at index " + getFirstIndex(args[1], args));
			}
			else {
				System.out.println(args[1] + " not found in x");
			}
		}

	}
	
	public static int getFirstIndex(double item, double[] x) {
		for (int i = 1; i < x.length; i++) {
			if (item == x[i]) {
				return i - 1;
			}
		}
		return -1;
	}
	
	public static int getFirstIndex(String item, String[] x) {
		for (int i = 3; i < x.length; i++) {
			if (item.equals(x[i])) {
				return i;
			}
		}
		return -1;
	}
	
	

}
