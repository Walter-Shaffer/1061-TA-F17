/*
 * Person.java
 * Author: John Xue
 * Submission Date: Nov. 9, 2017
 *
 * Purpose: Person class that tests class constructors, access modifiers,
 * instance variables, methods (including accessor and mutator methods),
 * and static variables and methods.
 *
 * Statement of Academic Honesty:
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized assistance
 * or plagiarism will be handled in accordance with the policies at
 * Clemson University and the policies of this course. I recognize that my
 * work is based on an assignment created by the School of Computing at
 * Clemson University. Any publishing or posting of source code
 * for this project is strictly prohibited unless you have written
 * consent from the instructor.
 */

public class Person {
	private int age = 0;
	private String name = "Unknown";
	private boolean isFemale = false;
	
	private static int totalPersons = 0;
	private static int totalFemales = 0;
	private static int totalAge = 0;
	
	public Person(String name, int age, boolean isFemale) {
		setAge(age);
		setName(name);
		setIsFemale(isFemale);
		totalPersons += 1;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		totalAge -= this.age;
		if (age > 0) {
			this.age = age;
		}
		totalAge += this.age;
	}
	
	public boolean getIsFemale() {
		return isFemale;
	}
	
	public void setIsFemale(boolean isFemale) {
		if (this.isFemale) {
			totalFemales -= 1;
		}
		this.isFemale = isFemale;
		if (this.isFemale) {
			totalFemales += 1;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			this.name = "Unknown";
		}
	}
	
	public boolean equals(Person a) {
		if (this.name.equals(a.name) 
				&& this.age == a.age && this.isFemale == a.isFemale) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isYounger(Person a) {
		if (this.age < a.age) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		String output = "Name: " + name;
		output += "\nAge: " + age;
		if (isFemale) {
			output += "\nFemale";
		} else {
			output += "\nMale";
		}
		return output;
	}
	
	public static double avgAge() {
		return (double) totalAge / (double) totalPersons;
	}
	
	public static int howManyPeople() {
		return totalPersons;
	}
	
	public static int howManyFemales() {
		return totalFemales;
	}
}
