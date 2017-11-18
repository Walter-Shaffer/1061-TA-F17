/*
* Stat.java
* Author: Andrew Padgett
* Submission Date: 11/02/17
*
* Purpose: Create various array objects and get information from
* 		   each using methods such as the average, minimum value, 
* 		   maximum value, and mode. Written method also compares
* 		   each index of two chosen arrays.
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


public class Stat {
	
	//create double array called data
	//
	private double[] data;
	
	//default Stat constructor
	Stat(){	
		data = new double[]{0.0};
	}
	
	//construct Stat object using values from d
	//
	Stat(double[] d){
		data = new double[d.length];
		for (int i = 0; i < d.length; i++)
			data[i] = d[i];
	}
	
	//returns copy of data from calling object
	//
	public double[] getData(){	
		double[] copy = new double[data.length];
		for (int i = 0; i < data.length; i++)
			copy[i] = data[i];
		return copy;
	}
	
	//create new array copy with values of d. Assign reference
	//of copy to data
	//
	public void setData(double[] d){
		double[] copy = new double[d.length];
		for (int i = 0; i < d.length; i++)
			copy[i] = d[i];
		data = copy;
	}
	
	//equals method checks each of two arrays and compares the 
	//indices. Use to check if contents of arrays are equal
	//rather than their memory locations
	//
	public boolean equals(Stat s){
		double [] copy = s.getData();
		if (copy.length != data.length)
			return false;
		else
			for (int i = 0; i < copy.length; i++)
				if (data[i] != copy[i])
					return false;
		return true;
	}
	
	//converts array to string by adding each index to empty string
	//
	public String toString(){
		String result = "";
		for (int i = 0; i < data.length; i++){
			result += data[i];
			if (i < data.length - 1)
				result += ", ";
		}
		return "[" + result + "]";		
	}
	
	//min method tests for the smallest value in calling object then
	//returns that value
	//
	public double min(){
		double result = data[0];
		for (int i = 0; i < data.length; i ++){
			if (data[i] < result)
				result = data[i];
		}
		return result;
	}
	
	//max method tests for the largest value in calling object then
	//returns that value
	//
	public double max(){
		double result = data[0];
		for (int i = 0; i < data.length; i ++){
			if (data[i] > result)
				result = data[i];
		}
		return result;
	}
	
	//average method adds every value contained in calling object
	//then divides the sum by the array length and returns the result
	//
	public double average(){
		double average = 0;
		for (int i = 0; i < data.length; i++){
			average += data[i];
		}
		return (average / data.length);
	}
	
	//mode method finds the most repeated value in an array and
	//returns that value. If there are two most repeated values,
	//"NaN" is returned
	//
	public double mode(){
		
		//sets mode equal to first number
		double mode = data[0];
		double maxCount = 0;
		double value;
		boolean same = false;
		
		//loops through each index of the calling object
		for (int i = 0; i < data.length; i++){
			
			//value is the current number being compared to
			//every index
			value = data[i];
			double count = 0;
			
			//loop compares value to every index
			for (int j = 0; j < data.length; j++){
				
				//if value is the repeated throughout the array,
				//add 1 to the count
				if (data[j] == value)
					count++;
			}
			
			//if the count of the last tested value is greater
			//than the current maxCount, set that value to the
			//mode
			if (count > maxCount) {
                mode = value;
                maxCount = count;
	        }
			
			//if two or more values in the array are repeated the
			//same amount of times, NaN will be printed
			else if (count == maxCount && value != mode)
				same = true;
			else if (count == maxCount && value == mode)
				same = false;
			}
		if (same == true)
			return Double.NaN;
		else;
		return mode;
	}
}
