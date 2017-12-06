package project4;
/*
	 * LetterFrequencies.java Author: Alejandro Pardo Submission Date: Novemeber
	 * 28 Purpose: count the frequency of characters in a string array Statement
	 * of Academic Honesty: The following code represents my own work. I have
	 * neither received nor given inappropriate assistance. I have not copied *
	 * or modified code from any source other than the course webpage * or the
	 * course textbook. I recognize that any unauthorized assistance or
	 * plagiarism will be handled in accordance with the policies at Clemson
	 * University and the policies of this course. I recognize that my work is
	 * based on an assignment created by the School of Computing at Clemson
	 * University. Any publishing or posting of source code for this project is
	 * strictly prohibited unless you have written consent from the instructor.
	 */
public class LetterFrequencies {
	

		/*
		 * Search through each character in s, which is array of strings, and
		 * update the count array with the correct character counts. Note: check
		 * the examples to see if the counts should be case sensitive or case
		 * insensitive.
		 */
		public static void letterCount(String[] s, int[] count) {

			if ((s != null) && (count != null))
				for (int a = 0; a < s.length; a++) {
					String word = s[a]; // gets string from string array
					if ((word != null) && (count != null)) { // if either the
																// count or
																// string s are
																// null, the
																// command will
																// not go
																// through
						char[] Brokenletters = word.toLowerCase().toCharArray(); // makes
																					// the
																					// string
																					// all
																					// into
																					// lower
																					// case
						for (int i = 0; i < word.length(); i++) {
							char Letter = Brokenletters[i]; // gets individual
															// characters from
															// the string
							int NumOfLetter = "abcdefghijklmnopqrstuvwxyz".indexOf(Letter); // if
																							// the
																							// character
																							// matches
																							// any
																							// of
																							// the
																							// characters
																							// in
																							// the
																							// alphabet
							if (NumOfLetter != -1) { // if the character is not
														// recognized, it will
														// not go through
								count[NumOfLetter] += 1; // increment the count
															// by one of the
															// character found
							}
						}
					}
				}
		}

		/*
		 * Initialize each value in the count array to zero.
		 */
		public static void initializeCount(int[] count) {

			if (count != null) { // if count is not initialized with null, it
									// will go through
				for (int i = 0; i < count.length; i++) {
					count[i] = 0; // sets each value of count to zero.
				}
			}
		}

	}

