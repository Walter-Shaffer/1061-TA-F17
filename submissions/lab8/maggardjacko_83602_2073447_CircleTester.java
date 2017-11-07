//*******************************************************
//CircleTester.java
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
		System.out.println("new circle1="+circle1);
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("new circle2="+circle2);
		
		// print circle1 diameter, area and perimeter
		System.out.println("Circle1 Dimensions\nThe diameter of circle1 is "+circle1.diameter()+"\nThe area of circle1 is "+circle1.area()+"\nThe perimeter of circle1 is "+circle1.perimeter()+"\n");
		// print circle2 diameter, area and perimeter
		System.out.println("Circle2 Dimensions\nThe diameter of circle2 is "+circle2.diameter()+"\nThe area of circle2 is "+circle2.area()+"\nThe perimeter of circle2 is "+circle2.perimeter()+"\n");
		// display whether circle1 is a unit circle
		if (circle1.isUnitCircle()){
			System.out.println("circle1 is a unit circle");
		}
		else
			System.out.println("circle1 is not a unit circle");
		// display whether circle2 is a unit circle
		if (circle2.isUnitCircle()){
			System.out.println("circle2 is a unit circle");
		}
		else
			System.out.println("circle2 is not a unit circle");
		// your additional tests should be placed below here
		
		//first equals test
		circle1.setX(0);
		circle1.setY(0);
		circle1.setRadius(2);
		circle2.setX(0);
		circle2.setY(0);
		circle2.setRadius(2);
		System.out.println("\nfirst equals test");
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		if (circle1.equals(circle2))
			System.out.println("circle1 and circle2 are equal");
		else
			System.out.println("circle1 and circle 2 are not equal");
		
		//second equals test
		circle1.setX(.5);
		circle1.setY(.5);
		circle1.setRadius(.51);
		circle2.setX(.49);
		circle2.setY(.49);
		circle2.setRadius(.512);
		System.out.println("\nsecond equals test");
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		if (circle1.equals(circle2))
			System.out.println("circle1 and circle2 are equal");
		else
			System.out.println("circle1 and circle 2 are not equal");
		
		//third equals test
		circle1.setX(.01);
		circle1.setY(.002);
		circle1.setRadius(.50001);
		circle2.setX(.01);
		circle2.setY(.002);
		circle2.setRadius(.50001);
		System.out.println("\nthird equals test");
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		if (circle1.equals(circle2))
			System.out.println("circle1 and circle2 are equal");
		else
			System.out.println("circle1 and circle 2 are not equal");		
		
		//first concentric test will use values from third equals test
		if (circle1.isConcentric(circle2))
			System.out.println("circle1 is concentric with circle2");
		else 
			System.out.println("circle1 is not concentric with circle2");
		//second concentric test
		circle1.setX(1);
		circle1.setY(2);
		circle2.setX(5);
		circle2.setY(7);
		if (circle1.isConcentric(circle2))
			System.out.println("circle1 is concentric with circle2");
		else 
			System.out.println("circle1 is not concentric with circle2");
		
		//third concentric test
		circle1.setX(3);
		circle1.setY(4);
		circle2.setX(1);
		circle2.setY(5);
		if (circle1.isConcentric(circle2))
			System.out.println("circle1 is concentric with circle2");
		else 
			System.out.println("circle1 is not concentric with circle2");	
		
		//First Distance test
		circle1.setX(1);
		circle1.setY(2);
		circle2.setX(5);
		circle2.setY(7);
		System.out.println("\nfirst distance test");
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		System.out.println("The distance between circle1 and circle2 is "+circle1.distance(circle2));
		
		//Second Distance test
		circle1.setX(3);
		circle1.setY(4);
		circle2.setX(1);
		circle2.setY(5);
		System.out.println("\nsecond distance test");
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);		
		System.out.println("The second distance between circle1 and circle2 is "+circle1.distance(circle2));
		
		//Third Distance test
		circle1.setX(9);
		circle1.setY(2);
		circle2.setX(5);
		circle2.setY(3);
		System.out.println("\nthird distance test");
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		System.out.println("The third distance between circle1 and circle2 is "+circle1.distance(circle2));
		
		//first intersects test
		circle1.setX(1);
		circle1.setY(2);
		circle2.setX(5);
		circle2.setY(7);	
		if (circle1.intersects(circle2))
			System.out.println("circle1 is concentric with circle2");
		else 
			System.out.println("circle1 is not concentric with circle2");
		
		//second intersects test
		circle1.setX(3);
		circle1.setY(4);
		circle2.setX(1);
		circle2.setY(5);
		if (circle1.intersects(circle2))
			System.out.println("circle1 is concentric with circle2");
		else 
			System.out.println("circle1 is not concentric with circle2");
		
		//third intersects test
		circle1.setX(9);
		circle1.setY(2);
		circle2.setX(5);
		circle2.setY(3);
		if (circle1.intersects(circle2))
			System.out.println("circle1 is concentric with circle2");
		else 
			System.out.println("circle1 is not concentric with circle2");
		}
	
}
