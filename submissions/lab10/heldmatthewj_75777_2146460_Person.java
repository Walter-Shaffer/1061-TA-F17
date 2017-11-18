
/*
* Person.java
* Author: Matthew Held
* Submission Date: 11-9-17
*
* Purpose:
* The purpose of this class is to create Person objects that
* can be manipulated and tested against other Person objects
* using its methods.
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
*
* I Agree
*
*/
 
public class Person {
      
       //Declare Instance Variables
       private String name;
       private int age;
       private boolean isFemale;
      
       //Declare Static Variables
       private static int totalPersons;
       private static int totalFemales;
       private static int totalAge;
      
       /*
       *  Constructor
       */
       public Person(String name, int age, boolean isFemale) {
             
              //Validate Input & Update Value For this.name
              if (name == null) {
                   
                    this.name = "Unknown";
                   
              } else {
                   
                    this.name = name;
                   
              }
             
              //Validate Input & Update Value For this.age
              if (age < 0) {
                   
                    this.age = 0;
                   
              } else {
                   
                    this.age = age;
                   
              }
             
              //Set Value For this.isFemale
              this.isFemale = isFemale;
             
              //Update Value For totalPersons
              totalPersons += 1;
             
              //Update Value For totalAge
              totalAge += age;
             
              //Update Value For totalFemales
              if (isFemale == true) {
                   
                    totalFemales += 1;
                   
              }
             
       }
      
       /*
       *  getName() - Get Method For this.name
       */
       public String getName() {
             
              return this.name;
             
       }
      
       /*
       *  setName() - Set Method For this.name
       */
       public void setName(String name) {
             
              //Validate Input & Update Value For this.name
              if (name != null) {
                   
                    this.name = name;
                   
              }
             
       }
      
       /*
       *  getAge() - Get Method For this.age
       */
       public int getAge() {
             
              return this.age;
             
       }
      
       /*
       *  setAge() - Set Method For this.age
       */
       public void setAge(int age) {
             
              //Validate Input & Update Value For this.age & totalAge
              if (age >= 0) {
                   
                    //Update Value Of totalAge
                    totalAge -= this.age;
                    totalAge += age;
                   
                    //Update Value Of this.age
                    this.age = age;
                   
              }
             
       }
      
       /*
       *  getIsFemale() - Get Method For this.isFemale
       */
       public boolean getIsFemale() {
             
              return this.isFemale;
             
       }
      
       /*
       *  setIsFemale() - Set Method For this.isFemale
       */
       public void setIsFemale(boolean isFemale) {
             
              //Update Value Of totalFemales
              if (isFemale == true && this.isFemale == false) {
                   
                    totalFemales += 1;
                   
              } else if (isFemale == false && this.isFemale == true) {
                   
                    totalFemales -= 1;
                   
              }
             
              //Update Value Of this.isFemale
              this.isFemale = isFemale;
             
       }
      
       /*
       *  equals() - Returns true if the calling object's instance variables
       *  are the same as the parameter object's instance variables. Returns
       *  false otherwise.
       */
       public boolean equals(Person otherPerson) {
             
              //Initialize Variable
              boolean isEqual = false;
             
              //Test Condition
              if (this.name.equalsIgnoreCase(otherPerson.name) && this.age == otherPerson.age && this.isFemale == otherPerson.isFemale) {
                   
                    isEqual = true;
                   
              }
             
              //Return Value
              return isEqual;
             
       }
      
       /*
       *  isYounger() - Returns true if the calling object's age is less than the
       *  parameter object's age. Returns false otherwise.
       */
       public boolean isYounger(Person otherPerson) {
             
              //Initialize Variable
              boolean isYounger = false;
             
              //Test Condition
              if (this.age < otherPerson.age) {
                   
                    isYounger = true;
                   
              }
             
              //Return Value
              return isYounger;
             
       }
      
       /*
       *  toString() - Returns a String representation of the object.
       */
       public String toString() {
             
              //Initialize Variable
              String gender = "Female";
             
              //Check Condition
              if (this.isFemale == false) {
                   
                    gender = "Male";
                   
              }
             
              //Return Value
              return "Name: " + this.name + "\nAge: " + this.age + "\n" + gender;
             
       }
      
       /*
       *  avgAge() - Returns the average age of all Person objects created.
       */
       public static double avgAge() {
             
              //Initialize Variable
              double averageAge = 0.0;
             
              //Perform Calculation
              if (totalPersons != 0) {
                   
                    averageAge = (double)totalAge / (double)totalPersons;
                   
              }
             
              //Return Value
              return averageAge;
             
       }
      
       /*
       *  howManyPeople - Returns the number of Person objects created.
       */
       public static int howManyPeople() {
             
              return totalPersons;
             
       }
      
       /*
       *  howManyFemales() - Returns the number of Females.
       */
       public static int howManyFemales() {
             
              return totalFemales;
             
       }
      
}
