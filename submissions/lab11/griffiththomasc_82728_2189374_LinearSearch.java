import java.io.Console;

/*

* [LinearSearch].java

* Author: [Thomas Griffith]

* Submission Date: [November 17, 2017]

*

* Purpose: This program is design to give us 
* lots of experience on one deminsional arrays 
* overloading methods and using a wrapper class 
* so we can find a name or number within the array

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
public class LinearSearch {

	public static int getFirstIndex(String item, String[] x){
	

		
		String find = item;
		int ifFound = -1;
		int indexOf = -1;
		for (int i = 0; i < x.length; i++){
			
			if (find.equals(x[i])){
				ifFound ++;
				indexOf = i;
				return indexOf;
			}
		}
		return -1;
		
	}
	
	public static int getFirstIndex(double item, double[] x){
		
		double find = item;
		int ifFound = -1;
		int indexOf = -1;
		for (int i = 0; i < x.length; i++){
			
			if (find == (x[i])){
				ifFound ++;
				indexOf = i;
				return indexOf;

			}
		}
		
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		if (args[0].equals("-s")){
				String findValue = args[1];
				String [] StringArgs;
				int length = args.length - 3;
				StringArgs = new String [length];
				for (int i = 0; i < length; i++){
					StringArgs[i] = args[i+3];
				}
		int theStringValue = getFirstIndex(findValue, StringArgs);
		if (theStringValue == -1){
			System.out.println(findValue +" not found in x");
		} else if (theStringValue != -1){
			System.out.println(findValue +" found in x at index " + theStringValue);
		}
		
		
}

	
		if (args[0].equals("-d")){
				double findValue = Double.parseDouble(args[1]);
				double [] intArgs;
				int length = args.length - 3;
				intArgs = new double [length];
				for (int i = 0; i < length; i++){
					intArgs[i] = Double.parseDouble(args[i+3]);
				}
		int theStringValue = getFirstIndex(findValue, intArgs);
		if (theStringValue == -1){
			System.out.println(findValue +" not found in x");
		} else if (theStringValue != -1){
			System.out.println(findValue +" found in x at index " + theStringValue);
		}
		
		
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		

	}

}
