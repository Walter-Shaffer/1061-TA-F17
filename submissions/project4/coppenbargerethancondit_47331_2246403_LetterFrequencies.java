/*
* LetterFrequencies.java
* Author: Ethan Coppenbarger
* Submission Date: 11/30/2017
*
* Purpose: Contains two functions, one sets all values in an int
* array to 0 and another counts all letters in a string and puts
* the output in a 26 character long int array with the position
* in the int array corresponding with the alphabetical postiion
* of the character.
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
public class LetterFrequencies{
    
  /*
   * Search through each character in s,
   * which is array of strings,
   * and update the count array
   * with the correct character counts.
   * Note: check the examples to see
   * if the counts should be case
   * sensitive or case insensitive.
   */
  public static void letterCount(String[] s, int[] count){
      initializeCount(count);
      if(s != null && s.length != 0) {                                      //make sure array has strings
          for(int i = 0; i < s.length; i++) {                              //loop through string in s
              if(s[i] != null && !s[i].isEmpty()) {                        //ignore null and empty strings
    	          s[i].toLowerCase();                                      //convert string to lower case
	          for(int j = 0; j < s[i].length(); j++) {                 //loop through each string
	              if(65 <= s[i].charAt(j) && s[i].charAt(j) <= 90) {   //only count characters between A and Z
	                  count[s[i].charAt(j)-65] += 1;                   //find the character at a point in the string, subtract 65 to convert a => 0, etc., add 1 to count array at position of that character
	              }
                  }
	       }
           }
       }
      
  }

  /*
   * Initialize each value in the
   * count array to zero.
   */
  public static void initializeCount(int[] count){
      if(count == null) {
	  count = new int[26];
      }
      for(int i = 0; i < count.length; i++) {                              //loop through count array
	  count[i] = 0;                                                    //set each item in array to 0
      } 
  }

}
