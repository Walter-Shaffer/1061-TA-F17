
/*
* Stat.java
* Author:  Nina Agafonovas
* Submission Date:  November 2, 2017
* Purpose: Follow a UML diagram to implement a class called Stat using constructors, access modifiers, methods, and instance variables.
* Honesty:
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
	
private double [] data;	


public Stat(){						//Default constructor with a double array having a single element.
	data = new double [1];
	data [0] = 0.0;
}

public Stat(double[] d){			//Constructs a Stat object using the values held in array d
	data = new double[d.length];
		for (int i = 0; i < d.length; i++){
		data[i] = d[i];
		}
}


public double [] getData(){				//getter method used to retrieve the values of Data.
	double [] valuesData = this.data;
										//create new array
	return valuesData;  				//return a copy
}

public void setData(double [] d){		//setter method used to set the values of the data array created (deep copy?)
	
	data = new double[d.length];
	for (int i = 0; i < d.length; i++){
		data[i] = d[i];
	}
	

	
}
public boolean equals(Stat s){
	
	for (int j = 0; j < this.data.length; j++){
		
	if (this.data[j] != s.data[j]){
		return false;	
	}									// if they are equal, return false
	}
	
		return true;			//if they are not equal, return true
	
}

public String toString(){						
	String tempString = "[";							//String representation of the data
	for ( int i = 0; i < this.data.length; i++){
		if (i < this.data.length -1){
		tempString = tempString + this.data[i] + ", ";
	}else {
		tempString = tempString + this.data[i];
	}
	}
	return tempString + ("]");		
} 


public double min(){								
	double min = data[0];
	
	for ( int i = 1; i < data.length; i++){
													// the first number in the array
		
		if (min > data[i]){
			min = data[i];
			
		}
	}
	return min;
	
}

public double max(){
	double max = data[0];
	
	for ( int i = 1; i < data.length; i++){
												// the first number in the array
		
		if (max < data[i]){
			max = data[i];
			
		}
	}
	return max;
	
}


public double average(){
	double sum = 0;
	double average = 0;
	
	
	for (int i = 0; i < data.length; i++){
		sum = sum + data[i];
		average = (sum / data.length);		// sum/total number of numbers (which is the array length)
		}
	return average;
}
		

public double mode(){
	int sameModes = 1;				
	int maxCount = 0;
	double mode = data[0];
	
	
	
	for (int i = 0; i < data.length; ++i){		//scanning array
		int count = 0;
		
		
		
		for (int j = 0; j < data.length; ++j){
			 if (data[i] == data[j]) 				//start with i, look through arrray j and increment
				 count++;
		}
		if (count > maxCount) {								//maxCount is the most repeated number until count is greater than, 
			
			mode = data[i];
			sameModes= 1;
			maxCount = count;										//set current mode to count
		}
		else if (maxCount == count &&  data[i] != maxCount) {		//if count is equal to the current mode AND the data is not equal to the current mode
			sameModes++;											//it (frequency) is going to be greater than 1
		}
		if (sameModes > 1){					
			return Double.NaN;
		}
	}
	return mode;
	
}



}