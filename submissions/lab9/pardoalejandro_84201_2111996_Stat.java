/*
* Stat.java
* Author:  Alejandro Pardo
* Submission Date:  November 2
* Purpose: Stores an array of doubles called data. This lab will also compute 
* the min, max and mode of an array.
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
public class Stat {
	private double[] data;

	public Stat() {
		double[] array = { 0.0 };
		data = array; // default array
	}

	public Stat(double[] d) {
		setData(d); // sets the values of the array

	}

	public double[] getData() { // creates new array with the length and values
		// of data
		double[] newData = new double[data.length];
		for (int a = 0; a < this.data.length; a++) {
			newData[a] = data[a];
		}
		return newData;
	}

	public void setData(double[] d) { // sets values of data array to a new
		// array
		data = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			data[i] = d[i];
		}
	}

	public boolean equals(Stat s) {// return true if both data objects
		// and object s have the same values

		for (int z = 0; z < this.data.length; z++) {
			if (this.data[z] != s.data[z]) {
				return false; // if they are not equal, return false
			}
		}
		return true; // anything other than not equal return true.

	}

	public String toString() {
		String numbers = "[";// start of the string
		for (int k = 0; k < data.length; k++) {
			numbers += (data[k] + ", "); // the values plus space and commas
			// (Ex.[4.6, 6.3])
		}
		return numbers.substring(0, numbers.length() - 2) + "]";
		// the end of the string according to line 60. ends with ", "
		// the substring allows to subtract two characters at the end of the
		// array.
	}

	public double min() { // returns the minimum value of the array.
		double minValue = Double.MAX_VALUE; // make it as big as possible so
		// anything lower becomes the
		// lowest.
		for (int p = 0; p < data.length; p++) {
			if (this.data[p] < minValue) {
				minValue = data[p];
			}
		}
		return minValue;

	}

	public double max() { // returns the maximum value of the array.
		double maxValue = -1 * Double.MAX_VALUE; // the smallest value is the
		// negative max.
		// in case any negative
		// array values
		for (int m = 0; m < data.length; m++) {
			if (this.data[m] > maxValue) {
				maxValue = data[m];
			}
		}
		return maxValue;

	}

	public double average() { // returns the average of all the values in the
		// array
		double sum = 0;
		for (int jc = 0; jc < data.length; jc++) {
			sum += data[jc];
		}
		return sum / data.length;
	}

	public double mode() { // return the value that appears the most in the
		// array
		double Value = data[0];
		double number = 1;
		double Count = 0;
		double RepCount = 0;

		for (int q = 0; q < data.length; q++) {
			Count = 0;
			for (int j = q; j < data.length; j++) {

				if (data[q] == data[j]) { // if two variables from each array
					// equal
					// increase the count
					Count++;
				}
			}
			if (Count > RepCount) { // if new higher count of number comes up,
				// the mode changes.
				Value = data[q];
				number = 1;
				RepCount = Count;

			} else if (Count == RepCount && data[q] != Value) {

				number++;
			}
		}
		if (number > 1) {
			return Double.NaN; // if two values in the array have the same
			// amount of repetitions then return NaN.
		} else {
			return Value;
		}

	}

	
	}
