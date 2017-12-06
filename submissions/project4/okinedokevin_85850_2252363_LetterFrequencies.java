/*
* LinearSearch.java
* Author: Kevin Okinedo
* Submission Date: 12/1/17
*
* Purpose: A brief paragraph description of the
* program. What does it do? Checks how many times a character appears in an array.
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
	public static void letterCount(String[] s, int[] count){
		if (count != null && s != null){
		//Temporarily stores number of chars found by defining new array
			int[] tempArray = new int[count.length];
		
		for (int i = 0; i < s.length; i++) { 
			if (s[i] != null){
			
				char[] stringToChars = s[i].toCharArray();
			
			
			
				for (char c: stringToChars) {
					char c2;
					int i2;
			  
			  
					for (c2 = 'a', i2 = 0; c2 <= 'z' && i2 < 26; c2++, i2++) {
						if (Character.toLowerCase(c) == c2) {
							tempArray[i2]++;
						}
					}
				}
			 }
		}
		
		for(int i= 0; i < tempArray.length; i++){
			count[i] = tempArray[i];
		}
		}
		 
	}
	

	public static void initializeCount(int[] count){
		//Sets count array to 0 
		if (count != null){
			for (int i = 0; i < count.length; i++) {
				count[i] = 0;
			}
		}
	}
	
}
 