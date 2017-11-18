/*
* Stat.java
 * Author: Christopher Hicks
 * Submission Date 10/31/2017
 * 
 * Purpose: To be able to access modifiers, instance variables, and methods.
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
//Start of Class Stat
public class Stat {
	private double [] data; 		
	//default constructor for Stat
	public Stat (){
		double [] d = {0.0};
		data = d;
					
	} // end Stat Method
	// Primary Constructor
	public Stat (double [] d){// starts Method Stat
		this.data = new double[d.length];
		for (int i = 0; i < d.length; i++){
			data[i] = d[i];
		}//loop ends
	}//Ends Method
	// returns data into getData
	public double[] getData(){// starts getData
		double[] b = new double [data.length];
		for (int i=0; i<data.length; i++){
			b[i] = data[i];
			
		}//loop ends
		return b;
	}//Ends Method
	//sets data's value
	public void setData(double [] d){// starts setData
		data = new double [d.length];
		for (int i = 0; i<d.length; i++){
			data[i] = d[i];
		}
	}//Ends Method
	// Compares the values of the arrays one at a time
	public boolean equals(Stat s){// starts equals
		boolean equals = true;
		double [] c = s.getData();
		for (int i = 0; i<c.length; i++){
			if (data[i] != c[i]){
				equals = false;
			}else{}//loop ends
		}//loop ends
		return equals;
	}//Ends Method
	public String toString(){//Starts toString
		String toString = ("[");
		for (int i = 0; i<data.length; i++){
			if (i == (data.length - 1)){
				toString += (data[i]+"]");
			}else {toString +=(data[i]+ ", ");}//loop ends
		}
		return toString;
		
	}//Ends Method
	public double min(){// Starts minimum method
		double MinValue = data[0];
		for (int i =0; i < data.length; i++){
			if (data[i]> MinValue){
				;
			}else{MinValue = data[i];}//loop ends
		}return MinValue;
		
	}//Ends Method
	public double max(){// Starts maximum method
		double MaxValue = data[0];
		for (int i =0; i < data.length; i++){
			if (data[i]> MaxValue){
				;
			}else{MaxValue = data[i];}//loop ends
		}return MaxValue;
	}//Ends Method
	public double average(){//start average method
		double a = 0;
		for (int i =0; i < data.length; i++){
			a += data[i];
		}
		double average = a/ data.length;
		return average;
	}//Ends Method
	public double mode(){//start mode method
		Arrays.sort(data);
		int counter1;
		int counter2 = 0;
		double num;
		double mode= Double.NaN;
		for (int i =0; i < data.length; i++){
				num = data[i];
				counter1 =1;
			for (int b =i+1; b < data.length; b++){
				if (num == data[b])
				counter1++;
			}
			if (counter1 > counter2){
				mode = num;
			}
			else if (counter1 == counter2){
				mode = Double.NaN;
			}//end of loop
		}//end of main loop
		return mode;
	}//end of mode method
	public static void main(String [] args){//Testing 
		double []data = {1,2,2,3,3,4};
		Stat stat1 = new Stat(data);
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max =  " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 data = " + data);
	
	}//Ends Method
}//Ends Class

