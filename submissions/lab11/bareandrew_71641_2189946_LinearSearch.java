/*
* Linear.java
* Author: Andrew Bare
* Submission Date: 11/17/17
*
* Purpose: 
* 
* This Class implements a linear search through an array to find
* an given value in a given array
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
	
	/**
	 * Finds the number item in the array passed
	 * @param item number you want to find
	 * @param x array to check
	 * @return -1 if not there, otherwise the first index that it is found at
	 */
	public static int getFirstIndex(double item, double[] x){
		boolean found = false;
		int index = -1;
		//loop to check each instance and return
		int i =0;
		while (i< x.length && !found)
		{
			if (x[i] ==item)
			{
				found = true;
				index = i;
			}
			i++;
		}
		
		//if not found
		if (!found)
			return -1;
		else
			return index;
		
	}
	
	/**
	 * find the first index of the requested item in the suggested array
	 * @param item what you're looking for
	 * @param x where you're looking
	 * @return 
	 */
	public static int getFirstIndex(String item, String[] x){
		boolean found = false;
		int index = -1;
		//loop to check each instance and return
		int i =0;
		while (i< x.length && !found)
		{
			if (x[i].equals(item))
			{
				found = true;
				index = i;
			}
			i++;
		}
		
		//if not found
		if (!found)
			return -1;
		else
			return index;
		
	}

	public static void main(String[] args) {
//		String parsed = null;
//		Double toFind;
		int begin = 0, end =0;
		int index;
		boolean isDouble = false, okToGo = false;
		
		for (int i = 0; i<args.length; i++){
			// find the beginning and ends of the data needed for each section
			if (args[i].contains("-s")|| args[i].contains("-d")){
				okToGo = true;
				begin = i;
				if (args[i].contains("-s")){
					isDouble = false;
//					parsed = args[i+1];
				}else{
					isDouble = true;
				}
			}
			if (args[i].contains("-x"))
				end = i;
		}
		
		if (okToGo && isDouble){
			double toFind = Double.parseDouble(args[begin+1]);
			
			//make the rest a double array
			double[] data = new double[args.length-end+2];
			int whereInData = 0;
			for (int i = end+1; i<args.length;i++, whereInData++)
			{				
				data[whereInData]=Double.parseDouble(args[i]);
			}
			index = getFirstIndex(toFind, data);
			
			//Give Output
			if(index == -1)
				System.out.println(toFind + " is not found in x");
			else
				System.out.println(toFind + " found in x at index " + index);
		}
		else if (okToGo && !isDouble){
			String toFind = args[begin+1];
			
			//make the rest a string array
//			System.out.println("end: " + end);
			String[] data = new String[args.length-(end+1)];
			
			if (data.length>0)
			{
				int whereInData = 0;
				for (int i = end+1; i<args.length;i++, whereInData++)
				{				
					data[whereInData]=args[i];
//					System.out.print(data[whereInData]+", ");
				}
//				System.out.println("toFind: " + toFind);
//				System.out.println("data: " + data[0]);
				
				index = getFirstIndex(toFind, data);
				
				//Give Output
				if(index == -1)
					System.out.println(toFind + " is not found in x");
				else
					System.out.println(toFind + " found in x at index " + index);
			}else{
				System.out.println(toFind + "is not found in x");
			}			
		}
		
		
	}

}
