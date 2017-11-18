
/* 
Person.java
Author: Sean Meade
Submission Date: 11/9
Purpose: To classify people based on their name, age, and
gender. As well as to calculate information about the entire
group such as how many people their are and how many of them
are female. 

Statement of Academic Honesty:
The following code represents my own work. I have neither
received nor given inappropriate assistance. I have not copied
or modified code from any source other than the course webpage
or the course textbook. I recognize that any unauthorized 
assistance or plagiarism will be handled in accordance
with policies at Clemson University and the
policies of this course. I recognize that my work is based
on an assignment created by the School of Computing
at Clemson University. Any publishing or posting 
of source code for this project is strictly prohibited 
unless you have written consent from the instructor. 
*/
public class Person {

	//Sets up the needed instance variables.
	private int age;
	private String name;
	private boolean isFemale;
	
	//Sets up the needed static variables. 
	public static int totalPersons;
	public static int totalFemales;
	public static int totalAge;

	public Person(String name, int age, boolean isFemale){ //This is the default constructor for object Person.
		if (age <= 0){ //Sets the age to zero if the age given is zero or below. 
			this.age = 0;
		}
		else{ //Sets the age to the age given if it is above zero. 
			this.age = age;
		}
		if (name == null){ //Sets the name to a preset string if their is no given name.
			this.name = "Unknown";
		}
		else{ //Sets the name to the given name. 
			this.name = name;
		}
		this.isFemale = isFemale; //Sets the isFemale value to the given isFemale value.
		totalPersons++; //Increments the total persons every time a Person object is created. 
		totalAge += age; //Adds the age of this object to the total age every time a Person object is created. 
		if (this.isFemale == true){ //Increments the total females every time a Person object created is female. 
			totalFemales++;
		}
	}
	
	public int getAge(){ //Returns the age variable. 
		return age;
	}
	
	public void setAge(int age){ //Adjusts the total age and sets the age of the object to the new age given if the given age is less than or equal to zero. 
		if (age >= 0){
			totalAge -=this.age;
			this.age = age;
			totalAge +=this.age;
		}
	}
	
	public String getName(){ //Returns the name variable. 
		return name;
	}
	
	public void setName(String name){ //Sets the name to the given name if the given name is not null. 
		if (name != null){
			this.name = name;
		}
	}
	
	public boolean getIsFemale(){ //Returns the isFemale variable. 
		return isFemale;
	}
	
	public void setIsFemale(boolean isFemale){ //Sets the isFemale variable to the given boolean variable and adjusts the totalFemales variable. 
		this.isFemale = isFemale;
		if (isFemale == true){
			totalFemales++;
		}
		else{
			totalFemales--;
		}
	}
	
	public boolean equals(Person otherPerson){ //Checks if two Person objects have all the same values and returns true or false based on the result. 
		if((this.age == otherPerson.age) &&	(this.name.equalsIgnoreCase(otherPerson.name)) && 
		(this.isFemale == otherPerson.isFemale)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isYounger(Person otherPerson){ //Checks if one Person object has a smaller age variable than the other and returns true or false based on the result. 
		if(this.age < otherPerson.age){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String toString(){ //Prints the Person information in a readable format. 
		String toString = new String();
		if (isFemale == true){
			toString = ("Name: " + name + "\nAge: " + age + "\nFemale");
		}
		else{
			toString = ("Name: " + name + "\nAge: " + age + "\nMale");
		}
		return toString;
	}
	
	public static double avgAge(){ //Calculates the average age of all the person objects created as a double. 
		double avgAge = ((double)totalAge/(double)totalPersons); 
		return avgAge;
	}
	
	public static int howManyPeople(){ //Returns the totalPersons static variable. 
		return totalPersons;
	}
	
	public static int howManyFemales(){ //Returns the totalFemales static variable. 
		return totalFemales;
	}

}
