/*
* Stat.java
* Author: Lydia Shealy
* Submission Date: 11/1/17
*
* Purpose: it initializes arrays within objects and then
* checks whether or not two arrays are equal and will 
* display the values of each object.
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
	//intance variable 
	private double[] data; 
	//basic constructor 
	public Stat(){
		data = new double[]{0.0}; 
	}
	//another constructor
	public Stat(double[] d){
		//int j = d.length; 
		int i = 0; 
		data = new double[d.length];
		while (i < d.length){
			//System.out.println(i);
			data[i] = d[i]; 
			i++;
		}
	}
	
	//finds the minimum of data
	public double min(){
		int i = 0; 
		double min = 0.0;
		while (i < this.data.length){
			if (min > data[i]){
				min = data[i]; 
			}
			else{				
			}
			i++; 
		}		
		return min; 
	}
	
	
	//finds the maximum of data
	public double max(){
		int i = 0; 
		double max = 0.0; 
		while (i < this.data.length){
			if (max < data[i]){
				max = data[i];
			}
			else{				
			}
			i++; 
		}
		return max; 
	}
	
	
	//finds the average of data
	public double average(){
		int i = 0; 
		double average = data[i]; 
		i++; 
		while (i < this.data.length){
			average += data[i]; 
			i++; 
		}
		average = average / data.length; 		
		return average; 
	}
	
	//finds the mode of data
	public double mode(){
		double mode = 0; 
		int maxCount = 0; 
		
		/**referenced stackoverflow*/
		for (int i = 0; i < data.length ; i++){
			int count = 0; 
			for (int j = 0; j < data.length; j++){
				if (data[j] == data[i]){
					count++; 
				}
			}
			
			if (count > mode){
				maxCount = count;
				mode = data[i]; 
			}
		}
		return mode; 
	}
	
	
	//sets data to a Stat's data (alters)
	public void setData(double[] d){
		int i = 0; 
		data = new double[d.length];
		while (i < d.length){
			//System.out.println(i);
			data[i] = d[i]; 
			i++;
		}
	}
	
	//gets data from a stat object and assigns it to a new array
	public double[] getData(){
		int i = 0; 
		double[] d = new double[data.length]; 
		for (i = 0; i < this.data.length; i++){
			d[i] = this.data[i]; 
		}
		return d;
		
	}
	
	//returns whether or not the arrays are equal
	public boolean equals(Stat s){
		//int i = 0; 
		boolean isEqual = false; 
		if (this.data.length != s.data.length){
			isEqual = false; 
		}
		else{
			for (int i = 0; i < this.data.length; i++){
				if (this.data[i] != s.data[i]){
					isEqual = false; 
				}
			}
			isEqual = true; 
		}
		return isEqual; 
	}
	
	//returns string of contents of data
	public String toString(){
		String statStr = "["; 
		int i = 0; 
		
		while (i < this.data.length){
			if (i == this.data.length - 1){
				statStr += data[i] + "]";			
			}
			else{
				statStr += data[i] + ", "; 
			}
			i++; 		 
		}		
		return statStr; 
	}
	

	public static void main(String[] args) {
		/** Example 1 
		//data that will be used to initialize arrays
		double[] data = {-5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88.9, 109.5, -90, 88.9};
		double[] data2 = {100.34, 50.01, 50.01, -8};
		
		//a new instance of the object Stat with just the value of 1 
		Stat stat1 = new Stat();
		
		//prints the string of stat1
		System.out.println("stat1 data = " + stat1.toString());
		//reassigns stat1 to new values 
		stat1 = new Stat(data);
		
		System.out.println("stat1 has been altered.");
				
		System.out.println("stat1 data = " + stat1.toString());
		
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode() + "\n");
		
		Stat stat2 = new Stat();
		
		stat2.setData(data2);
		Stat stat3 = new Stat(stat1.getData());
		System.out.println("stat2 data = " + stat2.toString());
		System.out.println("stat3 data = " + stat3.toString());
		System.out.println();
		
		System.out.println("stat1 is equal to stat2 using \"equals()\"? " +
				stat1.equals(stat2));
				System.out.println("stat1 is equal to stat3 using \"equals()\"? " +
				stat1.equals(stat3));
				System.out.println("stat1 is equal to stat3 using \"==\"? " + (stat1 == stat3));
		//*/
		/** Example2 
		double[] data = {10.0, 20.0, 30.0};
		Stat stat1 = new Stat(data);
		data[0] = 100.0;
		data[1] = 200.0;
		data[2] = 300.0;
		Stat stat2 = new Stat(data);
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat2 data = " + stat2.toString());
		System.out.println("The two arrays should be different");
		//*/
		/** Example3 
		double[] data1 = {10.0, 20.0, 30.0};
		Stat stat1 = new Stat(data1);
		double[] data2 = stat1.getData();
		System.out.println("The arrays are identical: " + (data1 == data2));
		//*/
		/** Example4
		double[] data1 = {10.0, 20.0, 30.0};
		Stat stat1 = new Stat();
		stat1.setData(data1);
		Stat stat2 = new Stat(data1);
		double[] data2 = stat1.getData();
		System.out.println("The arrays are identical: " + (data1 == data2));
		System.out.println("stat2 equals stat1: " +
		stat2.equals(stat1));
		System.out.println("stat1 equals stat2: " + stat2.equals(stat1));
		//*/
		/** Example 5
		Stat stat1 = new Stat();
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 data = " + stat1.toString());
		//*/
		/** Example 6
		double[] data = {1,2,2,3,3,4};
		Stat stat1 = new Stat(data);
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 data = " + stat1.toString());
		//*/
		
		
		
	}

}
