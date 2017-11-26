/*
* LinearSearch.java
* Author: Kevin Okinedo
* Submission Date: 11/17/17
*
* Purpose: A brief paragraph description of the
* program. What does it do? Finds the index a certain valiue within an array.
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

//looks for first index of a double value
 public static int getFirstIndex(double item, double[] x) {
	for (int i = 0; i < x.length; i++){
	    if(item == x[i]){
		return i;
	    }
	}
	return -1;
 }
   
 //looks for first index of string value
 public static int getFirstIndex(String item, String[] x) {
	for (int i = 0; i < x.length; i++){
	    if(item.equals(x[i])){
		return i;
	    }	
	}
	return -1;
 }

//converts double to string and looks for value in array	
public static void main(String [] args){
      boolean inputType = false;
      if(args[0].equals("-d")){
	      inputType = true;
	  }
	  String inputString = null;
	  double inputDouble = Double.NaN;
	  if(inputType == true){
	      
	      inputDouble = Double.parseDouble(args[1]);
	  }
	  else if (inputType == false){
	      inputString = args[1];
	  }
	  String [] arrayString = new String [args.length-3];
	  double [] arrayDouble = new double [args.length-3];

	  if(inputType == true){
	      for(int i = 3; i < args.length; i++){
		  arrayDouble[i-3] = Double.parseDouble(args[i]);
	      }
	  }

	  else if (inputType == false){
	      for(int i = 3; i < args.length; i++){
		  arrayString[i-3] = args[i];
	      }
	  }
	      
	  int firstIndex = -1;
	  if(inputType == true){
		  firstIndex = getFirstIndex(inputDouble, arrayDouble);
	  }
	      
	      else if(inputType == false){
		  firstIndex = getFirstIndex(inputString, arrayString);
	      }	      
	      
	      if(firstIndex == -1){
		  System.out.println(args[1] + " not found in x.");
	      }

	      else{
		  System.out.println(args[1] + " found in x at index " + firstIndex);
	      }
    }
}

