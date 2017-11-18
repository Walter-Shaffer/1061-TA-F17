/*
* Person.java
* Author: [Jason Battaglini]
* Submission Date: [11/20/17]
*
* Purpose: This program will set and return information about a person or multiple
* people.
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
public class Person{
	private int age;
	private String name;
	private boolean isFemale;
	static int totalPersons = 0;
	static int totalFemales = 0;
	static int totalAge = 0;

	public Person(String nombre, int a, boolean female){
		name = nombre;
		if(name==null){
		   name = "Unknown";
		}

		if(a > 0){
		   age = a;
		}
		else{
		   age = 0;
		}

		isFemale = female;
                
		if(isFemale == true){
		   totalFemales++;
		}
		totalPersons++;
		totalAge += age; 
	}

      	public int getAge(){
	       return age;
	}
	
	public void setAge(int c){
		if(c > 0){
		   age = c;
		}
		else{
		   age = 0;
		}
	}
	
	public boolean getIsFemale(){
		return isFemale;
		
	}
		
	public void setIsFemale(boolean b){
		if(b == true){
			totalFemales++;
		}
		isFemale = b;			
			
	}
	
	public void setName(String female){
		if(female.equals("NULL")){}
		else{
		name = female;
		}
	}

	

	public String getName(){
		return name;
	}  
	public static int howManyFemales(){
		return totalFemales;
	}
	public static int howManyPeople(){
		return totalPersons;
	}
	public static double avgAge(){
		return (totalAge/totalPersons);
	}
	public boolean isYounger(Person p){
		return this.getAge()<p.getAge();
	}
	public boolean equals(Person b){
		boolean c= false;;
		if(this.getAge()== b.getAge())
			if(this.getIsFemale()==b.getIsFemale())
				if(this.getName()==b.getName())
				c=true;
		return c;
				
				
		
		
		
				
			
		
		
		
	}
	public String toString(){
		String gender="Male";
		if(this.getIsFemale()==true)
			gender="Female";
		return "Name: " + this.name + "\n" + "Age: " + this.age + "\n" 
				+ gender;
		
	}
}
	

	
