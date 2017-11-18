	/*
* Stat.java
* Author: Hunter Singletary
* Submission Date: 11/03/2017
*
* Purpose: A program that tests different Arrays 
* for minimums and maximums, the average of the indices,
* and the mode.
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
	
	private double [] data = {0};
	
	public Stat(){              //Creates an array of one element, 0.0.
		
	double[] d = {0.0};
	}
	
	public Stat(double[] d){                
		double[] other = new double[d.length];
		for (int i = 0; i < d.length; i++){
			other[i] = d[i];
		}
		data = other;
		
	}

	public double[] getData(){              //returns an array with the same values as data
		
		double[] array = new double[data.length];
			for (int i = 0; i < data.length; i++){
				array[i] = data[i];
			}
		
		return array;
		
		}

	public void setData(double[] d){                //sets the values for data
		double[] temp = new double[d.length];
		for (int i = 0; i < d.length; i++){
			temp[i] = d[i];
		}
		
		temp = data;
	}
	
	public boolean equals(Stat s){                   //a function for testing if two arrays are equal
		
		
		for (int i = 0; i < data.length && i < this.data.length; i++){
			if (this.data[i] != data[i])
				return false;
		}
		return true;
	}
	
	public String toString(){			//returns the array "data" as a string
		String toReturn = "";
		toReturn += '{';
		for (int i = 0; i < data.length; i++)
			toReturn += data[i] + ", ";
		toReturn += '}';
		return toReturn;
		
	}
	
	public double min(){			// returns the minimum element of data
		
		double min = data[0];
		for (int i = 1; i < data.length; i++){
			if (min > data[i])
				min = data[i];		
		}
		return min;
	}
	
	public double max(){		// returns the max element of data
		double max = data[0];
		for (int i = 1; i < data.length; i++){
			if (max < data[i])
				max = data[i];
		}		
		return max;
		
	}
	
	public double average(){	// computes and returns the average of data
		
		double average = 0;
		for (int i = 0; i < data.length; i++){
			average += data[i];
		}
		average /= data.length;
		
		return average;
	}
	
	public double mode(){
		double count = 0, count1 = 0, frequency = 0, frequency1 = 0;
		for (int i = 0; i < data.length; i++){
				frequency = data[i];
				count = 1;
			
				for (int j = i + 1; j < data.length; j++){
			if (frequency == data[j])
				count++;
			if (count > count1){
				frequency1 = frequency;
				count1 = count;
			}
			
			else if (count1 == count){
				frequency = Double.NaN;
			}
				}	
		}
		return frequency;	
	}
	public static void main(String[] args) {
		double[] data = {1,2,2,3,3,4};
		Stat stat1 = new Stat(data);
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 data = " + stat1.toString());
	}
}