/*
* LinearSearch.java
* Author: Matthew Held
* Submission Date: 11-14-17
*
* Purpose:
* This class receives input from the command line and then prints
* to the console the first instance of the value specified from the
* specified array of values.
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
* I Agree
*
*/
 
public class LinearSearch {
      
       /*
       *  main() - Processes the args and calls getFirstIndex() to get
       *  correct output.
       */
       public static void main(String[] args) {
             
              //Check For Correct Input
              if (args.length >= 3) {
                   
                    //Check For Double Or String Types
                    if (args[0].equals("-d")) {
                          
                           //Declare Array
                           double[] dValues = new double[args.length - 3];
                          
                           //Put Values Into New Array
                           for (int i = 3; i < args.length; i++) {
                                 
                                  dValues[i - 3] = Double.parseDouble(args[i]);
                                 
                           }
                          
                           //Get The First Index In Array
                           int dResult = getFirstIndex(Double.parseDouble(args[1]), dValues);
                          
                           //Print Result To Console
                           if (dResult == -1) {
                                 
                                  System.out.println(args[1] + " not found in x");
                                 
                           } else {
                                 
                                  System.out.println(args[1] + " found in x at index " + dResult);
                                 
                           }
                          
                    } else if (args[0].equals("-s")) {
                          
                           //Declare Array
                           String[] sValues = new String[args.length - 3];
                          
                           //Put Values Into New Array
                           for (int i = 3; i < args.length; i++) {
                                 
                                  sValues[i - 3] = args[i];
                                 
                           }
                          
                           //Get The First Index In Array
                           int sResult = getFirstIndex(args[1], sValues);
                          
                           //Print Result To Console
                           if (sResult == -1) {
                                 
                                  System.out.println(args[1] + " not found in x");
                                 
                           } else {
                                 
                                  System.out.println(args[1] + " found in x at index " + sResult);
                                 
                           }
                          
                    }
                   
              }
             
       }
      
       /*
       *  getFirstIndex() - Returns the first index i of x where x[i]
       *  is equal to item, if the item is in the array x. Otherwise, returns
       *  -1 if the item is not in the array x.
       */
       public static int getFirstIndex(double item, double[] x) {
             
              //Declare & Initialize Variables
              boolean isDetermined = false;
              int i = -1;
             
              if (x.length != 0) {
                   
                    //Update Counter
                    i++;
                   
                    //Iterate Through x Array
                    while (isDetermined == false && i < x.length) {
                          
                           //Test Value In x To item
                           if (x[i] == item) {
                                 
                                  //Update Variable
                                  isDetermined = true;
                                 
                           } else if (i == x.length - 1) {
                                 
                                  //Update Variables
                                  i = -1;
                                  isDetermined = true;
                                 
                           } else {
                                 
                                  //Increment Counter
                                  i++;
                                 
                           }
                          
                    }
                   
              }
             
              //Return Value
              return i;
             
       }
      
       /*
       *  getFirstIndex() - Returns the first index i of x where x[i]
       *  is equal to item(case sensitive), if the item is in the array x. Otherwise,
        *  returns -1 if the item is not in the array x.
       */
       public static int getFirstIndex(String item, String[] x) {
             
              //Declare & Initialize Variables
              boolean isDetermined = false;
              int i = -1;
             
              if (x.length != 0) {
                   
                    //Update Counter
                    i++;
                   
                    //Iterate Through x Array
                    while (isDetermined == false && i < x.length) {
                          
                           //Test Value In x To item
                           if (x[i].equals(item)) {
                                 
                                  //Update Variable
                                  isDetermined = true;
                                 
                           } else if (i == x.length - 1) {
                                 
                                  //Update Variables
                                  i = -1;
                                  isDetermined = true;
                                 
                           } else {
                                 
                                  //Increment Counter
                                  i++;
                                 
                           }
                          
                    }
                   
              }
             
              //Return Value
              return i;
             
       }
      
}