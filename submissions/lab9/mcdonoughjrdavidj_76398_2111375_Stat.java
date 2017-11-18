/*
*Stat.java
* Author:  David McDonough
* Submission Date:  November 2nd, 2017
* Purpose: Uses public class Stat to get information from a main class and fills the array Data. Uses different methods to calculate 
* if the arrays are equal, the average, min, max, and mode.
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

private double[] data;//data array that is filled throughout the program
	
	public Stat(){
		double[] data = {0.0};//sets data to a single array with an element of 0.0
		this.data = data;
	}
	public Stat(double[] d){
		this.data = new double[d.length];
		for(int i = 0; i < d.length; i++){
			data[i] = d[i];
		}
		
	}
	public double[] getData(){//'getter' method that gives the Data to the main class
		double[] newArray = new double[this.data.length];
		for(int i = 0; i < data.length; i++){
			newArray[i] = data[i];
		}
		return newArray;
	}
	public void setData(double[] d){//'setter' method that sets data equal to an identical array
		int length = d.length;
		this.data = new double[length];
		for(int i = 0; i < d.length; i++){
			data[i] = d[i];
		}
	}
	public boolean equals(Stat s){//equals method that tests if the arrays filled in the main method are equal to one another
		boolean finder = true;
		for(int i = 0; i < this.data.length; i++){
			if(this.data.length != s.getData().length){
			finder = false;
		}
		else{
		for(int k = 0; k < data.length; k++){
			if(data[k] != s.data[k]){
				finder = false;
			}
		}
	}
		}	
		return finder;
	}
	
	public String toString(){//toString method that displays the arrays in the main method between brackets and separated by commas
		String arrayData = "[";
		for(int i = 0; i < this.data.length; i++){
			if(i < this.data.length - 1){
				arrayData = arrayData + this.data[i] + ",";
			}
		
			else{
			arrayData = arrayData + this.data[i];
		}
		}
			arrayData = arrayData +"]";
		
			return arrayData;
		
	}
	public double max(){//method that determines the max value in the array
		double max = data[0];
		for (int i = 1; i < data.length; i++){
			if(max < data[i]){
				max = data[i];
			}
				}
		return max;
	}
	public double min(){//method that determines the min value in the array
		double min = data[0];
		for (int i = 1; i < data.length; i++){
			if(min > data[i]){
				min = data[i];
			}
				}
		return min;
	}
	
	public double average(){//method that calculates the average of the array
		double total = 0;
		for (int i = 0; i < data.length; i++){
			total += data[i];
		}
		
		return total/data.length;
	}
	public double mode(){//method that calculates the mode of the array
		int sameValue = 0;
		int count = 0;
		int count2 = 0;
		
		double modeArray = data[0];
	
	
		for(int i = 0; i < data.length; i++){
			count2 = 0;
			for(int j = 0; j < data.length; j++){
				if(data[i] == data[j]){
					count2++;
					}
			}
			if(count2 > count){
				modeArray = data[i];
				sameValue = 1;
				count = count2;
			}
			else if(count2 == count && data[i] != modeArray){
				sameValue++;
			}
		}
		if (sameValue > 1){
			return Double.NaN;
		}
		else{
			return modeArray;
		}
	}
}


