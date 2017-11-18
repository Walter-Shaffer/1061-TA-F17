/*
* [Person].java
* Author: [Anthony Frazier]
* Submission Date: [11/10/17]
*
* Purpose:Creates functions that allow a main method to manipulate data.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagarism will be handled in accordance
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
	
	public static int totalPersons;
	public static int totalFemales;
	public static int totalAge;
	
	public Person(String name, int age, boolean gender){
		totalPersons ++;
		if(age>=0){
			this.age = age;
		}
		else{
			this.age = 0;
		}
		totalAge += age;
		if(name == null){
			this.name = "Unknown";
		}
		else{
		this.name = name;
		}
		if(!gender){
			this.isFemale = false;
		}
		else if(gender){
			this.isFemale = true;
			totalFemales ++;
		}
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public boolean getIsFemale(){
		return isFemale;
	}
	public void setName(String newName){
		if(newName == null){
			this.name = "Unknown";
		}
		else{
		this.name = newName;
		}
	}
	public void setAge(int newAge){
		double ageDifference = newAge - this.age;
		if(newAge >= 0){
			this.age = newAge;
		}
		totalAge += ageDifference;
		
	}
	public void setIsFemale(boolean isFemale){
		this.isFemale = isFemale;
		if(this.isFemale){
			totalFemales ++;
		}
	}
	public boolean equals(Person p){
		if(this.age == p.age && this.isFemale == p.isFemale && this.name.equalsIgnoreCase(p.name)){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isYounger(Person p){
		if(this.age <p.age){
			return true;
		}
		else{
			return false;
		}
	}
	public String toString(){
		if(isFemale){
			return "Name: " + this.name +"\nAge: " +this.age +"\nFemale" ;
		}
		else{
			return "Name: " + this.name +"\nAge: " +this.age +"\nMale" ;
		}
	}
	static public double avgAge(){
		return totalAge * 1.0/totalPersons;
	}
	static public int howManyPeople(){
		return totalPersons;
	}
	static public int howManyFemales(){
		return totalFemales;
	}
}