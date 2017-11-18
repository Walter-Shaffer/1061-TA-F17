/*
 Person.java
 Author: Hunter Singletary
 Submission Date: 11/10/2017

 Purpose: Construct a "Person" object and sets up functions to use the values of the Person object with 

 Statement of Academic Honesty:

 The following code represents my own work. I have neither
 received nor given inappropriate assistance. I have not copied
 or modified code from any source other than the course webpage
 or the course textbook. I recognize that any unauthorized
 assistance or plagiarism will be handled in accordance
 with the policies at Clemson University and the
 policies of this course. I recognize that my work is based
 on an assignment created by the School of Computing
 at Clemson University. Any publishing or posting
 of source code for this project is strictly prohibited
 unless you have written consent from the instructor.
*/
public class Person {

	
	private int age;			//Sets up instance and static variables
	private String name = "";
	private boolean isFemale;
	static int totalPersons;
	static int totalFemales;
	static int totalAge;
	
	public Person(String name, int age, boolean isFemale){		//constructor for "Person"
		if(this.name == null)
		name = "Unknown";
		else this.name = name;
		if(this.age >= 0)
		this.age = age;
		else age = 0;
		this.isFemale = isFemale;
		totalPersons++;
		totalAge += age;
		if (isFemale != false){
			totalFemales++;
			}
	}
	
	public String getName(){	//Getter Functions
		
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public boolean getIsFemale(){
		return isFemale;
	}
	
	public void setName(String name){		//Setter functions
	if (name != null)
	this.name = name;
	} 
	
	public void setAge(int age){
		if (age >= 0)
		this.age = age;
		
		totalAge += age; 
	}
	
	public void setIsFemale(boolean isFemale){
		this.isFemale = isFemale;
		if (isFemale != false)
			totalFemales++;
	}
	
	public boolean equals(Person anotherPerson){		//Checks to see if two objects are the same
		if (this.name == anotherPerson.name && this.age == anotherPerson.age && this.isFemale == anotherPerson.isFemale)
			return true;
		else return false;
	}
	
	public boolean isYounger(Person anotherPerson){  //checks if one person is younger than another
		if (this.age < anotherPerson.age)
		return true;
		else return false;
	}
	
	public String toString(){
		String toReturn = "";
		toReturn += "Name:" + name;
		toReturn += "\n" + "Age:" + age + "\n";
		if (isFemale != true)
		toReturn += "Male";
		else toReturn += "Female";
		
		return toReturn;
	}
	
	public static double avgAge(){
		double avgAge = totalAge / totalPersons;
		return avgAge;
	}
	
	public int howManyPeople(){
	return totalPersons;
	}
	
	public int howManyFemales(){
		return totalFemales;
	}
}
