/*		
 * [LetterFrequencies].java 		
 * Author: [Aneri Desai]		
 * Submission Date: [12/01/2017]		
 * 		
 * Purpose: In the project we learned more about the linear search and how to count the number
 * inside a string of an array and little bit about command line arguements. 		
 * 		
 *  Statement of Academic Honesty:		
 *  		
 *  The following code represent my own work. I have neither received nor given inappropriate assistance. 		
 *  I have not copied or modified code from any source other than the course webpage or the course textbook.		
 *  I recognize that any unauthorized assistance or plagiarism will be handled in accordance with the policies		
 *  at Clemson University and the policies of this course. I recognize that my work is based on an assignment 		
 *  created by the School of Computing at Clemson Univeristy. Any publishing or posting of source code for this 		
 *  project is strictly prohibited unless you have written consent from the instructor.  		
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
	  if(count == null) //if entered value is null
		  count = new int[26];
	 if(s==null)
		  s = new String[0];
	  char c = 'a';			
	 String x = "";			
	  for (String n:s) { //transfer value of s elements to n
		  if(n != (null))
		  x+=n;
	  }
	  x=x.toLowerCase();			
	  char q[] = x.toCharArray(); //converting a string array to char array
	  for(int j=0;j<26;j++) {	//look for values from a-z 	
		  for(int i=0;i<q.length;i++) {
			  if(q[i]==c)	
			  	count[j]++;
		  }		
		  c++;		
	  }			
  }				
  /*				
   * Initialize each value in the				
   * count array to zero.				
   */				
  				
  public static void initializeCount(int[] count){				
    //Implement this function				
	  //char c = 'a';	
	if(count == null) //entered null assign an empty array
		count = new int[26];
	 for(int i = 0; i<26; i++) {		//intialize to value 0	
		count[i] = 0;		
	}
	
  }				
}				