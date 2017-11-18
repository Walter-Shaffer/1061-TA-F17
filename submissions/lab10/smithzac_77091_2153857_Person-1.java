/*Person.java

 * Zachary Smith
 * 11-10-17
 * This program recieves a name, age, and whether the person is a
 * female, and makes a person object out of it.
 * It then calculates the average age, amount of females,
 * and how many people total there are in the given population.
 * It can determine whether or not 2 people are the same person,
 * or whether or not a person is younger than someone else.
 * 
 * Statement of Academic Honesty:
 * 
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
 * 
 */
public class Person {

	private int age;
	private String name;
	private boolean isFemale;
	
	private static int totalPersons;
	private static int totalFemales;
	private static int totalAge;
	
	public Person(String name, int age, boolean isFemale)
	{
		if(name == null)
		{
			this.name = "Unknown";
		}
		else
		{
			this.name = name;
		}
		totalPersons++;
		if(age >= 0)
		{
			this.age = age;
		}
		else
		{
			age = 0;
		}
		totalAge += age;
		this.isFemale = isFemale;
		if(isFemale == true)
		{
			totalFemales++;
		}
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		if(age >= 0)
		{		
			totalAge += age;
			totalAge -= this.age;
			this.age = age;
		}	
	}
	public boolean getIsFemale()
	{
		return isFemale;
	}
	public void setIsFemale(boolean isFemale)
	{
		this.isFemale = isFemale;
		if(this.isFemale == true)
		{
			totalFemales++;
		}
		else
		{
			totalFemales--;
		}	
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		if(name == null)
		{
			return;
		}
		else
		{
			this.name = name;
		}	
	}
	public boolean equals(Person anotherperson)
	{
		if((age == anotherperson.age) && (name.equalsIgnoreCase(anotherperson.name)) && (isFemale == anotherperson.isFemale))
		{
			return true;
		}
		else
			return false;
	}
	public boolean isYounger(Person anotherperson)
	{
		if(age < anotherperson.age)
		{
			return true;
		}
		else
			return false;
	}
	public String toString()
	{
		if(isFemale == true)
		{
			return ("Name: " + name + "\nAge: " + String.valueOf(age) + "\nFemale");
		}
		else
			return ("Name: " + name + "\nAge: " + String.valueOf(age) + "\nMale");
	}
	public static double avgAge()
	{
		return (double)totalAge / (double)totalPersons;
	}
	public static int howManyPeople()
	{
		return totalPersons;
	}
	public static int howManyFemales()
	{
		return totalFemales;
	}	
}