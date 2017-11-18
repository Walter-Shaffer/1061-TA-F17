//package lab9;
/*										
* [Stat].java										
* 										
* Author:  [Aneri Desai]										
* 										
* Submission Date:  [11/03/2017]										
* 										
* Purpose: In the lab we practice more of the array with different method using class and onjects.										
* 										
* Statement of Academic Honesty:										
* The following code represents my own work. I have neither										
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized										
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
	
	public static void main(String[] args) { //put all the exaple code in the comment section
		
		double[] data = {-5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88.9, 109.5, -90, 88.9}; 
		double[] data2 = {100.34, 50.01, 50.01, -8};
		Stat stat1 = new Stat();
		System.out.println("stat1 data = " + stat1.toString()); 
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
		
		
		 /*double[] data = {10.0, 20.0, 30.0};
		 Stat stat1 = new Stat(data);
			data[0] = 100.0;
			data[1] = 200.0;
			data[2] = 300.0;
			Stat stat2 = new Stat(data);
			System.out.println("stat1 data = " + stat1.toString()); 
			System.out.println("stat2 data = " + stat2.toString()); 
			System.out.println("The two arrays should be different");*/
		
		/*double[] data1 = {10.0, 20.0, 30.0}; 
		 Stat stat1 = new Stat(data1);
		 double[] data2 = stat1.getData();
		System.out.println("The arrays are identical: " + (data1 == data2));*/
		
		/*double[] data1 = {10.0, 20.0, 30.0}; 
		 Stat stat1 = new Stat(); 
		 stat1.setData(data1);
		Stat stat2 = new Stat(data1); 
		double[] data2 = stat1.getData();
		System.out.println("The arrays are identical: " + (data1 == data2)); System.out.println("stat2 equals stat1: " +
		stat2.equals(stat1));
		System.out.println("stat1 equals stat2: " + stat2.equals(stat1));*/
		
		/*Stat stat1 = new Stat();
		System.out.println("stat1 data = " + stat1.toString()); 
		System.out.println("stat1 min = " + stat1.min()); 
		System.out.println("stat1 max = " + stat1.max()); 
		System.out.println("stat1 average = " + stat1.average()); 
		System.out.println("stat1 mode = " + stat1.mode()); 
		System.out.println("stat1 data = " + stat1.toString());*/
		
		
		/*double[] data = {1,2,2,3,3,4}; 
		Stat stat1 = new Stat(data);
		System.out.println("stat1 data = " + stat1.toString()); 
		System.out.println("stat1 min = " + stat1.min()); 
		System.out.println("stat1 max = " + stat1.max()); 
		System.out.println("stat1 average = " + stat1.average()); 
		System.out.println("stat1 mode = " + stat1.mode()); 
		System.out.println("stat1 data = " + stat1.toString());*/
	}


	private double[] data;					
						
	public Stat() {					//array has single element
		data = new double[] {0.0};				
	}					
						
	public Stat(double[] d) {		//construct object 			
		data = d;				
		}				
						
	public double[] getData() {		//get method			
		double[] getArray= new double [data.length];		
		for (int a=0; a < data.length; a++){		
			getArray[a] = data[a];}	
		return getArray;						
	}					
						
	public void setData(double[] d) {		//set method			
		double [] setArray = new double[d.length];		
		for(int a=0; a < d.length; a++){		
			setArray[a] = d[a];}	
		this.data=setArray;						
	}					
	public boolean equals(Stat s) {			//equal method to return true or flase		
		if (Arrays.equals(s.getData(),this.data))	
			return true;
		else	
		return false;				
	}					
	public String toString() { //string method 
		String d = Arrays.toString(data); 
		return d;				
	}					
	public double min() //find the minimum
	{
		Arrays.sort(data);
		double minValue = data[0];
		return minValue;

	}
	public double max() //find the maximum
	{
		Arrays.sort(data);
		return data[data.length-1];
	}
	public double average() //find the average
	{
		double sum=0;
		for (int a=0; a < data.length ; a++){
			sum = (sum + data[a]);}
		double average = sum/ data.length;
		return average;

	}			
	public double mode () { //mode method to return mode and for more than one return NaN
		  double max = Double.NaN;
		  double number = 0;
		  int max_Count = 0;
		  int count = 0;
		  double[] n = Arrays.copyOf(data, data.length);
		  Arrays.sort(data);
		  for (int i = 0; i < n.length; i++) {
		    if (n[i] == number) {
		      count++;
		    }
		    else {
		      number = n[i];
		      count = 1;
		    }
		    if (count == max_Count) {
		      max = Double.NaN;
		    }
		    if (count > max_Count) {
		      max = number;
		      max_Count = count;
		    }
		  }
		  return max;
		  }					
}				
					

