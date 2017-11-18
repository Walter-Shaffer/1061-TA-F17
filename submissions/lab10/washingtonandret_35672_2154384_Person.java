/*
 * Person.java
 * Author: Andre Washington
 * Purpose: Using static variables and methods on an instance-level
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. 
 * I have neither received nor given inappropriate assistance. I have not copied
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

	
	//Declaring static variable types
	public static int totalPersons;	//Number of new Person objects created
	public static int totalFemales;	//Number of Person objects that are female
	public static int totalAge;	//Sum of the ages of all persons.
	//Declaring variable types
	private int age;	//A Persons age
	private String name;	//A Persons name
	private boolean isFemale;	//A Person is a female
	
	public Person(int age, String name, boolean isFemale){
		if(name != null){
			this.name = name;
		}	
		else if (name == null){
			this.name = "Unknown";
		}
		this.name = name;
		name = name;
		
		if (age < 0){	//Ensuring the age is greater than 0
			this.age = age;
		}
		age = this.age;
		
		if (this.isFemale != isFemale && isFemale == true){	//Decrements with the total of persons
			totalFemales--;
		}														
		if (this.isFemale != isFemale && isFemale == true){	//Increments with the total of persons
			totalFemales++;
		}		
			this.isFemale = isFemale;
			isFemale = this.isFemale;
			totalPersons++;
			totalAge = this.age + totalAge;
		
	}	
	public int getAge(){
		return this.age;
	}
	public String getName(){
		return this.name;
	}
	public boolean getIsFemale(){
		return isFemale;
	}
	public void setAge(int age){
		totalAge += (this.age - age);
		if (age < 0){
			this.age = this.age;
		}
		else {
			this.age = age;
		}
		
	}
	public void setName(String Name){
		if (name == null){
			this.name = "Unknown";
		}
		else if (name == null){
			this.name = this.name;
		}
		name = this.name;
	}
	public void setIsFemale(boolean isFemale){
		if(this.isFemale == isFemale && isFemale == true){
			totalFemales++;
		}
		if(this.isFemale != isFemale && isFemale == true){
			totalFemales++;
		}
		isFemale = this.isFemale;
	}
	public boolean equals(Person a){
		if (age == a.age && name.equalsIgnoreCase (a.age)
				&& isFemale == a.isFemale){
			return false;
		}
		else{
			return true;
		}
	}
	public boolean isYounger(Person b){
		if (this.age < b.age){
			return true;
		}
		else{
			return false;
		}
	}
	public String toString(){
		String A = "";
		if (this.isFemale == true){
			A = "Female";
		}
		else{
			A = "Male";
		}
		String avg = "Avg Age: " + (double) totalAge/totalPersons;
		String persons = "Name: " + name + "\n" + "\n" +
						"Age: " + age + "\n" + A + "\n";
		return persons;
	}
	public static double avgAge(){
		totalAge = totalAge;
		double avg = (double) totalAge/totalPersons;
		return avg;
	}
	public static int howManyPeople(){
		return totalPersons;
	}
	public static int howManyFemales(){
		return totalFemales+1;
	}
}
