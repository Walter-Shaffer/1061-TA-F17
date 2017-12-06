/*
 * LetterFrequencies.java
 * Author: John Xue
 * Submission Date: Dec. 1, 2017
 *
 * Purpose: Person class that tests class constructors, access modifiers,
 *
 * Statement of Academic Honesty:
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized assistance
 * or plagiarism will be handled in accordance with the policies at
 * Clemson University and the policies of this course. I recognize that my
 * work is based on an assignment created by the School of Computing at
 * Clemson University. Any publishing or posting of source code
 * for this project is strictly prohibited unless you have written
 * consent from the instructor.
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
	/* Check if arrays count and s are not null */
	if (count != null && s != null && count.length == 26) {
		/* Enter the s array */
		for (int i = 0; i < s.length; i++) {
			/* Check if string s[i] is null */
			if (s[i] != null) {
				/* Enter each char in string s[i] */
				for (int l = 0; l < s[i].length(); l++) {
					/* Check a-z */
					char c = 'a';
					for (int k = 0; k < 26; k++, c++) {
						if (c == s[i].toLowerCase().charAt(l)) {
							count[k] += 1;
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
	/* Check if count is null */
	if (count != null) {
		for (int i = 0; i < count.length; i++) {
			count[i] = 0;
		}
	}
  }

}
