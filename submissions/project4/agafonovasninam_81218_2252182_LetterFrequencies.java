/*
* LetterFrequencies.java
* Author:  Nina Agafonovas
* Submission Date:  December 1, 2017
* Purpose: Scan through a string array and keep count of the number of appearances of each letter from a-z.
* Honesty:
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
public class LetterFrequencies {

	/*
	 * Search through each character in s, which is array of strings, and update
	 * the count array with the correct character counts. Note: check the
	 * examples to see if the counts should be case sensitive or case
	 * insensitive.
	 */

	public static void letterCount(String[] s, int[] count) {
		// Implement this function

		int counter;
		
		if (s == null) {				//if the string is initially null

		} else {
			for (int j = 0; j < s.length; j++) { 	// search the length of the
													// array, outer most loop
								
				if (s[j] == null) { 				// for the strings with null

				} else {

					for (int k = 0; k < s[j].length(); k++) {		// searches through the letters of each word at each index
						counter = 0;
							
						// create another variable to search for the Upper case version of each character
						for (char character = 'a', charUpper = 'A'; character <= 'z'; character++, charUpper++, counter++) { // if characters match
																															// increment the counter associated with the letters (a-z)
							
							if (s[j].charAt(k) == character || s[j].charAt(k) == charUpper) {
								count[counter] += 1;

							}

						}

					}
				}

			}
		}
	}

	/*
	 * Initialize each value in the count array to zero.
	 */
	public static void initializeCount(int[] count) {
		if (count == null) {				//avoid null pointer exception

		} else {

			for (int k = 0; k < 26; k++) {

				count[k] = 0;			// set the count to 0.
				

			}

		}

	}
}
