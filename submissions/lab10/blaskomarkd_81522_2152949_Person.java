/*
* Person.java
* Author: Mark Blasko
* Submission Date: 11/10/17
* Purpose: The purpose of this program is to set values for objects of type Person, and to retrieve values of the classes data fields.
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

  private int age;
  private String name;
  private boolean isFemale;
  public static int totalPersons = 0;
  public static int totalFemales;
  public static int totalAge = 0;

  public Person(String name, int age, boolean isFemale) {
    totalPersons++;
    if (age < 0) {
      this.age = 0;
      totalAge += this.age;
    }
    else {
      this.age = age;
      totalAge += this.age;
    }
    if (name == null) {
      this.name = "Unknown";
    }
    else {
      this.name = name;
    }
    this.isFemale = isFemale;
    if (isFemale == true) {
      totalFemales++;
    }
  } //end of constructor

  public int getAge() { //retrieves age of person object
    return this.age;
  }

  public void setAge(int age) { //sets age of person object
    if (age < 0) {
    this.age = 0;
    }
    totalAge = totalAge - this.age;
    totalAge = totalAge + age;
    this.age = age;
  }

  public String getName() { //retrieves name of person object
    return this.name;
  }

  public void setName(String name) { //sets name of person object
    if (name == null) {
      //Prevents changing name when there is no argument for name
    }
    else {
      this.name = name;
    }
  }

  public boolean getIsFemale() { //returns boolean based on object being male or female
    return this.isFemale;
  }

  public void setIsFemale(boolean isFemale) { //sets data field isFemale equal to boolean
    int femaleAmount = 0;
    this.isFemale = isFemale;
    if (this.isFemale == true) {
      femaleAmount++;
      totalFemales += femaleAmount;
    }
    else {
      totalFemales = totalFemales - 1;
    }
  }

  public boolean equals(Person x) { //compares name, age, and gender of Person object
    if (this.age == x.age && this.name == x.name && this.isFemale == x.isFemale) {
      return true;
    }
    else {
      return false;
    }
  }

  public boolean isYounger(Person x) { //compares age of Person objects
    if (this.age < x.age) {
      return true;
    }
    else {
      return false;
    }
  }

  public String toString() { //returns string value of data fields
    if (this.isFemale == true) {
      return "Name: " + this.name + "\nAge: " + this.age + "\nFemale";
    }
    else {
      return "Name: " + this.name + "\nAge: " + this.age + "\nMale";
    }

  }

  public static double avgAge() { //returns average age
    return (double) totalAge / (double) totalPersons;
}

  public static int howManyPeople() { //returns amount of total people
    return totalPersons;
  }

  public static int howManyFemales() { //returns amount of females
    return totalFemales;
  }


} //end of class
