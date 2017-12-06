
/*
* LetterFrequencies.java
* Author: Matthew Held
* Submission Date: 11-30-17
*
* Purpose:
* The purpose of this class is to find the number of letters
* in a string array provided by the user.
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
 
public class LetterFrequencies {
      
       /*
       *  letterCount() - Search through each character in s,
       *  which is array of strings, and update the count array
       *  with the correct character counts.
        */
       public static void letterCount(String[] s, int[] count) {
             
              if (s != null && count != null) {
                   
                    String[] test = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
                   
                    //Iterate Through s Array
                    for (int i = 0; i < s.length; i++) {
                          
                           //Test For null Or Empty String
                           if (s[i] != null) {
                                 
                                  //Iterate Through Index
                                  for (int j = 0; j < s[i].length(); j++) {
                                        
                                         //Iterate Through Character Tests
                                         for (int k = 0; k < test.length; k++) {
                                              
                                               if (String.valueOf(s[i].charAt(j)).equalsIgnoreCase(test[k])) {
                                                     
                                                      count[k]++;
                                                     
                                               }
                                              
                                         }
                                        
                                  }
                                 
                           }
                          
                    }
                   
              }
             
       }
      
       /*
       *  initializeCount() - Initialize each value in the
       *  count array to zero.
       */
       public static void initializeCount(int[] count) {
             
              if (count != null) {
                   
                    //Iterate Through count Array
                    for (int i = 0; i < count.length; i++) {
                          
                           //Set Value In Array To Zero
                           count[i] = 0;
                          
                    }
                   
              }
             
       }
      
}