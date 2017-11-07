/* 
 * CircleTester.java 
 * Author:  Jackie Doan  
 * Submission Date:  10/26/17 
 * 
 * Purpose:
 * This program is used to test the methods
 * within the Circle.java program
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
 */ 
public class CircleTester {

	public static void main(String[] args) {
		Circle circle1 = new Circle(0.0,0.0,2);
		Circle circle2 = new Circle(2.0,1.0,1);
		
		System.out.println("circle1=" + circle1 + "\n");
		
		System.out.println("circle2=" + circle2 + "\n");
		
		circle1.setRadius(-2.0);
		
		circle1.setX(-3.0);
		circle1.setY(4.0);
		System.out.println("circle1=");
		System.out.println("center: (" + circle1.getX() + ","
				+ circle1.getY() + ")");
		System.out.println("radius: " + circle1.getRadius());
		System.out.println("diameter= " + circle1.diameter());
		System.out.println("area= " + circle1.area());
		System.out.println("perimeter= " + circle1.perimeter());
		System.out.println("Is unit circle= " + circle1.isUnitCircle() + "\n");
		
		circle2.setRadius(5.3);
		System.out.println("circle2=");
		System.out.println("center: (" + circle2.getX() + ","
				+ circle2.getY() + ")");
		System.out.println("radius: " + circle2.getRadius());
		System.out.println("diameter= " + circle2.diameter());
		System.out.println("area= " + circle2.area());
		System.out.println("perimeter= " + circle2.perimeter());
		System.out.println("Is unit circle= " + circle2.isUnitCircle() + "\n");
		
		System.out.println("Circles Equal= " + circle1.equals(circle2));
		System.out.println("Circles Concentric= " + circle1.isConcentric(circle2));
		System.out.println("Circles Distanec= " + circle1.distance(circle2));
		System.out.println("Circles Intersects= " + circle1.intersects(circle2));
	}

}
