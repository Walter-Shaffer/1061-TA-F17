/*
 * LetterFrequencies.java
 * Author: Monica Hart
 * Submission Date: 11/30/2017
 *
 * Purpose: This program calculates the number of times
 * a letter is used in a string array and stores the amount
 * in an integer array.
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
      
	  //check if null
	  if (s != null){
    	  
		  String sAsSingleString = ""; //to convert String[]s into one string
    	  
		  //add string in array to sAsSingleString if it isn't null
		  for (int i = 0; i < s.length; i++){
    		  if (s[i] != null)
    			  sAsSingleString += s[i]; 
    	  }
		  
		  //make all lower case
    	  sAsSingleString = sAsSingleString.toLowerCase();
    	  
    	  //loop through all characters in sAsSingleString
    	  for (int i = 0; i < sAsSingleString.length(); i++){
    		  //if character has ascii value of letter, then increase count of that in int[] count
    		  if (sAsSingleString.charAt(i) >= 97 && sAsSingleString.charAt(i) <= 122)
    			  count[(int)sAsSingleString.charAt(i) - 97]++;
    	  }
      }
  }

  /*
   * Initialize each value in the
   * count array to zero.
   */
  public static void initializeCount(int[] count){
      
	  //create new int[] to replace null
	  if (count == null)
    	  count = new int[26];
	  
	  //make all values in int[] count = 0
      for (int i = 0; i <=25; i++)
    	  count[i] = 0;
  }

}
