/**
* Stat.java
* Author: Ethan Coppenbarger
* Submission Date: 11/02/2017
*
* Purpose: create some useful functions for statistics
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
	// initialize data array
	private double[] data;
	
	// default constructor
	public Stat() {
		data = new double[]{0.0};
	}
	
	// constructor
	public Stat(double[] d) {
		data = new double[d.length];
		setData(d);
	}
	
	
	// get values from the data array
	public double[] getData() {
		return data;
	}
	
	// set the data array equal to another
	public void setData(double[] d) {
		data = new double[d.length];
		for (int f = 0; f < d.length; f++) {
			data[f] = d[f];
		}
	}
	
	// check if data is equal to another array
	public boolean equals(Stat s) {
		boolean isEqual = true;
		if (data.length != s.data.length) {
			isEqual = false;
		} else {
			for (int f = 0; f < data.length; f++) {
				if (data[f] != s.data[f]) {
					isEqual = false;
				}
			}
		}
		return isEqual;
	}
	
	// return string of elements in data
	public String toString() {
		String returnString = "[";
		for (int f = 0; f < data.length-1; f++) {
			returnString = returnString + data[f] + ", ";
		}
		return returnString + data[data.length-1] + "]";
	}
	
	// return minimum value in data
	public double min() {
		double minValue = data[0];
		for (int f = 0; f < data.length; f++) {
			if (data[f] < minValue) {
				minValue = data[f];
			}
		}
		return minValue;
	}
	
	// return maximum value in data
	public double max() {
		double maxValue = data[0];
		for (int f = 0; f < data.length; f++) {
			if (data[f] > maxValue) {
				maxValue = data[f];
			}
		}
		return maxValue;
	}
	
	// return average of data
	public double average() {
		double average = 0;
		for (int f = 0; f < data.length; f++) {
			average += data[f];
		}
		average /= data.length;
		return average;
	}
	
	// return most common number in data
	public double mode() {
		int[] counter = new int[data.length];				// create an array that counts how many times a number at a position appears
		int maxValuePosition = -1;							// the position of the largest number in counter
		double[] dataCopy = new double[data.length];		// create an array to copy data
		for (int f = 0; f < data.length; f++) {				// copy data into dataCopy
			dataCopy[f] = data[f];
		}
		
		for (int f = 0; f < counter.length; f++) {			// set all values in max to 0
			counter[f] = 0;
		}
		
		for (int f = 0; f < dataCopy.length; f++) {			// loop through dataCopy
			for (int i = 0; i < dataCopy.length; i++) {		// loop through dataCopy for each element of dataCopy
				if (dataCopy[f] == dataCopy[i]) {			// check if values in dataCopy are equal
					counter[f] += 1;						// increase counter at max for that number
					if (f != i) {
						dataCopy[i] = Double.NaN;			// remove data at i if it is not f
					}
				}
			}
			dataCopy[f] = Double.NaN;						// remove f
		}
		
		double maxValue = counter[0];						// create a variable for the pos. of the max value in counter
		for (int f = 0; f < counter.length; f++) {			// loop through counter
			if (counter[f] > maxValue) {					// check for values larger than the already found largest
				maxValue = counter[f];						// change max value and postition to the new maximum
				maxValuePosition = f;
			} else if (counter[f] == maxValue) {			// if two numbers are equally common, don't return either
				maxValuePosition = -1;
			}
		}
		
		if (data.length == 1) {
			return data[0];								// return data is the data is only one value
		}
		else if (maxValuePosition == -1) {				// return NaN if no max value was found
			return Double.NaN;
		} 
		else {											// return data at the most found number's position
			return data[maxValuePosition];
		}

	}

}
