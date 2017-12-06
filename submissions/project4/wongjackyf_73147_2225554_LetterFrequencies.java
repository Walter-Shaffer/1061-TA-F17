/**
 * LetterFrequencies.java
 * Author: Jacky Wong
 * Submission Date: 11/27/2017
 * 
 * Purpose: This program lists the number of occurrences of each
 * letter in a given array of strings.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance
 * with the policies at Clemson university and the
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
			if ((s != null) && (count != null)){		// Ensures arguments are not null
				for (int i = 0; i <= (s.length - 1); i++) {		// Sweep through each in s
					String tempWord = s[i];
					if (tempWord != null) {		// Ensures string being observed is not null
						tempWord = tempWord.toLowerCase();
						for (int j = 0; j <= (tempWord.length() - 1); j++) {		// Sweep through each letter
							char currentChar = tempWord.charAt(j);
							if (((int)currentChar > 96) && ((int)currentChar < 123)) {		// Values given by ASCII chart
								count[(int)currentChar - 97] += 1;		// -97 accounts for 'a' being 97
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
		if (count != null) {		// Ensures argument is not null
			for (int k = 0; k <= (count.length - 1); k++) {		// Reset each value to 0
				count[k] = 0;
			}
		}
	}
	}