/*
* Person.java
* Author: Jack Maggard
* Submission Date: 11/7/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* This program creates a Person object holding their name, age and gender. 
* Two or more person objects can be compared to each other using the methods 
* found in this class. 
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

	public Person(String name, int age, boolean isGirl) {// constructor for
															// setting person
															// object
		if (name == null)
			this.name = "Unknown";//case of null name
		else
			this.name = name;
		if (age > 0)
			this.age = age;//age must be greater than 0
		else
			this.age = 0;
		this.isFemale = isGirl;
		if (isGirl)
			totalFemales = totalFemales + 1;//increase in females
		totalPersons = totalPersons + 1;//increase in persons
		totalAge += age;//increase in age
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		totalAge-=this.age;
		if (age >= 0)
			this.age = age;
		totalAge += this.age;//
		}

	public boolean getIsFemale() {
		return isFemale;
	}

	public void setIsFemale(boolean isFemale) {
		// if the person was already female and the gender was changed, the
		// count of females decreases. If they were not already females and they
		// become females, then the female count increases by 1
		if (this.isFemale && !isFemale)
			totalFemales -= 1;
		if (!this.isFemale && isFemale)
			totalFemales += 1;
		this.isFemale = isFemale;
	}

	public void setName(String name) {
		if (name != null)// making sure name is not null
			this.name = name;
	}

	public boolean equals(Person x) {
		boolean z;
		if (x.age == this.age && x.isFemale == this.isFemale && x.name.equals(this.name))
			z = true;
		else
			z = false;
		return z;
	}

	public boolean isYounger(Person z) {
		if (this.age < z.age)// calling object must be younger than z to be true
			return true;
		else
			return false;
	}

	public String toString() {
		String s = "";
		s = s + "Name: " + this.name + "\n" + "Age:  " + this.age + "\n";// formatting
																			// output
		if (isFemale)
			s = s + "Female";
		else
			s = s + "Male";

		return s;

	}

	public static double avgAge() {
		return totalAge / totalPersons;// calculate average age
	}

	public static int howManyPeople() {
		return totalPersons;// return the amount of created person objects
	}

	public static int howManyFemales() {
		return totalFemales;// returns number of females
	}

}
