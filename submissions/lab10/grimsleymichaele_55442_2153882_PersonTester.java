/*
 * PersonTester.java
 * Author: Michael Grimsley
 * Submission Date: 11/10/2017
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
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
public class PersonTester {
public static void main(String args[]){
	//Making 4 new person objects
	Person person1 = new Person("Marcus Smith", 23, false);
	Person person2 = new Person("Marry Brown", 21, true);
	Person person3 = new Person("Pat", 40, false);
	Person person4 = new Person("Marcus Smith", 25, false);
	
	//prints out each object as a string
	System.out.println("person1 = \n" +person1.toString());
	System.out.println("person2 = \n" +person2.toString());
	System.out.println("person3 = \n" +person3.toString());
	System.out.println("person4 = \n" +person4.toString());

	//sets age of person1 to be 2 higher
	person1.setAge(person1.getAge()+2);
	
	//prints out person1's age
	System.out.println("person1's age is: " +person1.getAge());
	
	//sets person2's age to -12
	person2.setAge(-12);
	
	//prints person2's age
	System.out.println("person 2's age is : " +person2.getAge());
	
	//sets person3's name to null
	person3.setName(null);
	
	//sets person3 gender to female 
	person3.setIsFemale(true);
	
	//prints out the instance variables for person 3
	System.out.println("person 3 = \n" +person3.toString());
	
	//prints if person 4 is younger than person 3
	System.out.println("person4 is younger than person3?: " +person4.isYounger(person3));
	
	//prints if person 1 equals person4
	System.out.println("person1 equals person4?: " +person1.equals(person4));
	
	//final print statements
	System.out.println("total people: " +Person.howManyPeople());
	System.out.println("total females: " +Person.howManyFemales());
	System.out.println("average age: " +Person.avgAge());
	





}
}
