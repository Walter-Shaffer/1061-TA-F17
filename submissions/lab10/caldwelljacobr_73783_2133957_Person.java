/*
* StarGraph.java
* Author: Jacob Caldwell
* Submission Date: 11/10/2017
*
* Purpose: To determine a person's name, age, and whether or not
* they are female, as well as be able to manipulate their parameters
* and calculate the total number of people, females, and average age
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
	
	private int age;
	private String name;
	private boolean isFemale;
	private static int totalPersons;
	private static int totalFemales;
	private static int totalAge;
	
	public Person(String name, int age, boolean isFemale) {
		if (name == null) {
			name = "Unknown";
		}
		this.name = name;
		if (age < 0) {
			age = 0;
		}
		this.age = age;
		this.isFemale = isFemale;
		totalPersons++;
		totalAge += age;
		if (isFemale == true) {
			totalFemales++;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age){
		if (age >= 0) {
			totalAge -= this.age;
			this.age = age;
			totalAge += this.age;
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
		if (this.isFemale == true && isFemale == false) {
			totalFemales--;
		}
		if (this.isFemale == false && isFemale == true) {
			totalFemales++;
		}
 		this.isFemale = isFemale;
	}
	
	public boolean equals(Person p) {
		if (this.age == p.getAge() && this.name.equalsIgnoreCase(p.getName()) && this.isFemale == p.getIsFemale()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isYounger(Person p) {
		if (this.age < p.getAge()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		String isFemale;
		if (this.isFemale == true) {
			isFemale = "Female";
		}
		else {
			isFemale = "Male";
		}
		return "Name: " + name + "\nAge:  " + age + "\n" + isFemale;
	}
	
	public static double avgAge() {
		double avgAge = totalAge / totalPersons;
		return avgAge;
	}
	
	public static int howManyPeople() {
		return totalPersons;
	}
	
	public static int howManyFemales() {
		return totalFemales;
	}
	
}
