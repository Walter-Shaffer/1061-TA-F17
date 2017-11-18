/*PersonTester.java

 * Zachary Smith
 * 11-10-17
 * This program runs the Person class and gives inputs and outputs
 * for the Person class to go through.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not 
 * copied or modified code from any other source other than 
 * the course webpage or the course textbook. I recognize that 
 * any unauthorized assistance or plagiarism will be handled in
 * accordance with the policies at Clemson University and the
 * policies of this course, I recognize that my work is based
 * on an assignment created by the School of Computing at 
 * Clemson University. Any publishing or posting of source
 * code for this project is strictly prohibited unless
 * you have written consent from the instructor.
 * 
 */
public class PersonTester {

	public static void main(String[] args) {
		Person person1 = new Person("Marcus Smith", 23, false);
		Person person2 = new Person("Mary Brown", 21, true);
		Person person3 = new Person("Pat", 40, false);
		Person person4 = new Person("Marcus Smith", 25, false);
		
		System.out.println("person1 = \n" + person1 + "\n");
		System.out.println("person2 = \n" + person2 + "\n");
		System.out.println("person3 = \n" + person3 + "\n");
		System.out.println("person4 = \n" + person4 + "\n");
		
		person1.setAge(2);
		
		System.out.println("Age of person1 = " + person1.getAge());
		
		person2.setAge(-12);
		
		System.out.println("Age of person2 = " + person2.getAge());
		
		person3.setName(null);
		
		person3.setIsFemale(true);
		
		System.out.println("person3 = \n" + person3 + "\n");
		
		System.out.println("Is person4 younger than person3: " + person4.isYounger(person3));
		
		if(person1.equals(person4))
		{
			System.out.println("Person1 and Person4 are the same people.");
		}
		else
		{
			System.out.println("Person1 and Person4 are not the same people.");
		}	
		System.out.print("Total amount of people: ");
		
		System.out.print(Person.howManyPeople());
		
		System.out.print("\nTotal amount of females: ");
		
		System.out.print(Person.howManyFemales());
		
		System.out.print("\nAverage Age: ");
		
		System.out.print(Person.avgAge());
	}
}