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
		
		Circle circle3 = new Circle(6.0,4.0,3);//circles 3 and 4 should return true for intersect and equals
		Circle circle4 = new Circle(10.0,2.0,3);//but false for isConcentric, with a distance of 4.4721
		
		Circle circle5 = new Circle(5.0,2.5,6);//circles 5 and 6 should return true for isConcentric and intersect but 
		Circle circle6 = new Circle(5.0,2.5,3);//false for equals, with a distance of 0
		
		Circle circle7 = new Circle(8.0,-3.0,4);//circles 7 and 8 should return false for isConcentric,
		Circle circle8 = new Circle(-4.0,2.5,2);//equals, and intersect, with a distance of 13.200
		
		
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
		System.out.println("circle1="+circle1);
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2="+circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("diameter1=" + circle1.diameter());
		System.out.println("area1=" + circle1.area());
		System.out.println("perimeter1=" + circle1.perimeter());
		
		
		// print circle2 diameter, area and perimeter
		System.out.println("diameter2=" + circle2.diameter());
		System.out.println("area2=" + circle2.area());
		System.out.println("perimeter2=" + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		if (circle1.isUnitCircle() == true){
			System.out.println("Circle 1 is a unit circle");
		}
		else {
			System.out.println("Circle 1 is not a unit circle");
		}
		// display whether circle2 is a unit circle
		if (circle2.isUnitCircle() == true){
			System.out.println("Circle 2 is a unit circle");
		}
		else {
			System.out.println("Circle 2 is not a unit circle");
		}
		
		// your additional tests should be placed below here
		
		
		//display whether circles 1 and two have equal radii
		
		
		if (circle1.equals(circle2) == true){
			System.out.println("The radii of circles 1 and 2 are equivalent");}
		else {
			System.out.println("The radii of circles 1 and 2 are not equivalent");}
		
		//display whether circles 1 and 2 are concentric
		if (circle1.isConcentric(circle2)){
			System.out.println("Circles 1 and 2 are concentric circles");}
			else{
				System.out.println("Circles 1 and 2 are not concentric circles");}
		
		//display whether circles 1 and 2 intersect
		if (circle1.intersects(circle2) == true){
			System.out.println("Circles 1 and 2 intersect");}
		else {
			System.out.println("Circles 1 and 2 do not intersect");
		}
		
		//display the distance between the two circles
		System.out.println("The distance between circles 1 and 2 is " + circle1.distance(circle2));
		
		//--------------------------------------------------------------------------------------------
		//----------------------------Compare Circles 3 and 4-----------------------------------------
		//--------------------------------------------------------------------------------------------
		
		System.out.println("\ncircle3="+circle3);
		System.out.println("circle4="+circle4);
		
		//display whether the radii of circles 3 and 4 are equivalent
		if (circle3.equals(circle4) == true){
			System.out.println("\nThe radii of circles 3 and 4 are equivalent");}
		else {
			System.out.println("\nThe radii of circles 3 and 4 are not equivalent");}
		
		//display whether circles 3 and 4 are concentric
		if (circle3.isConcentric(circle4)){
			System.out.println("Circles 3 and 4 are concentric circles");}
			else{
				System.out.println("Circles 3 and 4 are not concentric circles");}
		
		//display whether circles 3 and 4 intersect
		if (circle3.intersects(circle4) == true){
			System.out.println("Circles 3 and 4 intersect");}
		else {
			System.out.println("Circles 3 and 4 do not intersect");
		}
		
		//display the distance between the two circles
		System.out.println("The distance between circles 3 and 4 is " + circle3.distance(circle4));


		//--------------------------------------------------------------------------------------------
		//----------------------------Compare Circles 5 and 6-----------------------------------------
		//--------------------------------------------------------------------------------------------
		
		System.out.println("\ncircle5="+circle5);
		System.out.println("circle6="+circle6);
		
		//display whether the radii of circles 5 and 6 are equivalent
		if (circle5.equals(circle6) == true){
			System.out.println("\nThe radii of circles 5 and 6 are equivalent");}
		else {
			System.out.println("\nThe radii of circles 5 and 6 are not equivalent");}
		
		//display whether circles 5 and 6 are concentric
		if (circle5.isConcentric(circle6)){
			System.out.println("Circles 5 and 6 are concentric circles");}
			else{
				System.out.println("Circles 5 and 6 are not concentric circles");}
		
		//display whether circles 5 and 6 intersect
		if (circle6.intersects(circle5) == true){
			System.out.println("Circles 5 and 6 intersect");}
		else {
			System.out.println("Circles 5 and 6 do not intersect");
		}
		
		//display the distance between the two circles
		System.out.println("The distance between circles 5 and 6 is " + circle5.distance(circle6));
		
		//--------------------------------------------------------------------------------------------
		//----------------------------Compare Circles 7 and 8-----------------------------------------
		//--------------------------------------------------------------------------------------------
				
		
		System.out.println("\ncircle7="+circle7);
		System.out.println("circle8="+circle8);
		
		//display whether the radii of circles 7 and 8 are equivalent
		if (circle7.equals(circle8) == true){
			System.out.println("\nThe radii of circles 7 and 8 are equivalent");}
		else {
			System.out.println("\nThe radii of circles 7 and 8 are not equivalent");}
	
		//display whether circles 7 and 8 are concentric
		if (circle7.isConcentric(circle8)){
			System.out.println("Circles 7 and 8 are concentric circles");}
			else{
				System.out.println("Circles 7 and 8 are not concentric circles");}
		
		//display whether circles 7 and 8 intersect
		if (circle7.intersects(circle8) == true){
			System.out.println("Circles 7 and 8 intersect");}
		else {
			System.out.println("Circles 7 and 8 do not intersect");
		}
		
		//display the distance between the two circles
		System.out.println("The distance between circles 7 and 8 is " + circle7.distance(circle8));


		
		
		
		
	
	
	
	
	
	
	}
		
				
	}
	

