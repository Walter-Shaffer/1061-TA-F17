/* Stat.java 
 * Author:  Alex Dobrenen 
 * Submission Date:  November 3
 * Purpose: A brief paragraph description of the 
 * program. What does it do? Data manipulator
 * Statement of Academic Honesty:  
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

public class Stat 
{
	//Vars
	private double[] data; //not initialized since each instance of the object will be different
	
	//Methods
	//Default constructor
	public Stat()
	{
		data = new double[1];
		data[0] = 0.0;
	}
	//Extra Special constructor
	public Stat(double[] d)
	{
		data = new double[d.length];
		//System.out.println(d.toString() + "\n" + data.toString());
		for(int x = 0; x < d.length; x++)
		{
			data[x] = d[x];
		}
	}
	//Accessor
	public double[] getData()
	{
		double[] returned = new double[data.length];
		for(int x = 0; x < data.length; x++)
		{
			returned[x] = data[x];
		}
		return returned;
	}
	//Mutator
	public void setData(double[] d)
	{
		for(int x = 0; x < data.length; x++)
		{
			data[x] = d[x];
		}
	}
	//Equals method
	public boolean equals(Stat s)
	{
		boolean equals = true;
		double[] one = this.getData();
		double[] two = s.getData();
		if(data.length != s.getData().length)
		{
			return false;
		}
		for(int x = 0; x < data.length; x++)
		{
			if(one[x] == two[x])
			{
				equals = true;
			}
			else
			{
				equals = false;
			}
		}
		if(equals == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//Returns a string version of data array
	public String toString()
	{
		String a = "";
		a = "[" + data[0];
		for(int x = 1; x < data.length; x++)
		{
			a = a + ", " + data[x];
		}
		a = a + "]";
		return a;
	}
	//Finds minimum
	public double min()
	{
		double min;
		min = data[0];
		for(int x = 0; x < data.length; x++)
		{
			if(min > data[x])
			{
				min = data[x];
			}
		}
		return min;
	}
	//Finds max
	public double max()
	{
		double max;
		max = data[0];
		for(int x = 0; x < data.length; x++)
		{
			if(max < data[x])
			{
				max = data[x];
			}
		}
		return max;
	}
	//Finds average
	public double average()
	{
		double avg = 0;
		for(int x = 0; x < data.length; x++)
		{
			avg += data[x];
		}
		avg /= data.length;
		return avg;
	}
	//Finds the mode
	public double mode()
	{
        double value = 0;
        int valCount = 0;
        
        for (int x = 0; x < data.length; ++x) 
        {
            int count = 0;
            for (int y = 0; y < data.length; ++y) 
            {
                if (data[y] == data[x])
                    ++count;
            }
            if (count > valCount) 
            {
                valCount = count;
                value = data[x];
            }
        }
 
        return value;
	}
}
