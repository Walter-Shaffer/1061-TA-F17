/*
* LetterFrequencies.java
* Author: Andrew Padgett
* Submission Date: 11/30/17
*
* Purpose: Finds and displays the count of each letter in a string s,
* 		   regardless of their case
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
		//Checks if s or count is null. Only continues if both are false
		if (s != null && count != null){
			//Loops through each index of s
			for (int j = 0; j < s.length; j++){
				//Only continues if index is not null
				if (s[j] != null){
					//Loops through each letter of the String at index j
					for (int k = 0; k < s[j].length(); k++){
						//Loops through alphabet until the character at s[j].charAt(k) equals h
						for (char h = 'a', i = 0; h <= 'z'; h++, i++){
							//If the character at k in s[j] equals h, add 1 to the corresponding position to the alphabet in count[]
							if (Character.toLowerCase(s[j].charAt(k)) == h || Character.toUpperCase(s[j].charAt(k)) == h){
								h = 'z';
								count[i] += 1;
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
		if (count != null){
			for (int i = 0; i < count.length; i++)
				count[i] = 0;
		}
	}
}
