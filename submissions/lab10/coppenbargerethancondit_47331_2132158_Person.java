/*
* Person.java
* Author: Ethan Coppenbarger
* Submission Date: 11/07/2017
*
* Purpose: 	
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
	// define variables
	int age;
	String name;
	boolean isFemale;
	
	static int totalPersons = 0;
	static int totalFemales = 0;
	static int totalAge = 0;
	
	public Person(String name, int age, boolean isFemale) {
		if (age >= 0) {
			this.age = age;
		} else {
			this.age = 0;
		}
		
		if (name != null) {
			this.name = name;
		} else {
			this.name = "Unknown";
		}
		
		this.isFemale = isFemale;
		
		totalPersons += 1;
		totalAge += age;
		if (isFemale) {
			totalFemales += 1;
		}
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
			totalAge += age;
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}
	
	public boolean getIsFemale() {
		return isFemale;
	}
	public void setIsFemale(boolean isFemale) {
		if (isFemale && (this.isFemale == false)) {
			totalFemales += 1;
		} else if (this.isFemale && (isFemale == false)) {
			totalFemales -= 1;
		}
		this.isFemale = isFemale;
	}
	
	public boolean equals(Person p) {
		if 		(this.name.toLowerCase().equals(p.name.toLowerCase()) && 
				(this.age == p.age) &&
				(this.isFemale == p.isFemale)) {
					return true;
				} else {
					return false;
				}
	}
	
	public boolean isYounger(Person p) {
		if (this.age <= p.age) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		String stringOut = "Name: " + name + "\n" + "Age: " + age + "\n";
		if (isFemale) {
			stringOut += "Female\n";
		} else {
			stringOut += "Male\n";
		}
		return stringOut;
	}
	
	public static double avgAge() {
		return totalAge / totalPersons;
	}
	public static int howManyPeople() {
		return totalPersons;
	}
	public static int howManyFemales() {
		return totalFemales;
	}
	
	
}
