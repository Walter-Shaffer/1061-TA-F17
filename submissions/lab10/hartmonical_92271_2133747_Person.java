/* 
 * File name: Person.java
 * Author: Monica Hart
 * Submission Date: 11/7/2017
 *
 * This program does the following:
 * This program sets and gets information, such as name/age/gender
 * as well as total people/females and averages, based on a class
 * object.
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
 *
 */
public class Person {
	
	//instance variables
	private int age;
	private String name;
	private boolean isFemale;
	
	//static variables
	private static int totalPersons = 0;
	private static int totalFemales = 0;
	private static int totalAge = 0;
	
	//constructor for class object - sets name, age, and isFemale
	//and updates total counters
	Person(String name, int age, boolean isFemale){
		
		//set name
		if (name == null)
			this.name = "Unknown";
		else
			this.name = name;
		
		//set age
		if (age >=0)
			this.age = age;
		else
			this.age = 0;
		
		//set isFemale
		this.isFemale = isFemale;
		
		//update static variables
		totalPersons++;
		totalAge += age;
		if (isFemale)
			totalFemales++;
		
	}
	
	//returns age
	public int getAge(){
		
		return age;
		
	}
	
	//sets age if entered age is greater than or equal to 0
	public void setAge(int age){
		
		if (age >=0){
			totalAge += age - this.age;
			this.age = age;
		}
		
	}
	
	//returns name
	public String getName(){
		
		return name;
		
	}
	
	//sets name if entered name is not null
	public void setName(String name){
		
		if (name != null)
			this.name = name;
		
	}
	
	//returns true if female or false if not female
	public boolean getIsFemale(){
		
		return isFemale;
		
	}
	
	//sets isFemale boolean and possibly updates female counter
	public void setIsFemale(boolean isFemale){
		
		//update counter if gender changed
		if (this.isFemale == false && isFemale == true)
			totalFemales++;
		else if (this.isFemale == true && isFemale == false)
			totalFemales--;
		
		this.isFemale = isFemale;
		
	}
	
	//returns true if age, name, and gender are the same -
	//returns false if not the same
	public boolean equals(Person b){
		
		if (this.age == b.age
			&& this.name.equalsIgnoreCase(b.name)
			&& this.isFemale == b.isFemale)
				return true;
		else
			return false;
		
	}
	
	//returns true if calling object is younger than
	//parameter object, returns false if not younger
	public boolean isYounger(Person b){
		
		if (this.age < b.age)
			return true;
		else
			return false;
		
	}
	
	//returns string containint name, age, and gender
	public String toString(){
		
		//create gender string based on isFemale boolean
		String gender;
		if (isFemale)
			gender = "Female";
		else 
			gender = "Male";
		
		return "Name: " + name +
				"\nAge: " + age +
				"\n" + gender;
		
	}
	
	//returns average age for all persons
	public static double avgAge(){
		
		return (double)totalAge / totalPersons;
		
	}
	
	//returns total person count
	public static int howManyPeople(){
		
		return totalPersons;
		
	}
	
	//returns total female count
	public static int howManyFemales(){
		
		return totalFemales;
		
	}

}
