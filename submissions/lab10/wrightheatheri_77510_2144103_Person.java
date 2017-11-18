/*
* Person.java
* Author: Heather Wright
* Submission Date: November 9, 2017
*
* Purpose: This program contains a plethora of methods to
* in the class Person. There is a constructor that sets the
* name, age, and gender of the person with certain parameters.
*It includes get methods and set methods with parameters. 
*There is an equals method and a isYounger method which return
*true if the two object variables are either younger or equal. 
*It also contains static variables which change in accordance 
*with the number of people, females, and the total age of all 
*the instances of person. Lastly, there are also static methods 
*which return the average age of the total number of people. 
*There is a static method which returns the number of people and
*the number of females.
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
	
	static int totalPersons = 0;
	static int totalFemales = 0;
	static int totalAge = 0;
	
	public Person(String name, int age, boolean isFemale){
		if(age < 0) {
			this.age = 0;
		}
		else {
			this.age = age;
			totalAge += age;
		}
		if(name == null) {
			this.name = "Unknown";
		}
		else {
			this.name = name;
		}
		this.isFemale = isFemale;
		totalPersons++;
		if(isFemale == true) {
			totalFemales++;
		}
	}
	public int getAge(){
		return age;
	}
	public String getName() {
		return name;
	}
	public boolean getIsFemale() {
		return isFemale;
	}
	public void setAge(int age) {
		if(age >= 0) {
			totalAge -= this.age;
			totalAge += age;
			this.age = age;
		}
	}
	public void setName(String name) {
		if(name != null) {
			this.name = name;
		}
	}
	public void setIsFemale(boolean isFemale) {
		if(this.isFemale == false && isFemale == true) {
			totalFemales++;
		}
		this.isFemale = isFemale;
	}
	public boolean equals(Person p) {
		boolean isEqual = false;
		if(this.age == p.age && this.name.equalsIgnoreCase(p.name) 
			&& this.isFemale == p.isFemale) {
			isEqual = true;
		}
		return isEqual;
	}
	public boolean isYounger(Person p) {
		boolean isYounger = false;
		if(this.age < p.age) {
			isYounger = true;
		}
		return isYounger;
	}
	public String toString() {
		String personInfo;
		personInfo = ("Name: " + this.name);
		personInfo += ("\nAge: " + age);
		if(isFemale == true) {
			personInfo += "\nFemale";
		}
		else {
			personInfo += "\nMale";
		}
		return personInfo;
	}
	public static double avgAge() {
		return (double)totalAge / totalPersons;
	}
	public static int howManyPeople() {
		return totalPersons;
	}
	public static int howManyFemales() {
		return totalFemales;
	}
}
