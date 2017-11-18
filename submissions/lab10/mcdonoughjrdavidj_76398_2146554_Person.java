/*
*Person.java
* Author:  David McDonough
* Submission Date:  November 9th, 2017
* Purpose: Calculates the amount of months needed to pay off credit card debt with interest.
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
	//instance variables
	int age;
	String name;
	boolean isFemale;
	static int totalPersons;
	static int totalFemales;
	static int totalAge;
	
	public Person(String name, int age, boolean isFemale){
		//constructor that sets conditions for age, name, and isFemale
		if (age > 0){
			this.age = age;
		}
		else{
			this.age = 0;
		}
		
		totalAge += this.age;
		
		if(name == null){
			this.name = "Unknown";
		}else
			this.name = name;
		
		
		this.isFemale = isFemale;
		//ternary operator that properly sets a condition for totalFemales
		totalFemales = (isFemale) ? (totalFemales + 1) : (totalFemales);
		
		totalPersons++;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		//calculates the total age if it were to be changed
		totalAge += (age - this.age);
		
		//sets age = 0 if it is less than or equal to 0
		if (age > 0){
			this.age = age;
		}
		else {
			this.age = 0;
		}
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		//sets name if it is not equal to null
		if(name != null){
			this.name = name;
		}
	}
	
	public boolean getIsFemale(){
		return isFemale;
	}
	
	public void setIsFemale(boolean isFemale){
		
		//if-else statement that properly increments or decrements totalFemales if gender were to change
		if(this.isFemale != isFemale){
			if(this.isFemale == true && isFemale != true){
				totalFemales--;
			}
			else {
				totalFemales++;
			}
			this.isFemale = isFemale;
		}
	}
	
	public boolean equals(Person anotherPerson){
		//if-else statement that compares both people including their age, name, and gender
		if(age == anotherPerson.getAge() && name == anotherPerson.getName() && isFemale == anotherPerson.getIsFemale()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isYounger(Person anotherPerson){
		//if-else statement that determines if one person is younger than another person
		if (this.age < anotherPerson.getAge()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String toString(){
		//toString method that properly prints out Name, Age, and the correct gender
		String str = "Name: " + this.name + "\n" + "Age: " + this.age + "\n";
		//if-else statement that prints out correct gender 
		if(isFemale == true){
			str = str + "Female";
		}
		else{
			str = str + "Male";
		}
		return str;
	}
	
	public static double avgAge(){
		//if totalPersons is less than or equal to zero, it will return 0
		if(totalPersons <= 0){
			return 0;
		}
		//calculates average age
		return (double) totalAge/totalPersons;
	}
	
	public static int howManyPeople(){
		return totalPersons;
	}
	
	public static int howManyFemales(){
		return totalFemales;
	}
}

