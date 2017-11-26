//*******************************************************
 // CircleTester.java
 //
 // Zachary Smith
 // 10-27-17
 //  A client to test the functionality of objects
 //  of the class Circle.
 //
 // Statement of Academic Honesty:
 // 
 // The following code represents my own work. I have neither
 // received nor given inappropriate assistance. I have not 
 // copied or modified code from any other source other than 
 // the course webpage or the course textbook. I recognize that 
 // any unauthorized assistance or plagiarism will be handled in
 // accordance with the policies at Clemson University and the
 // policies of this course, I recognize that my work is based
 // on an assignment created by the School of Computing at 
 // Clemson University. Any publishing or posting of source
 // code for this project is strictly prohibited unless
 // you have written consent from the instructor.
 // 
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
		
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: " + circle1.diameter(2.0) + ", Area: " + circle1.area(2.0) + ", Perimeter: " + circle1.perimeter(2.0) + " for Circle 1.");
		
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter(5.3) + ", Area: " + circle2.area(5.3) + ", Perimeter: " + circle2.perimeter(5.3) + " for Circle 2.");
		
		// display whether circle1 is a unit circle
		System.out.println("Is Circle 1 a unit circle? " + circle1.isUnitCircle(2.0, -3.0, 4.0));
		
		// display whether circle2 is a unit circle
		System.out.println("Is Circle 2 a unit circle? " + circle2.isUnitCircle(1.0, 2.0, 1.0));
		
		// your additional tests should be placed below here
				
		//test for equals
		
		//test 1
		System.out.println("Are the two circles equal? " + circle1.equals(circle2) );
		//test 2
		circle1.setX(-3.0);
		circle1.setY(4.0);
		circle1.setRadius(1);
		
		circle2.setX(-3.0);
		circle2.setY(4.0);
		circle2.setRadius(1);
		
		System.out.println("Are the two circles equal? " + circle1.equals(circle2) );
		//test 3
		circle1.setX(4.0);
		circle1.setY(-3.0);
		circle1.setRadius(1);
		
		circle2.setX(-3.0);
		circle2.setY(4.0);
		circle2.setRadius(1);
		
		System.out.println("Are the two circles equal? " + circle1.equals(circle2) );
		//reset
		circle1.setX(-3.0);
		circle1.setY(4.0);
		circle1.setRadius(1);
		
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(5.3);
		//test for isCoencentric
		//test 1
		System.out.println("Are the two circles coencentric? " + circle1.isCoencentric(circle2) );
		//test 2
		circle1.setX(-3.0);
		circle1.setY(4.0);
		circle1.setRadius(1);
		
		circle2.setX(-3.0);
		circle2.setY(4.0);
		circle2.setRadius(2);
		
		System.out.println("Are the two circles coencentric? " + circle1.isCoencentric(circle2) );
		//test 3
		circle1.setX(4.0);
		circle1.setY(-3.0);
		circle1.setRadius(1);
		
		circle2.setX(-3.0);
		circle2.setY(4.0);
		circle2.setRadius(1);
		
		System.out.println("Are the two circles coencentric? " + circle1.isCoencentric(circle2) );
		//reset
		circle1.setX(-3.0);
		circle1.setY(4.0);
		circle1.setRadius(1);
		
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(5.3);
		//test of distance
		//test 1
		System.out.println("The distance of the two circles: " + circle1.distance(circle2) );
		//test 2
		circle1.setX(-3.0);
		circle1.setY(4.0);
		
		circle2.setX(-3.0);
		circle2.setY(4.0);
		
		System.out.println("The distance of the two circles: " + circle1.distance(circle2) );
		//test 3
		circle1.setX(4.0);
		circle1.setY(-3.0);
		
		circle2.setX(-3.0);
		circle2.setY(4.0);
		
		System.out.println("The distance of the two circles: " + circle1.distance(circle2) );
		//reset
		circle1.setX(-3.0);
		circle1.setY(4.0);
		circle1.setRadius(1);
		
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(5.3);
		//test for intersection
		//test 1
		System.out.println("Do the two circles intersect? " + circle1.intersects(circle2) );
		//test 2
		circle1.setX(-3.0);
		circle1.setY(4.0);
		circle1.setRadius(1);
		
		circle2.setX(-3.0);
		circle2.setY(4.0);
		circle2.setRadius(2);
		System.out.println("Do the two circles intersect? " + circle1.intersects(circle2) );
		//test 3
		circle1.setX(4.0);
		circle1.setY(-3.0);
		circle1.setRadius(1);
		
		circle2.setX(-3.0);
		circle2.setY(4.0);
		circle2.setRadius(1);
		System.out.println("Do the two circles intersect? " + circle1.intersects(circle2) );
		//reset
		circle1.setX(-3.0);
		circle1.setY(4.0);
		circle1.setRadius(1);
		
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(5.3);
	}
	
}
