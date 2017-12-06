//Your class comments go here
/*
* [LetterFrequencies].java
* Author: [Anthony Frazier]
* Submission Date: [11/30/2017]
*
* Purpose: This program takes user input of a sting array and counts
* the number of each letter in the strings
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
	  //Here I initialize two arrays containing every letter in the alphabet
	  char [] z = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	  char [] Z = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	  char [] stringCharacters;
	  //this checks if the string is null
	  if(s != null){
	  for(int i = 0; i<s.length;i++){
		 if(s[i] != null){
		//this converts the string to a character array and assigns it to stringCharcters
		 stringCharacters = s[i].toCharArray();
		 //this loop executes for every letter int the character array
		 for(int j = 0; j<stringCharacters.length; j++){
			 //this loops through the array of alphabet letters to check if the character is in it
			  for(int k = 0; k<z.length;k++){
				  if(stringCharacters[j] == z[k] || stringCharacters[j] == Z[k]){
					  //if the character is detected then the occurrence array is incremented by 1
					  count[k] ++;
				  }
			  }
		  }
	  }
  }}
  }
  /*
   * Initialize each value in the
   * count array to zero.
   */
  public static void initializeCount(int[] count){
    //Implement this function
	  //checks to see if the integer array passed is null
	  if(count != null){
	  for(int i = 0; i< count.length;i++){
		  //sets  all indexes of count equal to zero
		  count[i]=0;
	  }
	  }
  }

}
