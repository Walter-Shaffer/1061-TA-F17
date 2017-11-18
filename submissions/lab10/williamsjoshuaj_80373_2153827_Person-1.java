/*
* Person.java
* Author: Joshua Williams
* Submission Date: 11/10/17
*
* Purpose: 
* 	This class creates a person object with a few instance
* variables, and some useful methods for comparing Person data
* with other Person data.  It also has static variables that track
* all person objects.
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
	private static int totalPersons, totalFemales, totalAge;

	public Person(String name, int age, boolean isFemale) {
		if (age <= 0)
			this.age = 0;
		else
			this.age = age;
		totalPersons++;
		this.isFemale = isFemale;
		if (isFemale)
			totalFemales++;
		totalAge += age;
		if (name == null)
			this.name = "Unknown";
		else
			this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= 0)
			age = 0;
		totalAge-=this.age;
		totalAge+=age;
		this.age = age;
	}

	public boolean getIsFemale() {
		return isFemale;
	}

	public void setIsFemale(boolean isFemale) {
		if(this.isFemale != isFemale){
			if(!this.isFemale)
				totalFemales+=1;
			else
				totalFemales-=1;
		}
		this.isFemale = isFemale;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		if (name == null)
			name = "Unknown";
		else
			this.name = name;
	}
	public boolean equals(Person person){
		if(this.name.equals(person.name) && this.age == person.age && this.isFemale == person.isFemale)
			return true;
		else
			return false;
	}
	public boolean isYounger(Person person){
		if(this.age < person.age)
			return true;
		else
			return false;
	}
	public String toString(){
		String gender = this.isFemale == true ? "Female" : "Male";
		return "Name: " + this.name + "\nAge: " + this.age + "\n" + gender;
	}
	static public double avgAge(){
		return totalAge / (1.0 * totalPersons);
	}
	static public int howManyPeople(){
		return totalPersons;
	}
	static public int howManyFemales(){
		return totalFemales;
	}
}