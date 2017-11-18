/*
* Stat.java
* Author: Michael Grimsley
* Submission Date: 11/3/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
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
	
	public Stat(){ //Default Constructor
		this.data = new double[1];
		this.data[0] = 0.0;
	}
	public Stat(double[] d){ //Constructor
		this.data = new double[d.length];
		for (int i=0; i < d.length; i++)
		this.data[i] = d[i];
	}
	public double[] getData(){ //returns copy of data array
		double[] dataClone = new double[this.data.length]; 
		for (int i=0; i < this.data.length; i++){
		dataClone[i] = this.data[i];
		}
		return dataClone;
	}
	public void setData(double[] d){ //sets values in array to be equal to values in d
		this.data = new double[d.length];
		for (int i=0; i < d.length; i++){ 
			this.data[i] = d[i];	
		}
	}
	public boolean equals(Stat s){ //compares to arrays if they are the same returns true else returns false
		if(s.getData().length != this.data.length){ //if they are not the same length then returns false
			return false;		
		}
		for (int i=0; i < this.data.length; i++){
			if (this.data[i] != s.getData()[i]){
			return false;
			}
			}
			return true;
	}
	public String toString(){ //puts values of data into a string for easy printing 
		String out = "[";
		out += this.data[0];
		for (int i=1; i < this.data.length; i++){
			out += ", "+data[i];
		}
		return out += "]";
	}
	public double min(){ //returns min value in array
		double min = this.data[0];
		for (int i=1; i < this.data.length; i++){
			if (min > this.data[i])
				min = this.data[i];
		}
		return min;
	}
	public double max(){ //returns max value in array 
		double max = this.data[0];
		for (int i=1; i < this.data.length; i++){
			if (max < this.data[i])
				max = this.data[i];
		}
		return max;
		
	}
	public double average(){ //returns average value in array
		double mean = this.data[0];
		for (int i=1; i < this.data.length; i++){
				mean = mean + this.data[i];
		}
		mean = mean/this.data.length;
		return mean;
	}
	public double mode(){ //returns mode if there is one mode if not return .NaN
		double mode = Double.NaN; //mode set to default .NaN
		double tempModeCount = 0; //hold number of times the a the current mode at any point in the loop is repeated in the array
		double modeCount = 0; // holds the number of times the current value at index i has been repeated in the loop
		for (int i=0; i < this.data.length; i++){
			for (int k=0; k < this.data.length; k++){
			if (k != i){ //dosn't allow a number to compare to it self when checking for repeated numbers
			if (this.data[i] == this.data[k]){ // increases modeCount if they is a repeat of a number
				modeCount = modeCount + 1; 
			}
			}
			}
			if (modeCount > tempModeCount){ //replaces tempModeCount with moddCount if modeCount is higher
			tempModeCount = modeCount;
			mode = this.data[i];		
			}
		}
		if (this.data.length == 1){ //if there is only one value in the array it is the mode 
		mode = this.data[0];
		}
	return mode;	
	}
}
