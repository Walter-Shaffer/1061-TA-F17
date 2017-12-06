/*
*LetterFrequencies.java
* Author: David McDonough
* Submission Date: November 28th, 2017
* Purpose: looping through an array of words and counting the frequency of letters in each array
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance
* with the policies at Clemson University and the
* policies of this course. I recognize that my work is based
* on an assignment created by the School of Computing
* at Clemson University. Any publishing or posting
* of source code for this project is strictly prohibited
* unless you have written consent from the instructor.
*/
public class LetterFrequencies{
	/**  Search through each character in s,*  which is array of strings,*  and update the count array*  with the correct character counts.*  Note: check the examples to see*  if the counts should be case*  sensitive or case insensitive.*/
	public static void letterCount(String[] s, int[] count){
		
		//ignores null statements within a string
		if(s == null){
			return;
		}
		
		//for each loop that creates a String, 'curString', and loops through the curString and increments every time a letter is present
		for(String curString : s){
			if (curString != null && !curString.equals("")){
				curString = curString.toLowerCase();
				for(int i = 0; i < curString.length(); i++){
					char letter = curString.charAt(i);
					int letterNum = letter - 97;
					if(letterNum >= 0 && letterNum <= 25){
						count[letterNum]++;
						
					}
				}
			}
		}
	}
		
	
	/**  Initialize each value in the*  count array to zero.*/
	public static void initializeCount(int[] count){
		//ignores null statements within any strings
		if(count == null){
			return;
		}
		
		//initializes each value in the array to zero
		for(int i = 0; i < count.length; i++){
			count[i] = 0;
		}
	}
}

