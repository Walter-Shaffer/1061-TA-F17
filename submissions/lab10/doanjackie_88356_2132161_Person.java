/* 
 * Person.java 
 * Author:  Jackie Doan  
 * Submission Date:  11/7/17 
 * 
 * Purpose:
 * This program is used in order to create people and make a list
 * of them. allowing users to get and set values of each person
 * created. This program will also be able to compare two persons
 * as well as get average age
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
	//private variable initialization
	private int age = 0;
	private String name = null;
	private boolean isFemale = false;
	//static variable initialization
	private static int totalFemale = 0;
	private static int totalPersons = 0;
	private static int totalAge = 0;
	//constructor class
	public Person(String name, int age, boolean isFemale){
		if(name != null){
			this.name = name;
		}
		else{
			this.name = ("\"Unknown\"");
		}
		if(age >= 0){
			this.age = age;
		}
		else{
			this.age = 0;
		}
		this.isFemale = isFemale;
		totalPersons++;
		totalAge += age;
		if(isFemale == true){
			totalFemale++;
		}
	}
	//getter and setter methods
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		totalAge -= this.age;
		if(age >= 0){
			this.age = age;
		}
		totalAge += this.age;
	}
	public boolean getIsFemale(){
		return isFemale;
	}
	public void setIsFemale(boolean isFemale){
		if(this.isFemale == false && isFemale == true){
			totalFemale++;
		}
		this.isFemale = isFemale;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		if(name != null){
			this.name = name;
		}
	}
	//comparison methods
	public boolean equals(Person another){
		if(this.age == another.age && this.isFemale == another.isFemale && this.name.equalsIgnoreCase(another.name)){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isYounger(Person another){
		if(this.age < another.age){
			return true;
		}
		else{
			return false;
		}
	}
	//toString method 
	public String toString(){
		if(isFemale == true){
			return ("Name: " + getName() + "\nAge: " + getAge() + "\nFemale");
		}
		else{
			return ("Name: " + getName() + "\nAge: " + getAge() + "\nMale");
		}
	}
	//Average age method
	public static double avgAge(){
		double avgAge;
		avgAge = totalAge/totalPersons;
		return avgAge;
	}
	//People getter methods
	public static int howManyPeople(){
		return totalPersons;
	}
	public static int howManyFemale(){
		return totalFemale;
	}
}