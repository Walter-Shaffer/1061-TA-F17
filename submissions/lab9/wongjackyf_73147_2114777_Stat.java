/**
 * Stat.java
 * Author: Jacky Wong
 * Submission Date: 11/2/2017
 * 
 * Purpose: This calculates various statistics given an array of numbers.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance
 * with the policies at Clemson university and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the School of Computing
 * at Clemson University. Any publishing or posting
 * of source code for this project is strictly prohibited
 * unless you have written consent from the instructor.
 */

public class Stat {

	private double[] data;
	
	public Stat() {
		data = new double[]{0.0};
		}
	
	public Stat(double[] d) {
		double[] tempArray = new double[d.length];
		data = new double[d.length];
		for (int i = 0; i <= d.length - 1; i++) {		// Sets the values of input d to tempArray
			tempArray[i] = d[i];
		}
		for (int j = 0; j <= tempArray.length - 1; j++) {		// Sets the values of tempArray to data
			data[j] = tempArray[j];
		}
	}
	
	public double[] getData() {
		double[] tempArray = new double[data.length];		// Creates a tempArray, assigns values from data, and returns tempArray
		for (int k = 0; k <= data.length - 1; k++) {
			tempArray[k] = this.data[k];
		}
		return tempArray;
	}
	
	public void setData(double[] d) {
		double[] tempArray = new double[d.length];
		for (int l = 0; l <= d.length - 1; l++) {
			tempArray[l] = d[l];
		}
		data = tempArray;
	}
	
	public boolean equals(Stat s) {
		boolean ifEqual = true;			// Temporary variable to keep track if the two arrays are equal
		if (this.data.length == s.data.length) {		// Ensures that the lengths are equal before checking values
			for (int i = 0; i <= this.data.length - 1; i++){
				if (this.data[i] != s.data[i]){
					ifEqual = false;
				}
			}
		}
		else {
			ifEqual = false;
		}
		return ifEqual;
	}
	
	public String toString() {		// Overrides default toString method
		String tempString = "";
		for (int m = 0; m <= data.length - 1; m++) {
			if (m == 0) {
				tempString = (tempString + "[" + data[m]);
			}
			else if ((m == 0) && (m == data.length - 1)) {
				tempString = (tempString + "[" + data[m] + "]");
			}
			else {
			tempString = (tempString + ", " + data[m]);
			}
		}
		return (tempString + "]");
	}
	
	public double min() {
		double minValue = Double.MAX_VALUE;		// Anything smaller than this is considered
		for (int n = 0; n <= data.length - 1; n++) {
			if (data[n] < minValue) {
				minValue = data[n];
			}
		}
		return minValue;
	}
	
	public double max() {
		double maxValue = -Double.MIN_VALUE;		// Anything larger than this is considered
		for (int n = 0; n <= data.length - 1; n++) {
			if (data[n] > maxValue) {
				maxValue = data[n];
			}
		}
		return maxValue;
	}
	
	public double average() {
		double sumValues = 0;
		for (int o = 0; o <= data.length - 1; o++) {
			sumValues = sumValues + data[o];
		}
		return (sumValues / data.length);		// Add all the numbers in the array and divide by the number of numbers
	}
	
	public double mode() {
		double modeValue = 0, modeNumber = 0, currentVal = 0, currentNum = 0; // mode___ refers to the overall mode for the array, current___ to the entry being inspected
		boolean ifMultMode = false;											// value is the actual number, number is the times of occurrences
		for (int p = 0; p <= data.length - 1; p++) {
			currentVal = data[p];
			currentNum = 0;		// Resets before advancing to next entry
			for (int q = 0; q <= data.length - 1; q++) {
				if (currentVal == data[q]) {
					currentNum += 1;
				}
			}
			if (currentNum > modeNumber) {
				modeNumber = currentNum;
				modeValue = currentVal;
				ifMultMode = false;			// This would mean that there are not multiple values that are modes
			}
			else if ((currentNum == modeNumber) && (currentVal != modeValue)) {
				ifMultMode = true;
			}
		}
		if (ifMultMode == false) {
			return modeValue;
		}
		else {
			return Double.NaN;
		}
	}
}
