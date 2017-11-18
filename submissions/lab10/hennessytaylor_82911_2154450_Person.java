
public class Person {
	
	/*
	* Person.java
	* Author: Taylor Hennessy
	* Submission Date: 11/10/2017
	*
	* Purpose: Person class that  defines person objects with an 
	* 			age, name, and boolean that specifies if the person is
	* 			female. Practice with class constructors, access modifiers,
	* 			instance variables and methods.
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
	
	static int totalPersons;
	static int totalFemales;
	static int totalAge;

	private static int age;
	private static String name;
	private static boolean isFemale;
	
	public Person(String n, int a, boolean f){
		//check if acceptable age, if acceptable, assign
		if (a >= 0)
		{
			age = a;
		}
		else
		{
			age = 0;
		}
		
		//check if name is not null, if null, assign "Unknown"
		if (n.equals(null))
		{
			name = "Unknown";
		}
		else
		{
			name = n;
		}
		
		//assign the f value to is female
		isFemale = f;
		
		//update static variables
		totalAge += age;
		if (isFemale)
		{
			totalFemales++;
		}
	}
	
	//return name value
	public static String getName(){
		return name;
	}
	
	//return age value
	public static int getAge(){
		return age;
	}
	
	//return isFemale value
	public static boolean getIsFemale(){
		return isFemale;
	}
	
	//set name value
	public static void setName(String n){
		//check if name is not null, if null, assign "Unknown"
		if (n.equals(null))
		{
			name = "Unknown";
		}
		else
		{
			name = n;
		}
	}
		
	//set age value
	public static void setAge(int a){
		totalAge -= age;
		//check if acceptable age, if acceptable, assign
		if (a >= 0)
		{
			age = a;
			totalAge += age;
		}
		else
		{
			age = 0;
		}
	}
		
	//set isFemale value
	public static void setIsFemale(boolean f){
		if (!(isFemale) && (f))
		{
			totalFemales++;
		}
		else if ((isFemale) && !(f))
		{
			totalFemales--;
		}
		
		isFemale = f; 
	}
	
	//check equality with another person object
	public static boolean equals(Person p){
		if ((p.isFemale && isFemale)&&(p.age == age) && (p.name.equals(name))){
			return true;
		}
		else {
			return false;
		}
	}
	
	//check if the person object is younger than the passed person object
	public static boolean isYounger(Person p){
		if (p.age > age){
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//return the string of the object
	public String toString(){
		String theString;
		theString = "Name: " + name + "\nAge: " + age + "\n";
		if (isFemale){
			theString = theString + "Female";
		} 
		else 
		{
			theString = theString + "Male";
		}
		return theString;
	}
	
	//return the average age of all person objects
	public static double avgAge(){
		double averageAge;
		averageAge = totalAge/totalPersons;
		return averageAge;
	}
	
	//return total number of people
	public static int howManyPeople(){
		return totalPersons;
	}

	//return total number of females
	public static int howManyFemales(){
		return totalFemales;
	}
}
