/*
* LetterFrequencies.java
* Author: Heather Wright
* Submission Date: December 1, 2017
*
* Purpose: This program contains two methods. The first one
* initializeCount initializes the count array to 0. The 
* letterCount method counts all the numbers in the String 
* it increments the array for those letters.
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
		int counter;
		if(s == null || count == null) {	// does nothing is the string or count is null
		}
		else {
			for(int i = 0; i < s.length; i++) {
				if(s[i] == null) {	// skips the instance of the array if its set to null
				}
				else {
					for(int p = 0; p < s[i].length(); p++) {
						counter = 0; //resets the counter after each letter is scanner
						for(char letter = 'a', letter2 = 'A'; letter <= 'z'; letter++, counter++, letter2++) {
							if(s[i].charAt(p) == letter || s[i].charAt(p) == letter2) { //if the letter equals the new character or the capital character it increments
							count[counter] = count[counter] + 1; //the instance of counter increments
							}
						}
					}	
				}
			}	
		}
	}
	public static void initializeCount(int[] count){
		if(count == null) { //if count is set to null it does nothing
		}
		else {
			for(int i = 0; i < 26; i++){ //initializes count to 0
				count[i] = 0;
			}
		}
	}
}