/*
* Person.java
* Author: Julia Owens
* Submission Date: 11/10/2017
*
* Purpose: 
*
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
public class Person {
	private int age;
	private String name;
	private boolean isFemale;
	private boolean areEqual;
	private boolean isYounger;
	String getIsFemale;
	// instance variables
	private static int totalPersons;
	private static int totalFemales;
	private static int totalAge;
	// static variables
	
	public Person (String name, int age, boolean isFemale) {
		if (age <= 0) {
			this.age= 0;
		}
		else {
			this.age= age;
		}
		if (name == null) {
			this.name= "Unknown";
		}
		else {
			this.name= name;
		}
		if (isFemale == true) {
			totalFemales++;
		}
		totalAge += age;
		totalPersons++;
	}
	// constructor to add age name and gender to new person 
	public void setAge(int age) {
		if (age <= 0) {
			this.age= 0;
		}
		else {
			this.age= age;
			totalAge += age;
		}	
	}
	// setter method for age
	public int getAge() {
		return age;
	}
	// getter method for age
	public void setIsFemale(boolean isFemale) {
		this.isFemale= isFemale;
		if (isFemale == true) {
			totalFemales++;
		}
	}
	// setter method for gender
	public String getIsFemale() {
		if (this.isFemale == true) {
			getIsFemale= "Female";
		}
		else {
			getIsFemale= "Male";
		}
		return getIsFemale;
	}	
	// getter method for gender
	public void setName(String name) {
		if (name == null) {
			this.name= "Unknown";
		}
		else {
			this.name= name;
		}
	}
	// setter method for name
	public String getName() {
		return name;
	}
	// getter method for name
	public boolean areEqual(Person a, Person b) {
		return areEqual;
	}
	// returns true if the two people are the same
	public boolean isYounger(Person person1) {
		if (this.age < age){
			isYounger= false;
		}
		else {
			isYounger= true;
		}
		return isYounger;
	}
	// confirms whether or not a person is younger
	public String toString() {
		String toString= "Name: " + getName() + "\nAge: " + getAge() + "\n" + getIsFemale();
		return toString;
	}
	// converts the information to a string
	public static double avgAge() {
		double avgAge= totalAge / totalPersons;
		return avgAge;
	}
	// returns the average age of all people created
	public static int howManyPeople() {
		return totalPersons;
	}
	public static int howManyFemales() {
		return totalFemales;
	}
	
}
