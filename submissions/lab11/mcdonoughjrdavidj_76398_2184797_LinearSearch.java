/*
*LinearSearch.java
* Author:  David McDonough
* Submission Date: November 16th, 2017
* Purpose: Searches through a collection of doubles or collection of strings for a specific word or number.
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance
* with the policies at Clemson University and the
* policies of this course. I recognize that my work is based
* on an assignment created by the School of Computing
* at Clemson University. Any publishing or posting
* of source code for this project is strictly prohibited
* unless you have written consent from the instructor.
*/

public class LinearSearch {
	
	public static int getFirstIndex(double item, double[] x){
		
		//method that loops through a double array and checks if the number inputed matches any word in the array
		for(int i = 0; i < x.length; i++){
			if(x[i] == item){
				return i;
			}
			}
		return -1;
		}

	public static int getFirstItem(String name, String[] x){
		
		//method that loops through a string array and checks if the word inputed matches any number in the array
		for(int i = 0; i < x.length; i++){
			if(x[i].equals(name)){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		//main loop that populates a double array and prints out correct statement
		if(args[0].equals("-d")){
			double number = Double.parseDouble(args[1]);
			if(args[2].equals("-x")){
				double[] x = new double[args.length - 3];
				for(int i = 3; i < args.length; i++){
					x[i - 3] = Double.parseDouble(args[i]);
				}
				int index = getFirstIndex(number, x);
				if(index >= 0)
					System.out.println(number + " found in x at index " + index);
				else
					System.out.println(number + " not found in x");
			}
		}
		
		//loop that populates a string array and prints out correct statement
		if (args[0].equals("-s")){
			String word = args[1];
			if(args[2].equals("-x")){
				String[] y = new String[args.length - 3];
				for(int i = 3; i < args.length; i++){
					y[i - 3] = (args[i]);
				}
				int counter = getFirstItem(word, y);
				if(counter >= 0)
					System.out.println(word + " found in x at index " + counter);
				else
					System.out.println(word + " not found in x");
				
				}
			}
		
		
		
		

	}

}

