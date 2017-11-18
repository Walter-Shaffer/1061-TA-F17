/*
		* Stat.java
		* Author: Spalding Latham
		* Submission Date: [11/03/2017]
		*
		* Purpose: This class creates methods to compare double arrays, including methods to return information such as the 
		* average, max, min, and mode
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
public class Stat{

	private double[] data;
	
	
	//default constructor
	public Stat(){
		
		double[] newArray;
		newArray = new double[1];
		newArray[0] = 0.0;
		data = newArray;
		}
	
	
	
	public Stat(double[] d){

		double[] constructor = new double[d.length];
		
		//loop to store values of d array in constructor array
		for (int i = 0; i < d.length; i++){
			constructor[i] = d[i];
		}
		
		data = constructor;
	}
	
	
	
	//getter method
	public double[] getData(){
		
		double[] newData = new double[data.length];
		
		//loop to store values of the data array in a new array
		for(int i = 0; i < data.length; i++){
			newData[i] = data[i];
		}
		
		return newData;
	}
	
	
	
	//setter method
	public double[] setData(double[] d){
		double[] setData = new double[d.length];
		
		//loop to store values of d array in the setData array
		for(int i = 0; i < d.length; i++){
			setData[i] = d[i];
		}
	    
		data = setData;
		return data;
	}
	
	
	
	//equals method
	public boolean equals(Stat s){
	if (this.data.length != s.data.length){
		return false;
	}
	
	for (int i = 0; i < this.data.length; i++){
		if (this.data[i] != s.data[i]){
			return false;
		}
	}
	
	return true;	
	}
			

	
	//toString method
	public String toString(){
		String output = "[";
		
		//loop to add the values of the array into a string
		for (int i = 0; i < data.length; i++){
			//if-else statement to format the output 
			if (i < data.length - 1)
				{output += data[i] + ", ";}
			else
				if (i == data.length - 1){
				output += data[i] + "]";
			}
		}
		return output;
	}
	
	
	//method to return the minimum of the array
	public double min(){
		int j;
		int n = data.length;
		double min = data[0];
		//loop to find the minimum of the array
		for (j = 1; j < n; j++){
			
			if (data[j] < min){
				min = data[j];}			
		}
		return min;
	}
	
	
	
	
	//method to array the maximum of the array
	public double max(){
		int j;
		int n = data.length;
		double max = data[0];
		//loop to find the maximum of the array
		for (j = 1; j < n; j++){
			
			if (data[j] > max){
				max = data[j];}			
		}
		return max;
	}
	
	
	
	//method to return the average of the array
	public double average(){
		double sum = 0;
		int i;
		int n = data.length;
		//loop to find the sum
		for(i = 0; i < n; i++){
			sum += data[i];
		}
		double average = sum / n;
		return average;
		}
	
	
	
	//method to return the mode of the array
	public double mode(){
		double increment = 0;
		double increment1 = 0;
		double frequent = 0;
		double frequent1 = 0;
		
		for(int i = 0; i < data.length; i++){
			frequent1 = data[i];
			increment1 = 1;
			
			for (int j = i+1; j < data.length; j++){
				
				if (frequent1 == data[j]){
					increment1++;}
				
				if (increment1 > increment){
					frequent = frequent1;
					increment = increment1;}
				
				else if(increment1 == increment){
				frequent = Double.NaN;	}
					
			
			}
		
		
		}
		
	return frequent;	
		
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

