
/** @formatter:off
* Person.java
* Author: John Hollowell
* Submission Date: TODO
*
* Purpose: TODO
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
* @formatter:on
*/

public class Person {

	// Instance Variables
	private int		age;
	private String	name;
	private boolean	isFemale;

	// Class Variables
	private static int	totalPersons;
	private static int	totalFemales;
	private static int	totalAge;

	public Person(String name, int age, boolean isFemale) {

		// validate and set variables
		this.name = (name != null) ? name : "Unknown";
		this.age = (age > 0) ? age : 0;
		this.isFemale = isFemale;

		totalAge += age;
		totalPersons++;
		totalFemales = isFemale ? totalFemales + 1 : totalFemales;
	}

	/**
	 * @return the current object's [name] variable
	 */
	public String getName() {

		return this.name;
	}

	/**
	 * Sets the passed value to the object's [name] variable
	 * 
	 * @param name
	 */
	public void setName(String name) {

		// If the passed name is not null, set to the object's [name] variable
		this.name = (name != null) ? name : this.name;
	}


	/**
	 * @return the current object's [age] variable
	 */
	public int getAge() {

		return this.age;
	}

	/**
	 * Sets the passed value to the object's [age] variable and update the [totalAge]
	 * 
	 * @param age
	 */
	public void setAge(int age) {

		totalAge -= this.age;
		this.age = (age > 0) ? age : this.age;
		totalAge += this.age;
	}

	/**
	 * Returns true is the current object is a female
	 * 
	 * @return the current object's [isFemale] variable
	 */
	public boolean getIsFemale() {

		return this.isFemale;
	}

	/**
	 * Sets the passed value to the object's [isFemale] variable and updates
	 * [totalFemales] accordingly
	 * 
	 * @param isFemale
	 */
	public void setIsFemale(boolean isFemale) {

		// If the value is changing, increase or decrease the number of females
		if (this.isFemale != isFemale) {
			if (this.isFemale) totalFemales--;
			if (!this.isFemale) totalFemales++;
		}

		this.isFemale = isFemale;
	}

	/**
	 * Returns if the current object and the passed object contain the same data
	 * 
	 * @param p
	 *            another Person object
	 * @return true if the objects' data matches
	 */
	public boolean equals(Person p) {

		return (this.age == p.age) && (this.name.equalsIgnoreCase(p.name)) && (this.isFemale = p.isFemale);
	}

	/**
	 * Returns true if the current object has a smaller age than the passed object
	 * 
	 * @param p
	 *            another Person object
	 * @return true if the current age is less than the passed object's [age]
	 */
	public boolean isYounger(Person p) {

		return this.age < p.age;
	}

	public String toString() {

		return String.format("Name: %s\nAge: %d\n%s", this.name, this.age, this.isFemale ? "Female" : "Male");
	}

	/**
	 * @return average age of all created Person objects
	 */
	public static double avgAge() {

		return totalAge / (double) totalPersons;
	}

	/**
	 * @return the class variable [totalPersons]
	 */
	public static int howManyPeople() {

		return totalPersons;
	}

	/**
	 * @return the class variable [totalFemales]
	 */
	public static int howManyFemales() {

		return totalFemales;
	}

	/**
	 * @param args
	 *            unused
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
