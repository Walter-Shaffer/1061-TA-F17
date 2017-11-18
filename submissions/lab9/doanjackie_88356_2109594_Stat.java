/* 
 * Stat.java 
 * Author:  Jackie Doan  
 * Submission Date:  11/2/17 
 * 
 * Purpose:
 * This program is used for the purpose of creating
 * number arrays and being able to perform Math functions
 * upon them such as equals, min, max, mode, and average.
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
	//the data arrays
	private double[] data;
	//is the default constructor
	public Stat(){
		double[] intial = {0.0}; 
		data = intial;
	}
	//contructs the stat array
	public Stat(double[] d){
		this.setData(d);
	}
	//returns the array
	public double[] getData(){
		double[] getData = data;
		return getData;
	}
	//sets the data of the array
	public void setData(double[] d){
		double[] info = new double[d.length];
		for(int i = 0;i < d.length;i++){
			info[i] = d[i];
		}
		data = info;
	}
	//returns if the sets are equal in terms of numbers in order
	public boolean equals(Stat s){
		boolean isFalse = false;
		boolean isEqual = false;
		if(this.data.length == s.data.length){
			for(int i = 0;i < data.length;i++){
				if(this.data[i] != s.data[i]){
					isFalse = true;
				}
			}
			if(isFalse != true){
				isEqual = true;
			}
		}
		return isEqual;
	}
	//returns the array as a string of doubles
	public String toString(){
		String print = null;
		for(int i = 0;i < this.data.length; i++){
			if(i == 0){
				print = "[";
			}
			if(i != 0){
				print += ", ";
			}
			print += this.data[i];
		}
		print += "]";
		return(print);
	}
	//returns the minimum of an array
	public double min(){
		double minimum = data[0];
		for(int i = 0;i < data.length;i++){
			if(minimum > data[i]){
				minimum = data[i];
			}
		}
		return minimum;
	}
	//returns the maximum of an array
	public double max(){
		double maximum = data[0];
		for(int i = 0;i < data.length;i++){
			if(maximum < data[i]){
				maximum = data[i];
			}
		}
		return maximum;
	}
	//returns the average of an array
	public double average(){
		double average = 0;
		for(int i = 0;i < data.length;i++){
			average += data[i];
		}
		average = average/data.length;
		return average;
	}
	//returns the mode of an array
	public double mode(){
		boolean isMultiple = false;
		int count = 0;
		int modeCount = 0;
		double mode1, mode2, realMode = 0;
		for(int i = 0;i < data.length;i++){
			mode1 = data[i];
			for(int j = 0;j < data.length;j++){
				mode2 = data[j];
				if(mode1 == mode2){
					count++;
				}
			}
			if(count >= modeCount){
				if(count == modeCount && realMode != mode1){
					isMultiple = true;
					modeCount = count;
				}
				else if(count != modeCount){
					isMultiple = false;
					realMode = mode1;
					modeCount = count;
				}
			}
			count = 0;
		}
		if(isMultiple == true){
			return Double.NaN;
		}
		else{
			return realMode;
		}
	}
	
	public static void main(String[] args) {
		//trial 1
		System.out.println("Trial 1:");
		double[] data = {-5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88.9, 109.5, -90, 88.9};
		double[] data2 = {100.34, 50.01, 50.01, -8};
		Stat stat1 = new Stat();
		
		System.out.println("stat1 data = " + stat1.toString());
		
		stat1 = new Stat(data);
		
		System.out.println("stat1 has been altered");
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
		System.out.println("stat1 is equal to stat3 using \"==\"? " + (stat1 == stat3) +"\n");
		//trial 2
		System.out.println("Trial 2:");
		double[] data1 = {10.0, 20.0, 30.0};
		Stat stat4 = new Stat(data1);
		
		data1[0] = 100.0;
		data1[1] = 200.0;
		data1[2] = 300.0;
		
		Stat stat5 = new Stat(data1);
		
		System.out.println("stat4 data = " + stat4.toString());
		System.out.println("stat5 data = " + stat5.toString());
		System.out.println("the two arrays should be different\n");
		//trial 3
		System.out.println("Trial 3:");
		double[] data3 = {10.0, 20.0, 30.0};
		Stat stat6 = new Stat(data3);
		
		double[] data6 = stat6.getData();
		
		System.out.println("The arrays are identical: " + (data3 == data6) + "\n");
		//trial 4
		System.out.println("Trial 4:");
		double[] data4 = {10.0, 20.0, 30.0};
		Stat stat7 = new Stat();
		stat3.setData(data4);
		Stat stat8 = new Stat(data4);
		double[] data5 = stat3.getData();
		
		System.out.println("The arrays are identical: " + (data4 == data5));
		System.out.println("stat8 equals stat7: " +
				stat7.equals(stat8));
		System.out.println("stat7 equals stat8: " + stat7.equals(stat8) + "\n");
		//trial 5
		System.out.println("Trial 5:");
		Stat stat9 = new Stat();
		System.out.println("stat9 data = " +stat9.toString());
		System.out.println("stat9 min = " +stat9.min());
		System.out.println("stat9 max = " +stat9.max());
		System.out.println("stat9 average = " +stat9.average());
		System.out.println("stat9 mode = " +stat9.mode());
		System.out.println("stat9 data = " +stat9.toString() + "\n");
		//Trial 6
		System.out.println("Trial 6:");
		double[] data7 = {1,2,2,3,3,4};
		Stat stat10 = new Stat(data7);
		
		System.out.println("stat10 data = " +stat10.toString());
		System.out.println("stat10 min = " +stat10.min());
		System.out.println("stat10 max = " +stat10.max());
		System.out.println("stat10 average = " +stat10.average());
		System.out.println("stat10 mode = " +stat10.mode());
		System.out.println("stat10 data = " +stat10.toString());
	}

}
