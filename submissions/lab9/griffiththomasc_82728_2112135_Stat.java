/*

* [Stat].java

* Author: [Thomas Griffith]

* Submission Date: [November, 3 2017]

*

* Purpose: The purpose of this lab is stores an array of 

* values then we will be able to compare the values and get 

* the min, max, mode, and average of the array. I use the get 

* and set methods to retrieve those values. 

*  

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

	private double[] data;

	// for my testing purposes the main method is provided

	public static void main(String[] args) {

		//

		double[] data1 = { 10.0, 20.0, 30.0 };

		Stat stat1 = new Stat();

		stat1.setData(data1);

		Stat stat2 = new Stat(data1);

		double[] data2 = stat1.getData();

		System.out.println("The arrays are identical: " + (data1 == data2));

		System.out.println("stat2 equals stat1: " + stat2.equals(stat1));

		System.out.println("stat1 equals stat2: " + stat2.equals(stat1));

		//

	}

	// is the default constructor and it makes a double array with

	// just 0.0 in the array

	public Stat() {

		this.data = new double[1];

		this.data[0] = 0.0;

	}

	// constructs a stat object in the d input and puts the values in

	// array d into array data as a reffernce copy

	public Stat(double[] d) {

		data = new double[d.length];

		for (int i = 0; i < d.length; i++) {

			data[i] = d[i];

		}

	}

	// this should recieve you the data values by creating another array [] the

	// is returned

	public double[] getData() {

		double[] test = this.data;

		return test;

	}

	// this sets the values of of the data [] by using the values of d and

	// putting them in data

	public void setData(double[] d) {

		data = new double[d.length];

		for (int x = 0; x < d.length; x++) {

			data[x] = d[x];

		}

	}

	// this returns a true or false statement if the two data arrays you are

	// comparing are the same, same valueswithin them

	public boolean equals(Stat s) {

		boolean wow = true;

		for (int i = 0; i < data.length; i++) {

			if (data.length != s.data.length) {

				wow = false;

			}

			else {

				for (int j = 0; j < data.length; j++) {

					if (data[j] != s.data[j]) {

						wow = false;

					}

				}

			}

		}

		return wow;

	}

	// returns a string of the data []

	public String toString() {

		String stringArray = "[";

		for (int i = 0; i < this.data.length; i++) {

			if (i < this.data.length - 1) {

				stringArray = stringArray + this.data[i] + ",";

			} else {

				stringArray = stringArray + this.data[i];

			}

		}

		stringArray = stringArray + "]";

		return stringArray;

	}

	// returns the minimum value in the array

	public double min() {

		double previous = data[0];

		double num;

		for (int i = 0; i < data.length; i++) {

			num = data[i];

			if (previous > num) {

				previous = num;

			}

		}

		return previous;

	}

	// returns the maximum value in the array

	public double max() {

		double max = data[0];

		for (int i = 0; i < data.length; i++) {

			if (max < data[i]) {

				max = data[i];

			}

		}

		return max;

	}

	// returns the average value in the array

	public double average() {

		double total = 0;

		for (int i = 0; i < data.length; i++) {

			total += data[i];

		}

		return total / data.length;

	}

	// returns the mode value in the array

	public double mode() {

		int samenumber = 1;

		int counterNum = 0;

		int couter2 = 0;

		double modeArray = data[0];

		for (int i = 0; i < data.length; i++) {

			couter2 = 0;

			for (int x = 1; x < data.length; x++) {

				if (data[i] == data[x]) {

					couter2++;

				}

			}

			if (couter2 > counterNum) {

				modeArray = data[i];

				samenumber = 1;

				counterNum = couter2;

			} else if (couter2 == counterNum && data[i] != modeArray) {

				samenumber++;

			}

		}

		if (samenumber > 1) {

			return Double.NaN;

		} else {

			return modeArray;

		}

	}

}