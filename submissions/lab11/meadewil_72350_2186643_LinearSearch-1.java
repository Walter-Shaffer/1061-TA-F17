
/*
LinearSearch.java
Author: Sean Meade
Submission Date: 11/16
Purpose: Creates a variable and an array based on the input
args from ssh and uses them to search the array for the double.

Statement of Academic Honest:
The following code represents my own work. I have neither
recieved nor given inappropriate assistance. I have not copied
or modified code from any source other than the course webpage
or the course textbook. I recognize that any unauthorized 
assistance or plagiarism will be handled in accordance
with the polices at Clemson University and the 
policies of this course. I recognize that my work is based
on an assignment created by the School of Computing
at Clemson University. Any publishing or posting
of source code for this project is strictly prohibited
unless you have written consent from the instructor. 
*/
public class LinearSearch {

    //The first two functions find the index of an item if it is in x. 
    public static int getFirstIndex(double item, double[] x){
    	int index = -1; // Index will be the returned variable. 
	
    	for(int i = 0; i < x.length; i++){ //This loop stops as soon as the if condition inside it is met. 
    		if(item == x[i]){ //If the given item is the same as the value of x[i], index is set to i. 
    			index = i;
    			i = x.length;
    		}
    	}
        return index; //Returns the set value of index. 
    }

    public static int getFirstIndex(String item, String[] x){
    	int index = -1; //Declare the necessary variables. Index will be the return variable.

    	for(int i = 0; i < x.length; i++){ 
    		if(item.equals(x[i])){ //If the given item is the same as the value of x[i], index is set to i. 
    			index = i;
    			i = x.length;
    		}
    	}
        return index; //Returns the set value of index.
    }

    public static void main(String[] args){ //This is the main function that uses the first two functions to find certain strings or doubles in the argument line based on the first three arguments. 
    	if(args[0].equalsIgnoreCase("-d")){ //If the first argument is "-d", this program uses the first function. 
    		double second = new Double(args[1]);
    		double[] x = new double[args.length - 3];

    		for(int i = 0; i < (x.length); i++){ //This loop sets the value of the x array to the values of args after the third command. 
    			x[i] = new Double(args[i + 3]);
    		}
	    
    		int index = LinearSearch.getFirstIndex(second, x);
    		if (index != -1){
    			System.out.println(second + " found in x at index " + index);
    		}
    		else{
    			System.out.println(second + " not found in x ");
    		}
    	}
    	else if(args[0].equalsIgnoreCase("-s")){ //If the first argument is "-s", this program uses the second function. 
    		String second = args[1];
    		String[] x = new String[args.length - 3];
    	
    		for(int i = 0; i < (x.length); i++){ //This loop sets the value of the x array to the value of args after the third command. 
    			x[i] = args[i + 3];
    		}

    		int index = LinearSearch.getFirstIndex(second, x);
    		if (index != -1){
    			System.out.println(second + " found in x at index " + index);
    		}
    		else{
    			System.out.println(second + " not found in x");
    		}
    	}

    }
}
