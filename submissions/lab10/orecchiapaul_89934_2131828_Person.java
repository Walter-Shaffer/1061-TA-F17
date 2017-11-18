/* 
 * 
 * Stat.java 
 * Author:  Paul Orecchia  
 * Submission Date:  11/6/17 
 * 
 * Purpose: This program contains set and get methods for age, name, and gender. the program also
 *  has a method to compare two people to see if who is younger and  a method to see if they are the same 
 *  person. the program can also return the average age total amount of people and how many are female.
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
	static int totalFemales;
	static int totalPersons;
	static int totalAge;
	
	public Person(String name,int age,  boolean isFemale){ //Constructor to set name, age and gender
		if (name==null){
			name="unkown";
		}else{
		this.name=name;
		}
		if (age<0){
			age=0;			
		}else{
		this.age=age;
		}
		this.isFemale=isFemale;
		totalPersons=totalPersons+1;
		totalAge+=age;
		if (isFemale==true){
			totalFemales=totalFemales+1;
		}else{
		}
	}	
	public int getAge(){ // returns age
		return age;
	}
	public String getName(){ //returns name
		return name;
	}
	public boolean getIsFemale(){ //returns gender
		return isFemale;
	}
	public void setAge(int age){ //sets the age if its greater than 0. also changes total age based on the change
		if (age<0){			
		}else{
			if(this.age==age){
			}else{
				totalAge=totalAge-this.age;
				totalAge=totalAge+age;
				this.age=age;	
			}
		}
	}
	public void setName(String name){// sets name unless its null
		if (name==null){
		}else{
		this.name=name;
		}
	}
	public void setIsFemale(boolean isFemale){ //sets gender, this also effects totalFemales
		if (this.isFemale==isFemale){
		}else{
			if (isFemale==true){
				totalFemales=totalFemales+1;
				this.isFemale=isFemale;
			}else{
				totalFemales=totalFemales-1;
				this.isFemale=isFemale;
			}
		}
	}
	public boolean equals(Person p){ //compares the two people
		if (this.age==p.age){
		}else{
			return false;
		}
		if (this.name.equalsIgnoreCase(p.name)){
		}else{
			return false;
		}
		if (this.isFemale==p.isFemale){
			return true;
		}else{
			return false;
		}
	}
	public boolean isYounger(Person p){ //compares to see who is younger
		if (this.age<p.age){
			return true;
		}else{
			return false;
		}	
	}
	public String toString(){ //prints
		if (isFemale==true){
			return "Name: "+name+"\nAge: "+age+"\nFemale";
		}else{
			return "Name: "+name+"\nAge: "+age+"\nMale";
		}
	}
	static double avgAge(){ //returns the average age of all the people
		return (double) totalAge/totalPersons;
	}
	static int howManyPeople(){ //returns the total amount of people
		return totalPersons;
	}
	static int howManyFemales(){ //returns the amount of females
		return totalFemales;
	}
}
