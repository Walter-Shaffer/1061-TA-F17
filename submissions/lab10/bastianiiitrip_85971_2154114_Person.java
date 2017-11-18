/*
* CPSC-1060.java
* Author: Trip Bastian
* Submission Date: November 10, 2017
*
* Purpose: to create a class that will hold the object Person, and have
* 			all the methods necessary to change/set/get the name/age/isFemale variables
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
	static int totalPersons, totalFemales, totalAge;
	public Person(String name, int age, boolean isFemale){
		if(name==null){
			this.name = "Unknown";
		}
		else{
			this.name=name;
		}
		if(age>0){
			this.age = age;
		}
		else{
			this.age = 0;
		}
		this.isFemale = isFemale;
		totalPersons++;
		totalAge+=age;
		if(isFemale==true){
			totalFemales++;
		}
	}
	public void setName(String name){
		if(name!=null){
			this.name = name;
		}
	}
	public void setAge(int age){
		if(age>0){
			totalAge=totalAge-this.age;
			this.age=age;
			totalAge=totalAge = this.age;
		}
	}
	public void setIsFemale(boolean isFemale){
		boolean pre = this.isFemale;
		this.isFemale=isFemale;
		if(pre==true&&isFemale==false){
			totalFemales--;
		}
		else if(pre==false&&isFemale==true){
			totalFemales++;
		}
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public boolean getIsFemale(){
		return isFemale;
	}
	public boolean equals(Person i){
		if(this.name.equals(i.name)==true&&this.age==i.age&&i.isFemale==this.isFemale){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isYounger(Person i){
		return i.age>this.age;
	}
	public String toString(){
		if(isFemale==true){
			return ("Name: "+name+"\nAge: "+age+"\nFemale");
		}
		else{
			return ("Name: "+name+"\nAge: "+age+"\nMale");
		}
	}
	public static double avgAge(){
		return totalAge/totalPersons;
	}
	public static int howManyPeople(){
		return totalPersons;
	}
	public static int howManyFemales(){
		return totalFemales;
	}
}