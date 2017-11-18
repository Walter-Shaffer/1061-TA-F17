/*
* Stat.java
* Author: Andrew Bare
* Submission Date: 11/3/17
*
* Purpose: 
* 
* This class contains methods to manipulate numbers using given
* inputs. It stores an array of doubles that it will reference
* to figure out the wanted output
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
	
	/**
	 * This is the default constructor for Stat, making an array
	 * with one value
	 */
	public Stat()
	{
		data = new double[1];
		data[0] = 0.0;
	}
	
	/**
	 * This constructs the class and makes the instance variable
	 * the value of the sent double array
	 */
	public Stat(double[] d)
	{
		this.setData(d);
	}
	
	//returns an array of doubles found in Stat class
	public double[] getData()
	{
		//new array
		double[] d = new double[data.length];
		for (int i = 0; i<d.length; i++)
		{
			d[i] = data[i];
		}
		return d;
	}
	
	//changes the data in the data object to the specified double array
	public void setData(double[] d)
	{
		//loop through d and fill data
		data = new double[d.length];
		for (int i = 0; i<d.length; i++)
		{
			data[i]=d[i];
		}
	}
	
	//checks to see if the stat class are equal
	public boolean equals(Stat s)
	{
		//loop while value is true 
		boolean same = true;
//		while (same)
//		{
//			
//		}
		//first check if they're the same length
		if (this.data.length == s.data.length)
		{
			for (int i = 0; i<data.length; i++)
			{
				if (data[i] != s.data[i])
				{
					same = false;
				}
			}
		}
		else
			same= false;
		
		return same;		
	}
	
	public String toString()
	{
		String s="[";
		//loop through and add values
		for (int i = 0; i<data.length; i++)
		{
			s+=data[i] + ", ";
		}
		s = s.substring(0, s.length()-2);
		s+="]";
		return s;
	}
	
	//returns minimum value
	public double min()
	{
		double min = data[0];
		//checks each instance
		for (int i = 0; i<data.length; i++)
		{
			if(data[i]<min)
			{
				min = data[i];
			}
		}
		return min;
	}
	//returns max value
	public double max()
	{
		double max = data[0];
		//checks each instance
		for (int i = 0; i<data.length; i++)
		{
			if(data[i]>max)
			{
				max = data[i];
			}
		}
		return max;
	}
	//returns average value
	public double average()
	{
		double sum = 0;
		//adds each instance
		for (int i = 0; i<data.length; i++)
		{
			sum+=data[i];
		}
		return sum/data.length;
	}
	//returns mode value
	public double mode()
	{		
//		double mode = 0.0;
//		double test = data[0];
//		int counter = 0;
//		int lastCount;
//		double lastTest;
//		
//		for (int i = 0; i<data.length; i++)
//		{
//			counter =0;
//			test = data[i];
//			for (int j = 0; j<data.length; j++)
//			{
//				if (data[i]== data[j])
//				{
//					counter ++;
//				}
//			}
//		}
		
		double mode=0.0;
		int maxNumber=0,lastMax = 0;
		double lastTest= Double.NaN;
		for (int i = 0; i<data.length; i++)
		{	
			int instanceNum=0;
			double test = data[i];
			//checks how man instances of that one there is
			for (int j = 0; j<data.length; j++)
			{
				if (data[i] == data[j])
				{
					instanceNum++;
				}
			}
			//if there was more of an instance make it the max
			//System.out.println("instanceNum for "+data[i]+": " + instanceNum);
			if (instanceNum>=maxNumber)
			{
				//System.out.println("stage1");
				if(i==0)
				{
					//System.out.println("FIRST stage2");
					lastMax = maxNumber;
					lastTest =test;
					maxNumber = instanceNum;
					mode = test;
					//System.out.println("FIRST last test" + lastTest);
				}
				else if (lastTest ==test)
				{
//					//System.out.println("stage2");
////					lastMax = maxNumber;
////					lastTest =test;
//					System.out.println("last test: " + lastTest);
//					System.out.println("last max: " + lastMax);
//					System.out.println("Max: " + maxNumber);
				}
				else
				{
					lastMax = maxNumber;
					lastTest =test;
					maxNumber = instanceNum;
					mode = test;
				}
				
				
			}			
		}
		//check to make sure no other instances same
		if (maxNumber>1 && lastMax!=maxNumber)
		{
			return mode;
		}
		else
		{
			//System.out.println("went here\n\n");
			return Double.NaN;
		}		
	}
	

}
