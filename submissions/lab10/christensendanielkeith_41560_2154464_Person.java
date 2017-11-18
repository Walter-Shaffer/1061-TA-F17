/*
* Person.java
* Author: Daniel Christensen
* Submission Date: 11/10/2017
*
* Purpose: This class allows for the creation of people objects which store 
* the age name and whether or not a person is female. It also includes methods to track the
* amount of people, average age and other statistics of the group of people as a whole.
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
    private boolean isFemale;//declare instance variables
    
    private static int totalPersons=0;
    private static int totalFemales=0;
    private static int totalAge=0;//define static class variables
    
    public Person() {//default constructor
    	age=0;
    	name = "Unknown";
    	isFemale = false;
    	totalPersons+=1;
    }
    
    public Person(String newName, int newAge, boolean female) {//constructor with input type
    	
    	totalPersons+=1;
    	
    	if(newAge>=0) {//age must be >=0
    		age = newAge;
    		totalAge+=newAge;
    	}
    	else {
    		age = 0;
    	}
    	
    	if(newName==null) {//name cannot be null
    		name = "Unknown";
    	}
    	else {
    		name = newName;
    	}
    	
    	isFemale = female;
    	if(female==true) {
    		totalFemales+=1;
    	}
    }
    
    public int getAge() {//getters
    	return this.age;
    }
    public String getName() {
    	return this.name;
    }
    public boolean getIsFemale() {
    	return this.isFemale;
    }
    
    public void setAge(int newAge) {//setters
    	if(newAge>=0) {//age must be >=0
    		int change=newAge-this.age;
    		totalAge+=change;
    		this.age = newAge;
    	}
    }
    public void setName(String newName) {
    	if(newName==null) {	//name cannot be null
    	}
    	else {
    		this.name = newName;
    	}
    }
    public void setIsFemale(boolean newIsFemale) {
    	if(newIsFemale==true && this.isFemale==false) {
    		totalFemales+=1;
    	}
    	this.isFemale=newIsFemale;
    	
    }
    
    public boolean equals(Person p) {
    	boolean istrue = false;
    	if (p.getName().equalsIgnoreCase(this.name)) {
    		if (p.getAge()==this.age) {
    			if(p.getIsFemale()==this.isFemale) {//returns true only 
    				istrue= true;
    			}
    		}
    	}
    	return istrue;
    	
    }
    
    public boolean isYounger(Person p) {
    	boolean younger = false;
    	if(p.getAge()>this.age) {
    		younger = true;
    	}
    	return younger;
    }
    
    public String toString() {
    	String gender = "Male";
    	if(isFemale) {
    		gender = "Female";
    	}
    	String output = "Name: "+name+"\nAge:  "+age+"\n"+gender+"\n";
    	return output;
    }
    
    public static double avgAge() {
    	double avg=0.0;
    	if(totalPersons>0) {
    		avg = totalAge/(double)totalPersons;
    	}
    	return avg;
    }
    
    public static int howManyPeople(){
    	return totalPersons;
    }
    
    public static int howManyFemales(){
    	return totalFemales;
    }
    
    

}
