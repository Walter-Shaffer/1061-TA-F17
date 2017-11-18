/*
* Person.java
* Author:  Alejandro Pardo
* Submission Date:  November 10
* Purpose:  This class calculates the total number of people, the total age of the people and how many females there are among the people.
* Statement of Academic Honesty:
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

	private static int totalPersons;
	private static int totalFemales;
	private static int totalAge;

	public Person(String actualname, int actualage, boolean actualisFemale) {
		if (actualage >= 0) {
			age = actualage;
		} else {
			age = 0;
		}
		if (actualname != null) {
			name = actualname;
		} else {
			name = "Unknown";
		}

		if (actualisFemale) {
			totalFemales++;
			isFemale = actualisFemale;
		}
		totalPersons++;
		totalAge += age;

	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {

		totalAge = totalAge - this.age;
		if (age >= 0) {
			this.age = age;
		}
		totalAge += this.age;

	}

	public boolean getIsFemale() {
		return this.isFemale;
	}

	public void setIsFemale(boolean isFemale) {
		if (this.isFemale != isFemale) {

			if (!isFemale) {
				totalFemales--;
			}
			if (isFemale) {
				totalFemales++;
			}
		}
		this.isFemale = isFemale;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}

	}

	public boolean equals(Person a) {
		if ((a.name.equals(this.name)) && (a.age == this.age) && (a.isFemale == this.isFemale)) {
			return true;
		} else
			return false;
	}

	public boolean isYounger(Person a) {
		if (a.age > this.age) {
			return true;
		} else
			return false;
	}

	public String toString() {
		String Gender = "";
		if (isFemale) {
			Gender = "Female";
		} else if (!isFemale) {
			Gender = "Male";
		}

		return "Name: " + name + "\n" + "Age: " + age + "\n" + Gender;
	}

	public static double avgAge() {
		double averageage = (double) totalAge / totalPersons;
		return averageage;
	}

	public static int howManyPeople() {
		return totalPersons;
	}

	public static int howManyFemales() {
		return totalFemales;
	}

	
}