/*
* Stat.java
* Author: Harrison C Hall
* Submission Date: November 1, 2017
*
* Purpose: Program changes statistics in double arrays. 
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
//import java.util.Arrays;
public class Stat {
	
	private double[] data;
	
	/**public static void main(String[] args) { //the main method was for testing purposes
	}**/ 
	
	public Stat(){ //Makes array of just 0.0
		double[] newArray = {0.0};
		setData(newArray);
	}
	
	public Stat(double[] d){ //makes array equal to that of d[]
		//setData(d);
		double[] newArray = new double[d.length];
		for(int i = 0; i < d.length; i++){
			newArray[i] = d[i];
		}
		setData(newArray);
	}

	public double[] getData(){//returns array of object
		return this.data;
	}
	
	public void setData(double[] d){//sets object array based on d
		double[] newArray = new double[d.length];
		for(int i = 0; i < d.length; i++){
			newArray[i] = d[i];
		}
		this.data = newArray;
	}
	
	public boolean equals(Stat s){ //checks if object array equals array of s
		int x = 0;
		if(this.getData().length != s.getData().length){ //if array lenghts are not equal, the arrays are automatically not equal
			return false;
		}
		for(int i = 0; i < s.getData().length; i++){ //changes x if i in both arrays are not equal
			if (this.getData()[i] != s.getData()[i]){
				x++;
			}
		}
		if (x==0){ //x doesn't change, therefore they are equal
			return true;
		}else{ //so if x changes at all, they are not equal
			return false;
		}
	}
	
	public String toString(){//prints string of array
		String s = "[";
		for(int i = 0; i < data.length; i++){
			s = s + data[i] + ", ";
		}
		s = s.substring(0, s.length() - 2) + "]"; //may need -3
		return s;
	}
	
	public double min(){//computes smallest value
		double smallest = data[0];
		for(int i = 1; i < data.length; i++){
			if (smallest > data[i]){
				smallest = data[i];
			}
		}
		return smallest;
	}
	
	public double max(){ //computes largest value
		double biggest = data[0];
		for(int i = 1; i < data.length; i++){
			if (biggest < data[i]){
				biggest = data[i];
			}
		}
		return biggest;
	}
	
	public double average(){ //computes average value
		double average = 0;
		for(int i=0; i<data.length;i++){
			average = average + data[i];
		}
		average /= data.length;
		return average;
	}
	
	public double mode(){ //I feel like this was a lot harder than it should have been, computes mode
		int[] newArray = new int[data.length];
		double mode = data[0];
		for(int i = 0; i < data.length; i++){//makes newArray equal to number of occurrences of of data value
			int amount = 0;
			for(int j = 0; j < data.length; j++){
				if (data[i] == data[j]){
					amount++;
				}
			newArray[i] = amount;
			}
		}
		//System.out.println(Arrays.toString(newArray)); //for testing
		
		int biggest = newArray[0];
		for(int i = 0;i<data.length;i++){ // this section returns NaN if number of occurences of mode is greater than it should be (mode happens more than once)
			//double biggest = newArray[0];
			for(int j = 1; j < data.length; j++){
				if (biggest < newArray[i]){
					biggest = newArray[i];
				}
			}
		}
		//System.out.println(biggest); //for testing
		int amount = 0;
		for(int j = 1; j < data.length; j++){
			if (biggest == newArray[j]){
				amount++;
			}
		}
		if (amount > biggest){
			return Double.NaN;
		}
		
			
		mode = data[0]; //section computes mode
		for(int i = 1;i<data.length;i++){
			if(newArray[i] > newArray[i - 1]){
				mode = data[i];
			}
		}
		return mode;
	}
	
	
}
