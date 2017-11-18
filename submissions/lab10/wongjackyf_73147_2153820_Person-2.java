/** 
 *
 * Person.java
 * Author: Jacky Wong
 * Submission Date: 11/10/2017
 * 
 * Purpose: A class that takes the name, age, and gender of
 * a few people and modifies and analyzes the information found.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance
 * with the policies at Clemson university and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the School of Computing
 * at Clemson University. Any publishing or posting
 * of source code for this project is strictly prohibited
 * unless you have written consent from the instructor.
 *
 */

public class Person {
	// Declare instance variables
	private int age;
	private String name;
	private boolean isFemale;
	
	// Declare static variables
	private static int totalPersons;
	private static int totalFemales;
	private static int totalAge;
	
	public Person(String name, int age, boolean isFemale) {
		if (age >= 0) {		// Ensures age is valid
			this.age = age;
		}
		else {
			this.age = 0;
		}
		
		if (name == null) {		// If a null is inputted for the name
			this.name = "Unknown";
		}
		else {
			this.name = name;
		}
		
		this.isFemale = isFemale;
		
		totalPersons += 1;
		totalAge += age;
		if (isFemale == true) {
			totalFemales += 1;
		}
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		if (age >= 0) {
			if (this.age != age) {		// Ensures that the age is different
				totalAge -= this.age;
				totalAge += age;
			}
			this.age = age;
		}
	}
	public boolean getIsFemale() {
		return this.isFemale;
	}
	public void setIsFemale(boolean isFemale) {
		if (isFemale = true) {
			totalFemales += 1;
		}
		this.isFemale = isFemale;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if (name != null) {		// Ensures the name is different
			this.name = name;
		}
	}
	
	public boolean equals(Person secondPerson) {
		if ((this.age == secondPerson.age) && (this.isFemale == secondPerson.isFemale) && (this.name.equalsIgnoreCase(secondPerson.name))) {
			return true;			// Checks if the name, age, and gender are equal
		}
		else {
			return false;
		}
	}
	
	public boolean isYounger(Person secondPerson) {
		if (this.age < secondPerson.age) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		String gender = "";
		if (isFemale == true) {
			gender = "Female";
		}
		else {
			gender = "Male";
		}
		return "Name: " + name + "\nAge: " + age + "\n" + gender;
	}
	
	public static double avgAge() {
		return (double)totalAge / (double)totalPersons;			// Typecast necessary because totalAge and totalPersons are int
	}
	
	public static int howManyPeople() {
		return totalPersons;
	}
	
	public static int howManyFemales() {
		return totalFemales;
	}
}
