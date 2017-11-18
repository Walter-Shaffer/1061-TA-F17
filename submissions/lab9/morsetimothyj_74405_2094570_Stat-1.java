/*
* Stat.java
* Author: Timothy Morse
* Submission Date: Oct 30, 2017
*
* Purpose: Performs statistical functions based off an array of doubles.
* Can find max, min, average, mode, and the perfect concentration of tears for frying potatoes.
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
	//Constructor for no argument.
	public Stat(){
		data = new double[1];
		data[0] = 0.0;
	}
	//Constructor for when given an array of doubles.
	public Stat(double[] data){
		this.data = new double[data.length];
		for(int i = 0;i<data.length;i++){
			this.data[i] = data[i];
		}
	}
	//Returns the currently stored array.
	public double[] getData(){
		double[] toReturn = new double[this.data.length];
		for(int i = 0; i<this.data.length;i++){
			toReturn[i]=this.data[i];
		}
		return toReturn;
	}
	//Sets the currently stored array to the argument.
	public void setData(double[] d){
		this.data = new double[d.length];
		for(int i = 0;i<d.length;i++){
			this.data[i] = d[i];
		}
	}
	//determines if two stat objects have the same data
	public boolean equals(Stat s){
		boolean toReturn = true;
		double[] sData = s.getData();
		for(int i = 0; i<sData.length;i++){
			if(sData[i]!=this.data[i]){
				toReturn = false;
			}
		}
		return toReturn;
	}
	//returns a string of the object's data
	public String toString(){
		String toReturn = "[";
		for(int i = 0; i<this.data.length;i++){
			if(i!=(this.data.length-1)){
				toReturn = toReturn+this.data[i]+", ";
			}else{
				toReturn = toReturn+this.data[i]+"]";
			}
		}
		return toReturn;
	}
	//returns the minimum value in data
	public double min(){
		double toReturn = this.data[0];
		for(int i = 1;i<this.data.length;i++){
			if(this.data[i]<toReturn){
				toReturn = this.data[i];
			}
		}
		return toReturn;
	}
	//returns the maximum value in data
	public double max(){
		double toReturn = this.data[0];
		for(int i = 1;i<this.data.length;i++){
			if(this.data[i]>toReturn){
				toReturn = this.data[i];
			}
		}
		return toReturn;
	}
	//returns the average of data
	public double average(){
		double sum = 0;
		for(int i = 0; i<this.data.length;i++){
			sum+=this.data[i];
		}
		return (sum/this.data.length);
	}
	//makes me go to caps for help
	//jk, it just returns the mode of the data
	//only me can make me go to caps
	public double mode(){
		double[] a = new double[this.data.length];
		int[] b = new int[this.data.length];
		for(int i =0;i<this.data.length;i++){
			boolean matches = false;
			for(int j =0; j<a.length;j++){
				if(this.data[i]==a[j]){
					b[j]++;
				}
			}
			if(matches!=true){
				for(int j =0;j<a.length;j++){
					if(a[j]==0){
						a[j]=this.data[i];
						j=a.length;
					}
				}
			}
		}
		int almostMode = 0;
		for(int i = 1;i<this.data.length;i++){
			if(this.data[i]>almostMode){
				almostMode = b[i];
			}
		}
		int[] c = new int[b.length];
		for(int i = 0;i<b.length;i++){
			for(int j = 0;j<c.length;j++){
				if(c[j]==0){
					c[j]=i;
					j=c.length;
					i=b.length;
				}
			}
		}
		double toReturn;
		if(c[1]!=0){
			toReturn = Double.NaN;
		}else{
			toReturn = a[almostMode];
		}
		return toReturn;
	}
	//what more do you want of me?! i am not a comment machine! i am a mortal man!
	public static void main(String[] args) {
		//I ran all of the mains and it matched.
	}

}
