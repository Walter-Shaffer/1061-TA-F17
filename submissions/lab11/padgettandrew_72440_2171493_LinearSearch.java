/*
 * LinearSearch.java
 * Author: Andrew Padgett
 * Submission Date: 11/14/17
 *
 * Purpose: accepts string and double command line arguments
 *          then compares an array of those arguments to a specificed item.
 *          The first variable in the array that matches the item
 *          is printed out along with the index of the variable. If no
 *          variables match the object, program says so.
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


    //getFirstIndex returns the first index of x that equals item.
    //If there are no matching indices, -1 is returned.
    //
    public static int getFirstIndex (double item, double[] x) {

	boolean itemFound = false;
	
	//loop ends and returns the current index when the the variable
	//at x[i] equals item.
	//
        for (int i = 0; i < x.length && itemFound == false; i++) {
	    if (x[i] == item){
		itemFound = true;
		return i;
	    }
	    else;
        }
        return -1;
    }


    //same as previous except compares strings rather than double values.
    //
    public static int getFirstIndex (String item, String[] x) {
    
	boolean itemFound = false;

	for (int i = 0; i < x.length && itemFound == false; i++) {
	    if (x[i].equals(item)){
		itemFound = true;
		return i;
	    }
	    else;
	}
	return -1;
    }


    //main method calls on previous methods based on the first command line argument
    //
    public static void main(String[] args) {
	
	//if the first argument is "-d", use double variables
	//
	if (args[0].charAt(1) == 'd'){
	    double[] x = new double[args.length - 3];
	    for (int i = 3, j = 0; i < args.length; i++, j++)
		x[j] = Double.parseDouble(args[i]);

	    //use getFirstIndex to assign index to the first args[] index that matches
	    //item. Assign item to the second argument.
	    //
	    int index = LinearSearch.getFirstIndex (Double.parseDouble (args[1]), x);
	    double item = (Double.parseDouble (args[1]));
	    if (index == -1)
		System.out.println(item + " not found in x");
	    else
		System.out.println(item + " found in x at index " + index);
	}
	
	//if the first argument is "-s", use string variables
	//
	else if (args[0].charAt(1) == 's'){
	    String[] x = new String[args.length - 3];
	    for (int i = 3, j = 0; i < args.length; i++, j++)
		x[j] = args[i];

	    //use getFirstIndex to assign index to the first args[] index that matches
	    //item. Assign item to the second argument.
	    //
	    int index = LinearSearch.getFirstIndex (args[1], x);
	    String item = args[1];
	    if (index == -1)
		System.out.println(item + " not found in x");
	    else
		System.out.println(item + " found in x at index " + index);
	}
    }
}
