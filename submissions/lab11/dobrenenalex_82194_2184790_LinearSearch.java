/* LinearSearch.java 
 * Author:  Alex Dobrenen 
 * Submission Date: Nov 17
 * Purpose: A brief paragraph description of the 
 * program. What does it do? Return indexs based of input and flags
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
public class LinearSearch 
{
	//Checks to see if the double input is in the array
	public static int getFirstIndex(double item, double[] x)
	{
		boolean there = false;
		int position = 0;
		
		while(!there && (position < x.length))
		{
			if(item == x[position])
				there = true;
			position++;
		}
		if(there == false)
			return -1;
		else
			return position;
	}
	
	//Check to see if the string input is in the given array
	public static int getFirstIndex(String item, String[] x)
	{
		boolean there = false;
		int position = 0;
		
		while(!there && (position < x.length))
		{
			if(item.equals(x[position]))
				there = true;
			position++;
		}
		
		if(there == false)
			return -1;
		else
			return position;
	}

	public static void main(String[] args) 
	{
		int position = 0;
		String itemS = "";
		double itemD = 0.0;
		/*while(position < args.length)
		{
			System.out.println(args[position]);
			position++;
		}*/
		if(args[0].equals("-s"))
		{
			itemS = args[1];
			position = 0;
			String[] argsB = new String[args.length-3];
			while(position < args.length-3)
			{
				argsB[position] = args[position+3];
				position++;
			}
			
			if(getFirstIndex(itemS, argsB) != -1)
			{
				System.out.println(itemS + " found at " 
				+ getFirstIndex(itemS, argsB));
			}
			else
				System.out.println(itemS + " not found in x.");
		}
		else
			if(args[0].equals("-d"))
			{
				itemD = Double.parseDouble(args[1]);
				position = 0;
				double[] argsB = new double[args.length-3];
				while(position < args.length-3)
				{
					argsB[position] = Double.parseDouble(args[position+3]);
					position++;
				}
				if(getFirstIndex(itemD, argsB) != -1)
				{
					System.out.println(itemD + " found at " 
					+ getFirstIndex(itemD, argsB));
				}
				else
					System.out.println(itemS + " not found in x.");
			}
			else
				System.out.println("Failed to Pull arg command");

	}

}
