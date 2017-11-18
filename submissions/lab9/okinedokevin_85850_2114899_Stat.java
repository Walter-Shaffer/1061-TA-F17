/*
* Stat.java
* Author: Kevin Okinedo
* Submission Date: 11/02/17
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* This program uses encapsulation and methods to complete certain tasks.
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

import java.util.Arrays;
public class Stat { 
	 
	private double[] data; //instance variable containing data
	
	public Stat() //Constructor 
	{ 
		double[] data = new double [0];
		this.data = data;
	} 	
	
	public Stat(double[] d) 
		{ 
			setData(d);
		} 
	
	public double[] getData() //getters
		{ 
			return data;
		} 
	
	public void setData(double[] d) //creates new copy of array
	{ 
		data = d;
	} 
	
	public boolean equals(Stat s)
		{ 
			return Arrays.equals(s.data,data);
		} 
	public String toString()
	{
		return Arrays.toString(data);
	}
	public void printData() 
		{ 
			System.out.println("data = " + Arrays.toString(data));
		} 
	
	public double min() //calculates minimum value
		{ 
			Arrays.sort(data); return data[0]; 
		} 
	
	public double max() //calculates maximum value
		{ 
			Arrays.sort(data); return data[data.length-1]; 
		}
	
	public double average() //calculates average
	{ 
		double result = 0.0; 
	
		for (int i=0; i < data.length; i++) 
		{ 
			result += data[i]; 
		} 
		
		return result/data.length; 
	} 
	
	public double mode() // return value that occurs the most (the mode)
	{ 
		double maxValue = 0.0; 
		int maxCount = 0; 
	
		for (int i = 0; i < data.length; ++i) { 
			int count = 0; 
				for (int a = 0; a < data.length; ++a) 
				{ 
					if (data[a] == data[i]) ++count; 
				}
				
	if (count > maxCount) 
	{ 
		maxCount = count; 
		maxValue = data[i]; 
	} 
} 
	return maxValue; 
		} 
	} 
