/* Stat.Java
* Author: Allison Tizik
* Submission Date: 10/26/17
* Purpose: The program recieves the data. After getting the
* data as an array it converts it to a string. In string format
* it prints it in a more readable format. It then runs it through
* the average, min, max, and mode methods and reports those. Finally
* it runs it through the equals method and returns true or false
* depending on if the arrays are equal to each other.
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

	private double [] data;
	
	// default constructor
	public Stat(){
		double [] dataArray = {0.0};
		this.data = dataArray;
			}

	// constructs stat object holding the d values in a array
	public Stat(double[] d){
		 double [] data = new double [d.length];
		 data = d;
		this.data = data; 
		 }
	//accessor to the data
	public double[] getData(){
		return data;
	}
	
	//mutator to set data to different variable
	public void setData(double[] d){
		d = data;
	}
	
	//if the stat object and the past stat object have the same values returns true
	public boolean equals(Stat s) {
		boolean isFalse = false;
		boolean isEqual = false;
		if(this.data.length == s.data.length){
			for(int i = 0; i < data.length; i++){
				if(this.data[i] != s.data[i]){
					isFalse = true;;
				}
			}
		if(isFalse != true){
			isEqual = true;
		}
		}
		return isEqual;
	}
 
	// string representation of the data
	public String toString(){
		String dataString = null;
				for(int i =0; i<this.data.length; i++){
					if (i==0){
						dataString = "[";
					}
					if (i != 0){
						dataString += ", ";
					}
					dataString += this.data[i];
				}
				dataString += "]";
				return(dataString);
				
	}
	
	//returns the min number from the array
	public double min(){	
		double result = data [0];
		for (int i = 0; i<data.length; i++){
			if (data[i]< result)
			result = data[i];
		}
		return result;
	}
	
	//returns the max number from the array
	public double max(){
		double result = data [0];
		for (int i = 0; i<data.length; i++){
		if (data[i]>result)
		result = data[i];
		}
		return result;
	}
	
	// returns the average of the array
	public double average(){
		double average; 
		double sum = 0;
		for (int i = 0; i<data.length; i++){
			sum+= data[i];
		}
		average = sum/data.length;
		return average;
	}
	
	//returns the mode of the number that shows up the most
	public double mode(){
		double maxValue = 0;
		double maxCount = data.length;

	    for (int i = 0; i < data.length; ++i) {
	        int count = 0;
	        for (int j = 0; j < data.length; ++j) {
	            if (data[j] == data[i]) ++count;
	        }
	        if (count > maxValue) {
	            maxCount = count;
	            maxValue = this.data[i];
	        }else if ((count == maxCount) && (maxValue != data[i])){
	        	maxValue = Double.NaN;
	        }
	    }
	    return maxValue;
	}
}


