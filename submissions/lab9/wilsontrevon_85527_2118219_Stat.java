/*
* [Stat].java
* Author: [Trevon Wilson]
* Submission Date: [11/3/2017]
*
* Purpose: To create classes utilizing constructors, access modifiers, instance variables, void methods and methods that return values,
* methods calling other methods, accessors and mutator methods(setters and getters), and using the quals() methods.
* 
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
		double[] array = {0,0};
		this.data = array;
	}
	public Stat (double[] d){
		this.data = d;
	}
	public double[] getData(){
		double[] arrayOne = new double [data.length];
		for(int j = 0; j < data.length; j++){
			arrayOne[j] = data[j];
		}
		return arrayOne;
	}
	public void setData(double[] d){
		double[] arrayTwo = new double [d.length];
		for(int j = 0; j < d.length; j++){
			arrayTwo[j] = data[j];
	}
		data = arrayTwo;
	}
	public boolean equals(Stat s){
		boolean isEquals = true;
		if(data.equals(this.data)){
		}
		else{
		}
		return false;
	}

}
