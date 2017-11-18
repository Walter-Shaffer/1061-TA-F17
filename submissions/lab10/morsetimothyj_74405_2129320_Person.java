/*
* Person.java
* Author: Timothy Morse
* Submission Date: Nov 6, 2017
*
* Purpose: Describe me!
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
	//Declarations
	private int age;
	private String name;
	private boolean isFemale;
	private static int totalPersons;
	private static int totalFemales;
	private static int totalAge;
	//Constructor
	//Takes in a name (String), age (int), and if the person is female (boolean)
	//Also checks for validity on all of these values, and handles any that aren't valid
	public Person(String name,int age,boolean isFemale){
		if(age<0){
			this.age = 0;
		}else{
			this.age = age;
			totalAge+=age;
		}
		if(name==null){
			this.name = "Unknown";
		}else{
			this.name=name;
		}
		if(isFemale!=true&&isFemale!=false){
			//I don't think this is even possible, but I'm not taking any chances.
			this.isFemale = false;
		}else{
			this.isFemale = isFemale;
			if(isFemale==true)
				totalFemales++;
		}
		totalPersons++;
	}
	//Sets the persons age from an int
	public void setAge(int age){
		if(age<0){
			//do nothing
		}else{
			totalAge+=age;
			this.age = age;
		}
	}
	//Returns the person's age as an int
	public int getAge(){
		return this.age;
	}
	//Sets the persons name based off a String
	public void setName(String name){
		if(name==null){
			//do nothing
		}else{
			this.name = name;
		}
	}
	//returns the person's name as a String
	public String getName(){
		return this.name;
	}
	//Sets whether a person is female or not from a boolean
	public void setIsFemale(boolean isFemale){
		boolean needsChange = false;
		if(isFemale!=this.isFemale)
			needsChange = true;
		if(isFemale!=true&&isFemale!=false){
			//do nothing
		}else{
			if(needsChange==true&&isFemale==true){
				totalFemales++;
			}else if(needsChange==true&&isFemale!=true){
				totalFemales--;
			}
			this.isFemale = isFemale;
		}
	}
	//Returns whether a person is female or not via a boolean
	public boolean getIsFemale(){
		return this.isFemale;
	}
	//Returns a boolean based upon if one person has the same age, name, and isFemale as another.
	public boolean equals(Person p){
		boolean toReturn = false;
		if(this.getAge()==p.getAge()&&this.getIsFemale()==p.getIsFemale()&&this.getName().equals(p.getName())){
			toReturn = true;
		}else{
			toReturn = false;
		}
		return toReturn;
	}
	//Returns a boolean based upon if a person is younger than another
	public boolean isYounger(Person p){
		boolean toReturn = false;
		if(this.getAge()<p.getAge()){
			toReturn = true;
		}else{
			toReturn = false;
		}
		return toReturn;
	}
	//Returns a String of a person's data
	public String toString(){
		String toReturn = "Name: "+this.name+"\nAge: "+this.age+"\n";
		if(this.isFemale==true){
			toReturn+="Female";
		}else{
			toReturn+="Male";
		}
		return toReturn;
	}
	//Returns the average age of all person objects as a double
	public static double avgAge(){
		return Person.totalAge/Person.totalPersons;
	}
	//Returns how many person objects there are as an int
	public static int howManyPeople(){
		return Person.totalPersons;
	}
	//Returns how many females there are as an int
	public static int howManyFemales(){
		return Person.totalFemales;
	}
}
