
/*
* LinearSearch.java
* Author:  Nina Agafonovas
* Submission Date:  November 16, 2017
* Purpose: Practice creating arrays and wrapper classes to perform pinear searches.
* Honesty:
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
		boolean flag = true;
		int index = -1;
		int i = 0;
		
		if (x.length == 0 ){							//if the length is 0 then return -1
			index = -1;
		}
		else{											//otherwise continue searching for match
		
		while (flag == true && i < x.length ){			//searches the entire array
		
			if (item == (x[i])) {						//if what i'm searching for equals the element found in the array
				index = i;
				flag = false;							//flag becomes false to exit the loop
		
			}
			else{
				index = -1;
			}
			i++;
		}
		}
			return index;
		}
		
	public static int getFirstIndex(String item, String[] x){
		boolean flag = true;
		int index = 0;
		int j = 0;
		
		if (x.length == 0 ){				//if the length is 0, return -1
			index = -1;
		}
		else{
		
		while (flag == true && j < x.length ){			//searches the entire array
		
			if (item.equals(x[j])) {					//if what i'm searching for equals the element found in the array
				index = j;								//index is where they match
				flag = false;
				
			
			}
			else{
				index = -1;
			}
			j++;
		}
		}
			return index;
		}
		
	
	public static void main(String[] args){				//main method
		
	
		
		if (args[0].equals("-s")){					//if the string begins with -s, search strings
			String itemSearchedFor = args[1];
			String []array2 = new String[args.length -3];		//make a new array doesn't include the beginning 3 indicators
			for (int k= 0; k < array2.length; k++){
				array2[k] = args[k+3];
			}
			int Index1 = getFirstIndex(itemSearchedFor, array2);	//implement getFirstIndex method for the new 'copied' array
			if(Index1 == -1){
				System.out.println(itemSearchedFor + " not found in x");
			}
			
			else{
				System.out.println(itemSearchedFor + " found in x at index " + Index1);
			}
			
		}
		
		 if (args[0].equals("-d")){										//if string begins with -d, search doubles
			 double itemSearchedFor = Double.parseDouble(args[1]);		//use double wrapper to turn the string into a doubles
			 double []array2 = new double[args.length -3];				//make a new array that doesn't include the beginning 3 indicators
			 for (int k= 0; k < array2.length; k++){					//length of array2 starting from index 2 (3 spaces)
				 array2[k] = Double.parseDouble(args[k+3]);
				 
				 
			 }
			 int Index1 = getFirstIndex(itemSearchedFor, array2);		//implement getFirstIndex
			 if(Index1 == -1){
					System.out.println(itemSearchedFor + " not found in x");
				}
				
				else{
					System.out.println(itemSearchedFor + " found in x at index " + Index1);
				}
			 
		 }
		
	}}	
		
		
