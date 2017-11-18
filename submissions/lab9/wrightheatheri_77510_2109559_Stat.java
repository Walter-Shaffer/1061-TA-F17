/*
* Stat.java
* Author: Heather Wright
* Submission Date: November 2, 2017
*
* Purpose: This class is filled with methods to compute, test,
* and change the data array. getData returns an array with the 
* same values as data. setData changed the data array to the 
* input array. equals checks two arrays and returns true if
* all the values in the arrays are the same. toString prints
* all the values in an array. max searches the array and returns 
* the largest value in the array. min searches the array and returns
* the smallest value. average adds all the values in the array and 
* then divides that by the length of the array which is the average.
* Lastly, mode returns the most repeated in the array. If two of the
* values repeat the same amount of times it returns NaN. 
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
	
	public Stat() {
		data = new double[1];
		data[0] = 0.0;
	}
	public Stat(double[] d) {
		setData(d);
	}
	public double[] getData(){
		double[] newArray = new double[this.data.length];
		for(int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		return newArray;
	}
	public void setData(double[] d) {
		int length = d.length;
		data = new double[length];
		for(int i = 0; i < length; i++) {
			data[i] = d[i];
		}
	}
	public boolean equals(Stat s) {
		boolean flag = true;
		for(int i = 0; i < this.data.length; i++) {
			if(this.data.length != s.data.length) {
			flag = false;
			}
			else {
				for(int j = 0; j < data.length; j++) {
					if(data[j] != s.data[j]) {
						flag = false;
					}
				}	
			}
		}
		return flag;	
	}
	public String toString() {
		String elements = "";
		if(data.length == 1) {
			return "[" + data[0] + "]";
		}
		else {
			for(int i = 0; i < data.length -1; i++) {
				elements += data[i] + ", ";
			}
		elements = elements + data[data.length - 1];
		return "[" + elements + "]";
		}
	}
	public double max() {
		double max = data[0];
		for(int i = 1; i < data.length; i++) {
			if(max < data[i]) {
				max = data[i];
			}
		}
		return max;
	}
	public double min() {
		double min = data[0];
		for(int i = 1; i < data.length; i++) {
			if(min > data[i]) {
				min = data[i];
			}
		}
		return min;
	}
	public double average() {
		double totalvalue = 0;
		for(int i = 0; i < data.length; i++) {
			totalvalue += data[i];
		}
		return totalvalue / data.length;
	}
	
	public double mode(){
		int sameModes = 1;
        int currentModeCount = 0;
        double currentMode = 0;
        for (int i = 0; i < data.length; i++) {
            int count = 0;
            for (int j = 0; j < data.length; j++) {
                    if (data[j] == data[i])
                        count++;
            }
            if (count > currentModeCount) {
                currentMode = data[i];
                sameModes = 1;
                currentModeCount = count;
            }
            else if (count == currentModeCount && data[i] != currentMode)
            {
                sameModes++;
            }
        }
        if (sameModes > 1) {
            return Double.NaN;
        }
        else {
            return currentMode;
        }
	}
}
