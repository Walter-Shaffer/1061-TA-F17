/*
* CPSC-1060.java
* Author: Trip Bastian
* Submission Date: November 30, 2017
*
* Purpose: To get a character count from various strings
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
	  char currentLetter = 'a';
	  int letterCount;
	  if(s!=null){
		  for(int l=0;l<s.length;l++){
			  if(s[l]!=null){
				  s[l]=s[l].toLowerCase();
			  }
		  }
		  for(int i = 0;i<26;i++, currentLetter++){ //For each letter
			  letterCount = 0;
			  for(int j = 0;j<s.length;j++){		//For each string
				  if(s[j]!=null){
					  while(s[j].indexOf(currentLetter)!=-1){
						  letterCount++;
						  s[j] = s[j].substring(0, s[j].indexOf(currentLetter))+s[j].substring(s[j].indexOf(currentLetter)+1);
					  }
				  }
			  }
			  count[i]=letterCount;
		  }
		  
	  }
  }

  /*
   * Initialize each value in the
   * count array to zero.
   */
  public static void initializeCount(int[] count){
	  if(count!=null){
		  for(int i = 0;i<count.length;i++){
			  count[i]=0;
		  }
	  }
  }
}
