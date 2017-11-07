
/*
* CircleTester.java
* Author: Matthew Held
* Submission Date: 10-24-17
*
* Purpose:
* The purpose of this program is to test the Circle class
* and its methods.
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
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
//
//*******************************************************
public class CircleTester{
      
       public static void main(String[] args) {
             
              Circle circle1= new Circle(0.0,0.0,2);
              Circle circle2= new Circle(2.0,1.0,1);
             
              System.out.println("circle1="+circle1);
              System.out.println("circle2="+circle2);
             
              // If the method setRadius is implemented correctly,
              // a call to setRadius with a negative number
              // will not change the value of the circle's radius.
              //
              circle1.setRadius(-2.0);
             
              //
              // Reset the center of circle1 (-3.0,4.0)
              //
              circle1.setX(-3.0);
              circle1.setY(4.0);
             
             
              // print circle1 characteristics (center and radius), use a statement similar
              // to the previous println statements. Note that is not necessary to call
              //the method toString, why?
              System.out.println("circle1=" + circle1);
             
              // set the circle2 radius to 5.3
              circle2.setRadius(5.3);
             
              // print circle2 characteristics (center and radius), use a statement similar to the first and
              // second println statements
              System.out.println("circle2=" + circle2);
             
              // print circle1 diameter, area, and perimeter
              System.out.println("circle1=\nDiameter: " + circle1.diameter() + "\nArea: " + circle1.area() + "\nPerimeter: " + circle1.perimeter());
             
              // print circle2 diameter, area and perimeter
              System.out.println("circle2=\nDiameter: " + circle2.diameter() + "\nArea: " + circle2.area() + "\nPerimeter: " + circle2.perimeter());
             
              // display whether circle1 is a unit circle
              System.out.println(circle1.isUnitCircle());
             
              // display whether circle2 is a unit circle
              System.out.println(circle2.isUnitCircle());
             
              // your additional tests should be placed below here
             
              //Create Some More Test Circles
              Circle circle3 = new Circle(-3.0, 4.0, 2);
              Circle circle4 = new Circle(-3.0, 5.0, 2);
              Circle circle5 = new Circle(0.0, 0.0, 1);
              Circle circle6 = new Circle(1.9, 0.0, 1);
              Circle circle7 = new Circle(2.0, 0.0, 1);
             
              //Display If circle1 Equals circle2
              System.out.println("circle1=circle2?: " + circle1.equals(circle2));
             
              //Display If circle1 Equals circle3
              System.out.println("circle1=circle3?: " + circle1.equals(circle3));
             
              //Display If circle2 Equals circle3
              System.out.println("circle2=circle3?: " + circle2.equals(circle3));
             
              //Set Radius Of circle3 To 4
              circle3.setRadius(4);
             
              //Display If circle1 Is Concentric With circle2
              System.out.println("circle1 concentric circle2?: " + circle1.isConcentric(circle2));
             
              //Display If circle1 Is Concentric With circle3
              System.out.println("circle1 concentric circle3?: " + circle1.isConcentric(circle3));
             
              //Display If circle2 Is Concentric With circle3
              System.out.println("circle2 concentric circle3?: " + circle2.isConcentric(circle3));
             
              //Display Distance Of circle1 To circle3
              System.out.println("circle1 distance to circle3?: " + circle1.distance(circle3));
             
              //Display Distance Of circle3 To circle4
              System.out.println("circle3 distance to circle4?: " + circle3.distance(circle4));
             
              //Display Distance Of circle1 To circle2
              System.out.println("circle1 distance to circle2?: " + circle1.distance(circle2));
             
              //Display If circle1 intersects circle2
              System.out.println("circle1 intersects circle2?: " + circle1.intersects(circle2));
             
              //Display If circle5 intersects circle6
              System.out.println("circle5 intersects circle6?: " + circle5.intersects(circle6));
             
              //Display If circle5 intersects circle7
              System.out.println("circle5 intersects circle7?: " + circle5.intersects(circle7));
             
       }
      
}