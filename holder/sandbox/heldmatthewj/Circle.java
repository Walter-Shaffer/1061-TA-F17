
/*
* Circle.java
* Author: Matthew Held
* Submission Date: 10-24-17
*
* Purpose:
* The purpose of this program is to create a circle object
* with methods that allow the user to get different
* information about the circle and how it is related to
* other circle objects.
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
*/
 
//*******************************************************
// Circle.java
//
//
//*******************************************************
public class Circle {
      
 
       private double radius;       // declare the private double instance  radius
       private double x;       // declare the private double instance  x
       private double y;       // declare the private double instance  y
      
       //----------------------------------------------
       // Class Constructor: set the initial values of
       //                    the instance variables
       //                    for this circle
       //----------------------------------------------      
       public Circle(double x, double y,double  radius) {
              this.x = x;
              this.y = y;
              this.radius = radius;          
       }
      
      
       //----------------------------------------------
       // getX - returns the value of x
       //----------------------------------------------
       public double getX() {
             
              //Return The Value Of X
              return this.x;
             
       }
      
 
       //----------------------------------------------
       // getY - returns the value of y
       //----------------------------------------------
       public double getY() {
             
              //Return The Value Of Y
              return this.y;
             
       }
      
       //----------------------------------------------
       // getRadius - returns the value of radius
       //----------------------------------------------
       public double getRadius() {
             
              //Return The Value Of Radius
              return this.radius;
             
       }
 
       //----------------------------------------------
       // setX - assigns a new value to x
       //----------------------------------------------
       public void setX(double x) {
             
              //Set Value Of X
              this.x = x;
             
       }
      
 
       //----------------------------------------------
       // setY - assigns a new value to y
       //----------------------------------------------
       public void setY(double y) {
             
              //Set Value Of Y
              this.y = y;
             
       }    
      
      
       //----------------------------------------------
       // setRadius - assigns a new value to radius
       //----------------------------------------------
       public void setRadius(double radius) {
             
              //Test If Value Is Greater Or Equal To 0
              if (radius >= 0) {
                   
                    //Set Value Of Radius
                    this.radius = radius;
                   
              }
             
       }
      
       //--------------------------------------------------------
       // diameter - calculates the diameter of the circle
       //--------------------------------------------------------
       public double diameter() {
             
              //Calculate Diameter & Assign To Variable
              double diameter = this.radius * 2.0;
             
              //Return The Diameter
              return diameter;
             
       }
      
 
       //--------------------------------------------------------
       // area - returns the area of the circle
       //--------------------------------------------------------
       public double area() {
             
              //Calculate Area & Assign To Variable
              double area = Math.PI * Math.pow(this.radius, 2);
             
              //Return The Area
              return area;
             
       }
 
       //--------------------------------------------------------
       // perimeter - returns the perimeter of the circle
       //--------------------------------------------------------
       public double perimeter() {
             
              //Calculate Perimeter & Assign To Variable
              double perimeter = 2.0 * Math.PI * this.radius;
             
              //Return The Perimeter
              return perimeter;
             
       }
      
       //--------------------------------------------------------
       // isUnitCircle - return true if the radius of this circle
       //                is 1 and its center is (0,0) and false
       //                otherwise.
       //--------------------------------------------------------
       public boolean isUnitCircle() {
             
              //Declare Variable
              boolean isUnitCircle = false;
             
              //Test Condition
              if (this.radius == 1.0 && this.x == 0.0 && this.y == 0.0) {
                   
                    isUnitCircle = true;
                   
              }
             
              //Return Value
              return isUnitCircle;
             
       }
      
      
       //--------------------------------------------------------
       // toString - return a String representation of
       //            this circle in the following format:
       //            center:(x,y)
       //            radius: r
       //--------------------------------------------------------
       public String toString() {
             
              //Declare & Initialize The String
              String str = "\ncenter: (" + this.x + "," + this.y + ")\n" + "radius: " + this.radius;
             
              //Return The String
              return str;
             
       }
      
       //--------------------------------------------------------
       // equals - return true if the x, y, and radius of
       //          two circles are the same and false
       //          otherwise.
       //--------------------------------------------------------
       public boolean equals(Circle anotherCircle) {
             
              //Declare Variable
              boolean isEqual = false;
             
              //Test Condition
              if (this.x == anotherCircle.getX() && this.y == anotherCircle.getY() && this.radius == anotherCircle.getRadius()) {
                   
                    isEqual = true;
                   
              }
             
              //Return Value
              return isEqual;
             
       }
      
       //--------------------------------------------------------
       // isConcentric - return true if x and y values of the two
       //                circles are the same and the two radii
       //                are different, otherwise return false.
       //--------------------------------------------------------
       public boolean isConcentric(Circle anotherCircle) {
             
              //Declare Variable
              boolean isConcentric = false;
             
              //Test Condition
              if (this.x == anotherCircle.getX() && this.y == anotherCircle.getY() && this.radius != anotherCircle.getRadius()) {
                   
                    isConcentric = true;
                   
              }
             
              //Return Value
              return isConcentric;
             
       }
      
       //--------------------------------------------------------
       // distance - return the distance between the circle
       //            executing the method and anotherCircle
       //--------------------------------------------------------
       public double distance(Circle anotherCircle) {
             
              //Declare Variable
              double distance;
             
              //Perform Calculation
              distance = Math.sqrt(Math.pow(this.x - anotherCircle.getX(), 2) + Math.pow(this.y - anotherCircle.getY(), 2));
             
              //Return Value
              return distance;
             
       }
      
       //--------------------------------------------------------
       // intersects - return true if the circle executing the
       //              method and anotherCircle have an
       //              intersecting area
       //--------------------------------------------------------
       public boolean intersects(Circle anotherCircle) {
             
              //Declare Variable
              boolean intersects = false;
             
              //Test Condition
              if ((this.distance(anotherCircle)) < (this.radius + anotherCircle.getRadius())) {
                   
                    intersects = true;
                   
              }
             
              //Return Value
              return intersects;
             
       }
      
}