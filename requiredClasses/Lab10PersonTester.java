public class Lab10PersonTester {
	public static void main(String[] args) {

		//1. [10 points for 1 and 2] 
		//   Create 4 new Person Objects with the properties listed below.
		Person person1 = new Person("Marcus Smith", 23, false);
		Person person2 = new Person("Mary Brown", 21, true);
		Person person3 = new Person("Pat", 40, false);
		Person person4 = new Person("Marcus Smith", 25, false);
		//2. Use the method toString() to display each of the Person objects. 
		System.out.println("Person 1\n" + person1 + "\n");
		System.out.println("Person 2\n" + person2 + "\n");
		System.out.println("Person 3\n" + person3 + "\n");
		System.out.println("Person 4\n" + person4 + "\n");
		
		//3. [10 points] 
		//   Increase the age of person1 by 2. Print out the current age of person1.
		person1.setAge(person1.getAge()+2);
		System.out.println("Age of P1:\t" + person1.getAge());		
		
		//4. [10 points] Set the age of person2 to -12. Print out the age of person2. 
		//   The value should not be -12; it should remain 21. 
		person2.setAge(-12);
		System.out.println("Age of P2:\t" + person2.getAge());		

		//5. [30 points for correct output based on 5 – 7]
		//   Call the setName method of person3 using null as a parameter.
		person3.setName(null);
		//6. Set the gender of person3 to female.
		person3.setIsFemale(true);
		//7. Print out the name and gender of person3.
		System.out.println("Name of P3:\t" + person3.getName());		
		System.out.println("P3 is Female:\t" + person3.getIsFemale());		
		
		//8. [5 points] Print out whether person3 is younger than person4
		System.out.println("P3 < P4:\t" + person3.isYounger(person4));
		
		//9. [10 points] Print out whether or not person1 and person4 are the same person
		System.out.println("P1 equals P4:\t" + person1.equals(person4));
		
		//10. [5 points] Print out the total number of Person objects created
		System.out.println("# of People:\t" + Person.howManyPeople());
		//11. [10 points] Print out the total number of females
		System.out.println("# of Females:\t" + Person.howManyFemales());
		//12. [10 points] Print out the average age of all Person objects
		System.out.println("Avg Age:\t" + Person.avgAge());
	}
}
