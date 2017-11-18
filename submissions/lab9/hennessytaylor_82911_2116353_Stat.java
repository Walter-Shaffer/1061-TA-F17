


public class Stat {
	/*
	* Stat.java
	* Author: Taylor Hennessy
	* Submission Date: 11/3/2017
	*
	* Purpose: This is a class for a Stat object, containing methods 
	* that work with an array of doubles.
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

	private double[] data;
	
	//written constructor
	public Stat(){
		data = new double[] {0.0};
	}
	
	//constructor with passed parameter
	public Stat (double[] d){
		//create real copy (not shallow copy) of d
		data = new double[d.length];
		
		//fill with d values
		for (int i = 0; i < d.length; i++){
			data[i] = d[i];
		}
	}
	
	//return reference to deep copy of the data
	public double[] getData(){
		//make a deeeeeep copy of data
		double[] returnData = new double[this.data.length];
		
		//fill with data values
		for (int i = 0; i < this.data.length; i++){
			returnData[i] = this.data[i];
		}
		//return a ref to my deep copy
		return returnData;
	}
	
	//set data equal to passed array
	public void setData(double[] d){
		//make a deeeeeep copy of d
		double[] newData = new double[d.length];
		
		//fill with passed values
		for (int i = 0; i < this.data.length; i++){
			newData[i] = d[i];
		}
		//set data equal to a ref to newData array
		this.data = newData;
	}
	
	//check if equal or not
	public boolean equals(Stat s){
		
		if (s.getData().length == this.data.length)
		{
			//loop to find out if each one is equal
			for (int i = 0; i < this.data.length; i++){
				//if the one at i isn't equal
				if (s.getData()[i] != data[i]){
					return false;
				}
			}
		}
		else 
			{
				return false;
			}
	//assuming they got out of that if statement, it's true
	return true;
	}

	//return a string variable to represent the stat
	public String toString(){
		String theString= "";
		
		//loop through and add values to the string
		for (int i = 0; i < this.data.length; i++)
		{
			theString = theString + this.data[i];
			if (i != this.data.length - 1)
			{
				theString = theString + ", ";
			}
		}
		
		return "[" + theString + "]";
	}
	
	//return the smallest double of the data array
	public double min(){
		//variable for min val
		double min = this.data[0];
		
		for (int i = 1; i < this.data.length; i++){
			//if the minimum is more than the current index, change min to that value
			if (min > this.data[i]){
				min = this.data[i];
			}
		}
		//return the minimum val
		return min;
	}

	//return the largest double of the data array
	public double max(){
		//variable for max val
		double max = this.data[0];
		
		for (int i = 1; i < this.data.length; i++){
			//if the maximum is less than the current index, change max to that value
			if (max < this.data[i]){
				max = this.data[i];
			}
		}
		//return the maximum val
		return max;
	}
	
	
	//return the average of the data set
	public double average(){
		//create variable to hold the values
		double average = 0;
		
		for (int i = 0; i < this.data.length; i++){
			//add current index
			average += this.data[i];
			}
		return (average/this.data.length);
	}
	
	//return the most common double in the data set
	public double mode(){
		
		//make a double to return the mode
		double mode = 0.0;
		
		//make 2 possible mode doubles
		double maybeMode;
		
		//make 2 mode count integers
		int modeCount1= 0;
		int modeCount= 0;
		
		//outer loop to go through the array
		for (int i = 0; i < this.data.length; i++)
		{
			//assign maybeMode in order to 
			maybeMode = this.data[i];
			
			for (int j = 0; j < this.data.length; j++)
			{
				if (maybeMode == this.data[j]){
					modeCount1++;
				}
			}
			
			//if the new number (at index i) occurs more 
			//often than the old number (or is the first one)
			//assign the new number to mode
			//and its count to modeCount
			if (modeCount1 > modeCount)
			{
				mode = maybeMode;
				modeCount = modeCount1;
			}
			//reset mode count
			modeCount1 = 0;
		}
		
		
		//outer loop to go through the array again
		for (int i = 0; i < this.data.length; i++)
		{
			//assign maybeMode in order to 
			maybeMode = this.data[i];
			
			for (int j = 0; j < this.data.length; j++)
			{
				if (maybeMode == this.data[j]){
					modeCount1++;
				}
			}
			
			if ((maybeMode != mode) && (modeCount1 == modeCount)){
				return Double.NaN;
			}
		}
		
		//if the mode actually occurs more than once, return it
		if (modeCount > 1)
		{ return mode; }
		//if not, there is no mode and return NaN
		else
		{ return Double.NaN; }
		
	}
	

}
