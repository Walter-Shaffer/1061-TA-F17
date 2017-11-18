/*
* Stat.java
* Author: Daniel Christensen
* Submission Date: 11/3/2017
*
* Purpose: This class contains several methods used to analyze a given array of data 
* and assist the displaying of the data
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

	public Stat() {
		double[] s = new double[1];
		s[0]=0.0;
		data = s;
	}
	
	public Stat(double[] d) {
		double[] s = new double[d.length];
		
		for(int i=0; i<d.length; i++) {
			s[i] = d[i];
		}
		
		this.data = s;
	}
	
	public double[] getData() {
		
		double[] s = new double[this.data.length];
		
		for(int i=0; i<data.length; i++) {
			s[i] = data[i];
		}
		
		return s;
	}
	
	public void setData(double[] d) {
		
		double[] s = new double[d.length];
		
		for(int i=0; i<d.length; i++) {
			s[i] = d[i];
		}
		
		this.data = s;
	}
	
	public boolean equals(Stat s) {
		
		
		int count = 0;
		
		for(int i=0; i<s.getData().length; i++) {//adds one to count each time corresponding elements are equal
			if(s.getData()[i] == this.data[i]) {
				count++;
			}
		}
		
		if(count==this.data.length) {//i.e. if the number of equal elements is the length of data
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		
		String s = "[";
		for(int i=0; i<data.length-1; i++) {//loops through elements of data and appends them to s up to last element
			s+=data[i];
			s+=", ";
		}
		s+=data[(data.length-1)];//appends last element 
		s+="]";//finishes array
		return s;//returns array
	}
	
	public double min() {
		double min = data[0];
		
		for(int i = 1; i<data.length; i++) {//finds min of data by looping through all elements
			if(min>data[i]) {//changes min if current element is smaller than current min
				min=data[i];
			}
		}
		
		return min;
		
	}
	
	public double max() {
        double max = data[0];
		
		    for(int i = 1; i<data.length; i++) {//finds max element of data by looping through all elements
			    if(max<data[i]) {//changes max if current element is larger than current min
				    max=data[i];
			    }
	        }
		    
		return max;
	}
	
	public double average() {
		double sum = 0;
		for(int i = 0; i<data.length; i++) {//sums elements of data
			sum+=data[i];
		}
		
		double average=sum/data.length;//calcuates average
		
		return average;//returns average
		
	}
	
	public double mode() {
		
		double[] instanceArray = new double[data.length];
		
		for(int i = 0; i<data.length; i++) {//loops through all elements of data
			
			double element_i = data[i];
			int count=0;
			
			for(int j = 0; j<data.length; j++) {//checks instances of a single element
				if (data[j]==element_i) {
					count+=1;
				}
				
			}
			
			instanceArray[i]=count;//stores instances of each element
			
		}
		Stat s = new Stat(instanceArray);
		
		int maxInstance = (int) s.max();
		
		int instanceOfMaxInstance=0;
		
		for (int i=0; i<instanceArray.length; i++) {
			if(instanceArray[i]==maxInstance) {
				instanceOfMaxInstance++;
			}
		}
		
		if (instanceOfMaxInstance>maxInstance) {//i.e. if there is no unique mode
			return Double.NaN;//desired output for no mode
		}
		else {
			int index = -1;
			for(int j = 0; j<instanceArray.length; j++) {//finds index of element with greatest number of instances
				if (instanceArray[j]==maxInstance) {
					index = (int) instanceArray[j];
				}
				
			}
			return data[index-1];//returns element of data with greatest number of instances
		}
	}

}