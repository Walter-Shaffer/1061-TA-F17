/*

* [Person].java

* Author: [Thomas Griffith]

* Submission Date: [November 10, 2017]

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

	private int age = 0;

	private String name = "Unkown";

	private Boolean isFemale = false;

	static int totalPersons = 0;

	static int totalFemales = 0;

	static int totalAge = 0;

	static double avgAge = 0;

	public Person(String n, int a, boolean iF) {

		if (a >= 0) {

			this.age = a;

		}

		if (a < 0) {

			this.age = 0;

		}

		if (n == null) {

			this.name = "Unknown";

		} else {

			this.name = n;

		}

		this.isFemale = iF;

		totalPersons++;

		totalAge = totalAge + age;

		if (isFemale == true) {

			totalFemales++;

		}

	}

	public int getAge() {

		return this.age;

	}

	public int setAge(int age) {

		if (age >= 0) {

			totalAge = totalAge - this.age;

			this.age = age;

			totalAge = totalAge + this.age;

		}

		return this.age;

	}

	public String getName() {

		return this.name;

	}

	public String setName(String name) {

		if (name != null) {

			this.name = name;

			return name;

		}

		return this.name;

	}

	public boolean getIsFemale() {

		return this.isFemale;

	}

	public boolean setIsFemale(boolean isFemale) {

		if (this.isFemale == true) {

			if (isFemale == false) {

				totalFemales--;

			}

		}

		if (this.isFemale == false) {

			if (isFemale == true) {

				totalFemales++;

			}

		}

		this.isFemale = isFemale;

		return isFemale;

	}

	public boolean equals(Person anotherPerson) {

		int p = 0;

		if (this.age == anotherPerson.getAge()) {

			p++;

		}

		if (this.name == anotherPerson.getName()) {

			p++;

		}

		if (this.isFemale == anotherPerson.getIsFemale()) {

			p++;

		}

		if (p == 3) {

			return true;

		} else {

			return false;

		}

	}

	public boolean isYounger(Person anotherPerson) {

		if (this.age > anotherPerson.getAge()) {

			return false;

		} else {

			return true;

		}

	}

	public String toString() {

		String gender = "";

		if (isFemale == true) {

			gender = "Female";

		}

		if (isFemale == false) {

			gender = "Male";

		}

		return "Name: " + this.name + "\nAge: " + this.age + "\n" + gender;

	}

	public static double avgAge() {

		return (totalAge / totalPersons);

	}

	public static int howManyPeople() {

		return totalPersons;

	}

	public static int howManyFemales() {

		return totalFemales;

	}

	

}