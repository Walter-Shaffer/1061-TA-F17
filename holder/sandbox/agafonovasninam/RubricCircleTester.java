//*******************************************************
// RubricCircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
//
// Note: Circles are printed using the notation (x,y,radius) 
//*******************************************************
public class RubricCircleTester{
	
	
	private static double error = 0.0;	// for some tests, this can be adjusted (in case rounding causes slight differences in output). 
	
	public static boolean unitCircleTest()
	{
		Circle circle1= new Circle(1,1,1);  // not a unit circle
		Circle circle2= new Circle(0,0,1);  // a unit circle
		Circle circle3= new Circle(5,6,10); // not a unit circle
		
		boolean testA = (false == circle1.isUnitCircle());
		boolean testB = (true == circle2.isUnitCircle());
		boolean testC = (false == circle3.isUnitCircle());
		
		
		System.out.println("Unit Circle Test:");
		System.out.println("\tTest Passed: " + testA + "\t(1,1,1) is a unit circle: " + circle1.isUnitCircle());
		System.out.println("\tTest Passed: " + testB + "\t(0,0,1) is a unit circle: " + circle2.isUnitCircle());
		System.out.println("\tTest Passed: " + testC + "\t(5,6,10) is a unit circle: " + circle3.isUnitCircle());
		System.out.println("Unit Circle Test: " + (testA && testB && testC));
		return testA && testB && testC;
	}

	
	public static boolean xTest()
	{
		double x;		
		double xReturn;
		Circle circle= new Circle(20,1.0,1.0);
		System.out.println("Getting/Setting x:");
		
		x = 1.0;
		circle.setX(x);
		xReturn =  circle.getX();
		boolean testA =   (x == xReturn);
		System.out.println("\tTest Passed: " + testA + "\tvalue set: " + x + " x returned: " + xReturn);
		

		x = -1.0;
		circle.setX(x);
		xReturn =  circle.getX();
		boolean testB =   (x == xReturn);
		System.out.println("\tTest Passed: " + testB + "\tvalue set: " + x + " x returned: " + xReturn);

		
		x = 0.0;
		circle.setX(x);
		xReturn =  circle.getX();
		boolean testC =   (x == xReturn);
		System.out.println("\tTest Passed: " + testC + "\tvalue set: " + x + " x returned: " + xReturn);


		x = 1138.25;
		circle.setX(x);
		xReturn =  circle.getX();
		boolean testD =   (x == xReturn);
		System.out.println("\tTest Passed: " + testD + "\tvalue set: " + x + " x returned: " + xReturn);
		System.out.println("Getting/Setting x: " + (testA && testB && testC && testD));
		return testA && testB && testC && testD;
	}
	

	public static boolean yTest()
	{
		double y;		
		double yReturn;
		Circle circle= new Circle(20,1.0,1.0);
		System.out.println("Getting/Setting y:");
		
		y = 1.0;
		circle.setY(y);
		yReturn =  circle.getY();
		boolean testA =   (y == yReturn);
		System.out.println("\tTest Passed: " + testA + "\tvalue set: " + y + " y returned: " + yReturn);
		

		y = -1.0;
		circle.setY(y);
		yReturn =  circle.getY();
		boolean testB =   (y == yReturn);
		System.out.println("\tTest Passed: " + testB + "\tvalue set: " + y + " y returned: " + yReturn);
		
		y = 0.0;
		circle.setY(y);
		yReturn =  circle.getY();
		boolean testC =   (y == yReturn);
		System.out.println("\tTest Passed: " + testC + "\tvalue set: " + y + " y set returned: " + yReturn);


		y = 1000.80;
		circle.setY(y);
		yReturn =  circle.getY();
		boolean testD =   (y == yReturn);
		System.out.println("\tTest Passed: " + testD + "\tvalue set: " + y + " y returned: " + yReturn);

		System.out.println("Getting/Setting y: " + (testA && testB && testC && testD));
		return testA && testB && testC && testD;
	}
		

	public static boolean radiusTest()
	{
		double radius;		
		double radiusReturn;
		Circle circle= new Circle(20,1.0,1.0);
		System.out.println("Getting/Setting radius:");
		
		radius = 1.0;
		circle.setRadius(radius);
		radiusReturn =  circle.getRadius();
		boolean testA =   (radius == radiusReturn);
		System.out.println("\tTest Passed: " + testA + "\tvalue set: " + radius + " radius returned: " + radiusReturn);
		

		radius = -1.0;
		circle.setRadius(radius);
		radiusReturn =  circle.getRadius();
		boolean testB =   (radius != radiusReturn);
		System.out.println("\tTest Passed: " + testB + "\tvalue set: " + radius + " radius returned: " + radiusReturn);

		
		radius = 0.0;
		circle.setRadius(radius);
		radiusReturn =  circle.getRadius();
		boolean testC =   (radius == radiusReturn);
		System.out.println("\tTest Passed: " + testC + "\tvalue set: " + radius + " radius returned: " + radiusReturn);


		radius = 99.50;
		circle.setRadius(radius);
		radiusReturn =  circle.getRadius();
		boolean testD =   (radius == radiusReturn);
		System.out.println("\tTest Passed: " + testD + "\tvalue set: " + radius + " radius returned: " + radiusReturn);
		System.out.println("Getting/Setting radius: " + (testA && testB && testC && testD));
		return testA && testB && testC && testD;
	}
	
	
	
	public static double distance(double x, double y, double  x2, double  y2)
	{
		return Math.sqrt((x - x2)* (x - x2) + (y - y2)* (y - y2));
	}
	
	public static boolean distanceTest()
	{

		double x1 = 0.0, y1 = 0.0, r1 = 1.0;
		double x2 = 0.0, y2 = 10.0, r2 = 1.0;
		
		Circle circle1;
		Circle circle2;
				
		double distance;
		double referenceDistance;

		
		System.out.println("Distance Test:");
		
		circle1 = new Circle(x1,y1,r1);
		circle2 = new Circle(x2,y2,r2);
		distance = circle1.distance(circle2);
		referenceDistance = distance(x1,y1,x2,y2);
		boolean testA = (Math.abs(distance-referenceDistance) <= error);
		System.out.println("\tTest Passed: " + testA +"\texpected: " + referenceDistance + " found: " + distance);
		
		x2 = 10;
		circle1 = new Circle(x1,y1,r1);
		circle2 = new Circle(x2,y2,r2);
		distance = circle1.distance(circle2);
		referenceDistance = distance(x1,y1,x2,y2);
		boolean testB = (Math.abs(distance-referenceDistance) <= error);
		System.out.println("\tTest Passed: " + testB +"\texpected: " + referenceDistance + " found: " + distance);
	
		x2 = 0;
		y2 = 0;
		circle1 = new Circle(x1,y1,r1);
		circle2 = new Circle(x2,y2,r2);
		distance = circle1.distance(circle2);
		referenceDistance = distance(x1,y1,x2,y2);
		boolean testC = (Math.abs(distance-referenceDistance) <= error);
		System.out.println("\tTest Passed: " + testC +"\texpected: " + referenceDistance + " found: " + distance);
		
		x1 = 20;
		y1 = 20;
		x2 = 25;
		y2 = 32;
		circle1 = new Circle(x1,y1,r1);
		circle2 = new Circle(x2,y2,r2);
		distance = circle1.distance(circle2);
		referenceDistance = distance(x1,y1,x2,y2);
		boolean testD = (Math.abs(distance-referenceDistance) <= error);
		System.out.println("\tTest Passed: " + testD +"\texpected: " + referenceDistance + " found: " + distance);
		System.out.println("\tDistance Test: " + (testA && testB && testC && testD));	
		return testA && testB && testC && testD;
	}
	

	
	private static double referenceArea(double r)
	{
		return Math.PI * r*r;
	}
	
	public static boolean areaTest()
	{

		Circle circle;
				
		double area;
		double referenceArea;

		
		System.out.println("Area Test:");
		
		circle = new Circle(0,0,1);
		area = circle.area();
		referenceArea = referenceArea(1);
		boolean testA = (Math.abs(area-referenceArea) <= error);
		System.out.println("\tTest Passed: " + testA +"\texpected: " + referenceArea + " found: " + area);

		circle = new Circle(0,0,10);
		area = circle.area();
		referenceArea = referenceArea(10);
		boolean testB = (Math.abs(area-referenceArea) <= error);
		System.out.println("\tTest Passed: " + testB +"\texpected: " + referenceArea + " found: " + area);

		circle = new Circle(0,0,100);
		area = circle.area();
		referenceArea = referenceArea(100);
		boolean testC = (Math.abs(area-referenceArea) <= error);
		System.out.println("\tTest Passed: " + testC +"\texpected: " + referenceArea + " found: " + area);

		System.out.println("\tArea Test: " + (testA && testB && testC));	
		return testA && testB && testC;
	}
	
	
	
	private static double referencePerimeter(double r)
	{
		return 2*Math.PI * r;
	}
	
	public static boolean perimeterTest()
	{

		Circle circle;
				
		double perimeter;
		double referencePerimeter;

		
		System.out.println("Perimeter Test:");
		
		circle = new Circle(0,0,0.5);
		perimeter = circle.perimeter();
		referencePerimeter = referencePerimeter(0.5);
		boolean testA = (Math.abs(perimeter-referencePerimeter) <= error);
		System.out.println("\tTest Passed: " + testA +"\texpected: " + referencePerimeter + " found: " + perimeter);

		circle = new Circle(0,0,0.05);
		perimeter = circle.perimeter();
		referencePerimeter = referencePerimeter(0.05);
		boolean testB = (Math.abs(perimeter-referencePerimeter) <= error);
		System.out.println("\tTest Passed: " + testB +"\texpected: " + referencePerimeter + " found: " + perimeter);

		circle = new Circle(0,0,0.005);
		perimeter = circle.perimeter();
		referencePerimeter = referencePerimeter(0.005);
		boolean testC = (Math.abs(perimeter-referencePerimeter) <= error);
		System.out.println("\tTest Passed: " + testC +"\texpected: " + referencePerimeter + " found: " + perimeter);

		System.out.println("\tPerimeter Test: " + (testA && testB && testC));		
		return testA && testB && testC;
	}
	
	

	private static double referenceDiameter(double r)
	{
		return 2*r;
	}
	
	public static boolean diameterTest()
	{

		Circle circle;

		double radius;
		double diameter;
		double referenceDiameter;

		
		System.out.println("Diameter Test:");
		
		radius = 1;
		circle = new Circle(0,0,radius);
		diameter = circle.diameter();
		referenceDiameter = referenceDiameter(radius);
		boolean testA = (Math.abs(diameter-referenceDiameter) <= error);
		System.out.println("\tTest Passed: " + testA +"\texpected: " + referenceDiameter + " found: " + diameter);

		radius = 2;
		circle = new Circle(0,0,radius);
		diameter = circle.diameter();
		referenceDiameter = referenceDiameter(radius);
		boolean testB = (Math.abs(diameter-referenceDiameter) <= error);
		System.out.println("\tTest Passed: " + testB +"\texpected: " + referenceDiameter + " found: " + diameter);

		radius = 10;
		circle = new Circle(0,0,radius);
		diameter = circle.diameter();
		referenceDiameter = referenceDiameter(radius);
		boolean testC = (Math.abs(diameter-referenceDiameter) <= error);
		System.out.println("\tTest Passed: " + testC +"\texpected: " + referenceDiameter + " found: " + diameter);

		System.out.println("\tDiameter Test: " + (testA && testB && testC));			
		return testA && testB && testC;
	}
	
	

	
	public static boolean intersectsTest()
	{
		Circle circle1= new Circle(0,1,1);  
		Circle circle2= new Circle(1,0,1);  
		Circle circle3= new Circle(10,0,2);  
		Circle circle4= new Circle(10,3,4);  
				
		boolean testA = (true == circle1.intersects(circle2));
		boolean testB = (true == circle2.intersects(circle1));
		boolean testC = (false == circle1.intersects(circle3));
		boolean testD = (true == circle3.intersects(circle4));
		
		System.out.println("Intersection Test:");
		System.out.println("\tTest Passed: " + testA + "\t (0,1,1) intersects (1,0,1): " + circle1.intersects(circle2));
		System.out.println("\tTest Passed: " + testB + "\t (1,0,1) intersects (0,1,1): " + circle2.intersects(circle1));
		System.out.println("\tTest Passed: " + testC + "\t (0,1,1) intersects (10,0,2): " + circle1.intersects(circle3));
		System.out.println("\tTest Passed: " + testD + "\t (10,0,2) intersects (10,3,4): " + circle3.intersects(circle4));
		System.out.println("\tIntersection Test: " + (testA && testB && testC && testD));
		return testA && testB && testC && testD;
	}

	

	public static boolean concentricTest()
	{
		Circle circle1= new Circle(10,10,5);  
		Circle circle2= new Circle(10,10,3);  
		Circle circle3= new Circle(0,0,5);  
		Circle circle4= new Circle(0,0,4);  
				
		boolean testA = (true == circle2.isConcentric(circle1));
		boolean testB = (false == circle2.isConcentric(circle3));
		boolean testC = (false == circle3.isConcentric(circle1));
		boolean testD = (true == circle4.isConcentric(circle3));
		
		System.out.println("Concentric Circles Test:");
		System.out.println("\tTest Passed: " + testA + "\t (10,10,3) concentric with (10,10,5): " + circle2.isConcentric(circle1));
		System.out.println("\tTest Passed: " + testB + "\t (10,10,3) concentric with (0,0,5): " + circle2.isConcentric(circle3));
		System.out.println("\tTest Passed: " + testC + "\t (0,0,5) concentric with (10,10,5): " + circle3.isConcentric(circle1));
		System.out.println("\tTest Passed: " + testD + "\t (0,0,4) concentric with (0,0,5): " + circle4.isConcentric(circle3));
		System.out.println("\tConcentric Circles Test: " + (testA && testB && testC && testD));
		return testA && testB && testC && testD;
	}


	public static boolean equalsTest()
	{
		Circle circle1= new Circle(10,10,5);  
		Circle circle2= new Circle(0,10,5);  
		Circle circle3= new Circle(0,11,5);
		Circle circle4= new Circle(10,10,6);
		
				
		boolean testA = (true == circle1.equals(circle1));
		boolean testB = (false == circle2.equals(circle1));
		boolean testC = (false == circle3.equals(circle2));
		boolean testD = (false == circle4.equals(circle1));
		
		
		System.out.println("Equals Test:");
		System.out.println("\tTest Passed: " + testA + "\t (10,10,5) equals (10,10,5): " + circle1.equals(circle1));
		System.out.println("\tTest Passed: " + testB + "\t (0,10,5)  equals (10,10,5): " + circle2.equals(circle1));
		System.out.println("\tTest Passed: " + testC + "\t (0,11,5)  equals (0,10,5): " +  circle3.equals(circle2));
		System.out.println("\tTest Passed: " + testD + "\t (10,10,6) equals (10,10,5): " + circle4.equals(circle1));
		System.out.println("\tEquals Test: " + (testA && testB && testC && testD));

		return testA && testB && testC && testD;
	}


	
	
	
	
	
	
	public static void main(String[] args) {
		
		boolean flag =  true;
		flag = unitCircleTest() && flag;
		flag = xTest() && flag;
		flag = yTest() && flag;
		flag = radiusTest() && flag;
		flag = distanceTest() && flag;
		flag = areaTest() && flag;
		flag = perimeterTest() && flag;
		flag = diameterTest() && flag;
		flag = intersectsTest() && flag;
		flag = concentricTest() && flag;
		flag = equalsTest() && flag;
		
		System.out.print("\nAll TESTS PASSED: " + flag); 
		
		
				
	}
	
}
