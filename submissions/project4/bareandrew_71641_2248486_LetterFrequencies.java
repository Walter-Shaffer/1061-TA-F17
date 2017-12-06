/*
* LetterFrequencies.java
* Author: Andrew Bare
* Submission Date: 12/1/17
*
* Purpose: 
* 
* This Class parses through given data in a string array and counts the
* number of instances it find each letter of the alphabet
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
	//loop for each letter in the alphabet
	  char checkLower = 'a';
	  char checkUpper = 'A';
	//make sure good input
	  if (s!= null && s.length !=0){
		  for (int letterChecking =0; letterChecking<count.length;letterChecking++){	  		  
			  
			  //make sure good input
			  if (s.length !=0 && s!= null){
				//loop for the size of s
				  for (int i = 0; i< s.length;i++){	
					//make sure good input
					  if (s[i]!= null &&s[i].length() !=0){
						  char[] compare =s[i].toCharArray();
						  
						  //loop for the size of of each string in the array
						  for (int j =0; j<s[i].length(); j++){
							  if (checkLower == compare[j] || checkUpper == compare[j]){
								  count[letterChecking]++;
							  }
						  }
					  }				  
				  }
			  }
			  
			
			  //System.out.println("Number of "+ checkLower + " found: "+count[letterChecking]);
			  
			  //update checkers
			  checkLower++;
			  checkUpper++;
			  
			  //System.out.println("Upper:\t"+checkUpper);
			  
		  }
	  }
	  
	  
    
	  
  }

  /*
   * Initialize each value in the
   * count array to zero.
   */
  public static void initializeCount(int[] count){
	  //check to make sure not null
	  if (count != null){
		  	for (int i =0; i<count.length; i++)
		    	count[i]=0;
	  }  	
  }

}
