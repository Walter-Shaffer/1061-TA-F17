/*
 * Person.java
 * Author: Michael Grimsley
 * Submission Date: 11/10/2017
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
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
	
//static variables	
	private static int totalPerson;
	private static int totalFemales;
	private static int totalAge;

//constructor	
	Person(String name, int age, boolean female){
		//validating values
		if (age < 0){
			this.age = age;
		}
		if (name == null){
			this.name = "unknown";
		}
		this.name = name;
		this.age = age;
		this.isFemale = female;
		if (female){
			totalFemales++;
		}
		totalPerson++;
		totalAge = totalAge + age;
	}

//set age method	
	public void setAge(int age){
		if (age >= 0){
		totalAge = (totalAge - this.age) + age;
		this.age = age;
		}
		
	}
//set name method
	public void setName(String name){
		if (name != null)
		this.name = name;
		}
	
//set isFeamale method
	public void setIsFemale(boolean female){
		if (female){
		this.isFemale = female;
		totalFemales++;
		}else{
		this.isFemale = female;
		totalFemales--;
		}
	}
	
//returns age
	public int getAge(){
		return this.age;
	}
	
//returns name	
	public String getName(){
		return this.name;
	}
	
//returns isFemale
	public boolean getIsFemale(){
		return this.isFemale;
	}
	
//returns true if two person objects are equal
	public boolean equals(Person Obj){
		if (this.age == Obj.getAge() && this.name.equalsIgnoreCase(Obj.getName()) && this.isFemale == Obj.getIsFemale()){
		return true;	
		}else{
		return false;
		}
		}
	
//returns true if calling object has a lower age than argument object	
	boolean isYounger(Person Obj){
		if (this.age < Obj.getAge()){
			return true;
		}else{
			return false;
	}
	}
	
//returns string of instance variables to be printed
	public String toString(){
		String str = "Name: " +this.name+ "\nAge: " +this.age+ "\n";
		if (isFemale){
			str += "Female\n";
		}else{
			str += "Male\n";
		}
		
		return str;
	}
	
//returns average age of all objects
	public static double avgAge(){
		return totalAge/totalPerson;
		
	}
	
//returns total number of Person objects
	public static int howManyPeople(){
		return totalPerson;
	}
	
//returns total number of female objects 
	public static int howManyFemales(){
		return totalFemales;
	}
}
