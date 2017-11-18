/*
* Stat.java
* Author: Joshua Williams
* Submission Date: 11/2/17
*
* Purpose: 
* 	The Stat.java class stores an array of double values called data. 
* it computes the min, max, mode, and average of these values. 
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
		//The default constructor for Stat. It should create a double array having a single element 0.0.
		data = new double[] {0.0};
	}

	public Stat(double[] d) {
		//Constructs a Stat object using the values held in d. 
		//The constructor should create a double array of the same length as d and holding copies of the values of d. A
		//reference to this new array should be assigned to data
		double[] returnData = new double[d.length];
		for(int i = 0; i<d.length; i++){
			returnData[i] = d[i];
		}
		data = returnData;
	}

	public double[] getData() {
		double[] returndata = data;
		return returndata;
	}

	public void setData(double[] d) {
		//This is a mutator (set or setter) method used to set the values of the
		//data array. The method should create a new array containing exactly the elements of d and assign to
		//data a reference to this new array (that is, the method should not simply assign d to data).
		double[] returnData = new double[d.length];
		for(int i = 0; i<d.length; i++){
			returnData[i] = d[i];
		}
		data = returnData;
	}

	public boolean equals(Stat s) {
		for(int i = 0; i<data.length; i++){
			if(s.data[i] != this.data[i]){
				return false;
			}
		}
		return true;
	}
	public String toString(){
		String returnString = "[";
		for(int i = 0; i<data.length; i++){
			returnString += data[i];
			if(i != data.length-1){
			returnString += ", ";
			}
		}
		return returnString + "]";
	}
	public double min(){
		double lowest = data[0];
		for(int i = 0; i<data.length; i++){
			if(data[i] < lowest){
				lowest = data[i];
			}
		}
		return lowest;
	}
	public double max(){
		double maximum = data[0];
		for(int i = 0; i<data.length; i++){
			if(data[i] > maximum){
				maximum = data[i];
			}
		}
		return maximum;
	}
	public double average(){
		double averageValue = 0;
		for(int i = 0; i<data.length; i++){
			averageValue += data[i];
		}
		return averageValue/data.length;
	}
	public double mode(){
		double[] frequency = new double[data.length];
		for(int i = 0; i<data.length; i++){
			double searchDouble = data[i];
			for(int j = 0; j<data.length; j++){
				if(data[j] == searchDouble){
					frequency[i] +=1;
				}
			}
		}
		int maximumIndex = 0;
		double maximum = frequency[0];
		double timesMaximumHappens = 0;
		for(int i = 0; i<frequency.length; i++){
			if(frequency[i] > maximum){
				maximum = frequency[i];
				maximumIndex = i;
			}
		}
		for(int i = 0; i<frequency.length; i++){
			if(frequency[i] == maximum){
				timesMaximumHappens+=1;
			}
		}
		if(timesMaximumHappens !=  maximum){
			return Double.NaN;
		}
		
		return data[maximumIndex];
	}
}
