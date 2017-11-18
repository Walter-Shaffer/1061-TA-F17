/*
* Person.java
* Author: Andrew Padgett
* Submission Date: 11/07/17
*
* Purpose: Person class contains methods that alter Person objects
* 		   containing an age, a name, and male or female. Static variables
* 		   keep track of the total Person objects, total female objects,
* 		   and the combined age of each object.
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
	
	//declare instance and static variables
	//
	private int age;
	private String name;
	private boolean isFemale;
	static int totalPersons;
	static int totalFemales;
	static int totalAge;
	
	//constructor assigns name, age, and gender. Also alters total persons,
	//total age, and total number of females.
	//
	public Person(String newName, int newAge, boolean newIsFemale){
		if (newAge < 0)
			age = 0;
		else
			age = newAge;
		if (newName == null)
			name = "Unknown";
		else
			name = newName;
		if (newIsFemale == true)
			totalFemales++;
		totalPersons++;
		totalAge += newAge;
		isFemale = newIsFemale;
	}
	
	//returns age of Person objectt
	//
	public int getAge(){
		return age;
	}
	
	//returns name of Person object
	//
	public String getName(){
		return name;
	}
	
	//returns boolean for whether object is female or not
	//
	public boolean getIsFemale(){
		return isFemale;
	}
	
	//sets objects age and total age
	//
	public void setAge(int age){
		if (age < 0);
		else{
			totalAge = totalAge + age - this.age;
			this.age = age;
		}
	}
	
	//sets objects name
	//
	public void setName(String name){
		if (name != null)
			this.name = name;
		else;
	}
	
	//sets objects gender and increments or decrements total females. 
	//If changing previously made object's gender and the new status
	//equals the old status, nothing changes.
	//
	public void setIsFemale(boolean isFemale){
		if (isFemale == this.isFemale)
			totalFemales = totalFemales;
		else if (isFemale == true)
			totalFemales++;
		else if (isFemale == false)
			totalFemales--;
		this.isFemale = isFemale;
	}
	
	//checks if two Person objects are equal
	//
	public boolean equals(Person p){
		if (p.getAge() == age && p.getName().equalsIgnoreCase(name) && p.getIsFemale() == isFemale)
			return true;
		else
			return false;
	}
	
	//compares the age of two objects
	public boolean isYounger(Person p){
		if (age < p.getAge())
			return true;
		else
			return false;
	}
	
	//returns name, age, and gender of object
	//
	public String toString(){
		String gender;
		if (isFemale == true){
			gender = "Female";
		}
		else{
			gender = "Male";
		}
		return "Name: " + name + "\n" + "Age: " + age + "\n" + gender;
	}
	
	//returns the average of the combined age of every object
	//
	public static double avgAge(){
		return (double)totalAge / (double)totalPersons;
	}
	
	//returns count of total Person objects
	//
	public static int howManyPeople(){
		return totalPersons;
	}
	
	//returns count of total female Person objects
	//
	public static int howManyFemales(){
		return totalFemales;
	}

}
