/*
 * Stat.java
 * Author: John Xue
 * Submission Date: Nov. 2, 2017
 *
 * Purpose: Use a class file to hold various methods to analyze and
 * manipulate the data array.
 *
 * Statement of Academic Honesty:
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized assistance
 * or plagiarism will be handled in accordance with the policies at
 * Clemson University and the policies of this course. I recognize that my
 * work is based on an assignment created by the School of Computing at
 * Clemson University. Any publishing or posting of source code
 * for this project is strictly prohibited unless you have written
 * consent from the instructor.
 */

public class Stat {
	private double[] data;
	
	
	// Constructors for Stat Class
	Stat() {
		data = new double[]{0.0};
	}
	
	Stat(double[] d) {
		this.setData(d);
	}
	
	// Returns array that contains deep copy of values in the data array
	public double[] getData() {
		double[] array = new double[this.data.length];
		for (int i = 0; i < this.data.length; i++) {
			array[i] = this.data[i];
		}
		return array;
	}
	
	// Sets values array d in data array (deep copy)
	public void setData(double[] d) {
		this.data = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			this.data[i] = d[i];
		}
	}
	
	// Returns true if this.data has the same values in the same order as s.data
	public boolean equals(Stat s) {
		if (s.data.length != this.data.length) {
			return false;
		} else {
			for (int i = 0; i < s.data.length; i++) {
				if (s.data[i] != this.data[i]) {
					return false;
				}
			}
			return true;
		}
	}
	
	// Default output when the object is called by itself
	public String toString() {
		String output = "[";
		for(int i = 0; i < this.data.length - 1; i++) {
			output += this.data[i];
			output += ", ";
		}
		output += this.data[this.data.length - 1] + "]";
		return output;
	}
	
	// Returns minimum value of this.data set
	public double min() {
		double x = data[0];
		for (int i = 1; i < this.data.length; i++) {
			if (data[i] < x) {
				x = data[i];
			}
		}
		return x;
	}
	
	// Returns maximum value of this.data set
	public double max() {
		double x = data[0];
		for (int i = 1; i < this.data.length; i++) {
			if (data[i] > x) {
				x = data[i];
			}
		}
		return x;
		
	}
	
	// Returns arithmetic mean of this.data set
	public double average() {
		double x = 0;
		for (int i = 0; i < this.data.length; i++) {
			x += data[i];
		}
		return (x / this.data.length);
	}
	
	// Returns mode value of this.data set (Return NaN if no mode exists)
	public double mode() {
		int[] range = new int[this.data.length];
		for (int i = 0; i < this.data.length; i++) {
			double key = this.data[i];
			int k = 1;
			for (int j = i + 1; j < this.data.length; j++) {
				if(key == this.data[j]) {
					k++;
				}
			}
			range[i] = k;
		}
		int x = range[0];
		for (int i = 1; i < range.length; i++) {
			if (range[i] > x) {
				x = range[i];
			}
		}
		double mode = 0;
		int j = 0;
		for (int i = 0; i < range.length; i++) {
			if(x == range[i]) {
				j++;
				mode = this.data[i];
			}
		}
		if (j == 1) {
			return mode;
		} else {
			return Double.NaN;
		}
		
	}
	public static void main(String[] args) {
		/* Various Tests */
		// 1
		double[] data_1 = {10.0, 20.0, 30.0};
		Stat stat_1 = new Stat(data_1);
		double[] data_2 = stat_1.getData();
		System.out.println("The arrays are identical: " + (data_1 == data_2));
		
		// 2
		double[] data = {-5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88.9, 109.5, -90, 88.9};
		double[] data2 = {100.34, 50.01, 50.01, -8};
		Stat stat1 = new Stat();
		System.out.println("stat1 data = " + stat1.toString());
		stat1 = new Stat(data);
		System.out.println("stat1 has been altered.");
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode() + "\n");
		Stat stat2 = new Stat();
		stat2.setData(data2);
		Stat stat3 = new Stat(stat1.getData());
		System.out.println("stat2 data = " + stat2.toString());
		System.out.println("stat3 data = " + stat3.toString());
		System.out.println();
		System.out.println("stat1 is equal to stat2 using \"equals()\"? " +
		stat1.equals(stat2));
		System.out.println("stat1 is equal to stat3 using \"equals()\"? " +
		stat1.equals(stat3));
		System.out.println("stat1 is equal to stat3 using \"==\"? " + (stat1 == stat3));
	}
}