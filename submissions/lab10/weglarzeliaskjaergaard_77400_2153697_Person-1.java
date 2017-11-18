
public class Person {

	private int age;
	private String name;
	private boolean isFemale;
	
	public static int totalPersons;
	public static int totalFemales;
	public static int totalAge;
	
	//constructor that validates given parameters before assigning to instance variables
	public Person(String name, int age, boolean isFemale){
		if(age < 0){
			this.age = 0;
		}
		else
			this.age = age;
		if(name.equals(null)){
			this.name = "Unknown";
		}
		else{
			this.name = name;
		}
		this.isFemale = isFemale;
		
		totalAge = age + totalAge;
		totalPersons++;
		if (isFemale = true){
			totalFemales = 1;
		}
		
	}
	//sets the age of the person and adds one to total age if necessary and subtracts from total age if necessary
	public void setAge(int age){
		if(age >= 0){
			this.age = age;
		}
		if(age > this.age){
			totalAge = totalAge + (age - this.age);
		}
		else if(this.age > age){
			totalAge = totalAge - (this.age - age);	
			}
		}
	//returns the age of the person
	public int getAge(){
		return age;
	}
	//returns whether the person is female or not
	public boolean getIsFemale(){
		return isFemale;
	}
	//sets the isFemale boolean to false or true given parameters
	public void setIsFemale(boolean isFemale){
		if(isFemale == true){
		this.isFemale = isFemale;
		}
		else{
			isFemale = false;
		}
		if(this.isFemale == true){
			totalFemales++;
		}
		else if (this.isFemale == false){
			totalFemales--;
		}
	}
	//returns the name of the person
	public String getName(){
		return name;
	}
	//sets the name of the person equal to the instance variable name if the input is not null
	public void setName(String name){
		if(!(name.equals(null))){
			this.name = name;
		}
	}
	//returns a string that outputs the name, age, and gender of the person
	public String toString(){
		String personName = "Name: " + this.name;
		String personAge = "Age: " + this.age;
		String personIsFemale = "";
		if(isFemale == true){
		personIsFemale = "Female";
		}
		else if(isFemale == false){
			personIsFemale = "Male";
		}
		String output = personName + "\n" + personAge + "\n" + personIsFemale;
		return output;
	}
	//returns true if all parameters are equal for the called object and parameter object
	public boolean equals(Person anotherPerson){
		if ((this.age == anotherPerson.age) && (this.name.equalsIgnoreCase(anotherPerson.name)) && (isFemale == anotherPerson.isFemale)){
			return true;
		}
		else
			return false;
	}
	//returns true or false for whether the called object is less than or greater than the parameter Person object
	public boolean isYounger(Person anotherPerson){
		if(this.age < anotherPerson.age){
			return true;
		}
		else
			return false;
	}
	//returns the average age of the people
	public static double avgAge(){
		double avg = (double)totalAge / (double)totalPersons;
		return avg;
	}
	//returns how many people there are
	public static int howManyPeople(){
		return totalPersons;
	}
	//returns how many females there are
	public static int howManyFemales(){
		return totalFemales;
	}	
}
