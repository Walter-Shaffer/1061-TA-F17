/*
* Person.java
* Author:  Nina Agafonovas
* Submission Date:  November 9, 2017
* Purpose: Practice incorporating static variables and methods into a program.
* Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
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

	private static int totalPersons; // records the number of new Person objects
										// created
	private static int totalFemales; // number of Person objects that are
										// female...
										// but might increase or decrease over
										// time

	static int totalAge; // Keeps track of the sum of the ages of all persons
							// (might also change)

	public Person(String name, int age, boolean isFemale) {
		if (this.age >= 0) {
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

		totalPersons++; 	// increment static variables when a new object is
							// created.
		
		totalAge += this.age; 		// to increment by the age to end up with the sum of
									// ages

		if (isFemale) {	 // increment this with every object if the person
								// is a female.
			totalFemales++;
		}

	}

	public int getAge() {

		return age;

	}

	public String getName() {
		return name;
	}

	public boolean getIsFemale() {

		return isFemale;
	}

	public void setAge(int age) {
		if (age < 0) {
			this.age = 0;
		}
			
		
		totalAge = totalAge - this.age;				 // to update the totalAge for average
		totalAge = totalAge + age;
		
	}

	public void setName(String name) {
		if (this.name != null) {
			this.name = name;
		}
	}

	public void setIsFemale(boolean isFemale) {
		int femaleCount = 0; 			//create counter to keep track of when the boolean returns true (is Female)
		this.isFemale = isFemale;
		
		if (this.isFemale){
			femaleCount++;				//if this object is a female, femaleCount increments by 1
		}
			totalFemales = totalFemales + femaleCount;	

	}

	public boolean equals(Person A) {
		// the age, name, and gender must all be the same to return true
		if (this.age == A.age && this.name.equals(A.name) && this.isFemale == A.isFemale) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isYounger(Person A) {
		if (this.age < A.age) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() { // toString is necessary bc otherwise it returns
								// a memory location

		String gender = ""; // create empty string to set the boolean
							// to either female or male for outprint
		if (this.isFemale) {

			gender = "Female";
		} else {
			gender = "Male";
		}
		return "Name: " + this.name + "\nAge: " + this.age + "\n" + gender;

	}

	static double avgAge() {
		// sum of all the ages divided by the number of Persons
		return (double)totalAge / (double)totalPersons;
	
	}

	static int howManyPeople() {
		return totalPersons;
	}

	static int howManyFemales() {
		return totalFemales;

	}

}
