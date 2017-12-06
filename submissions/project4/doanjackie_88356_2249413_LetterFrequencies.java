/* 
 * LetterFrequencies.java 
 * Author:  Jackie Doan  
 * Submission Date: Thursday September 7, 2017
 * 
 * Purpose:
 * This program is designed with the purpose of being able to
 * search through a string array and be able to count all the
 * alphabetic characters.
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
	char letter;
	if (s != null){
		for (int i = 0; i < s.length; i++){
			if (s[i] != null){
				for (int j = 0; j < s[i].length(); j++){
					letter = s[i].charAt(j);
					letter = Character.toLowerCase(letter);
					if (letter == 'a'){
						count[0]++;
					}
					else if (letter == 'b'){
						count[1]++;
					}
					else if (letter == 'c'){
						count[2]++;
					}
					else if (letter == 'd'){
						count[3]++;
					}
					else if (letter == 'e'){
						count[4]++;
					}
					else if (letter == 'f'){
						count[5]++;
					}
					else if (letter == 'g'){
						count[6]++;
					}
					else if (letter == 'h'){
						count[7]++;
					}
					else if (letter == 'i'){
						count[8]++;
					}
					else if (letter == 'j'){
						count[9]++;
					}
					else if (letter == 'k'){
						count[10]++;
					}
					else if (letter == 'l'){
						count[11]++;
					}
					else if (letter == 'm'){
						count[12]++;
					}
					else if (letter == 'n'){
						count[13]++;
					}
					else if (letter == 'o'){
						count[14]++;
					}
					else if (letter == 'p'){
						count[15]++;
					}
					else if (letter == 'q'){
						count[16]++;
					}	
					else if (letter == 'r'){
						count[17]++;
					}
					else if (letter == 's'){
						count[18]++;
					}
					else if (letter == 't'){
						count[19]++;
					}
					else if (letter == 'u'){
						count[20]++;
					}
					else if (letter == 'v'){
						count[21]++;
					}
					else if (letter == 'w'){
						count[22]++;
					}
					else if (letter == 'x'){
						count[23]++;
					}
					else if (letter == 'y'){
						count[24]++;
					}
					else if (letter == 'z'){
						count[25]++;
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
		  for (int i = 0; i < count. length; i++){
			  count[i] = 0;
		  }
	  }
  }
}