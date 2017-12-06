
/** @formatter:off
* LetterFrequencies.java
* Author: John Hollowell
* Submission Date: 11/20/2017
*
* Purpose: A class to calculate the frequency of english letters within all the
* strings in a String array.
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
* @formatter:on
*/

public class LetterFrequencies {

	/*
	 * Search through each character in s, which is array of strings, and update the
	 * count array with the correct character counts. Note: check the examples to
	 * see if the counts should be case sensitive or case insensitive.
	 */
	public static void letterCount(String[] s, int[] count) {

		if (s != null) {
			for (String str : s) {
				if (str != null) {
					for (char c : str.toLowerCase().toCharArray()) {
						int index = getAlphabetIndex(c);
						if (index >= 0) count[index] += 1;
					}
				}
			}
		}
	}

	/*
	 * Initialize each value in the count array to zero.
	 */
	public static void initializeCount(int[] count) {

		if (count != null) {
			for (int i = 0; i < count.length; i++) {
				count[i] = 0;
			}
		}
	}

	/**
	 * Returns the index in the alphabet (a=0) of the passed character. Returns -1
	 * if character is not a lowercase letter.
	 * 
	 * @param c
	 *            a character that is a letter
	 */
	private static int getAlphabetIndex(char c) {

		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for (int i = 0; i < alphabet.length; i++) {
			if (c == alphabet[i]) return i;
		}
		return -1;
	}
}
