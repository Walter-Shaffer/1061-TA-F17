/*
 * LinearSearch.java
 * Author: Jackie Doan
 * Submission Date: Thursday, November 17, 2017
 *
 * Purpose:
 * Locate the index of a specified item
 * in the array of x. can be either a double
 * or a String.
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
 * Source code for this project is strictly prohibited
 * unless you have written consent from the instructer
 */

public class LinearSearch{
	private static int index = 0;
	//overload the getFirstIndex method and get first index based upon input perameters 
    public static int getFirstIndex(double item, double[] x){
    	boolean found = false;
    	int firstIndex = 0;
    	while(!found && firstIndex < x.length){
    		if(item == x[firstIndex]){
    			found = true;
    		}
    		else{
    			firstIndex++;
    		}
    	}
    	if(found == true){
    		return firstIndex;
    	}
    	else{
    		return -1;
    	}
    }
    public static int getFirstIndex(String item, String[] x){
    	int firstIndex = 0;
    	boolean found = false;
    	while(!found && index < x.length){
    		if(x[index].equals(item) && index > 1){
    			found = true;
    		}
    		else{
    			index++;
    			if(index > 3){
    				firstIndex++;
    			}
    		}
    	}
    	if(found == true){
    		return firstIndex;
    	}
    	else{
    		return -1;
    	}
    }

    public static void main(String[] args){
    	String findingString = "";
    	double findingDouble = 0;
    	int firstIndex;
	//If-else statement to check which input
    	if(args[0].contains("-s")){
    		findingString = args[1];
    		if(args.length != 0){
    			firstIndex = getFirstIndex(findingString, args);
    			if(firstIndex != -1){
    				System.out.println(findingString + " found in x at index " + firstIndex);
    			}
    			else{
    				System.out.println(findingString + " not found in x");
    			}
    		}
    		else{
    			System.out.println(findingString + " not found in x");
    		}
    	}
    	else if(args[0].contains("-d")){
    		findingDouble = Double.parseDouble(args[1]);
		//create the double array
    		double[] searchingDouble = new double[args.length - 3];
    		for(int i = 0; i < args.length - 3; i++){
    			searchingDouble[i] = Double.parseDouble(args[i + 3]);
    		}
    		double[] doubleInput = searchingDouble;
    		firstIndex = getFirstIndex(findingDouble, doubleInput);
    	 	if(firstIndex != -1){
        		System.out.println(findingDouble + " found in x at index " + firstIndex);
    	 	}
    	 	else{
    	 		System.out.println(findingDouble + " not found in x");
    	 	}
    	}
    }
}
