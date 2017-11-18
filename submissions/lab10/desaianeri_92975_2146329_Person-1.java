//package lab10;
/*										
* [Person].java										
* 										
* Author:  [Aneri Desai]										
* 										
* Submission Date:  [11/10/2017]										
* 										
* Purpose: In the lab we practice more of the different classes and their methods and functions. We also learned to declare variables with static method and used
* constructor. 										
* 										
* Statement of Academic Honesty:										
* The following code represents my own work. I have neither										
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized										
* assistance or plagiarism will be handled in accordance										
* with the policies at Clemson University and the										
* policies of this course. I recognize that my work is based										
* on an assignment created by the School of Computing										
* at Clemson University. Any publishing or posting										
* of source code for this project is strictly prohibited										
* unless you have written consent from the instructor.										
*/
public class Person {			
			
	private int age; //declared instant and static variables		
	private String name;		
	private boolean isFemale;		
	private static int totalPersons;		
	private static int totalFemales;		
	private static int totalAge;		
	private boolean Female;		
	private boolean Male;		
			
			
	public Person(String name, int age, boolean isFemale) { //constructor which takes age,name and gender type		
		this.age = age;	
		this.name = name;	
		this.isFemale = isFemale;	
		totalPersons++; //to increase the number of people and female every time new person is created 	
		if(isFemale)	
			totalFemales++;
		totalAge +=age; //does some of all ages declared	
			
		if(this.age<0) { //if age < 0, assign it to 0 otherwise it equals instant variable	
			this.age = 0;
		}else 	
			this.age = age;
			
		if(this.name==null) { //if name declared null thn it should assign name to unknown 	
		//if(this.ma)	
			this.name = "Unknown";
		}else 	
			this.name = name;
	}		
			
	public int getAge() {		
		return age;	
			
}			
	public void setAge(int age) { //else age is not greater thn 0 thn it should be unchanged 		
		if(age>0) {totalAge-=this.age;
			this.age=age;
			totalAge=totalAge+this.age;
		}	
	}		
			
	public String getName() {		
		return name;	
	}		
			
	public void setName(String name) { //else age is null thn it should be left unchanged		
		if(!name.equals(null)) {	
			this.name = name;
		}	
	}		
			
	public boolean getIsFemale() {		
		return isFemale;	
	}		
			
	public void setIsFemale(boolean isFemale) {		
		if(isFemale = true) { //if the person is female thn it should increase the number of female	
			this.isFemale = isFemale;
			totalFemales++;
		}	
	}		
			
	public boolean equals(Person a) {		
		return (this.age == a.age && this.name == a.name && this.isFemale == a.isFemale); //passing object parameter to method	
	}		
			
			
	public boolean isYounger(Person b) {		
		return (age < b.age);	
	}		
			
	public String toString() {		
		if(this.isFemale)	//printing male female instead of true false
			return "Name: " + name + "\nAge: " + age + "\n" + "Female";
		else	
			return "Name: " + name + "\nAge: " + age + "\n" + "Male";
	}		
			
	public static double avgAge() {		
		double x= (totalAge/(double)totalPersons); // gives the avg of all ages	
		return x;	
	}		
			
	public static int howManyPeople() {		
		return totalPersons; //returns total people	
			
	}		
			
	public static int howManyFemales() {		
		return totalFemales; //return total number of female 	
	}		
			
}			

