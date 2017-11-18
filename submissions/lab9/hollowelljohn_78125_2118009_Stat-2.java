import java.util.HashMap;

/** @formatter:off
* Stat.java
* Author: John Hollowell
* Submission Date: 10/31/2017
*
* Purpose: Create a class that performs certain statistical functions
* on a given set of double values to demonstrate OOP and encapsulation.
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
* @formatter:on
*/

public class Stat {

	private double[] data;

	public Stat() {

		this.data = new double[1];
		this.data[0] = 0.0;
	}

	public Stat(double[] d) {

		setData(d);
	}

	public double[] getData() {

		double[] returnD = new double[data.length];
		for (int i = 0; i < data.length; i++)
			returnD[i] = data[i];
		return returnD;
	}

	/**
	 * Sets the data variable of this object to the given array
	 * 
	 * @param d
	 *            An input double array
	 */
	public void setData(double[] d) {

		data = new double[d.length];
		for (int i = 0; i < data.length; i++)
			data[i] = d[i];
	}

	/**
	 * @param s
	 *            Another Stat object
	 * @return true if this object has the same data in the same order as [s]
	 */
	public boolean equals(Stat s) {

		for (int i = 0; i < this.data.length; i++) {
			if (this.data[i] != s.data[i]) return false;
		}
		return true;
	}

	/**
	 * @return String representation of this object's [data] variable
	 */
	public String toString() {

		String returnStr = "[";
		for (double element : this.data)
			returnStr += element + ", ";
		// remove the trailing comma and space, add an end bracket, and return
		return returnStr.substring(0, returnStr.length() - 2) + "]";
	}

	/**
	 * @return the smallest double value in this object's [data] variable
	 */
	public double min() {

		double min = Double.MAX_VALUE;
		for (double element : this.data)
			min = element < min ? element : min;
		return min;
	}

	/**
	 * @return the largest double value in this object's [data] variable
	 */
	public double max() {

		double min = -1 * Double.MAX_VALUE;
		for (double element : this.data)
			min = (element > min) ? element : min;
		return min;
	}

	/**
	 * @return the mean of the values in this object's [data] variable
	 */
	public double average() {

		double sum = 0;
		for (double element : this.data)
			sum += element;
		return sum / this.data.length;
	}

	/**
	 * Returns the most common (frequent) value in the object's [data] variable, or
	 * Double.NaN if there is no one value that is more common.
	 * 
	 * @return the most common value. If no number is more common, return
	 *         Double.NaN;
	 */
	public double mode() {

		// stores the doubles in data and the count that number appears
		HashMap<Double, Integer> frequencyMap = new HashMap<Double, Integer>();
		for (double element : this.data) {
			// If the number has already been encountered, add 1 to the count for that
			// number.
			if (frequencyMap.get(element) != null) {
				frequencyMap.put(element, frequencyMap.get(element) + 1);
			}
			// Otherwise, the number is a new element, so we add it
			else {
				frequencyMap.put(element, 1);
			}
		}

		int maxFreq = 0;
		double maxValue = 0;
		int duplicateCount = 1;

		// Determines the highest frequency value, and if there are multiple values with
		// the same frequency
		for (Double key : frequencyMap.keySet()) {
			if (frequencyMap.get(key) == maxFreq) duplicateCount++;
			if (frequencyMap.get(key) > maxFreq) {
				maxFreq = frequencyMap.get(key);
				maxValue = key;
				duplicateCount = 1;
			}

		}
		if (duplicateCount > 1) return Double.NaN;

		return maxValue;
	}


	/**
	 * @param args
	 *            unused
	 */
	public static void main(String[] args) {

		double[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double[] data1 = {20.0, 10.0, 20.0, 30.0, 30.0, 20.0};
		Stat stat1 = new Stat(data);

		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 data = " + stat1.toString());

		stat1.setData(data1);
		System.out.println("\nchanged stat1 data.\n");

		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 data = " + stat1.toString());

	}

}
