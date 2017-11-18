/*
* Person.java
* Author: Lydia Shealy
* Submission Date: 11/9/17
*
* Purpose: Creates and compares people based on their name, age,
* and gender. Computes the average age of all people. 
* 
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
	//instance variables 
	private int age; 
	private String name; 
	private boolean isFemale; 
	
	static int totalPersons = 0; 
	static int totalFemales = 0; 
	static int totalAge = 0; //sum of all ages 
	
	//constructor to initialize the Person object 
	public Person(String name, int age, boolean isFemale){
		//checks if the age is greater than zero 
		if (age > 0){ 
			this.age = age; 
		}
		else{
			this.age = 0; 
		}
		
		//assigns unknown if given a null input
		if (name != null){
			this.name = name; 
		}
		else{
			this.name = "Unknown"; 
		}
		
		this.isFemale = isFemale; 
		
		//updating the static variables 
		totalPersons += 1; 
		
		//adds to isFemale if its a girl
		if (isFemale){
			totalFemales +=1; 
		}
		
		//adding all the ages together
		totalAge += age; 
	}
	
	//to set the age based on input being positive
	public void setAge(int age){
		//if input is negative, dont change anything
		if (age>0){
			totalAge -= this.age; 
			this.age = age;	
			totalAge += age; 
		}
		else{
			//no change 
		}	 
	}
	
	//returns age
	public int getAge(){
		return age; 
		
	}
	
	//changes the isFemale value and updates the totalFemales variable 
	public void setIsFemale(boolean isFemale){
		this.isFemale = isFemale; 
		
		
		if (isFemale){
			totalFemales +=1; 
		}
		else{
			totalFemales -=1; 
		}
		
	}
	
	//returns true or false depending on whether or not its a female
	public boolean getIsFemale(){
		return isFemale; 
	}
	
	//updates name of object and has no change if its null
	public void setName(String name){
		if (name != null){
			this.name = name; 
		}
		else{
			//no change 
		}
	}
	
	//returns the name of the person 
	public String getName(){
		return name; 
	}
	
	//checks whether or not two people are equal 
	public boolean equals(Person p2){
		if (this.age == p2.age && this.name.equalsIgnoreCase(p2.name) && this.isFemale == p2.isFemale){
			return true; 
		}
		else{
			return false; 
		}
		
	}
	
	//returns whether or not a person is younger than another 
	public boolean isYounger(Person p2){
		if (this.age > p2.age){
			return false; 
		}
		else{
			return true; 
		}
	}
	
	//converts the people to string 
	public String toString(){
		String gender; 
		if (isFemale){
			gender = "Female"; 
		}
		else{
			gender = "Male"; 
		}
		return "Name: " + this.name +  
				"\nAge: " + this.age + 
				"\n" + gender; 
	}
	
	//calculates the average of all the ages 
	public static double avgAge(){
		double avg = (double) totalAge / (double) totalPersons; 
		return avg; 
	}
	
	//returns the total number of people 
	public static int howManyPeople(){
		return totalPersons; 
	}
	
	//returns the total number of females 
	public static int howManyFemales(){
		return totalFemales; 
	}
}
