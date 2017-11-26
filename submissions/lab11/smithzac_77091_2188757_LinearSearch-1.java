/*LinearSearch.java
 * Zachary Smith
 * 11-17-17
 * This program takes a string entered in by the user through
 * the command line and searches through the string for a specified
 * phrase. It then returns the index of the phrase if it is in the
 * phrase, or says that it doesn't exist in the string.
 * Statement of Academic Honesty:
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not 
 * copied or modified code from any other source other than 
 * the course webpage or the course textbook. I recognize that 
 * any unauthorized assistance or plagiarism will be handled in
 * accordance with the policies at Clemson University and the
 * policies of this course, I recognize that my work is based
 * on an assignment created by the School of Computing at 
 * Clemson University. Any publishing or posting of source
 * code for this project is strictly prohibited unless
 * you have written consent from the instructor.
 */
public class LinearSearch {
	
	public static int getFirstIndex(double item, double[] x) // searches command line to find match
	{
		int index = 0;
		int i = 0;
		boolean found = false;	
		while(found == false)
		{
			i++;
			if(i >= x.length)// stops the program if the search isn't found
			{
				found = true;
				index = -1;
			}
			else if(item == x[i])
			{
				found = true;
				index = i; //returns the index of the search if it is found
			}
		}
		return index; //returns the if statement		
	}
	public static int getFirstIndex(String item, String[] x) // searches command line to find match
	{
		int index = 0;
		int i = 3;
		boolean found = false;
		while(found == false)
		{
			i++;
			if(i >= x.length)
			{
				found = true;
				index = -1; //returns -1 if the search isn't found
			}
			else if(item.equals(x[i]))
			{
				found = true; 
				index = (i - 3); //returns the index of the search if it is found
			}
		}
		return index; //returns the if statement
	}
	public static void main(String[] args)
	{
		if(args[args.length - 1].endsWith("-x")) // if there is no command line argument, prints out that the search wasn't found
		{
			System.out.print(args[1]);
			System.out.print(" is not found in x.");
		}
		else if(args[0].equals("-d")) //checks if the search is for a double
		{	
				double d = Double.valueOf(args[1]); // casts the search to a double
				double [] doubleArray = new double[args.length - 3]; // creates an array of doubles the same length as the argument
				for(int i = 3; i < args.length; i++)
				{
					doubleArray[i - 3] = Double.valueOf(args[i]); // loops through and changes all inputs to doubles
				}			
				if(getFirstIndex(d, doubleArray) == -1)
				{
					System.out.print(d); // prints out that the search wasn't found if getFirstIndex returns -1.
					System.out.print(" not found in x.");
				}
				else
				{
					System.out.print(d); // prints out that the search was successful and at which index the search term is
					System.out.print(" found in x at index " + (getFirstIndex(d, doubleArray)));
				}
		}
		else if(args[0].equals("-s")) //checks if the search for a string
		{
			String search = args[1];
			System.out.print(search);
			if(getFirstIndex(search, args) == -1)
			{
				System.out.print(" not found in x."); // prints out that the search wasn't found if getFirstIndex returns -1.
			}
			else
			{
				System.out.print(" found in x at index " + (getFirstIndex(search, args))); // prints out that the search was successful and at which index the search term is
			}	
		}
		else //prints out the search isn't found if the search type is anything other than "-s" or "-d"
		{
			System.out.print(args[1]);
			System.out.print(" is not found in x.");
		}
	}	
}