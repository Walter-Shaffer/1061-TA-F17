/*
 * LinearSearch.java
 * Author: Christopher Hicks
 * Submission Date 11/14/2017
 * 
 * Purpose: Practice using a linear search through the use of command lines
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
public class LinearSearch {// begin class

	public static int getFirstIndex(double item, double[] x) {// function to get first index if index is double
		int a = -1;
		for(int i = 0; i <x.length; i++)//Gets and checks first index
		{
		   if( x[i] == item)
		   { 	a = i;
			   i = x.length + 1;
		   }//ends if
		}//ends for
		return a;// returns getFirstIndex Double
	}// end of getFirstIndex Double
	public static int getFirstIndex(String item, String[] x){// function to getFirstIndex for Strings
		int a = -1;
		for(int i = 0; i <x.length; i++)//Gets and checks first index
		{
		   if( x[i].equals(item))
		   { 	a = i;
			   i = x.length + 1;
		   }//ends if
		}//ends for
		return a;	// returns getFirstIndex String
	}// end of getFirstIndex String
	
	public static void main(String[] args){// Start of Main
		String inputTacS = null;	// Declare input for -s
		double inputTacD = Double.NaN;// Declare input for -d
		int inputIndex = 0;			// Declare input for Index 0
		int arrayIndex = 0;			// Declare Array Index
		
		for (int i = 0; i < args.length; i++){ // this tests the inputs for -s and -d
			if (args[i].equals("-s") || (args[i].equals("-d"))){//Decides if input is double or string
				inputIndex = i;// double
			} else if (args[i].equals("-x")){
				arrayIndex = i;// string
			}//ends if
		}//ends for
		if (args[inputIndex].equals("-d")){// Checks for Doubles in the string
			inputTacD = Double.parseDouble(args[inputIndex + 1]);// parse the doubles from the string
		} else if (args[inputIndex].equals("-s")){
			inputTacS = args[inputIndex +1];// places the doubles into and array args
		}//ends if
		
		String[] searchArrayS = new String[args.length - (arrayIndex +1)];// create new array to search for the string
		double[] searchArrayD = new double[args.length - (arrayIndex +1)];// create new array to search for the doubles in the string
		String[] argsCut = new String[args.length]; //String that will cut out the unnecessary stuff
		
		for(int i = arrayIndex + 1; i < args.length; i++){// Parse arrayIndex
			argsCut[i] = args[i];
		}//ends for
		
		int indexInc = 0;
		for(String s : argsCut) {// for else to set the vaues into correct final location
			if (s != null){
				if (inputTacS != null) { // checks for null
					searchArrayS[indexInc] = s;
				} else if (inputTacD != Double.NaN){ // checks for NaN
					searchArrayD[indexInc] = Double.parseDouble(s);// parse searchArray -d
				}
				indexInc++;
			}//end if
		}//end for
		int finIndex = -1; // final value of string (ANSWER)
		if (args[inputIndex].equals("-s")){// sets -s string to equal input for -s
			finIndex = getFirstIndex(inputTacS,searchArrayS);// gets final answer for -s
			if (finIndex == -1) {// gets not found answer
				System.out.println(inputTacS + " not found in x");
			} else {// if answer is not -1 then it will print correct answer
				System.out.println(inputTacS + " found in x at index " + finIndex );
			}//end if
		} else if (args[inputIndex].equals("-d")){// final vaue for -d
			finIndex = getFirstIndex(inputTacD,searchArrayD);// ANSWER for -d
			if (finIndex == -1) {// gets not found 
				System.out.println(inputTacS + " not found in x");
			} else {// gets the correct index
				System.out.println(inputTacS + " found in x at index " + finIndex );
			}
		}// end Answer if loop
	}// ends main
}// en
