/*
* LetterFrequencies.java
* Author: Michael Grimsley
* Submission Date: 12/1/2017
*
* Purpose:to count the ammount of times a letter
* appears in array of strings and output it in a readable way
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
	  //no null pointer errors!
	  if (s != null && count != null && s.length > 0){
	  int x;   
	  //for loop to count through arryas
   for (int i = 0; i < s.length; i++){
	   //no null pointer erros!
	   if (s[i] != null){
		//for loop to count through each char of each string   
	   for (int j = 0; j < s[i].length(); j++){
		   
		   //make it all upercase
		   x = s[i].toUpperCase().charAt(j);
		   
		   // subtract 65 from the ASCI code to get letters postion in the alphabet
		   x = x-65;
		   
		   //doesn't allow anything that's not in a the 
		   //standard 26 letter alphabet to pass through
		   if (x <= 25 && x >= 0){
		   count[x] = count[x]+1;
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
	  //no null pointers 
	  if (count != null){
    
		  for (int i = 0; i < count.length; i++){
    	count[i] = 0;
    }
    }
    }
  }


