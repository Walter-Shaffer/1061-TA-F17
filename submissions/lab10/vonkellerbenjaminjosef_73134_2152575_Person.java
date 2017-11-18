/*
* Person.java
* Author: Benjamin VonKeller
* Submission Date: 11/10/2017
*
* Purpose: practice with OOP, creates person objects and tests and changes them.
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
	public static int totalPersons;
	public static int totalFemales;
	public static int totalAge;
	
	public Person(String name, int age, boolean isFemale) {
		if (age >= 0) {
			this.age = age;
		}
		else {
			this.age = 0;
		}
		if (name != null) {
			this.name = name;
		}
		else {
			this.name = "Unknown";
		}
		this.isFemale = isFemale;
		if (isFemale == true) {
			totalFemales++;
		}
		totalPersons++;
		totalAge = totalAge + this.age;
	}
	public void setAge(int age) {
		if (age >= 0) {
			if (this.age < age) {
				totalAge = totalAge + (age - this.age);
			}
			else if (this.age > age) {
				totalAge = totalAge - (this.age - age);
			}
			this.age = age;
		}
	}
	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
		else {
			this.name = "Unknown";
		}
	}
	public void setIsFemale(boolean isFemale) {
		if (isFemale == false && this.isFemale == true) {
			totalFemales--;
		}
		else if (isFemale == true && this.isFemale == false) {
			totalFemales++;
		}
		this.isFemale = isFemale;
	}
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return  this.name;
	}
	public boolean getIsFemale() {
		return isFemale;
	}
	public boolean equals(Person p) {
		if (this.name.equals(p.name) && this.age == p.age && this.isFemale == p.isFemale) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isYounger(Person p) {
		if (this.age < p.age) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		String personString = "Name: " + this.name + "\nAge: " + this.age + "\n";
		if (this.isFemale == true) {
			personString = personString + "Female";
		}
		else {
			personString = personString + "Male";
		}
		return personString;
	}
	public static double avgAge() {
		double average = (double)totalAge/(double)totalPersons;
		return average;
	}
	public static int howManyPeople() {
		return totalPersons;
	}
	public static int howManyFemales() {
		return totalFemales;
	}
	
	
	
}
