/*
* Person.java
* Author: Harrison C Hall
* Submission Date: November 9, 2017
*
* Purpose: Checks and sets information for the class person.
* Also tells information on all instances of class person.  
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
	private int age; //Creates necessary variables
	private String name;
	private boolean isFemale;
	static int totalPersons;
	static int totalFemales;
	static int totalAge;
	
	
	public Person(String name, int age, boolean isFemale){ //Constructor class for instances of person
		if (age < 0){
			age = 0;
		}
		if (name == null){
			name = "Unknown";
		}
		totalPersons++;
		totalAge += age;
		if (isFemale){
			totalFemales++;
		}
		this.age = age;
		this.name = name;
		this.isFemale = isFemale;
		
	}
	
	public int getAge(){ //returns integer age of person
		return this.age;
	}
	
	public void setAge(int age){ //sets integer age of person
		if (age < 0){
			//doNothing
		} else{
			totalAge += (age - this.age);
			this.age = age;
		}
	}
	
	public boolean getIsFemale(){ //returns boolean of whether person is female
		return isFemale;
	}
	
	public void setIsFemale(boolean isFemale){ //sets whether person is female
		if ((isFemale == true) & (this.isFemale == false)){
			totalFemales++;
		} else if ((isFemale == false) & (this.isFemale == true)){
			totalFemales--;
		}
		this.isFemale = isFemale;
	}
	
	public String getName(){ // returns string name of person
		return name;
	}
	
	public void setName(String name){ //sets string name of person
		if (name != null){
			this.name = name;
		}
	}
	
	public boolean equals(Person person2){ // returns true if both person objects are true
		if ((this.age == person2.age) & ((this.isFemale == person2.isFemale) & (this.name.equals(person2.name)))){
			return true;
		} else{
			return false;
		}
	}
	
	public boolean isYounger(Person person2){ //returns boolean if person1 is younger than person2
		if (this.age < person2.age){
			return true;
		} else{
			return false;
		}
	}
	
	public String toString(){ //returns string of name age gender
		if (isFemale){
			return ("Name: " + name + "\nAge: " + age + "\nFemale");
		} else{
			return ("Name: " + name + "\nAge: " + age + "\nMale");
			}
	}
	
	public static double avgAge(){ //returns average age of all persons
		return (totalAge / (double)totalPersons);
	}
	
	public static int howManyPeople() { //returns number of persons
		return totalPersons;
	}
	
	public static int howManyFemales(){ //returns number of females of type person
		return totalFemales;
	}
	
	
}
