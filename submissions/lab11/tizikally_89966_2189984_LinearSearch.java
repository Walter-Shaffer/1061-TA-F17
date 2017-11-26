/*LinearSearch.java
Author: Allison Tizik
Submission Date: 11/17/17
Purpose: The purpose of this lab is to run through an array that is inputed and
figure out if a word or number that is stated is also stated in the array. If it
is stated in the array it wants it to print out the word or number and at what index
it is at. If it is not an the array then the lab prints out that the word or number
is not found in the array. 

Statement of Academic Honesty:

The following code represents my own work. I have neither received nor given inappropriate assistance.
I have not copied or modified code from any source other than the course webpage or the course textbook.
I recognize that any unauthorized assistance or plagiarism will be handled in accordance with 
the policies at Clemson University and the policies of this course. I recognize that my work is based 
on an assignment created by the School of Computing at Clemson University.
 Any publishing or posting of source code for this project is strictkly prohibited unless 
you have writted consent from the instructor.
 */

public class LinearSearch {

    //If the item is in the array x, then return the first index i of x where x[i[ is equal to item. 
    //Otherwise, return -1 if the item is not in the array.
    public static int getFirstIndex (double item, double [] x) {
	int j = 0;
	for (int i = 3; i < x.length; i ++){
	    if (x[i] == item){
		return j;
	    }
	    j++;
	}
	return -1;
    }

    //If the item is in the array x, then return the first index i of x where x[i] is equal to (case senstive) 
    //item. Otherwise, return -1 if the item is not in the array x
    public static int getFirstIndex (String item, String [] x) {
	int j = 0;
	for (int i = 3; i < x.length; i++){
	    if(x[i].equals(item)){
		return j;
	    }
	    j++;
	}
	return -1;
   }

    //The main method that process the args and calls getFirstIndex to get the correct output based on the
    //examples for in this lab. You may assume the command line arguments follow the aforementioned pattern 
    //and the examples. Using the wrapper class to convert String value to a double values wwhen -d is an input
    public static void main(String[] args){
	if (args[0].equals("-d")){
		double[] newArgs = new double[args.length];
		double newItem = Double.parseDouble(args[1]);
		for (int i = 3; i<args.length; i++){
		    newArgs[i] = Double.parseDouble(args[i]);
		}
		if (getFirstIndex(newItem, newArgs) == -1){
			System.out.println(args[1] + " not found in x");
		    }else{
		    System.out.println(args[1] + " found in x index " + getFirstIndex(newItem, newArgs));
		}
	}else if (getFirstIndex(args[1], args)== -1){
		System.out.println(args[1] + " not found in x");
	    }else{
		System.out.println(args[1] + " found in x index " + getFirstIndex(args[1], args));
	}   
    }
}
