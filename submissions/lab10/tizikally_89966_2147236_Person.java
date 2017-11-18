/* Person.java
* Author: Allison Tizik
* Submission Date: 11/9/17
* Purpose: The program takes the person's name, age,
* and a true or false statement declaring if they
* are female or male. True equals female, and false 
* equals male. If the age is less than 0 it returns the
* age as 0. Also if the name is null it returns the names
* as unknown. It counts the total amount of people, 
* sums up their ages, and how many females. It records all
* the information and returns it. It also compares to see which
* person is younger. It returns average age and amount of females.
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

	private int age; // specifies person's age
	private String name; // specifies peron's name
	private boolean isFemale; //specifies peron's gender
	
	private static int totalPersons; //records total amount of people declared
	private static int totalFemales; // records amount of female
	private static int totalAge; // records sum of all peoples ages
	
	
	//constructor accepting name, age, and gender
	public Person(String name, int age, boolean isFemale){
		if (age < 0){ //setting age parameters
			this.age = 0;
		}else{
			this.age = age;
		}
			if (name == null){ //setting name parameters
				this.name = "Unknown";
			}else {
				this.name = name;
			}
		this.isFemale = isFemale;
			if (this.isFemale == true){
				totalFemales++;
			}
		totalAge += this.age; //summing age
		totalPersons++; // tracking people
		}
	
	public int getAge(){ //accessor for age
		int newAge = age;
		return newAge;
	}
	public void setAge(int age){ //mutator for age
		totalAge -= this.age;//if age is reset subtracts the age that is already inputted
		if (age < 0){
			this.age = 0;
		}else{
			this.age = age;
		}
		totalAge += this.age; //adds the new age that has been set
	}
	
	public boolean getIsFemale(){//accessor for isFemale
		return this.isFemale;
	}
	
	public void setIsFemale(boolean isFemale){//mutator for isFemale
		if (this.isFemale == true){
			totalFemales--;
		}
		this.isFemale = isFemale; 
		if (this.isFemale == true){
			totalFemales++;
		}
	}
	
	public String getName(){ //accessor for name
		return this.name;
	}
	
	public void setName(String name){ //mutator for name
		String unknownName = "Unknown";
		if (this.name != null){
			this.name = name;
		}else{
			this.name = unknownName;
		}
	}
	
	public String toString(){ //produces a string that says name, age, and gender in correct spaced format
		String name = ("Name: " + this.name);
		String age = ("Age: " + this.age);
		String gender;

		if (isFemale == false){
			gender = "Male";
		}else{
			gender = "Female";
		}
		return name + "\n" + age + "\n" + gender;
	}

	
	public boolean isYounger(Person anotherPerson){ //caculates who is younger by age
		if (this.age > anotherPerson.age){
			return false;
		}else{
		return true;
		}
	}
	
	public static double avgAge(){ // totalAge(is sum of the ages)/totalPersons(the amount of persons created)
		return (double) totalAge/totalPersons;
	}
	
	public static int howManyPeople(){ //amount of times constructor was run creating new person
		return totalPersons;
	}
	
	public static int howManyFemales(){ //amount of times female was counted
		return totalFemales;
	}
	

	
}
