/*
 * LetterFrequencies.java
 * Author: Andre Washington
 * Purpose: Write a program in Java that use static methods, variables
 * assignments, expressions, decision statements, nested
 * loops, various nested statements, and arrays of objects.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. 
 * I have neither received nor given inappropriate assistance. I have not copied
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

public class FindTheSums  {
	//Your class comments go here

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
		  //for loop to search through each letter of each string
		  //increase value of count[letter] by 1 every time there is a letter
		  //nested if loops
		  String[] temp={""};
		  char object='a';
		  char objectUp='A';
		  int counter;
		  for(counter=0; counter<26; counter++){
			  if(s==null)
				  s=temp;
		  for(int i=0; i<s.length; i++){
			  if(s[i]==null){
				  s[i]="";
			  }
			  for(int j=0; j<s[i].length();j++){
			  if(s[i].charAt(j)==object||s[i].charAt(j)==objectUp){
					  count[counter]=count[counter]+1;
			  }
		  }
		  }
		  
		  object++;
		  objectUp++;
		  }
		  
	  }
	  

	  /*
	   * Initialize each value in the
	   * count array to zero.
	   */
	  public static void initializeCount(int[] count){
	    
		  int[] temp={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		  if(count==null)
			  count=temp;
			  	
		  
			  
			  
		  for(int i=0;i<26;i++)
			  count[i]=0;
		  
		  }

	}



