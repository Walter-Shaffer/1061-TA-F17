//*******************************************************
// Circle.java
//
// 
//*******************************************************
/*
* Stat.java
* Author: Elias Weglarz
* Submission Date: 10/27/17
*
* Purpose: Compute mode, average, minimum, and maximum of an array of double values.
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
	private double[] data;

	public Stat(){
		double[] b = {0.0};
		data = b;
	}
	
	public Stat(double[] d){
		data = new double[d.length];
		for(int i =0; i < d.length; i++){
			data[i] = d[i];
		}
		
	}
	
	public void setData(double [] d) {
		if (data.length == 0){
			data = new double [0];
		}
		else {
			data = new double[d.length];
			for (int i =0; i < d.length; i++){
				data[i] = d[i];
			}
		}
	}
	public double[] getData(){
		double[] dataArray = new double[data.length];
		for(int i = 0; i < data.length; i++){
			dataArray[i] = data[i];
					
		}
		return dataArray;
		
	}
	public boolean equals(Stat s){
		double [] eqArray = s.getData();
		if (data.length != eqArray.length){
			return false;
		}
		for (int i = 0; i < data.length; i++){
			if (data[i] != eqArray[i])
				return false;	
		}
		return true;
	}
	public double average(){
		double total = 0;
		for(int i = 0; i < data.length; i++){
			total = total + data[i];
		}
		return total/data.length;
	}
	public double max(){
		double max = data[0];
		for(int i = 1; i < data.length; i++){
			if (data[i] > max){
				max = data[i];
			}
		}
		return max;
	}
	
	public double min(){
		double min = data[0];
		for(int i = 1; i < data.length; i++){
			if (data[i] < min){
				min = data[i];
			}
		}
		return min;
	}
	public double mode(){
		if (data.length == 0){
			return Double.NaN;
		}
		if (data.length == 1){
			return data[0];
		}
		if (data.length == 2){
			if (data[0] == data[1]){
				return data[0];
			}
			else{
				return Double.NaN;
			}
		}
	double[] number = new double[data.length];
	int[] a = new int[data.length];
	int y = 0;
		for (int i = 0; i < data.length; i++){
			boolean b = false;
			for (int j = 0; j < y; j++){
				if (data[i] == number[j]){
					b = true;
					a[j]++;
				}
			}
			if (!b){
				number[y] = data[i];
				a[y] = 1;
				y++;
			}
		
		}
		int maximum = a[0];
		int b = 0;
			for (int k = 1; k < y; k++){
				if (a[k] > maximum){
					maximum = a[k];
					b = k;
				}
			}
		int c = 0;
		for (int l = 0; l < y; l++){
			if (a[l] == maximum){
				c++;
			}
		}
		if (c == 1){
			return number[b];
		}
		else{
			return Double.NaN;
		}
	}
	public String toString(){
		String variable = "[";
		for (int i = 0; i < data.length; i++){
			variable = variable + data[i];
			if (i < data.length - 1){
				variable = variable + ", ";
			}
		}
		return variable + "]";
	}	
}
