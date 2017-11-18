/*
* Person.java
* Author: Andrew Bare
* Submission Date: 11/10/17
*
* Purpose: 
* 
* This class contains the data associated with a Person object
* with instance variables that are unique to each object, 
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
public class Person {
	private int age = 0;
	private String name = "Unknown";
	private boolean isFemale = false;
	
	static int totalPersons=0;
	static int totalFemales=0;
	static int totalAge=0;
	
	/**
	 * Constructor for person object
	 * @param n String to be the name
	 * @param a integer to be age
	 * @param f boolean as to whether or not the person is a female
	 */
	public Person(String n, int a, boolean f)
	{
		this.setAge(a);
		this.setName(n);
		this.setIsFemale(f);
		
		totalPersons++;
		
//		//Update static variables
//		totalPersons++;
//		totalAge+=this.age;
//		if (isFemale == true)
//			totalFemales++;
		
	}
	//ALL SETTER METHODS AND CHECK FOR CORRECT INPUT-----------------
	public void setAge(int age)
	{
		if (age > 0)
		{
			totalAge-=this.age;
			this.age = age;
			totalAge+=age;
		}
		
	}
	public void setName(String n)
	{
		if (n != null)
		{
			name = n;
		}
	}
	public void setIsFemale(boolean isFemale)
	{
		//check if girl first
		if(this.isFemale && !(isFemale))
			totalFemales--;
		
		this.isFemale = isFemale;
		if (isFemale == true)
			totalFemales++;
	}
	
	//ALL GETTER METHODS---------------------------------------------
	public int getAge(){
		return this.age;
	}
	public String getName(){
		return this.name;
	}
	public boolean getIsFemale(){
		return this.isFemale;
	}
	
	/**
	 * checks equality between 2 Person classes
	 * @param p A person object
	 * @return true if everything within object is same in both person objects
	 * 
	 */
	public boolean equals(Person p){
		if (this.name.equalsIgnoreCase(p.getName())
				&& this.age == p.getAge()
				&& this.isFemale == p.getIsFemale())
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean isYounger(Person p){
		if (this.age < p.getAge())
			return true;
		else 
			return false;
	}
	
	public String toString()
	{
		//make a little string that will be returned after some
		//logic to decide female or male to print
		String s= 	"Name: " + name +"\nAge: "+ age +"\n";
		if (isFemale)
			s+="Female";
		else
			s+="Male";
		
		return s;		
	}
	
	//ALL STATIC METHODS----------------------------------------------------------
	public static double avgAge()
	{
//		System.out.println("total age: "+ totalAge);
//		System.out.println("total persons: "+ totalPersons);
		return (double)totalAge/(double)totalPersons;
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
