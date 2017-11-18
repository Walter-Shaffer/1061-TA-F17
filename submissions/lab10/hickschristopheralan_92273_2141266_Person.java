/*
 * Person.java
 * Author: Christopher Hicks
 * Submission Date 11/7/2017
 * 
 * Purpose: Practice working with constructors and modifiers.
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
public class Person {// Start of class
	private int age;// age of person
	private String name;//Name of person
	private boolean isFemale;// True/False depending on gender
	static int totalPersons;// total population
	static int totalFemales;// total females in population
	static int totalAge;	// average age of population
	
	public Person (String name,int age, boolean isFemale){//Start of Person Constructor
		if (age <= 0){// to validate age above 0
			this.age = 0;
		}
		else{this.age = age;
		}
		if (name == null){// confirm name to null
			this.name = "Unknown";
		}
		else{this.name = name;	
		}
		if(isFemale = false){// test for female 
		totalFemales--;		// incurment female
		}
		else{totalFemales++ ;}
		
		totalPersons++;	// add total Persons
		totalAge++;		// add total age to formula
		this.age += totalAge;
	}
	public void setAge(int age){// sets age to a number greater than 0
		if (age <= 0){
			age = 0;
		}else {}
		
	}
	public int getAge(){	//returns age 
		return this.age;
	
	
	}
	public boolean getIsFemale(){	// returns true/false for female
		return this.isFemale;
	}
	public void setIsFemale(boolean isFemale){	// Sets gender 
		if(isFemale == true ){
			totalFemales++;
		}
		else{totalFemales--;
		}
		
	}
	public String getName(){	// returns name
		return this.name;
	}
	public void setName(String name){	// sets name 
		
		if (name == null){				// if no name is entered then it sets name to null
			;
		}else {}
	}
	
	
	public boolean equals(Person one){ // compares persons
		boolean equals = true;
		if (this.name.equalsIgnoreCase(one.name) && this.age == one.age && this.isFemale == one.isFemale){
			equals = true;
		}
		else {equals = false;
		}
		return equals;	// returns true/ false if equal or not
	}
	
	public boolean isYounger(Person one){// compares age of persons
		boolean younger = false;
		if(this.age > one.age){
			younger = true;
			
		}return younger;	// returns true/ false if younger or not
	}
	public String toString(){	// toString method for showing string values
		String female = "";
		if(getIsFemale() == true){
			female += "Female";
		}
		else{female += "Male";
			
		}
		return ("Name: " + getName() + "\n" + "Age: " + getAge() + "\n" + "Female");	// returns the persons characteristics
		
	}
	public double avgAge(){	// average age
		double avg = (totalAge / (double) totalPersons);
		return avg;
		
	}
	public int howManyPeople(){// incerments total population
		int People = totalPersons;
		return People;
		
	}
	public int howManyFemales(){// incerments total females
		int Women = totalFemales;
		return Women;
		
	}

		
		

	

}
