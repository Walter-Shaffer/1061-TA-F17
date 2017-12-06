/*
LetterFrequencies.java
Author: Sean Meade
Submission Date: 11/30
Purpose: Searches a given string array and counts how many times
each letter in the alphabet is in the string array. 

Statement of Academic Honest:
The following code represents my own work. I have neither
recieved nor given inappropriate assistance. I have not copied
or modified code from any source other than the course webpage
or the course textbook. I recognize that any unauthorized 
assistance or plagiarism will be handled in accordance
with the polices at Clemson University and the 
policies of this course. I recognize that my work is based
on an assignment created by the School of Computing
at Clemson University. Any publishing or posting
of source code for this project is strictly prohibited
unless you have written consent from the instructor. 
*/
public class LetterFrequencies{

	public static void letterCount(String[] s, int[] count){
		char[] list = new char[26]; //Creates a character array of the lowercase alphabet. 
		char assign = 'a';
		for(int i = 0; i < 26; i++){
			list[i] = assign;
			assign++;
		}
		
		for(int i = 0; i < 26; i++){ //Cycles through list[] with i
			String srcChar = "" + list[i];
			if(s != null){
				for(int j = 0; j < s.length; j++){ //Searches the given string[] s for each string. 
					if(s[j] == null){
						j++;
					}
					for (int k = 0; k < s[j].length(); k++){ //Searches each string for list[i]
						String stringChar = s[j].substring(k, k+1);
						if(stringChar.equalsIgnoreCase(srcChar)){ //If the character in the string at s[j] is the same as the character being searched for, the count increases. 
							count[i]++;
						}
					}
				}
			}
		}
	}

	public static void initializeCount(int[] count){ //Creates an array filled with zeroes. 
		if(count != null){
			for(int i = 0; i < count.length; i++){
				count[i] = 0;
			}
		}
	}
}