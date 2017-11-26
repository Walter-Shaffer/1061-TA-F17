import java.util.Arrays;

/*
* LinearSearch.java
* Author: Daniel Christensen
* Submission Date: [This class will search through an array for a specified double or string.
*
* Purpose: A brief paragraph description of the
* program. What does it do?
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

    public static void main(String[] args){


            if(args[0].equals("-s") && args[2].equals("-x")){
                String item=args[1];
                item.trim();
                if(getFirstIndex(item, Arrays.copyOfRange(args, 2, args.length))>0){
                    System.out.println(item + " found in x at index " + getFirstIndex(item, Arrays.copyOfRange(args, 2, args.length)));

                }
                else {
                	System.out.println("");
                }


            }
            else{
               if(args[0].equals("-d") && args[2].equals("-x")){
                   String double1 = args[1];
                   double1.trim();
                   if(getFirstIndex(double1, Arrays.copyOfRange(args, 2, args.length))>0){
                       System.out.println(double1 + " found in x at index " + getFirstIndex(double1, Arrays.copyOfRange(args, 2, args.length)));

                   }
                   else {
                   	System.out.println("");
                   }


               }
               else{

                   System.out.println("Invalid search format");

               }
            }
        
    }


    public static int getFirstIndex( double item, double[] x){
        boolean inArray = false;
        int count = 0;
        while(inArray==false && count<x.length && count>0){
            if(item==x[count]){
                inArray=true;
                

            }
            else{
                count++;
                if(count==x.length){
                    count = -1;
                }
            }

        }
        return count;



    }


    public static int getFirstIndex( String item, String[] x){
        boolean inArray = false;
        int count = 0;
        while(inArray==false && count<x.length && count>0){
            if(item.equals(x[count])){
                inArray=true;
             

            }
            else{
                count++;
                if(count==x.length){
                    count = -1;
                }
            }

        }
        return count;








   }
}
