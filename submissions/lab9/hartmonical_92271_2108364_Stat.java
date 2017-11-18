/* 
 * File name: Stat.java
 * Author: Monica Hart
 * Submission Date: 11/1/2017
 *
 * This program does the following:
 * This program creates a double array of data and calculates
 * the data's min, max, average, and mode, and returns a boolean
 * if two data arrays are equal.
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
 *
 */

public class Stat {
	
	private double[] data;
	
	//default constructor
	public Stat(){
		
		double[] newArray = {0.0};
		data = newArray;
		
	}
	
	//constructs Stat object using values held in d
	public Stat(double[] d){
		
		double[] newArray = new double[d.length];
		int count;
		for (count = 0; count < d.length; count++){
			newArray[count] = d[count];
		}
		data = newArray;
		
	}
	
	//retrieve values of data
	public double[] getData(){
		
		double[] newArray = new double[data.length];
		int count;
		for (count = 0; count < data.length; count++){
			newArray[count] = data[count];
		}
		return newArray;
		
	}
	
	//create new array containing elements of d and assing to data
	public void setData(double[] d){
		
		double[] newArray = new double[d.length];
		int count;
		for (count = 0; count < d.length; count++){
			newArray[count] = d[count];
		}
		data = newArray;
		
	}
	
	//return true if data and s objects have same values in same order
	public boolean equals(Stat s){
		
		boolean isEqual;
		int count = 0;
		
			//if array lengths are the same
			if (s.getData().length == data.length){
				
				boolean repeat = true;
				
				do{
					
					isEqual = false;
					if (s.getData()[count] == data[count])
						isEqual = true;
					count++;
					if (count >= data.length || !isEqual)
						repeat = false;
					
				}while (repeat);
			}
			//if array lengths aren't the same
			else 
				isEqual = false;
		
		return isEqual;
		
	}
	
	//return string representation of data elements
	public String toString(){
		
		int count;
		String arrayString = "";
		for (count = 0; count < data.length; count++){
			
			arrayString += data[count] + ", ";
			
		}
		
		return "[" + arrayString.substring(0, arrayString.length()-2) + "]";
		
	}
	
	//return minimum of data array
	public double min(){
		
		int count;
		double min = data[0];
		for (count = 1; count < data.length; count++){
			if (data[count] < min)
				min = data[count];
		}
		return min;
		
	}
	
	//return maximum of data array
	public double max(){
		
		int count;
		double max = data[0];
		for (count = 1; count < data.length; count++){
			if (data[count] > max)
				max = data[count];
		}
		return max;
		
	}
	
	//return average of data array
	public double average(){
		
		int count;
		double average = 0;
		for (count = 0; count < data.length; count++){
			average += data[count];
		}
		average /= data.length;
		return average;
		
	}
	
	//return value that occurs most frequently
	public double mode(){
		
		double mode = Double.NaN; //if there is no mode
		
		//array with one double - mode is the only double
		if (data.length == 1){
			mode = data[0];
		}
		//array with multiple doubles
		else{
			
			//variables for counting each double's appearance amount
			int amountNumberAppears1 = 1;
			int amountNumberAppears2;
			
			int count, count2;
			
			//goes through each double in array
			for (count = 0; count < data.length; count++){
				
				amountNumberAppears2 = 1;
				
				//goes through each double besides the one in the above
				//for loop to check if equal
				for (count2 = data.length - 1; count2 > count; count2--){
					
					if (data[count] == data[count2])
						amountNumberAppears2++;
					
				}
				
				//check which number appears the most
				if (amountNumberAppears2 > amountNumberAppears1){
					mode = data[count];
					amountNumberAppears1 = amountNumberAppears2;
				}
				//if two numbers appear the same amount - no mode
				else if (amountNumberAppears2 == amountNumberAppears1){
					mode = Double.NaN;
				}
				
			}
		}
		
		return mode;
		
		
	}
	
	public static void main(String[] args) {
		
		//test
		
		double[] data1 = {1,1,1,2,2,2,2,3,4,5,5,5,6,7};
		double[] data2 = {1,2};
		Stat stat1 = new Stat(data1);
		Stat stat2 = new Stat(data2);
		
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		
		System.out.println("\nstat2 data = " + stat2.toString());
		System.out.println("stat2 min = " + stat2.min());
		System.out.println("stat2 max = " + stat2.max());
		System.out.println("stat2 average = " + stat2.average());
		System.out.println("stat2 mode = " + stat2.mode());
		
			//change stat2
		stat2.setData(data1);
		System.out.println("\nstat2 data = " + stat2.toString());
		
		double[] data3 = {1,1,1,2,2,2,2,3,4,5,5,5,6,7};
		Stat stat3 = new Stat(data3);
		System.out.println("stat3 data = " + stat3.toString());
		
		System.out.println("\nstat1 == stat2: " + (stat1 == stat2));
		System.out.println("stat1 == stat3: " + (stat1 == stat3));
		System.out.println("stat1.equals(stat2): " + stat1.equals(stat2));
		System.out.println("stat1.equals(stat3): " + stat1.equals(stat3));
		
			//change value of data3[3]
		data3[3] = 1;
		stat3.setData(data3);
		System.out.println("\nstat3 data = " + stat3.toString());
		System.out.println("stat3 min = " + stat3.min());
		System.out.println("stat3 max = " + stat3.max());
		System.out.println("stat3 average = " + stat3.average());
		System.out.println("stat3 mode = " + stat3.mode());
		System.out.println("stat1.equals(stat3): " + stat3.equals(stat1));
		
	}

}
