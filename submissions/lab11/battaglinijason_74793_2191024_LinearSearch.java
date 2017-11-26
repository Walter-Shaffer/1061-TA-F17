/*
* LinearSearch.java
* Author: [Jason Battaglini]
* Submission Date: [11/17/17]
*
* Purpose: This program will search through an array of strings or doubles with 
* values given by the command line argument. The program will return the first index
* of a desired string or double in the array.
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
	//will return the first index of item in an array of doubles
public static int getFirstIndex(double item, double[]x){
	int size =x.length;
	for(int i=0;i<size;i++){
		if (x[i]==item){
			//System.out.println("java LinearSearch -d " + item + " -x "+ x + "\n" + item + " found in x at index " + i);
			return i;
		}
			}
	
	return -1;
		
		
	}
	
	
	
	
			
//will return the first index of item in an array of strings
public static int getFirstIndex(String item, String[]x){
	int size=x.length;
	for(int i=3;i<size;i++){
		if(x[i].equals(item)){
			return i;
		}
	}
	return -1;
	
}

public static void main(String[] args){
	if(args[0].equals("-d")){
		//parses the given array into an array of doubles so it can be ran successfully
	double[]dArr=new double [args.length-3];
	//loop to set the values of dArr to those of the parsed strings from args
	for (int i=0; i<dArr.length;i++){
		dArr[i]=Double.parseDouble(args[i+3]);
	}
	if((LinearSearch.getFirstIndex(Double.parseDouble(args[1]), dArr)==-1))
			System.out.println(args[1]+" not found in x");
	else
	System.out.println(args[1] + " found in x at index " + LinearSearch.getFirstIndex(Double.parseDouble(args[1]), dArr));
	/*double x;
	double[] test;
	if (args[0].equals("-d")){
			double y=Double.parseDouble(args[1]);
			for(int i=3;i<args.length;i++){
			x=Double.parseDouble(args[i]);
			test = new double[args.length-3];
			test[i-3]=x;
			System.out.println(LinearSearch.getFirstIndex(y, test));
			*/
			
			
		
			
		}

				
		
			
				
		
		
		
		//System.out.println(LinearSearch.getFirstIndex(args[1], args)-3);
		//LinearSearch.getFirstIndex(args[1], args);


			
		
	if (args[0].equals("-s")){
		if (LinearSearch.getFirstIndex(args[1], args)==-1)
			System.out.println(args[1]+" not found in x");
		else
			System.out.println(args[1]+ " found in x at index " + (LinearSearch.getFirstIndex(args[1], args)-3));
	}
	}
	//use args[]
	//double d=Double.parseDouble(s);
	
}

