/*
* LetterFrequencies.java
* Author: Daniel Christensen
* Submission Date: 12/1/2017
*
* Purpose: This class will search through an array of strings, counting how many times a given letter will appear.
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
      if(s==null) {//we can ignore s if it is null
    	  
      }
      else {
    	  int arrayLength = s.length;
		  
    	  for(int i = 0; i<arrayLength; i++) {
    	    	  
    	      if(s[i]==null) {//we can ignore s[i] if it is null
    				    
    			  }
    			  else {
    				  
    				  int stringLength = s[i].length();
    				  
    				  for(int j = 0; j<stringLength; j++) {
    	    			  
    				      for(int k = 0; k<26; k++) {//searches through whole alphapet through ASCII values
    		    				  
    		    	          if( s[i].charAt(j)=='a'+k || s[i].charAt(j)=='A'+k) {
    		    					  
    		    		          count[k]++;//adds one to count if the upper or lower case letter is present
    		    		      }
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
      if (count ==null) {//null is annoying
    	  count = new int[26];
    	  for(int i=0; i<26; i++) {
    		  count[i]=0;
    	  }
      }
	  
	  else {//w00t
		  int[] initial = count;
		  
		  for(int i = 0; i<26; i++) {
			  
			  initial[i] = 0;
	  }
      
  }

  }
}
