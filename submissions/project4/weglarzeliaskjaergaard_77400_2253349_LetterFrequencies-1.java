/*
* LetterFrequencies.java
* Author: Elias Weglarz
* Submission Date: 10/13/17
*
* Purpose: Determine the amount of times each letter of the alphabet appears in a given string.
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
	  for (int k = 0; k < 26; k++){
		  int letterCount = 0;
		  if (s != null && count != null){
			  for (int i = 0; i < s.length; i++){
				  String[] x = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", 
						  "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
				  if (s[i] != null) {
					  for (int j = 0; j < s[i].length(); j++){
						  if (s[i].substring(j, j +1).equalsIgnoreCase(x[k])){
							  letterCount++;
						  }
					  }
				  }
			  }
		  }
		  if (count != null){
			  count[k] = letterCount;
		  }
	  }
	  
  }

  /*
   * Initialize each value in the
   * count array to zero.
   */
  public static void initializeCount(int[] count){
	  if (count != null){
		  for (int k = 0; k < count.length; k++){
			  count[k] = 0;
		  }
	  }
  }

}