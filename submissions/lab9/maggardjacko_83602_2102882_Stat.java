/*
* Stat.java
* Author: Jack Maggard
* Submission Date: 11/1/2017]
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* This program has a bunch of methods to make various calculations of an array
* These calculations include finding the min, max, average, mode, and finding 
* if two arrays are equal to each other
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
	private double[] data;

	public Stat() {// default constructor. Constructs an array with one number,
					// 0.0
		double[] d = { 0.0 };
		data = d;
	}

	public Stat(double[] d) {// so you can initialize a stat object to contain a
								// certain array of numbers
		double[] x = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			x[i] = d[i];
		}
		data = x;
	}

	public double[] getData() {//returns a reference to the data array
		double[] array = new double[data.length];
		array = data;
		return array;

	}

	public void setData(double[] d) {//sets the data array to be d
		double[] array = new double[d.length];
		for (int i = 0; i < d.length; i++)
			array[i] = d[i];
		data = array;

	}

	public boolean equals(Stat s) {//compares two arrays for if they contain the same double values
		int count = 0;
		if (data.length == s.getData().length) {
			for (int i = 0; i < data.length; i++) {
				if (s.getData()[i] == this.data[i]) {
					count = 0;
				} else
					count += 1;
			}
		} else
			return false;
		return count == 0;
	}

	public String toString() {//converts the calling object to a string to be read by the user
		String x = "";
		x = "[";
		for (int i = 0; i < data.length; i++) {
			x = x + this.data[i];
			if (i < data.length - 1)
				x = x + ", ";
		}
		x = x + "]";
		return x;

	}

	public double min() {//finds the minimum value of an array
		double min = Integer.MAX_VALUE;
		for (int i = 0; i < data.length; i++)
			if (data[i] < min)
				min = data[i];
		return min;

	}

	public double max() {//finds the maximum value in an array
		double max = Integer.MIN_VALUE;
		for (int i = 0; i < data.length; i++)
			if (data[i] > max)
				max = data[i];
		return max;

	}

	public double average() {//calculates the average value of an array
		double sum = 0;
		for (int i = 0; i < data.length; i++)
			sum = sum + data[i];
		double average = sum / data.length;
		return average;

	}

	public double mode() {//calculates the mode of an array
		double mode = .32142;
		int maxC = -1;
		for (int i = 0; i < data.length; i++) {
			int count = 0;
			for (int j = 0; j < data.length; j++) {
				if (data[j] == data[i])
					count = count + 1;
				if (count > maxC) {
					maxC = count;
					mode = data[i];
				}

			}

		}
		return mode;

	}

}
