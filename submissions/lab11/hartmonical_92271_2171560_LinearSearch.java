/* 
 * File name: LinearSearch.java
 * Author: Monica Hart
 * Submission Date: 11/14/2017
 *
 * This program does the following:
 * This program searches for a string or double inside of an 
 * array entered by the user (args).
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
 *
 */

public class LinearSearch{
    
    /*
     * returns the first index of a double item in a double array
     */
    public static int getFirstIndex(double item, double[] x){
    	int index = -1; //stays the same if no index found

	//searches array for item match
    	for (int i = 0; i < x.length; i++){
	    
	    //sets index number if match found
    	    if (x[i] == (item)){
    			index = i;
    			i = x.length; //exit after 1st match
    	    }
    	}
    		
    	return index;
    }

    /*
     * returns the first index of a string item in a string array
     */
    public static int getFirstIndex(String item, String[] x){
    	int index = -1; //stays the same if no index found

	//searches array for item match
    	for (int i = 0; i < x.length; i++){

	    //sets index number if match found
    	    if (item.equals(x[i])){
    			index = i;
    			i = x.length; //exit after 1st match
    	    }
    	}
    		
    	return index;
    }
    
    public static void main(String[] args){

	String item = args[1]; //item to search array for
	String[] x; //array to search
	double itemDouble = 0; //item if -d
	double[] xDouble; //array if -d
	String result = args[1]; //fills in later
	int index = -1;

	//for string item and array
	if (args[0].equals("-s")){
		x = new String[args.length - 2];
		for (int i = 3; i < args.length; i++)
		    x[i - 3] = args[i];
		index = getFirstIndex(item, x);
	}
	//for double item and array
	else if (args[0].equals("-d")){
	    result = "" + Double.parseDouble(args[1]);
	    itemDouble = Double.parseDouble(args[1]);
	    xDouble = new double[args.length - 2];
	    for (int i = 3; i < args.length; i++)
	    	xDouble[i - 3] = Double.parseDouble(args[i]);
	    index = getFirstIndex(itemDouble, xDouble);
	}	

	//complete result
	if (index < 0)
		result += " not found in x";
	else
		result += " found in x at index " + index;
	    
	System.out.println(result);
	    
    }

}
