/*
* LetterFrequencies.java
* Author: Jacob Caldwell
* Submission Date: 12/01/2017
*
* Purpose: To search an array of strings for the number of 
* alphabetic characters the entire array contains
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
    //Implement this function
	  if (s == null) {
		  s = new String[0];
	  }
	  for (int i = 0; i < s.length; i++){
		  if (s[i] == null) {
			  s[i] = "";
		  }
		  int c = 0;
		  int character = 0;
		  for (char k = 'a', K = 'A'; character < count.length; k++, K++, character++, c++) {
			  for (int j = 0; j < s[i].length(); j++) {
				  if (k == s[i].charAt(j)) {
					  count[c]++;
				  }
				  else if (K == s[i].charAt(j)) {
					  count[c]++;
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
	  if (count != null) {
		  for(int i = 0; i < count.length; i++) {
    	count[i] = 0;
		  }
	  }
  }

}
