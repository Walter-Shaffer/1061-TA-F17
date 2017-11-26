/* 
 * 
 * LinearSearch.java 
 * Author:  Paul Orecchia  
 * Submission Date:  11/14/17 
 * 
 * Purpose: The purpose of this program is to find the index of the input parameter inside the array.
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

	 public static int getFirstIndex(double item, double[] x){
		
		 for(int i=3;i<x.length;i++){
			 if (item==x[i]){
				 i=i-3;
				 System.out.println(item+" found in x at index "+i+"\n");
				 return i;
			 }else{
			 }
		 }
		 System.out.println(item+" not found in x\n");
		 return -1;
	 }
	 public static int getFirstIndex(String item, String[] x){
		 for(int i=3;i<x.length;i++){
			 if (item.equals(x[i])){
				 i=i-3;
				 System.out.println(item+" found in x at index "+i+"\n");
				 return i;
			 }else{ 
			 }
		 }
		 System.out.println(item+" not found in x\n");
		 return -1;
	 }
	 public static void main(String[] args){
		 if (args[0].equals("-s")){
			getFirstIndex(args[1], args);
		}else if (args[0].equals("-d")){
			double[]d=new double[args.length];
			for (int i=0; i<args.length;i++){
				if (args[i].equals("-d")){
					d[i]=0;
				}else if (args[i].equals("-x")){
					d[i]=0;
				}else{
				d[i]=Double.parseDouble(args[i]);
				}
			}
			getFirstIndex(d[1], d);
		}else{
			System.out.println("Incorrect input");
		}
	}
}	 
		
