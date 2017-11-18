/*
* [Person].java
* Author: [Spalding Latham]
* Submission Date: [11/10/2017]
*
* Purpose: This program uses OOP to create objects of type person.
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
	
	static int totalPersons;
	static int totalFemales;
	static int totalAge;
	
	public Person(String name, int age, boolean isFemale){
		//when a new Person object is made, total persons increases by 1
		totalPersons++;
		//when a new Person object is made, total age adds that persons age to the total
		totalAge += age;
		//if the new Person object is female, the total females increases by 1
		if(isFemale == true){
			totalFemales++;
		}
		
		//if an invalid age is entered, the age is set to 0
		if(age < 0){
			age = 0;
		} else {
	    this.age = age;
		}
		
		//if an invalid name is entered, the name is set to Unknown
		if(name != null){
			this.name = name;
		} else {
			name = "Unknown" ;
		}
		
		this.isFemale = isFemale;
		
	}
	
	//accessor method for age
	public int getAge(){
		return age;
	}
	
	//setter method for age
	public void setAge(int age){
		if (age > 0){
		this.age = age;
		}
	}
	
	//accessor method for isFemale
	public boolean getIsFemale(){
		return isFemale;
	}
	
	//setter method for isFemale
	public void setIsFemale(boolean isFemale){
		
		this.isFemale = isFemale;
	}
	
	//accessor method for name
	public String getName(){
		return name;
	}
	
	//setter method for name
	public void setName(String name){
		if(name != ""){
			this.name = name;
		}
	}
	
	//equals method to test if two people have the same age name and gender
	public boolean equals(Person anotherPerson){
		if((this.getAge() == anotherPerson.getAge()) && (this.getIsFemale() == anotherPerson.getIsFemale()) && (this.getName().equalsIgnoreCase(anotherPerson.getName()))){
			return true;
		} else {
			return false;
		}
	}
	
	//instance method to check if person is younger than anotherPerson
	public boolean isYounger(Person anotherPerson){
		if (this.getAge() < anotherPerson.getAge()){
			return true;
		} else {
			return false;
		}
	}
	
	//toString method to output the person's info in a single string
	public String toString(){
		String gender;
		if(isFemale == true){
			gender = "Female";
		} else {
			gender = "Male";
		}
		
		return "Name: " + name + "\nAge: " + age + "\n" + gender;
	}
	
	
	//method to return the total persons
	public static int howManyPeople(){
		return totalPersons;
	}
	
	
	//method to return the total number of females
	public static int howManyFemales(){
		return totalFemales;
	}
	
	
	//returns the average age of all Person objects created
	public static double avgAge(){
		double age = (double)totalAge;
		//System.out.print("total age - " + age);
		double people = (double)totalPersons;
	//System.out.print("total ppl - " + people);
		double average = age/people;
		return average;
		
	}
	
	
	
	
	
	
	
	
	
	

}
