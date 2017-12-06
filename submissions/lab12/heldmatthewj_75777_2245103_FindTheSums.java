
/*
* FindTheSums.java
* Author: Matthew Held
* Submission Date: 11-30-17
*
* Purpose:
* The purpose of this class is to find sums of consecutive numbers
* in either the rows or columns of a rectangular array.
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
 
public class FindTheSums {
      
       /*
       *  arrayToString() - Returns a string that is a neat
       *  representation of the values in a.
       */
       public static String arrayToString(int[][] a) {
             
              //Create New String
              String neatStr = "";
             
              //Iterate Through 2D Array
              for (int i = 0; i < a.length; i++) {
                   
                    for (int j = 0; j < a[i].length; j++) {
                          
                           //Concat Value In Array To neatStr
                           neatStr += Integer.toString(a[i][j]);
                          
                           //Test If End Of Array
                           if (j != a[i].length - 1) {
                                 
                                  //Concat Space
                                  neatStr += " ";
                                 
                           }
                          
                    }
                   
                    //Test If End Of Array
                    if (i != a.length - 1) {
                          
                           //Concat New Line Character
                           neatStr += "\n";
                    }
                   
              }
             
              //Return String
              return neatStr;
             
       }
      
       /*
       *  horizontalSums() - Returns a new array with the same dimensions
       *  as a. Values that add up to sumToFind horizontally will stay at
       *  their index. Values that do not will be replaced with 0.
       */
       public static int[][] horizontalSums(int[][] a, int sumToFind) {
             
              //Create New Array
              int[][] b = new int[a.length][a[0].length];
             
              //Iterate Through 2D Array
              for (int i = 0; i < a.length; i++) {
                   
                    //Iterate Through 1D Array
                    for (int j = 0; j < a[i].length; j++) {
                          
                           //Create Temp Variables
                           int tempSum = 0;
                          
                           //Iterate Through Row
                           for (int k = j; k < a[i].length; k++) {
                                 
                                  //Increment tempSum
                                  tempSum += a[i][k];
                                 
                                  //Test Value
                                  if (tempSum == sumToFind) {
                                        
                                         //Replace Values In Array
                                         for (int l = j; l < k + 1; l++) {
                                              
                                               b[i][l] = a[i][l];
                                              
                                         }
                                        
                                  }
                                 
                           }
                          
                    }
                   
              }
             
              //Return Array
              return b;
             
       }
      
       /*
       *  verticalSums() - Returns a new array with the same dimensions
       *  as a. Values that add up to sumToFind vertically will stay at
       *  their index. Values that do not will be replaced with 0.
       */
       public static int[][] verticalSums(int[][] a, int sumToFind) {
             
              //Create New Array
              int[][] b = new int[a.length][a[0].length];
             
              //Iterate Through 2D Array
              for (int i = 0; i < a[0].length; i++) {
                   
                    //Iterate Through 1D Array
                    for (int j = 0; j < a.length; j++) {
                          
                           //Create Temp Variables
                           int tempSum = 0;
                          
                           //Iterate Through Column
                           for (int k = i; k < a.length; k++) {
                                 
                                  //Increment tempSum
                                  tempSum += a[k][j];
                                 
                                  //Test Value
                                  if (tempSum == sumToFind) {
                                        
                                         //Replace Values In Array
                                         for (int l = i; l < k + 1; l++) {
                                              
                                               b[l][j] = a[l][j];
                                              
                                         }
                                        
                                  }
                                 
                           }
                          
                    }
                   
              }
             
              //Return Array
              return b;
             
       }
      
}
