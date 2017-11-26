/*
* LinearSearch.java
* Author: Timothy Morse
* Submission Date: 14/11/17
*
* Purpose: Find the argument input from an input array. Can search for either doubles or strings. Well, a double or a 
* string. It only does one.
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
public class LinearSearch{
    public static int getFirstIndex(double item, double[] x){
	int pos = -1;
	for(int i = 0;i<x.length;i++){
	    if(item==x[i]){
		pos = i;
		i=x.length;
	    }
	}
	return pos;
    }
    public static int getFirstIndex(String item, String[] x){
	int pos = -1;
	for(int i = 0;i<x.length;i++){
	    if(item.equals(x[i])){
		pos = i;
		i=x.length;
	    }
	}
	return pos;
    }
    public static void main(String[] args){
	if(args[0].equals("-s")){//String handler
	    String toMatch = args[1];
	    String[] content = new String[args.length - 3];
	    for(int i = 3;i<args.length;i++){
		content[i-3] = args[i];
	    }
	    int found = getFirstIndex(toMatch, content);
	    if(found!=-1){
		System.out.println(toMatch+" found in x at index "+found);
	    }else{
		System.out.println(toMatch + " not found in x");
	    }
	}else if(args[0].equals("-d")){//double handler
	    double toMatch = Double.parseDouble(args[1]);
	    double[] content = new double[args.length - 3];
	    for(int i = 3;i<args.length;i++){
		content[i-3] =Double.parseDouble(args[i]);
	    }
	    
	    int found = getFirstIndex(toMatch, content);
	    if(found!=-1){
		System.out.println(toMatch+" found in x at index "+found);
	    }else{
		System.out.println(toMatch + " not found in x");
	    }
	}
    }
}
