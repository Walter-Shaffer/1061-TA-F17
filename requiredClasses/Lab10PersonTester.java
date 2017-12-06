public class Lab10PersonTester {

	Person person1 = new Person("Marcus Smith", 23, false);
	Person person2 = new Person("Mary Brown", 21, true);
	Person person3 = new Person("Pat", 40, false);
	Person person4 = new Person("Marcus Smith", 25, false);

	private boolean test1(){
		System.out.println("Test 1");
		boolean flag = true;
		//1. [10 points for 1 and 2] 
		//   Create 4 new Person Objects with the properties listed below.

		//2. Use the method toString() to display each of the Person objects. 
		System.out.println("Person 1\n" + person1 + "\n");
		System.out.println("Person 2\n" + person2 + "\n");
		System.out.println("Person 3\n" + person3 + "\n");
		System.out.println("Person 4\n" + person4 + "\n");

		String p1Expected = "Name: Marcus Smith		Age: 23		Male";
		String p2Expected = "Name: Mary BrownAge: 21Female";
		String p3Expected = "Name: PatAge: 40Male";
		String p4Expected = "Name: Marcus SmithAge: 25Male";

		//.replaceAll("\\s+","").equalsIgnoreCase
		if(!p1Expected.replaceAll("\\s+","").equalsIgnoreCase(person1.toString().replaceAll("\\s+",""))){
			System.out.println("person1 " + person1.toString().replaceAll("\\s+",""));
			System.out.println("p1Expected " + p1Expected.replaceAll("\\s+",""));
			System.out.println("person1 != p1Expected");
			flag = false;
		}
		if(!p2Expected.replaceAll("\\s+","").equalsIgnoreCase(person2.toString().replaceAll("\\s+",""))){
			System.out.println("person2 != p2Expected");
			flag = false;
		}
		if(!p3Expected.replaceAll("\\s+","").equalsIgnoreCase(person3.toString().replaceAll("\\s+",""))){
			flag = false;
			System.out.println("person3 != p3Expected");
		}
		if(!p4Expected.replaceAll("\\s+","").equalsIgnoreCase(person4.toString().replaceAll("\\s+",""))){
			flag = false;
			System.out.println("person4 != p4Expected");
		}

		if(flag){
			System.out.println("Passed");
			return true;
		} else {
			System.out.println("Failed(-10 points)");
			return false;
		}

	}

	private boolean test2(){
		System.out.println("Test 2");
		//3. [10 points] 
		//   Increase the age of person1 by 2. Print out the current age of person1.
		int newAge = person1.getAge()+2;
		person1.setAge(newAge);
		System.out.println("Age of P1:\t" + person1.getAge());
		if(person1.getAge() != newAge){
			System.out.println("Failed(-10 points)");
			return false;
		}

		System.out.println("Passed");
		return true;
	}

	private boolean test3(){
		System.out.println("Test 3");
		//4. [10 points] Set the age of person2 to -12. Print out the age of person2. 
		//   The value should not be -12; it should remain 21. 
		person2.setAge(-12);
		System.out.println("Age of P2:\t" + person2.getAge());
		if(person2.getAge() != 21){
			System.out.println("Failed(-10 points)");
			return false;
		}

		System.out.println("Passed");
		return true;
	}

	private boolean test4(){
		System.out.println("Test 4");
		//5. [30 points for correct output based on 5 – 7]
		//   Call the setName method of person3 using null as a parameter.
		person3.setName(null);

		//6. Set the gender of person3 to female.
		person3.setIsFemale(true);

		//7. Print out the name and gender of person3.
		System.out.println("Name of P3:\t" + person3.getName());		
		System.out.println("P3 is Female:\t" + person3.getIsFemale());
		boolean flag = true;
		if( person3.getName() == null || !person3.getName().equalsIgnoreCase("pat")){
			flag = false;
			System.out.println("person3.getName() != pat");
		}
		if(!person3.getIsFemale()){
			System.out.println("person3.getIsFemale != true");
			flag = false;
		}
		
		if(flag == false){
			System.out.println("Failed(-30 points)");
			return false;
		}

		System.out.println("Passed");
		return true;
	}

	private boolean test5(){
		System.out.println("Test 5");
		//8. [5 points] Print out whether person3 is younger than person4
		System.out.println("P3 < P4:\t" + person3.isYounger(person4));

		if(!person3.isYounger(person4)){
			System.out.println("Passed");
			return true;
		} else{
			System.out.println("Failed(-5 points)");
			return false;
		}
	}

	private boolean test6(){
		System.out.println("Test 6");
		//9. [10 points] Print out whether or not person1 and person4 are the same person
		System.out.println("P1 equals P4:\t" + person1.equals(person4));
		if(person1.equals(person4)){
			System.out.println("Passed");
			return true;
		} else{
			System.out.println("Failed(-10 points)");
			return false;
		}
	}

	private boolean test7(){
		System.out.println("Test 7");
		//10. [5 points] Print out the total number of Person objects created
		System.out.println("# of People:\t" + Person.howManyPeople());
		if(Person.howManyPeople() == 4){
			System.out.println("Passed");
			return true;
		} else{
			System.out.println("Failed(-5 points)");
			return false;
		}
	}

	private boolean test8(){
		System.out.println("Test 8");
		//11. [10 points] Print out the total number of females
		System.out.println("# of Females:\t" + Person.howManyFemales());
		if( Person.howManyFemales() == 2){
			System.out.println("Passed");
			return true;
		} else {
			System.out.println("Failed(-10 points)");
			return false;
		}
	}

	private boolean test9(){
		System.out.println("Test 9");
		//12. [10 points] Print out the average age of all Person objects
		System.out.println("Avg Age:\t" + Person.avgAge());
		if(Person.avgAge() == 27.75){
			System.out.println("Passed");
			return true;
		}else {
			System.out.println("Failed(-10 points)");
			return false;
		}

	}

	public static void main(String[] args) {	
		int grade = 0;
		Lab10PersonTester tester = new Lab10PersonTester();
		
		try{
			if(tester.test1())
			grade += 10;
		
		}catch(Exception e){
			System.out.println("Error test 1\n" + e);
		}
		System.out.println();

		
		try{
			if(tester.test2())
			grade += 10;
		
		}catch(Exception e){
			System.out.println("Error test 2\n" + e);
		}
		System.out.println();

		
		try{
			if(tester.test3())
			grade += 10;
		
		}catch(Exception e){
			System.out.println("Error test 3\n" + e);
		}
		System.out.println();

		
		try{
			if(tester.test4())
			grade += 30;
		
		}catch(Exception e){
			System.out.println("Error test 4\n" + e);
		}
		System.out.println();

		
		try{
			if(tester.test5())
			grade += 5;
		
		}catch(Exception e){
			System.out.println("Error test 5\n" + e);
		}
		System.out.println();

		
		try{
			if(tester.test6())
			grade += 10;
		
		}catch(Exception e){
			System.out.println("Error test 6\n" + e);
		}
		System.out.println();

		
		try{
			if(tester.test7())
			grade += 5;
		
		}catch(Exception e){
			System.out.println("Error test 7\n" + e);
		}
		System.out.println();

		
		try{
			if(tester.test8())
			grade += 10;
		}catch(Exception e){
			System.out.println("Error test 8\n" + e);
		}
		System.out.println();

		
		try{
			if(tester.test9())
			grade += 10;
		
		}catch(Exception e){
			System.out.println("Error test 9\n" + e);
		}
		System.out.println();


		System.out.print("\nGrade=" + grade);
		
	}
}
