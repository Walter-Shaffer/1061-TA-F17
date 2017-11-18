/* 
 * 
 * Stat.java 
 * Author:  Paul Orecchia  
 * Submission Date:  10/31/17 
 * 
 * Purpose: The purpose of this program is to take the numbers from data and find the min, max, average, and
 * mode.
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

	private double[] data = {0.0};
	public Stat(){  //default Constructor
	}
	
	public Stat(double[] d){ //constructs a stat based on the values of d
		double[] a=new double[d.length];
		System.arraycopy(d, 0, a, 0, d.length);
		data=a;
	}
	public double[] getData(){ //returns the values of data
		double[] dataCopy=new double[data.length];
		System.arraycopy(data, 0, dataCopy, 0, data.length); 
		return dataCopy;
	}
	public void setData(double[] d){ //sets datas values to d
		double[] copy=new double[d.length];
		System.arraycopy(d, 0, copy, 0, d.length);
		data=d;
	}
	public boolean equals(Stat s){ //checks if the two arrays are equal
		return Arrays.equals(data, s.data);	
	}
	public String toString(){ //prints out the values of the array
	
		return Arrays.toString(data);
		
	}
	public double min(){  //finds the minimum value of the array
		int y=0;
		double min=0;
		for (int i=0;i<data.length;i++){
			if (i==0){
				min=data[i];
			}else{	
			}if (min>data[i]){
				min=data[i];
				y=i;
			}else{
			}
		}	
		return	data[y];
	}
	public double max(){ //finds the maximum value of the array
		int y=0;
		double max=0;
		for (int i=0;i<data.length;i++){
			if (i==0){
				max=data[i];
			}else{	
			}if (max<data[i]){
				max=data[i];
				y=i;
			}else{
			}
		}	
		return	data[y];
	}
	public double average(){ //finds the average value of the array
		double average=0;
		for (int i=0;i<data.length;i++){
			average+=data[i];
		}	
		average/=data.length;
		return average;
	}
	public double mode(){  //finds the mode of the array
		int b=0;
		int y=0;
		int a=0;
		for (int i=0; i<data.length;i++){
			a=0;
			for(int m=0;m<data.length;m++){
				if (data[i]==data[m]){
					a++;
				}else{
				}
			}
			if(a>b){
				b=a;
				y=i;
			}else{
			}
		}
		if (data.length==1){
			return data[0];
		}else if (a==1){
			return Double.NaN;
		}else{
			return data[y];
		}
	}
	
	
	public static void main(String[] args){ //main function
		double[] data = {-5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88.9, 109.5, -90, 88.9};
		double[] data2 = {100.34, 50.01, 50.01, -8};
		Stat stat1 = new Stat();   
		System.out.println("stat1 data = " +  stat1.toString());   
		stat1 = new Stat(data);  
		System.out.println("stat1 has been altered.");
		System.out.println("stat1 data = " +  stat1.toString());   
		System.out.println("stat1 min = " + stat1.min()); 
		System.out.println("stat1 max = " + stat1.max()); 
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode() + "\n"); 
		 
		Stat stat2 = new Stat(); 
		stat2.setData(data2);
		Stat stat3 = new Stat(stat1.getData());
		System.out.println("stat2 data = " +  stat2.toString()); 
		System.out.println("stat3 data = " +  stat3.toString()); 
		System.out.println(); 
		System.out.println("stat1 is equal to stat2 using \"equals()\"? " +    stat1.equals(stat2));
		System.out.println("stat1 is equal to stat3 using \"equals()\"? " +  stat1.equals(stat3)); 
		System.out.println("stat1 is equal to stat3 using \"==\"? " + (stat1 == stat3)); 
	}
}	