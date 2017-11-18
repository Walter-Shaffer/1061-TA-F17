/*
* Person.java
* Author: Kevin Okinedo
* Submission Date: 11/10/17
*
* Purpose: A brief paragraph description of the
* program. What does it do? This class holds the methods for PersonTester
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
	
		private static int totalPersons; //number of people
		private static int totalFemales; //number of females
		private static int totalAge; //sum of all ages
				
		private int age; //specifies a person's age
		private String name; //holds a person's name
		private boolean isFemale; //specifies is person is a female
		
	public Person (String name, int age, boolean isFemale) {
		if(age < 0) {
			age = 0;
			this.age = age;
		}
		
		else {
			this.age = age;
		}
		
		this.isFemale = isFemale;
		
		if(name == null){
			name = "Unknown";
			this.name = name;
		}
		
		else{
			this.name = name;
		}
		
		totalPersons++;
		totalAge = totalAge + age;
		
		if(isFemale = true){
			totalFemales++;
		}
		
		
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age){
		if(age > 0){
			this.age = age;
		}
		
		age = age + this.age;
	}
	
	public boolean getFemale(){
		return isFemale;
	}
	
	public void setFemale(boolean isFemale){
		this.isFemale = isFemale;
		totalFemales++;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		if (name != null){
			this.name = name;
		}
	}
	public boolean isYounger(Person person){
		return (this.getAge() < person.getAge());
	}
	
	public String toString(){
		if (isFemale == true)
			return "Name: " +name + "\nAge: " + age + "\nFemale";
		else
			return "Name:" + name + "\nAge: " + age + "\nMale";
	}

	public double avgAvg(){
		return age/totalPersons;
	}
	
	public int howManyPeople(){
		return totalPersons;
	}
	
	public int howManyFemales(){
		return totalFemales;
	}
}
