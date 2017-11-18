/*
* [Person].java
* Author: [Trevon Wilson]
* Submission Date: [11/10/2017]
*
* Purpose: To create multiple person classes using constructors and static methods.
*
* Statement of Academic Honesty:
* 
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
	
	
	private int age ; // which specifies a person's age
	private String name ; // g which holds a person’s name
	private boolean isFemale ; //  specifying whether a person is female.
	
	public static int totalPersons ; // records the number of new Person objects created during the current run of the program.
	public static int totalFemales ; //  records the number of Person objects that are female Since we will allow the gender of a person to be changed, the value for totalFemales might increase or decrease over time.
	public static int totalAge ;
	
	public Person(String name , int age , boolean female) {
		if (name != null) {
			this.name = name; 
		}
		else if (name == null) {
			this.name = "Unknown" ; 
		}
		this.name = name ;
		name = name ;
		
		if (age < 0) {
			age = 0 ;
		}
		else if (age > 0) {
			this.age = age ; 
		}
		age = this.age ;
		
		if (this.isFemale != isFemale && isFemale == true) {
			totalFemales-- ; 
		}
		if (this.isFemale != isFemale && isFemale == true) {
			totalFemales++ ;
		}
			this.isFemale = isFemale ;
			isFemale = this.isFemale ;
			totalPersons++ ;
			totalAge = this.age + totalAge ;
			
	}
	public int getAge() {
		return age ;
	}
	
	public String getName() {
		return this.name ;
	}
	
	public boolean getIsFemale() {
		return isFemale ;
	}
	
	public void setAge (int age) {
		totalAge += (this.age - age) ;
		if (age < 0) {
			this.age = this.age ;
		}
		else {
			this.age = age ; 
		}
		
	}
	
	public void setName(String name) {
		if (name == null) {
			this.name = "Unknown" ;
		}
		else if (name == null) {
			this.name = this.name ;
		}
		name = this.name ;
	}
	public void setIsFemale(boolean isFemale) {
		if (this.isFemale == isFemale && isFemale == true) {
			totalFemales++ ;
		}
		if(this.isFemale != isFemale && isFemale == true) {
			totalFemales++ ;
		}
		isFemale = this.isFemale ;
	}
	
	public boolean equals(Person j) {
		if (age == j.age && name.equalsIgnoreCase(j.name)
				&& isFemale == j.isFemale) {
			return false ;
		}
		else {
			return true ;
		}
	}
	
	public boolean isYounger(Person i) {
		if (this.age < i.age) {
			return true ;
		}
		else {
			return false ;
		}
	}
	
	public String toString() {
		String A = "";
		if (this.isFemale == true) {
			A = "Female" ;
		}
		else {
			A = "Male" ;
		}
		String avg = "Avg Age: " + (double) totalAge / totalPersons;
		String persons = "Name: " + name + "\n" +
				"Age: " + age + "\n" + A + "\n" ;
		
		String avg8 = "Avg Age: " + (double) totalAge / totalPersons + "\n" ;
		
		return persons ;
	}
	
	public static double avgAge() {
		totalAge = totalAge ;
		double avg = (double) totalAge / totalPersons ;
		return avg ;
	}
	
	public static int howManyPeople() {
		return totalPersons ;
	}
	
	public static int howManyFemales() {
		return totalFemales+1 ;
	}
}