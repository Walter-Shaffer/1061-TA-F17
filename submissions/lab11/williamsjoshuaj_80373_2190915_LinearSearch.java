/*
* LinearSearch.java
* Author: Joshua Williams
* Submission Date: 11/17/17
*
* Purpose: The program searches through an array that is created using java run arguments to find what is
* between -d or -s and -x in that array, and then it displays if  it found it, and the index, or that it did not find
* it.
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
		if(args[0].equals("-s")){
			String[] x = new String[args.length - 3];
			for(int i = 0; i<x.length; i++){
				x[i] = "" + args[3 + i];
			}
			if(getFirstIndex(args[1], x) != -1){
			System.out.println(args[1] + " found in " + args[2].substring(1, args[2].length()) + " at index " + getFirstIndex(args[1], x));
			}else{
			System.out.println(args[1] + " not found in " + args[2].substring(1, args[2].length()));
			}
		}else if(args[0].equals("-d")){
			double[] x = new double[args.length - 3];
			for(int i = 0; i<x.length; i++){
				x[i] = Double.parseDouble(args[3 + i]);
			}
			if(getFirstIndex(Double.parseDouble(args[1]), x) != -1){
			System.out.println(Double.parseDouble(args[1]) + " found in " + args[2].substring(1, args[2].length()) + " at index " + getFirstIndex(Double.parseDouble(args[1]), x));
			}else{
			System.out.println(Double.parseDouble(args[1]) + " not found in " + args[2].substring(1, args[2].length()));
			}
		}
	}

	public static int getFirstIndex(double item, double[] x) {
		for(int i = 0; i<x.length; i++){
			if(item == x[i]){
				return i;
			}
		}
		return -1;
	}

	public static int getFirstIndex(String item, String[] x) {
		for(int i = 0; i<x.length; i++){
			if(item.equals(x[i])){
				return i;
			}
		}
		return -1;
	}
}
