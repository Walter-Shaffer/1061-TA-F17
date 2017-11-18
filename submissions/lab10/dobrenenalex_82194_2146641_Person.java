/* People.java 
 * Author:  Alex Dobrenen 
 * Submission Date:  November 9
 * Purpose: A brief paragraph description of the 
 * program. What does it do? Holds the Person class and creates the 
 * objects for it
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

public class Person 
{
	private int age;
	private String name;
	private boolean isFemale;
	public static int totalPersons;
	public static int totalFemales;
	public static int totalAge;
	
	//Constructor 3 arguments
	public Person(String nAme, int aGe, boolean female)
	{
		if(aGe > 0)
			this.age = aGe;
		else
			this.age = 0;
		
		if(nAme == null)
			this.name = "Unknown";
		else
			this.name = nAme;
		
		this.isFemale = female;
		if(this.isFemale == true)
			totalFemales++;
		
		totalPersons++;
		totalAge += aGe;
	}
	
	//age mutator
	public void setAge(int aGe)
	{
		if(aGe > 0)
		{
			totalAge -= this.age;
			this.age = aGe;
			totalAge += this.age;
			
		}
			
	}
	
	//name mutator
	public void setName(String nAme)
	{
		if(nAme != null)
			this.name = nAme;
	}
	
	//female mutator
	public void setIsFemale(boolean female)
	{
		this.isFemale = female;
		if(this.isFemale == true)
			totalFemales++;
		else
			if((this.isFemale == false) && (totalFemales > 0))
			{
				totalFemales--;
			}
	}
	
	//age getter
	public int getAge()
	{
		return this.age;
	}
	
	//name getter
	public String getName()
	{
		return this.name;
	}
	
	//isFemale getter
	public boolean getIsFemale()
	{
		return this.isFemale;
	}
	
	//equals method
	public boolean equals(Person person)
	{
		if(this.age == person.age)
			if(this.name.equalsIgnoreCase(person.name))
				if(this.isFemale == person.isFemale)
					return true;
				else
					return false;
			else
				return false;
		else
			return false;
	}
	
	//Compares age
	public boolean isYounger(Person person)
	{
		if(this.age == person.age)
			return true;
		else
			return false;
	}
	
	//Reutrns avg age
	public static double avgAge()
	{
		return (totalAge/totalPersons);
	}
	
	//returns total number of people objects made
	public static int howManyPeople()
	{
		return totalPersons;
	}
	
	//how many females
	public static int howManyFemales()
	{
		return totalFemales;
	}
	
	//output method
	public String toString()
	{
		String read = "";
		read = read + "Name: " + this.name + "\n";
		read = read + "Age: " + this.age + "\n";
		if(isFemale == true)
			read = read + "Female" + "\n";
		else
			read = read + "Male" + "\n";
		
		return read;
	}
}
